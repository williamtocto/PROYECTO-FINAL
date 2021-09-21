package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modelo_Usuario extends Usuario {

    ConexionPG con = new ConexionPG();

    public Modelo_Usuario() {
    }

    public Modelo_Usuario(int codigo_usario, int codigo_socio, int codig_rol, String usuario, String contraseña) {
        super(codigo_usario, codigo_socio, codig_rol, usuario, contraseña);
    }

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

    public void AgregarUsuario() {
        String sql = "INSERT INTO usuario(codigo_socio,codigo_rol,usuario,contrasenia) "
                + "VALUES (" + getUsuario() + "," + getCodig_rol() + ",'" + getUsuario() + "','" + getContrasenia() + "');";
        if (con.accion(sql)) {
            JOptionPane.showInputDialog(null, "Usuario Registrado con Éxito", "", 1);
        }

    }

    public void modificarUsuario() {
        String sql = "UPDATE usuario set usuario='" + getUsuario() + "',contrasenia='" + getContrasenia()
                + "' where codigo_usuario=" + getCodigo_usuario() + ";";
        if (con.accion(sql)) {
            JOptionPane.showInputDialog(null, "Usuario Modificado con Éxito", "", 1);
        }
    }
    
    public void EliminarUsuario() {
        String sql=" DELETE FROM usuario  WHERE codigo_usuario='"+getCodigo_usuario()+"';";
        if (con.accion(sql)) {
            JOptionPane.showInputDialog(null, "Usuario Eliminado con Éxito", "", 1);
        }
    }
    
    public List<Usuario> BuscarUsuario(String aguja) {
        
        try {
            String sql="select * from usuario where ";
            sql+="codigo_socio::text like '%"+aguja+"%' OR ";
            sql+="codigo_usuario::text like '%"+aguja+"%' OR";
            sql+="codigo_rol::text like '%"+aguja+"%' OR";
            sql+="upper(usuario) like upper('%"+aguja+"%')";
            
            ResultSet rs=con.consulta(sql);
            
            List<Usuario> lista=new ArrayList<Usuario>();
            while(rs.next()){
                Usuario us=new Usuario();
                us.setCodigo_usuario(rs.getInt("usuario"));
                us.setCodig_rol(rs.getInt("codigo_rol"));
                us.setUsuario(rs.getString("usuario"));
                us.setContrasenia("contrasenia");       
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
                
        
    }
    
    

}
