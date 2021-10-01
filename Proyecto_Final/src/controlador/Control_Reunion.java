package controlador;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

    int codigo_reunion;
    String fecha_reunion;
    String duracion_reunion;
    String topico_reunion;
    Date fecha = null;
    String formato = null;
    String formato2 = null;
    String ruta = "";
    int fila = -1;
    int n;

    public Control_Reunion(Modelo_Reunion modelo, Vista_Reunion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("REUNION");
        vista.setVisible(true);
    }

    public Control_Reunion() {
    }
    
    public void iniciaControl(){
        KeyListener kl = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        
        MouseListener ml = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
       //vu.getBtn_aceptar().addActionListener(l -> DefinirMetodo(n));
       vista.getBtnGuardar().addActionListener(l -> {
            try {
                guardarReunion();
            } catch (ParseException ex) {
                Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
       
       vista.getBtnModificar().addActionListener(l -> modificarReunion());
       vista.getBtnEliminar().addActionListener(l -> eliminarReunion());
       vista.getBtnConsultar().addActionListener(l -> {
            try {
                cargarDialogo(1);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }

    public void guardarReunion() throws ParseException {
        cargarDatos();
        int verificarFecha;
        if (vista.getJdFecha() == null || "".equals(vista.getTxtDuracion()) || "".equals(vista.getTxtTopic())) {

            JOptionPane.showMessageDialog(null, " EXISTEN CAMPOS VACIOS DEBE LLENAR TODOS", "TEOLAM", 0);

        } else {

            verificarFecha = ValidarFechaIngreso();
            if (verificarFecha == -1) {
                JOptionPane.showMessageDialog(null, " LA FECHA ES INCORRECTA", "TEOLAM", 0);

            } else {

                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(vista.getJdFecha().getDate());
                }
                String format = null;
                int fila = 0;

                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    format = sdf.format(vista.getJdFecha().getDate());
                }

                if (fila <= 0) {

                    modelo.setCodigo_reunion(codigo_reunion);
                    modelo.setFecha_reunion(fecha_reunion);
                    modelo.setDuracion_reunion(duracion_reunion);
                    modelo.setTopico_reunion(topico_reunion);
                    int codigo_reunion = 0;
                    codigo_reunion = Integer.parseInt(vista.getTxtCodReu().getText());
                    if (modelo.AgregarReunion()) {
                        JOptionPane.showInputDialog(null, "Se ha guardado correctamente", "", 1);
                    } else {
                        JOptionPane.showInputDialog(null, "Error", "", 0);
                    }
                    //Asistencia_Ventana asis = new Asistencia_Ventana(formato, codigo_reunion);
                    //asis.setVisible(true);
                }
            }

        }

    }

    public void modificarReunion() {
        cargarDatos();
        modelo.setCodigo_reunion(codigo_reunion);
        modelo.setFecha_reunion(fecha_reunion);
        modelo.setDuracion_reunion(duracion_reunion);
        modelo.setTopico_reunion(topico_reunion);
        if (modelo.modificarReunion()) {
            JOptionPane.showInputDialog(null, "Se ha modificado correctamente", "", 1);
        } else {
            JOptionPane.showInputDialog(null, "Error", "", 0);
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
                if (fila <= 0) {
                    if (modelo.eliminarReunion()) {
                        cargarDatos();
                        JOptionPane.showMessageDialog(null, "La reunion fue ELIMINADA con Exito", "", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se a podido eliminar", "", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
            }
        }
    }

    public void cargarDatos() {
        codigo_reunion = Integer.parseInt(vista.getTxtCodReu().getText());
        fecha_reunion = formatoFecha();
        duracion_reunion = vista.getTxtDuracion().getText();
        topico_reunion = vista.getTxtTopic().getText();
    }

    public String formatoFecha() {
        if (vista.getJdFecha().getDate() != null) {
            fecha = vista.getJdFecha().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        return formato;
    }

    private void cargarDialogo(int origen) throws SQLException {
        vista.getDgReunion().setSize(600, 600);
        vista.getDgReunion().setLocationRelativeTo(vista);
        fila = vista.getJTdatos().getSelectedRow();
        if (origen == 1) {
            vista.getDgReunion().setTitle("Consultar Reunion");
            n = 1;
            vista.getDgReunion().setVisible(true);
        }
    }

    public int ValidarFechaIngreso() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaIngreso = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (vista.getJdFecha() != null) {
            fechaIngreso = sdf.format(vista.getJdFecha());
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaIngreso);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;
    }
}
