package controlador;

import modelo.Modelo_Multa;
import vista.Vista_Multa;

public class Control_Multa {

    private Modelo_Multa modelo;
    private Vista_Multa vista;

    public Control_Multa(Modelo_Multa modelo, Vista_Multa vista) {
        this.modelo = modelo;
        this.vista = vista;
        System.out.println("cpmnssss");
        vista.setTitle("Cobrar Multas");
        vista.setVisible(true);
    }
    
    

}
