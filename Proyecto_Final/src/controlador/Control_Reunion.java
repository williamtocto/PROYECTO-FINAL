package controlador;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Reunion;
import modelo.Reunion;
import vista.Vista_Reunion;

/**
 *
 * @author Mateo
 */
public class Control_Reunion {

    private Modelo_Reunion modelo;
    private Vista_Reunion vista;

    //int codigo_reunion;
    String fecha_reunion;
    Date fecha = null;
    String formato = null;
    String formato2 = null;
    String ruta = "";
    int fila;
    int n;

    public Control_Reunion(Modelo_Reunion modelo, Vista_Reunion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("REUNION");
        vista.setVisible(true);
        cargarLista("");
        vista.getBtnModificar().setEnabled(false);
        vista.getBtnEliminar().setEnabled(false);
    }

    //Metodo para habilitar los botones cuando le de clic a un dato de la tabla
    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = vista.getJTdatos().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vista.getJTdatos().getRowHeight();
        if (row < vista.getJTdatos().getRowCount() && row >= 0 && column < vista.getJTdatos().getColumnCount() && column >= 0) {
            vista.getBtnModificar().setEnabled(true);
            vista.getBtnEliminar().setEnabled(true);
        } else {
            String name = "" + vista.getJTdatos().getValueAt(row, 1);
        }

    }

    public Control_Reunion() {
    }

    public void iniciaControl() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vista.getTxtTopic()) {
                    char caracter = e.getKeyChar();

                    // Verificar si la tecla pulsada no es un digito
                    char c = e.getKeyChar();
                    if (Character.isDigit(c) == false) {
                    } else {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo letras en este campo", "ERROR", 0);
                    }
                }
                if (e.getSource() == vista.getTxtDuracion()) {
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
                cargarLista(vista.getTxtBuscar().getText());
            }

        };

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarDatos();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        };

        vista.getJTdatos().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });

        vista.getBtnGuardar().addActionListener(l -> {
            try {
                guardarReunion();
            } catch (ParseException ex) {
                Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getBtnModificar().addActionListener(l -> modificarReunion());
        vista.getBtnEliminar().addActionListener(l -> eliminarReunion());
        vista.getJTdatos().addMouseListener(ml);
        vista.getTxtBuscar().addKeyListener(kl);
        vista.getBtnLimpiar().addActionListener(l -> limpiar());
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vista.getTxtDuracion().addKeyListener(kl);
        vista.getTxtTopic().addKeyListener(kl);
    }

    public void guardarReunion() throws ParseException {
        int verificarFecha;
        int fila = 0;
        if (vista.getJdFecha().getDate() == null || "".equals(vista.getTxtDuracion().getText()) || "".equals(vista.getTxtTopic().getText())) {
            JOptionPane.showMessageDialog(null, " EXISTEN CAMPOS VACIOS DEBE LLENAR TODOS", "ERROR", 0);
        } else {
            verificarFecha = ValidarFechaIngreso();
            if (verificarFecha == 1) {
                JOptionPane.showMessageDialog(null, " LA FECHA NO PUEDE SER ANTERIOR AL DIA ACTUAL", "ERROR", 0);
            } else {
                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(vista.getJdFecha().getDate());
                }
                String format = null;

                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    format = sdf.format(vista.getJdFecha().getDate());
                }
                //modelo.consultaFecha(format);
                System.out.println("LA FECHA NO ES MENOR");
                fila=0;
                //if(  1  <  0)
                Date fechaDispositivo = new Date();
                Date fecha = null;
                String fechaIngreso = null;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaActual = sdf.format(fechaDispositivo);
                // Tranformar la fecha a String
                if (vista.getJdFecha().getDate() != null) {
                    fechaIngreso = sdf.format(vista.getJdFecha().getDate());
                    // PARSE PARA COMPARAR LAS FECHAS
                    fechaDispositivo = sdf.parse(fechaActual);
                    fecha = sdf.parse(fechaIngreso);
                    fila = fechaDispositivo.compareTo(fecha);
                    System.out.println("ingreso" + fila +"");
                }
                
                if (modelo.consultaFecha(format)!=0) {
                    JOptionPane.showMessageDialog(null, "LA REUNION YA EXISTE NO SE PÚEDE CREAR", "TEOLAM", 0);
                } else {
                    System.out.println("GUARDANDO FECHA");
                    System.out.println("FECHA = CERO");
                    String duracion_reunion = vista.getTxtDuracion().getText();
                    String topico_reunion = vista.getTxtTopic().getText();
                    modelo.setFecha_reunion(format);
                    modelo.setDuracion_reunion(duracion_reunion);
                    modelo.setTopico_reunion(topico_reunion);
                    if (modelo.AgregarReunion()) {
                        JOptionPane.showMessageDialog(null, "Se guardo la reunion correctamente", "", 1);
                        cargarLista("");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha podido guardar", "Error", 0);
                    }
                }
            }
        }
    }

    public void modificarReunion() {
        fila = vista.getJTdatos().getSelectedRow();
        if (fila == 0) {
            JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "ADVERTENCIA", 2);
        } else {
            int resp;
            Component rootPane = null;
            resp = JOptionPane.showConfirmDialog(rootPane, "¿DESEA MODIFICAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                if (fila <= 0) {
                    String codigo_reunion = vista.getTxtCodReu().getText();
                    String duracion_reunion = vista.getTxtDuracion().getText();
                    String topico_reunion = vista.getTxtTopic().getText();
                    if (vista.getJdFecha().getDate() != null) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        formato = sdf.format(vista.getJdFecha().getDate());
                    }
                    String format = null;
                    fila = 0;
                    if (vista.getJdFecha().getDate() != null) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        format = sdf.format(vista.getJdFecha().getDate());
                    }
                    //modelo.setCodigo_reunion(codigo_reunion);
                    modelo.setFecha_reunion(format);
                    modelo.setDuracion_reunion(duracion_reunion);
                    modelo.setTopico_reunion(topico_reunion);
                    if (modelo.modificarReunion(codigo_reunion)) {
                        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "", 1);
                        cargarLista("");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha podido modificar", "Error", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
            }

        }
    }

    public void eliminarReunion() {
        fila = vista.getJTdatos().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "ADVERTENCIA", 2);
        } else {
            modelo.setCodigo_reunion(Integer.parseInt(String.valueOf(vista.getJTdatos().getValueAt(fila, 0))));
            int resp;
            Component rootPane = null;
            resp = JOptionPane.showConfirmDialog(rootPane, "¿DESEA ELIMNAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                String codigoReu = String.valueOf(vista.getJTdatos().getValueAt(fila, 0));
                if (modelo.eliminarReunion(codigoReu)) {
                    JOptionPane.showMessageDialog(null, "La reunion fue ELIMINADA con Exito", "", 1);
                    cargarLista("");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar, existe asistencias de la misma", "", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
            }
        }
    }

    public void cargarLista(String aguja) {
        //aguja=vista.getTxtCodReu().getText();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getJTdatos().getModel();
        tblModel.setNumRows(0);
        List<Reunion> lista = modelo.listaReunion(aguja);
        lista.stream().forEach(r -> {
            String[] reuni1 = {String.valueOf(r.getCodigo_reunion()), r.getFecha_reunion(), r.getDuracion_reunion(), r.getTopico_reunion()};
            tblModel.addRow(reuni1);
        });
    }

    public void cargarDatos() {
        int fila = vista.getJTdatos().getSelectedRow();
        vista.getTxtCodReu().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 0)));
        List<Reunion> reunions = modelo.listaReunion(vista.getTxtBuscar().getText());
        String fecha = reunions.get(fila).getFecha_reunion();
        String fechan[] = fecha.split("-");
        LocalDate fechanac = LocalDate.of(Integer.parseInt(fechan[0]), Integer.parseInt(fechan[1]), Integer.parseInt(fechan[2]));
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(fechanac.getYear(), fechanac.getMonthValue() - 1, fechanac.getDayOfMonth());
        vista.getJdFecha().setCalendar(calendar);
        vista.getTxtDuracion().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 2)));
        vista.getTxtTopic().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 3)));
    }

    public String formatoFecha() {
        if (vista.getJdFecha().getDate() != null) {
            fecha = vista.getJdFecha().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        return formato;
    }

    public int ValidarFechaIngreso() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaIngreso = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (vista.getJdFecha().getDate() != null) {
            fechaIngreso = sdf.format(vista.getJdFecha().getDate());
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaIngreso);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;
    }

    //Método para limpiar campos
    private void limpiar() {
        vista.getTxtCodReu().setText("");
        vista.getTxtDuracion().setText("");
        vista.getTxtTopic().setText("");
        vista.getJdFecha().setDate(null);
    }

    public void BuscarPorFecha(JTable tabla, Date date, Date date1) {
        Date fecha1 = null;
        Date fecha2 = null;
        String aguja1 = null;
        String aguja2 = null;

    }
}
