
package controlador;

import modelo.Modelo_Rol;
import modelo.Modelo_Usuario;
import vista.Vista_Principal;
import vista.Vista_Rol;
import vista.Vista_Usuario;

public class Control_VistaPrincipal {
    private Vista_Principal vista;

    public Control_VistaPrincipal(Vista_Principal vista) {
        this.vista = vista;
        vista.setVisible(true);
        
    }
    
    public void incioControl() {
        System.out.println("roooooooooool");
        
        // LOS DIFERENTES BOTONES DE LA VENTANA PRINCIPAL 
        vista.getMenu_MantenimientoUser().addActionListener(l->AgregarUsuario());
        vista.getMenuRol().addActionListener(l-> IniciarVentanaRol());
        
    }
    
    
    public void AgregarUsuario() {
        System.out.println("hola");
        Modelo_Usuario mu=new Modelo_Usuario();
        Vista_Usuario vu=new Vista_Usuario();
        vista.getDesk_Principal().add(vu);   
     //  Control_usuario c=new Control_usuario(mu, vu);
      // c.iniciaControl();   
    }
    
    public void IniciarVentanaRol() {
        System.out.println("hola ");
        Modelo_Rol mr=new Modelo_Rol();
        Vista_Rol vr=new Vista_Rol();
        vista.getDesk_Principal().add(vr);
        Control_Rol cr=new Control_Rol(mr, vr);
        cr.iniciaControl();  
    }
    
  
    
    
}
