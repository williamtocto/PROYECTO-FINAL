
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionPG;
import modelo.Modelo_Socio;
import modelo.Socio;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.Vista_Socio;


public class Control_Socio {

    private Modelo_Socio modelo;
    private Vista_Socio vista;
    int fila, n;
    char digito = 1;

    public Control_Socio(Modelo_Socio modelo, Vista_Socio vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
        cargarDatos();
        desactivarBotones();
        vista.getTxtFechaIngreso().setText(FechaActual());
        vista.getTxtFechaIngreso().setEditable(false);
        vista.getTxtNumCuenta().setEditable(false);
        vista.getTxtCodigo().setEditable(false);

    }

    //Metodo para habilitar los botones cuando le de clic a un dato de la tabla
    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = vista.getJtDatosSocio().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vista.getJtDatosSocio().getRowHeight();
        if (row < vista.getJtDatosSocio().getRowCount() && row >= 0 && column < vista.getJtDatosSocio().getColumnCount() && column >= 0) {
            vista.getBtnModificar().setEnabled(true);
            vista.getBtnInactivar().setEnabled(true);
        } else {
            String name = "" + vista.getJtDatosSocio().getValueAt(row, 1);
        }

    }

    public void IniciarControl() {

        KeyListener validarCed = new KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                //Validación de cédula para que se ingresen solo 10 dígitos
                if (vista.getTxtCedula().getText().length() >= 10) {
                    evt.consume();
                    vista.getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "La cédula excede el número de dígitos", "Sintaxis Error", 0);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        KeyListener buscador;
        buscador = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarDatosbusqueda(vista.getTxtBuscar().getText());
            }

            @Override
            public void keyTyped(KeyEvent evt) {

            }
        };
        vista.getJtDatosSocio().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });

        vista.getTxtBuscar().addKeyListener(buscador);
        vista.getBtnRegistrar().addActionListener(l -> mostrarDialogo(1));
        vista.getBtnModificar().addActionListener(l -> mostrarDialogo(2));
        vista.getBtnInactivar().addActionListener(l -> inactivarSocio());
        vista.getBtnAceptar().addActionListener(l -> DefinirMetodo(n));
        vista.getBtnCancelar().addActionListener(l -> cancelar());
        vista.getBtnImprimir().addActionListener(l -> imprimirReporte());
        vista.getBtnNuevaCuenta().addActionListener(l -> nuevaCuenta());
        vista.getBtnActivar().addActionListener(l -> reactivarSocio());
        vista.getBtnRefrescar().addActionListener(l -> cargarDatos());

        vista.getTxtCedula().addKeyListener(validarCed);
    }

    private void crearSocio() {
        fila = 0;
        int ced;
        if (vista.getTxtNumCuenta().getText() == null || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtApellido().getText())
                || "".equals(vista.getTxtDireccion().getText()) || "".equals(vista.getTxtEmail().getText())
                || "".equals(vista.getTxtTelefono().getText()) || "".equals(vista.getTxtCedula().getText())) {
            JOptionPane.showMessageDialog(null, " Existen campos vacíos, llenar todos por favor ", "DATOS INCOMPLETOS", 0);
        } else {
            modelo.setCedula_socio(vista.getTxtCedula().getText());
            ced = modelo.validarCed();
            if (ced == 0) {
                int edad = 0;

                    Date fecha;
                    String formato = null;
                    
                    if (vista.getJdFechaNac().getDate() != null) {
                        fecha = vista.getJdFechaNac().getDate();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        formato = sdf.format(fecha);
                        edad = calcularEdad(formato);
                    }
                    if (edad >= 18) {

                        String ced_socio = vista.getTxtCedula().getText();
                        String num_cuenta = vista.getTxtNumCuenta().getText();
                        String nombre = vista.getTxtNombre().getText();
                        String apellido = vista.getTxtApellido().getText();
                        String correo = vista.getTxtEmail().getText();
                        String dir = vista.getTxtDireccion().getText();
                        String telf = vista.getTxtTelefono().getText();


                        Modelo_Socio socio = new Modelo_Socio();

                        socio.setCedula_socio(ced_socio);
                        socio.setNumero_cuenta(Integer.parseInt(num_cuenta));
                        socio.setNombre_socio(nombre);
                        socio.setApellido_socio(apellido);
                        socio.setCorreo_socio(correo);
                        socio.setDireccion_socio(dir);
                        socio.setTelefono_socio(telf);
                        socio.setFecha_nac_socio(formato);
                        socio.setFecha_ingreso(FechaActual());
                        if (socio.CrearSocio()) {
                            JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE");

                        } else {
                            JOptionPane.showMessageDialog(vista, "ERROR");
                        }
                        limpiar();
                        vista.getJDialogo().setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "El socio no puede ser menor de edad", null, 2);
                    }
//                }

            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un socio con esta cédula");
            }
        }

        cargarDatos();
    }

    private void editarSocio() {
        
        int op = JOptionPane.showOptionDialog(null,
                "¿Está seguro de modificar al socio a continuación?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
        if (op == 0) {

            if ("".equals(vista.getTxtNumCuenta().getText()) || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtApellido().getText())
                    || "".equals(vista.getTxtDireccion().getText()) || "".equals(vista.getTxtEmail().getText())
                    || "".equals(vista.getTxtTelefono().getText())) {
                JOptionPane.showMessageDialog(null, " Existen campos vacíos, llenar todos por favor ", "DATOS INCOMPLETOS", 0);
            } else {

                String cod_socio = vista.getTxtCodigo().getText();
                String ced_socio = vista.getTxtCedula().getText();
                String num_cuenta = vista.getTxtNumCuenta().getText();
                String nombre = vista.getTxtNombre().getText();
                String apellido = vista.getTxtApellido().getText();
                String correo = vista.getTxtEmail().getText();
                String dir = vista.getTxtDireccion().getText();
                String telf = vista.getTxtTelefono().getText();

                Date fecha;
                String formato = null;
                // Tranformar la fecha a String
                if (vista.getJdFechaNac().getDate() != null) {
                    fecha = vista.getJdFechaNac().getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(fecha);
                }

                Modelo_Socio socio = new Modelo_Socio();

                socio.setCedula_socio(ced_socio);
                socio.setNumero_cuenta(Integer.valueOf(num_cuenta));
                socio.setNombre_socio(nombre);
                socio.setApellido_socio(apellido);
                socio.setCorreo_socio(correo);
                socio.setDireccion_socio(dir);
                socio.setTelefono_socio(telf);
                socio.setFecha_nac_socio(formato);

                if (socio.editar_socio(cod_socio)) {
                    JOptionPane.showMessageDialog(vista, "SE HA MODIFICADO CORRECTAMENTE");

                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR");
                }
                limpiar();
                vista.getJDialogo().setVisible(false);

            }
            cargarDatos();
            desactivarBotones();
        }

    }
    private void desactivarBotones(){
        vista.getBtnModificar().setEnabled(false);
        vista.getBtnInactivar().setEnabled(false);
    }
    private void cargarDatos() {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtDatosSocio().getModel();
        dtm.setNumRows(0);
        List<Socio> lista = modelo.socios();
        lista.stream().forEach(s -> {
            String[] socio = {Integer.toString(s.getCodigo_socio()), s.getCedula_socio(),
                s.getNombre_socio(), s.getApellido_socio(), s.getCorreo_socio(), s.getDireccion_socio(),
                s.getTelefono_socio(), s.getFecha_nac_socio(), s.getFecha_ingreso()};
            dtm.addRow(socio);
        });
    }

    private void cargarDatosbusqueda(String aguja) {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtDatosSocio().getModel();
        dtm.setNumRows(0);
        List<Socio> lista = modelo.socios(aguja);
        lista.stream().forEach(s -> {
            String[] socio = {Integer.toString(s.getCodigo_socio()), s.getCedula_socio(),
                s.getNombre_socio(), s.getApellido_socio(), s.getCorreo_socio(), s.getDireccion_socio(),
                s.getTelefono_socio(), s.getFecha_nac_socio(), s.getFecha_ingreso()
            };
            dtm.addRow(socio);
        });
    }

    private int calcularEdad(String fecha_nac) {
        String convertirFecha = fecha_nac.toString();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(convertirFecha, formatoFecha);
        LocalDate fechaActual = LocalDate.now();

        Period fecha = Period.between(fechaNacimiento, fechaActual);
        int edad = fecha.getYears();
        return edad;
    }

    //Método para imprimir reportes con JasperStudio
    public void imprimirReporte() {
        ConexionPG con = new ConexionPG();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Reporte_Socios.jasper"));
            //Aquí se lee el parámetro segun el que ingresemos para poder imprimirlo en el Jasper
            Map<String, Object> parametro = new HashMap();
            String miaguja = vista.getTxtBuscar().getText();
            parametro.put("aguja", "%" + miaguja + "%");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(jp, false);//Poner false para que el resto de ventanas no se cierren
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para limpiar campos
    private void limpiar() {
        vista.getTxtCodigo().setText("");
        vista.getTxtNumCuenta().setText("");
        vista.getTxtCedula().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtDireccion().setText("");
        vista.getTxtTelefono().setText("");
        vista.getTxtEmail().setText("");
        vista.getJdFechaNac().setDate(null);

    }

    public void DefinirMetodo(int n) {
        if (n == 1) {
            fila = vista.getJtDatosSocio().getSelectedRow();
            crearSocio();
        } else if (n == 2) {
            fila = vista.getJtDatosSocio().getSelectedRow();
            editarSocio();
        }
    }

    public void mostrarDialogo(int origen) {
        vista.getJDialogo().setSize(711, 443);
        vista.getJDialogo().setLocationRelativeTo(vista);
        fila = vista.getJtDatosSocio().getSelectedRow();
        if (origen == 1) {
            n = 1;
            limpiar();
            vista.getJDialogo().setTitle("Crear Socio");
            vista.getLblCodigo().setVisible(false);
            vista.getTxtCodigo().setVisible(false);
            vista.getTxtCedula().setEditable(true);
        } else {
            n = 2;
            mostrarDatos();
            vista.getJDialogo().setTitle("Editar Socio");
            vista.getTxtCedula().setEditable(false);
            vista.getBtnNuevaCuenta().setVisible(false);
            vista.getLblCodigo().setVisible(true);
            vista.getTxtCodigo().setVisible(true);
        }
        vista.getJDialogo().setVisible(true);
    }

    public void mostrarDatos() {

        List<Socio> socios = modelo.socios();

        int fila = vista.getJtDatosSocio().getSelectedRow();

        vista.getTxtCodigo().setText(String.valueOf(socios.get(fila).getCodigo_socio()));
        vista.getTxtCedula().setText(String.valueOf(socios.get(fila).getCedula_socio()));
        vista.getTxtNombre().setText(String.valueOf(socios.get(fila).getNombre_socio()));
        vista.getTxtApellido().setText(String.valueOf(socios.get(fila).getApellido_socio()));
        vista.getTxtEmail().setText(String.valueOf(socios.get(fila).getCorreo_socio()));
        vista.getTxtDireccion().setText(String.valueOf(socios.get(fila).getDireccion_socio()));
        vista.getTxtTelefono().setText(String.valueOf(socios.get(fila).getTelefono_socio()));
        vista.getTxtNumCuenta().setText(String.valueOf(socios.get(fila).getNumero_cuenta()));
        vista.getTxtFechaIngreso().setText(String.valueOf(socios.get(fila).getFecha_ingreso()));

        //Transformar fecha
        String fecha = socios.get(fila).getFecha_nac_socio();
        String fechan[] = fecha.split("-");
        System.out.println(fecha);
        LocalDate fechanac = LocalDate.of(Integer.parseInt(fechan[0]), Integer.parseInt(fechan[1]), Integer.parseInt(fechan[2]));
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(fechanac.getYear(), fechanac.getMonthValue() - 1, fechanac.getDayOfMonth());
        vista.getJdFechaNac().setCalendar(calendar);

    }

    public void cancelar() {
        vista.getJDialogo().dispose();

    }
//Método para generar el numero de cuenta automático del socio

    public void nuevaCuenta() {
        List<Socio> ls = modelo.socios();
        int n;
        String num;
        do {
            n = 1;
            num = n + "";
            for (int i = 0; i < 9; i++) {

                n = (int) Math.floor(Math.random() * 9);
                num = num + n;
            }
            ls = modelo.nuevaCuenta(Integer.parseInt(num));
            if (ls.size() == 0) {
                break;
            }
        } while (true);
        vista.getTxtNumCuenta().setText(num);
    }

    public void inactivarSocio() {
        Modelo_Socio ms = new Modelo_Socio();
        int op = JOptionPane.showOptionDialog(null,
                "¿Está seguro que desea inactivar al socio seleccionado?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
        if (op == 0) {
            try {
                int fila = vista.getJtDatosSocio().getSelectedRow();
                String cedula = String.valueOf(vista.getJtDatosSocio().getValueAt(fila, 1));
                if (ms.inactivar_socio(cedula)) {
                    System.out.println(cedula);
                    JOptionPane.showMessageDialog(null, "Acción realizada correctamente");
                    cargarDatos();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR AL INACTIVAR", "TEOLAMDY", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA", "TEOLAMDY", 1);
        }
    }

    public void reactivarSocio() {
        Modelo_Socio ms = new Modelo_Socio();
        int op = JOptionPane.showOptionDialog(null,
                "¿Está seguro que desea reactivar al socio seleccionado?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
        if (op == 0) {
            try {
                int fila = vista.getJtDatosSocio().getSelectedRow();
                String cedula = String.valueOf(vista.getJtDatosSocio().getValueAt(fila, 1));
                if (ms.reactivarSocio(cedula)) {
                    System.out.println(cedula);
                    JOptionPane.showMessageDialog(null, "Acción realizada correctamente");
                    cargarDatos();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTIVAR SOCIO", "TEOLAMDY", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA", "TEOLAMDY", 1);
        }
    }

    public String FechaActual() {
        Date fechaDispositivo = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String fechaActual = sdf.format(fechaDispositivo);    
        return sdf.format(fechaDispositivo);
    }


}
