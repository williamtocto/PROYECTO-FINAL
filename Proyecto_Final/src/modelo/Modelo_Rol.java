package modelo;

import Modelo.Rol;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modelo_Rol extends Rol {

    ConexionPG pg = new ConexionPG();

    public Modelo_Rol(int codigo_rol, String tipo_rol) {
        super(codigo_rol, tipo_rol);
    }

    public Modelo_Rol() {
    }

    public boolean grabarRol() {

        String sql = "INSERT INTO rol (tipo_rol) values ('" + getTipo_rol() + "')";
        return pg.accion(sql);

    }

    public boolean eliminarRol(String codigo) {
        System.out.println("eliminar");
        String sql = "DELETE FROM ROL WHERE codigo_rol= '" + codigo + "';";
        System.out.println(sql);

        boolean ejecutar;
        ejecutar = pg.accion(sql);
        System.out.println(ejecutar);
        return ejecutar;

    }

    public boolean modificarRol() {
        String sql = "UPDATE rol set tipo_rol= '" + getTipo_rol() + "' WHERE codigo_rol= " + getCodigo_rol();
        return pg.accion(sql);

    }

    public List<Rol> listaRol(String aguja) {
        try {
            String sql = "Select * from rol where ";
            sql += "codigo_rol::text like '%" + aguja + "%' or ";
            sql += "UPPER(tipo_rol) like  UPPER('%" + aguja + "%')";
            ResultSet rs = pg.consulta(sql);
            List<Rol> lr = new ArrayList<Rol>();
            while (rs.next()) {
                Rol r = new Rol();
                r.setCodigo_rol(rs.getInt("codigo_rol"));
                r.setTipo_rol(rs.getString("tipo_rol"));
                lr.add(r);
            }
            rs.close();
            return lr;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Rol.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public Vector<Rol> mostrarRoles() {
        Vector<Rol> roles = new Vector<Rol>();
        try {
            String sql = "SELECT * FROM rol ";
            ResultSet rs = pg.consulta(sql);
            while (rs.next()) {
                Rol rol = new Rol();
                rol.setCodigo_rol(rs.getInt("codigo_rol"));
                rol.setTipo_rol(rs.getString("tipo_rol"));
                roles.add(rol);
            }
            return roles;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
            return roles;
        }
    }

}
