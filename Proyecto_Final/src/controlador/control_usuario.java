package controlador;

import Vista.Login;
import java.sql.SQLException;
import java.util.List;
import modelo.Modelo_Login;
import modelo.Usuario;
import vista.Ventana_principal;

public class control_usuario {

    private Modelo_Login modelo;
    private Vista.Login vista;

    Modelo_Login login = new Modelo_Login();

    public control_usuario(Modelo_Login modelo, Login vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("LOGIN");
        vista.setVisible(true);

    }

    public void validarUsuario() throws SQLException {
        
        String usuario=vista.getTxtUsuari().getText();
        String clave=vista.getTxt_Password().getText();   
        Usuario usu = new Usuario();
        Modelo_Login m=new Modelo_Login();
        m.Usuario(usuario, clave);
        usu.getCodig_rol();
        Ventana_principal ven=new Ventana_principal();
        
        
    }

}
