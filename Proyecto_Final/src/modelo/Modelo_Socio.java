/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF Gaming
 */
public class Modelo_Socio extends Socio {

    public Modelo_Socio(int codigo_socio, String cedula_socio, String nombre_socio, String apellido_socio, String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio, String fecha_ingreso, int numero_cuenta) {
        super(codigo_socio, cedula_socio, nombre_socio, apellido_socio, correo_socio, fecha_nac_socio, telefono_socio, direccion_socio, fecha_ingreso, numero_cuenta);
    }

    public Modelo_Socio() {
    }

    ConexionPG con = new ConexionPG();
    
       public void CrearSocio() {
        String sql = new String();
//        String sentencia;
        Socio objtSocio = new Socio();
        sql = "INSERT INTO socio (cedula_socio,nombre_socio,apellido_socio,correo_socio,fecha_nac_socio,telefono_socio,direccion_socio,fecha_ingreso_socio,numero_de_cuenta,estado_socio)";
        sql = sql + "VALUES('" + objtSocio.getCedula_socio() + "','" + objtSocio.getNombre_socio() + "','" + objtSocio.getApellido_socio() + "','"
                + objtSocio.getCorreo_socio() + "','" + objtSocio.getFecha_nac_socio() + "','" + objtSocio.getTelefono_socio() + "','" 
                + objtSocio.getDireccion_socio()+ "','" + objtSocio.getFecha_ingreso() + "','" + objtSocio.getNumero_cuenta() + "','TRUE')";
        con.accion(sql);

    }

    public List<Socio> socios() {

        try {
            String sql = "SELECT FROM* socio";
            ResultSet rs = con.consulta(sql);
            List<Socio> ls = new ArrayList<Socio>();

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setCodigo_socio(rs.getInt("codigo_socio"));
                socio.setCedula_socio(rs.getString("cedula_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setFecha_nac_socio(rs.getString("fecha_nac_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setDireccion_socio(rs.getString("direccion_socio"));
                socio.setFecha_ingreso(rs.getString("fecha_ingreso_socio"));
                socio.setNumero_cuenta(rs.getInt("numero_de_cuenta"));

                ls.add(socio);
            }
            rs.close();
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    //Consulta y método para realizar la búsqueda del socio
    public List<Socio> socios(String aguja) {

        try {
            String sql = "SELECT FROM* socio WHERE ";
            sql += " UPPER(cedula_socio) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(nombre_socio) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(apellido_socio) like UPPER('%" + aguja + "%')";
            ResultSet rs = con.consulta(sql);
            List<Socio> ls = new ArrayList<Socio>();

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setCodigo_socio(rs.getInt("codigo_socio"));
                socio.setCedula_socio(rs.getString("cedula_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setFecha_nac_socio(rs.getString("fecha_nac_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setDireccion_socio(rs.getString("direccion_socio"));
                socio.setFecha_ingreso(rs.getString("fecha_ingreso_socio"));
                socio.setNumero_cuenta(rs.getInt("numero_de_cuenta"));

                ls.add(socio);
            }
            rs.close();
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }



    public boolean editar_socio(String id) {
        String sql = "UPDATE socio SET nombre_socio='" + getNombre_socio() + "',apellido_socio='"
                + getApellido_socio() + "',correo_socio='" + getCorreo_socio() + "',fecha_nac_socio='"
                + getFecha_nac_socio() + "',telefono_socio='" + getTelefono_socio() + "',direccion_socio='"
                + getCorreo_socio() + "',fecha_ingreso_socio='" + getFecha_ingreso()
                + "'WHERE codigo_socio=" + getCodigo_socio() + ";";
        return con.accion(sql);
    }

    public void inactivar_socio() {
        String sql = "UPDATE socio SET estado_socio=" + "'FALSE'" + "WHERE codigo_socio=" + getCodigo_socio() + ";";
        con.accion(sql);
    }

    public boolean mostrar_socio_activo() {
        String sql;
        sql = "SELECT *FROM socio where estado_socio='TRUE' order by fecha_ingreso_socio";
        con.consulta(sql);
        return con.accion(sql);
    }

    public int codigoSocio(String cedula) {
        int codigo = 0;
        String sql = "SELECT codigo_socio from socio where cedula_socio='" + cedula + "';";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                codigo = rs.getInt("codigo_socio");
            }
            return codigo;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public String[] nombres(String cedula) {

        String[] socio = new String[2];

        String sql = "SELECT nombre_socio, apellido_socio from socio where cedula_socio= '" + cedula + "'";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("nombre_socio"));
                socio[0] = rs.getString("nombre_socio");
                socio[1] = rs.getString("apellido_socio");
            }
            return socio;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
