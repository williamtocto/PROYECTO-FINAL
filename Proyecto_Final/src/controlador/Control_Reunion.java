package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public void guardarReunion() throws ParseException {
        cargarDatos();
        modelo.setCodigo_reunion(codigo_reunion);
        modelo.setFecha_reunion(fecha_reunion);
        modelo.setDuracion_reunion(duracion_reunion);
        modelo.setTopico_reunion(topico_reunion);
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
                
            }
        }
    }
    
    public void modificarReunion(){
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

    public void cargarDatos() {
        codigo_reunion = Integer.parseInt(vista.getTxtCodReu().getText());
        fecha_reunion= formatoFecha();
        duracion_reunion= vista.getTxtDuracion().getText();
        topico_reunion=vista.getTxtTopic().getText();
    }
    
    public String formatoFecha(){
        if (vista.getJdFecha().getDate() != null) {
            fecha = vista.getJdFecha().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        return formato;
    }
    
    /*private void cargarDialogo(int origen) throws SQLException {
        vista.getDgPersona().setSize(600, 600);
        vista.getDgPersona().setLocationRelativeTo(vista);
        fila = vista.getTblPersonas().getSelectedRow();
        if (origen == 1) {
            vista.getDgPersona().setTitle("Crear Persona");
            n = 1;
            vista.getDgPersona().setVisible(true);

        } else {
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "IMPORTANTE", 2);
            } else {
                cargarDatos();
                vista.getDgPersona().setTitle("Editar Persona");
                n = 2;
                vista.getDgPersona().setVisible(true);
            }
        }
    }*/
    
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
