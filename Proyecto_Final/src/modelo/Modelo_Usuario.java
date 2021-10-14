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

    public Modelo_Usuario(String cedula, String rol, String usuario, String contrasenia, int codigo_usuario, int codigo_socio, int codig_rol, String nombre) {
        super(cedula, rol, usuario, contrasenia, codigo_usuario, codigo_socio, codig_rol, nombre);
    }

    public Modelo_Usuario() {
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

    public boolean AgregarUsuario() {
        System.out.println(getCodigo_socio() + "    " + getCodig_rol() + ",'" + getUsuario() + "','" + getContrasenia());
        String sql = "INSERT INTO usuario(codigo_socio,codigo_rol,usuario,contrasenia) "
                + "VALUES (" + getCodigo_socio() + "," + getCodig_rol() + ",'" + getUsuario() + "','" + getContrasenia() + "');";
        return con.accion(sql);
    }

    public boolean modificarUsuario() {
        String sql = "UPDATE usuario set usuario='" + getUsuario() + "',contrasenia='" + getContrasenia()
                + "' where codigo_usuario=" + getCodigo_usuario() + ";";
        return con.accion(sql);
    }

    public boolean EliminarUsuario() {
        System.out.println(getCodigo_usuario());
        String sql = " DELETE FROM usuario  WHERE codigo_usuario='" + getCodigo_usuario() + "';";
        return con.accion(sql);

    }

    public int validarUsuario() {

        int fila = 0;
        try {
            System.out.println(getUsuario() + " Usuario");
            String sql = "Select * from usuario where usuario= '" + getUsuario() + "'";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                fila++;
            }
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return fila;
        }
    }

    public int validarRol() {
        int fila = 0;
        try {
            System.out.println(getUsuario() + " Usuario");
            String sql = "Select * from usuario where codigo_rol= '" + getCodig_rol() + "'";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                fila++;
            }
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return fila;
        }
    }
    
    public int codigoSocio() {
        int fila = 0;
        try {
            System.out.println(getUsuario() + " Usuario");
            String sql = "Select * from usuario where codigo_socio= '" + getCodigo_socio() + "'";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                fila++;
            }
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return fila;
        }
    }
    
    

    public List<Usuario> listarUsuario(String aguja) {
        try {
            String sql = "select s.codigo_socio,codigo_usuario,r.codigo_rol,usuario, cedula_socio,"
                    + "nombre_socio||' '||apellido_socio as nombre,tipo_rol from socio s join "
                    + "usuario u on s.codigo_socio=u.codigo_socio join rol r on r.codigo_rol=u.codigo_rol where ";
            sql += "s.codigo_socio::text like '%" + aguja + "%' OR ";
            sql += "codigo_usuario::text like '%" + aguja + "%' OR ";
            sql += "r.codigo_rol::text like '%" + aguja + "%' OR ";
            sql += "upper(usuario) like upper('%" + aguja + "%')";
            ResultSet rs = con.consulta(sql);
            List<Usuario> lista = new ArrayList<Usuario>();
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setCodigo_usuario(rs.getInt("codigo_usuario"));
                us.setCodigo_socio(rs.getInt("codigo_socio"));
                us.setCodig_rol(rs.getInt("codigo_rol"));
                us.setUsuario(rs.getString("usuario"));
                us.setContrasenia("contrasenia");
                us.setCedula(rs.getString("cedula_socio"));
                us.setNombre(rs.getString("nombre"));
                us.setRol(rs.getString("tipo_rol"));
                lista.add(us);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
