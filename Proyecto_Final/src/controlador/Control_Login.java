package controlador;

import Vista.Vista_Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_Login;
import vista.Vista_Principal;

public class Control_Login {

    private Modelo_Login modelo;
    private Vista_Login vista;

    public Control_Login(Modelo_Login modelo, Vista_Login vista) throws SQLException {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Inicio");
        vista.setVisible(true);

    }

    public void validarUsuario() throws SQLException {

        String usuario = vista.getTxtUsuari().getText();
        String clave = vista.getTxt_Password().getText();
        modelo.setUsuario(usuario);
        modelo.setContrasenia(clave);
        int codigo = modelo.ValidarUsuario();
        if (codigo != 0) {            
        Vista_Principal vp = new Vista_Principal(codigo);
        Control_VistaPrincipal cp = new Control_VistaPrincipal(vp);
        cp.incioControl();
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
