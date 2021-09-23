
package Proyecto;

import Vista.Vista_Login;
import controlador.Control_usuario;
import modelo.Modelo_Usuario;

public class Main {

    public static void main(String[] args) {
        Modelo_Usuario modelo = new Modelo_Usuario();
        Vista_Login vista = new Vista_Login();
        Control_usuario control = new Control_usuario(modelo, vista);
        control.iniciaControl();
    }
    
}
