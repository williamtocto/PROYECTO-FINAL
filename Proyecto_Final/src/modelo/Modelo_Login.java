package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Modelo_Login extends Usuario {

    ConexionPG con = new ConexionPG();

    public Modelo_Login() {
    }

    public Modelo_Login(int codigo_usario, int codigo_socio, int codig_rol, String usuario, String contraseña) {
        super(codigo_usario, codigo_socio, codig_rol, usuario, contraseña);
    }

    public void Usuario(String usuario, String clave) throws SQLException {
        String sql = "select * from usuario where usuario='" + usuario + "' and contrasenia='" + clave + "'";
        try (ResultSet rs = con.consulta(sql)) {
            if (rs.next()) {
                Usuario usu = new Usuario();
                usu.setCodig_rol(rs.getInt("codigo_rol"));
            } else {
                JOptionPane.showMessageDialog(null, "ERROR USUARIO NO REGISTRADO", "TEOLAM", 2);
            }
        }

    }

}
