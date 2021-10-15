
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modelo_Login extends Usuario {

    ConexionPG con = new ConexionPG();

    public int ValidarUsuario() throws SQLException {

        String sql = "select * from usuario where usuario='" + getUsuario() + "' and contrasenia='" + getContrasenia() + "'";
        System.out.println(getUsuario()+getContrasenia());   
        ResultSet rs = con.consulta(sql);      
        if (rs.next()) {
            System.out.println(rs.getInt("codigo_rol"));
            return rs.getInt("codigo_rol");          
        } else {
            JOptionPane.showMessageDialog(null, "ERROR USUARIO NO REGISTRADO", "", 2);
        }
        rs.close();
        return 0;
    }


}
