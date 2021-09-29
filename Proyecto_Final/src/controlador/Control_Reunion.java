package controlador;

import modelo.Modelo_Reunion;
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

    public Control_Reunion(Modelo_Reunion modelo, Vista_Reunion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("REUNION");
        vista.setVisible(true);
    }

    public Control_Reunion() {
    }

    public void guardarReunion() {

    }

    public void cargarDatos() {
        codigo_reunion=Integer.parseInt(vista.getTxtCodReu().getText());
        String fecha_reunion;
        String duracion_reunion;
        String topico_reunion;
    }
}
