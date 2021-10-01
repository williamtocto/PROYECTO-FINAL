/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.Vista_Principal;


public class Modelo_Login extends Usuario{
    
        ConexionPG con=new ConexionPG();
    
    public void Usuario(String usuario, String clave) throws SQLException {

        String sql = "select * from usuario where usuario='" + usuario + "' and contrasenia='" + clave + "'";
        try (ResultSet rs = con.consulta(sql)) {
            if (rs.next()) {
                Usuario usu = new Usuario();
                usu.setCodig_rol(rs.getInt("codigo_rol"));
            } else {
                JOptionPane.showMessageDialog(null, "ERROR USUARIO NO REGISTRADO", "", 2);
            }
            rs.close();
        }

    }
    
    public void ValidarUsuario() {
   
    }
}
