package controlador;

import Vista.Login;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_Usuario;
import modelo.Usuario;
import vista.Ventana_Principal;

public class control_usuario {

    private Modelo_Usuario modelo;
    private Login vista;

    Modelo_Usuario login = new Modelo_Usuario();

    public control_usuario(Modelo_Usuario modelo, Login vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("LOGIN");
        vista.setVisible(true);

    }

    public void validarUsuario() throws SQLException {
        
        String usuario=vista.getTxtUsuari().getText();
        String clave=vista.getTxt_Password().getText();   
        Usuario usu = new Usuario();
        Modelo_Usuario m=new Modelo_Usuario();
        m.Usuario(usuario, clave);
        if (usu.getCodig_rol()!=0 ) {
            Ventana_Principal ven=new Ventana_Principal(usu.getCodig_rol());
        } 
        
            
    }
    
    public void iniciaControl() {
       vista.getbtnIngresar().addActionListener(l-> {
           try {
               validarUsuario();
           } catch (SQLException ex) {
               Logger.getLogger(control_usuario.class.getName()).log(Level.SEVERE, null, ex);
           }
       });    
    }
    
    
    
    
    
    
}
