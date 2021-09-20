package Modelo;

import conexion.Conexion_sql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Rol {

    private int codigo_rol;
    private String tipo_rol;

    //metodo constructor
    public Rol(int codigo_rol, String tipo_rol) {
        this.codigo_rol = codigo_rol;
        this.tipo_rol = tipo_rol;
    }

    public Rol() {
    }

    //getters
    public int getCodigo_rol() {
        return codigo_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }
    //setters

    public void setCodigo_rol(int codigo_rol) {
        this.codigo_rol = codigo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String toString() {
        return this.tipo_rol;
    }

    public Vector<Rol> mostrarRoles() {
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        String consulta = null;

        Vector<Rol> roles = new Vector<Rol>();

        Rol rol = null;

        try {
            String sql = "SELECT * FROM rol ";
            resultado = Conexion_sql.Resultados(sql);
            rol = new Rol();
            rol.setCodigo_rol(0);
            rol.setTipo_rol("SELECCIONA EL ROL");
            roles.add(rol);

            while (resultado.next()) {
                rol = new Rol();
                rol.setCodigo_rol(resultado.getInt("codigo_rol"));
                rol.setTipo_rol(resultado.getString("tipo_rol"));
                roles.add(rol);

            }
            Conexion_sql.CerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }
        return roles;

    }

}
