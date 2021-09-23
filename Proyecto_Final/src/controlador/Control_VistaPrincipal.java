
package controlador;

import modelo.Modelo_Usuario;
import vista.Vista_Principal;
import vista.Vista_Usuario;

public class Control_VistaPrincipal {
    private Vista_Principal vista;

    public Control_VistaPrincipal(Vista_Principal vista) {
        this.vista = vista;
        vista.setVisible(true);
        
    }
    
    public void incioControl() {
        
        // LOS DIFERENTES BOTONES DE LA VENTANA PRINCIPAL 
        vista.getMenu_MantenimientoUser().addActionListener(l->AgregarUsuario());
        
    }
    
    
    public void AgregarUsuario() {
        System.out.println("hola");
        Modelo_Usuario mu=new Modelo_Usuario();
        Vista_Usuario vu=new Vista_Usuario();
        vista.getDesk_Principal().add(vu);   
        Control_usuario c=new Control_usuario(mu, vu);
        c.iniciaControl();   
    }
    
  
    
    
}
