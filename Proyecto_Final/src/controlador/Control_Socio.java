/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
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

/**
 *
 * @author TUF Gaming
 */
public class Control_Socio {

    private Modelo_Socio modelo;
    private Vista_Socio vista;
    int fila, n;

    public Control_Socio(Modelo_Socio modelo, Vista_Socio vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
        cargarDatos();
        vista.getBtnModificar().setEnabled(false);
        vista.getBtnInactivar().setEnabled(false);
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
        KeyListener validar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vista.getTxtNombre() || e.getSource() == vista.getTxtApellido()) {
                    char caracter = e.getKeyChar();

                    // Verificar si la tecla pulsada no es un digito
                    char c = e.getKeyChar();
                    if (Character.isDigit(c) == false) {
                    } else {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo letras en este campo", "ERROR", 0);
                    }
                }
                if (e.getSource() == vista.getTxtCodigo() || e.getSource() == vista.getTxtCedula() || e.getSource() == vista.getTxtNumCuenta() || e.getSource() == vista.getTxtTelefono()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    if (((caracter < '0')
                            || (caracter > '9'))
                            && (caracter != '\b')) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo numeros en este campo", "ERROR", 0);// ignorar el evento de teclado
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        KeyListener buscador = new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                cargarDatosbusqueda(vista.getTxtBuscar().getText());
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }
        };
        vista.getJtDatosSocio().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });
//        vista.getBtnRegistrar().addActionListener(l -> crearSocio());
        vista.getTxtBuscar().addKeyListener(buscador);
        vista.getBtnRegistrar().addActionListener(l -> mostrarDialogo(1));
        vista.getBtnModificar().addActionListener(l -> mostrarDialogo(2));
