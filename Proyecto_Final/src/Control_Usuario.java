
import Vista.Vista_Login;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_Usuario;
import modelo.Usuario;
import vista.Vista_Principal;

public class Control_Usuario {

    private Modelo_Usuario modelo;
    private Vista_Login vista;

    Modelo_Usuario login = new Modelo_Usuario();

    public Control_Usuario(Modelo_Usuario modelo, Vista_Login vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("LOGIN");
        vista.setVisible(true);

    }

    public void validarUsuario() throws SQLException {

        String usuario = vista.getTxtUsuari().getText();
        String clave = vista.getTxt_Password().getText();
        Usuario usu = new Usuario();
        Modelo_Usuario m = new Modelo_Usuario();
        m.Usuario(usuario, clave);
        if (usu.getCodig_rol() != 0) {
            Vista_Principal ven = new Vista_Principal(usu.getCodig_rol());
        }
    }

    public void iniciaControl() {
        vista.getbtnIngresar().addActionListener(l -> {
            try {
                validarUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void grabarUsuario() {

        int codigo_socio = Integer.parseInt(vista.getTxtUsuari().getText());
        
        
       // int codigo_socio = Integer.parseInt(vista.getTxtUsuari().getText());
       // int codigo_socio = Integer.parseInt(vista.getTxtUsuari().getText());

    }

}