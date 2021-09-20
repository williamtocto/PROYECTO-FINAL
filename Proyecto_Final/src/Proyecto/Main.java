
package Proyecto;

import Vista.Login;
import controlador.control_usuario;
import modelo.Modelo_Usuario;

public class Main {

    public static void main(String[] args) {
        Modelo_Usuario modelo = new Modelo_Usuario();
        Login vista = new Login();
        control_usuario control = new control_usuario(modelo, vista);
        control.iniciaControl();
    }
    
}
