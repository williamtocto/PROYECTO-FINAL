package controlador;

import modelo.Modelo_Rol;
import vista.Vista_Rol;

public class Control_Rol {

    private Modelo_Rol modelo;
    private Vista_Rol vista;

    public Control_Rol(Modelo_Rol modelo, Vista_Rol vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Crud Roles");
        vista.setVisible(true);
       
    }
    
    public void iniciaControl() {
        
    }
    
    
    public void cargarLista() {
        
    }
    
    
    
    
    

}
