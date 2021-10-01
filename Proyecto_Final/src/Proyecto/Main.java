package Proyecto;

import Vista.Vista_Login;
import controlador.Control_VistaPrincipal;
import modelo.Modelo_Usuario;
import vista.Vista_Principal;

public class Main {

    public static void main(String[] args) {

        // Modelo_Usuario modelo = new Modelo_Usuario();
        //  Vista_Login vista = new Vista_Login();
        //  Control_Usuario control = new Control_Usuario(modelo, vista);
        //control.iniciaControl();
        Vista_Principal vp = new Vista_Principal();
        Control_VistaPrincipal cp = new Control_VistaPrincipal(vp);
        cp.incioControl();

    }

}
