
package controlador;

import Vista.Vista_Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_Login;
import modelo.Modelo_Usuario;
import modelo.Usuario;
import vista.Vista_Principal;

/**
 *
 * @author PCX
 */
public class Control_Login {
    
    private Modelo_Usuario modelo;
    private Vista_Login vista;
    
    public void validarUsuario() throws SQLException {

        String usuario = vista.getTxtUsuari().getText();
        String clave = vista.getTxt_Password().getText();
        Usuario usu = new Usuario();
        Modelo_Login m= new Modelo_Login();
        m.Usuario(usuario, clave);
        if (usu.getCodig_rol() != 0) {
            Vista_Principal ven = new Vista_Principal(usu.getCodig_rol());
        }
    }

    
    public void IniciaControl() {
        
           vista.getbtnIngresar().addActionListener(l -> {
            try {
                validarUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }
    
}