//        vista.getBtnInactivar().addActionListener(l -> inactivarSocio());
        vista.getBtnAceptar().addActionListener(l -> DefinirMetodo(n));
        vista.getBtnCancelar().addActionListener(l -> cancelar());
        vista.getBtnLimpiar().addActionListener(l -> limpiar());
        vista.getBtnImprimir().addActionListener(l -> imprimirReporte());
        vista.getBtnNuevaCuenta().addActionListener(l -> nuevaCuenta());
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vista.getTxtApellido().addKeyListener(validar);
        vista.getTxtCedula().addKeyListener(validar);
        vista.getTxtCodigo().addKeyListener(validar);
        vista.getTxtNombre().addKeyListener(validar);
        vista.getTxtNumCuenta().addKeyListener(validar);
        vista.getTxtTelefono().addKeyListener(validar);
    }

    private void crearSocio() {

//        String cod_socio = vista.getTxtCodigo().getText();
        String ced_socio = vista.getTxtCedula().getText();
        String num_cuenta = vista.getTxtNumCuenta().getText();
        String nombre = vista.getTxtNombre().getText();
        String apellido = vista.getTxtApellido().getText();
        String correo = vista.getTxtEmail().getText();
        String dir = vista.getTxtDireccion().getText();
        String telf = vista.getTxtTelefono().getText();

        Date fecha;
        Date fecha2;
        String formato = null;
        String formato2 = null;
        // Tranformar la fecha a String
        if (vista.getJdFechaNac().getDate() != null) {
            fecha = vista.getJdFechaNac().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (vista.getJdFechaIng().getDate() != null) {
            fecha2 = vista.getJdFechaIng().getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            formato2 = sdf2.format(fecha2);
        }
        System.out.println(formato);
        System.out.println(formato2);
        Modelo_Socio socio = new Modelo_Socio();

//        socio.setCodigo_socio(Integer.parseInt(cod_socio));
        socio.setCedula_socio(ced_socio);
        socio.setNumero_cuenta(Integer.parseInt(num_cuenta));
        socio.setNombre_socio(nombre);
        socio.setApellido_socio(apellido);
        socio.setCorreo_socio(correo);
        socio.setDireccion_socio(dir);
        socio.setTelefono_socio(telf);
        socio.setFecha_nac_socio(formato);
        socio.setFecha_ingreso(formato2);

        if (socio.CrearSocio()) {
            JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE");

        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
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

    private void editarSocio() {

        String cod_socio = vista.getTxtCodigo().getText();
        String ced_socio = vista.getTxtCedula().getText();
        String num_cuenta = vista.getTxtNumCuenta().getText();
        String nombre = vista.getTxtNombre().getText();
        String apellido = vista.getTxtApellido().getText();
        String correo = vista.getTxtEmail().getText();
        String dir = vista.getTxtDireccion().getText();
        String telf = vista.getTxtTelefono().getText();
  
        Date fecha;
        Date fecha2;
        String formato = null;
        String formato2 = null;
        // Tranformar la fecha a String
        if (vista.getJdFechaNac().getDate() != null) {
            fecha = vista.getJdFechaNac().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (vista.getJdFechaIng().getDate() != null) {
            fecha2 = vista.getJdFechaIng().getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            formato2 = sdf2.format(fecha2);
        }

        Modelo_Socio socio = new Modelo_Socio();

        socio.setCodigo_socio(Integer.valueOf(cod_socio));
        socio.setCedula_socio(ced_socio);
        socio.setNumero_cuenta(Integer.valueOf(num_cuenta));
        socio.setNombre_socio(nombre);
        socio.setApellido_socio(apellido);
        socio.setCorreo_socio(correo);
        socio.setDireccion_socio(dir);
        socio.setTelefono_socio(telf);
        socio.setFecha_nac_socio(formato);
        socio.setFecha_ingreso(formato2);

        if (socio.editar_socio(cod_socio)) {
            JOptionPane.showMessageDialog(vista, "SE HA MODIFICADO CORRECTAMENTE");

        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
    }

    private String calcularEdad(Date fecha_nac) {
        String convertirFecha = fecha_nac.toString();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(convertirFecha, formatoFecha);
        LocalDate fechaActual = LocalDate.now();

        Period fecha = Period.between(fechaNacimiento, fechaActual);
        return String.valueOf(fecha.getYears());
    }

    //Método para imprimir reportes con JasperStudio
    public void imprimirReporte() {
        ConexionPG con = new ConexionPG();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Reporte_Socios.jasper"));
            //Aquí se lee el parámetro segun el que ingresemos para poder imprimirlo en el Jasper
            Map<String, Object> parametro = new HashMap<String, Object>();
            String miaguja = vista.getTxtBuscar().getText();
            parametro.put("aguja", "%" + miaguja + "%");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_Socio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para limpiar campos
    private void limpiar() {
        vista.getTxtCodigo().setText("");
        vista.getTxtCedula().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtDireccion().setText("");
        vista.getTxtTelefono().setText("");
        vista.getTxtEmail().setText("");
        vista.getJdFechaNac().setDate(null);
        vista.getJdFechaIng().setDate(null);
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
        vista.getJDialogo().setSize(745, 520);
        vista.getJDialogo().setLocationRelativeTo(vista);
        fila = vista.getJtDatosSocio().getSelectedRow();
        if (origen == 1) {
            n = 1;
            vista.getJDialogo().setTitle("Crear Socio");
        } else {
            n = 2;
            mostrarDatos();

            vista.getJDialogo().setTitle("Editar Socio");
        }
        vista.getJDialogo().setVisible(true);

    }

    public void mostrarDatos() {

        List<Socio> socios = modelo.socios(vista.getTxtBuscar().getText());

        int fila = vista.getJtDatosSocio().getSelectedRow();

        vista.getTxtCodigo().setText(String.valueOf(socios.get(fila).getCodigo_socio()));
        vista.getTxtCedula().setText(String.valueOf(socios.get(fila).getCedula_socio()));
        vista.getTxtNombre().setText(String.valueOf(socios.get(fila).getNombre_socio()));
        vista.getTxtApellido().setText(String.valueOf(socios.get(fila).getApellido_socio()));
        vista.getTxtEmail().setText(String.valueOf(socios.get(fila).getCorreo_socio()));
        vista.getTxtDireccion().setText(String.valueOf(socios.get(fila).getDireccion_socio()));
        vista.getTxtTelefono().setText(String.valueOf(socios.get(fila).getTelefono_socio()));
        //Transformar fecha
        String fecha = socios.get(fila).getFecha_nac_socio();
        String fechan[] = fecha.split("-");
        System.out.println(fecha);
        LocalDate fechanac = LocalDate.of(Integer.parseInt(fechan[0]), Integer.parseInt(fechan[1]), Integer.parseInt(fechan[2]));
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(fechanac.getYear(), fechanac.getMonthValue() - 1, fechanac.getDayOfMonth());
        vista.getJdFechaNac().setCalendar(calendar);

        fecha = socios.get(fila).getFecha_ingreso();
        String fechai[] = fecha.split("-");
        LocalDate fechain = LocalDate.of(Integer.parseInt(fechai[0]), Integer.parseInt(fechai[1]), Integer.parseInt(fechai[2]));
        calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(fechain.getYear(), fechain.getMonthValue() - 1, fechain.getDayOfMonth());
        vista.getJdFechaIng().setCalendar(calendar);

//   
    }

    public void cancelar() {
        vista.getJDialogo().dispose();

    }

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

//    public void inactivarSocio() {
//        Modelo_Socio modelo = new Modelo_Socio();
//        int op = JOptionPane.showOptionDialog(null,
//                "¿Está seguro que desea inactivar al socio seleccionado?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
//        if (op == 0) {
//            try {
//                String codigo = vista.getTxtCodigo().getText();
//                modelo.inactivar_socio(codigo);
//                cargarDatos();
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "ERROR AL INACTIVAR", "TEOLAMDY", 0);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "ACCION CANCELADA", "TEOLAMDY", 1);
//        }
//    }
//    
}
