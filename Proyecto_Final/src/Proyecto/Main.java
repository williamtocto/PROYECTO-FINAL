package Proyecto;

import vista.Vista_Login;
import controlador.Control_Login;
import java.sql.SQLException;
import modelo.Modelo_Login;


public class Main {

    public static void main(String[] args) throws SQLException {
        Modelo_Login ml = new Modelo_Login();
        Vista_Login vista = new Vista_Login();
        Control_Login control = new Control_Login(ml, vista);
        control.IniciaControl();

    }

}
