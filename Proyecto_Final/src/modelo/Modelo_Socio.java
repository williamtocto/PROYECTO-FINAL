package modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public boolean CrearSocio() {
        String sql = new String();
//        String sentencia;

        sql = "INSERT INTO socio (cedula_socio,nombre_socio,apellido_socio,correo_socio,fecha_nac_socio,telefono_socio,direccion_socio,fecha_ingreso_socio,numero_de_cuenta,estado_socio)";
        sql = sql + "VALUES('" + getCedula_socio() + "','" + getNombre_socio() + "','" + getApellido_socio() + "','"
                + getCorreo_socio() + "','" + getFecha_nac_socio() + "','" + getTelefono_socio() + "','"
                + getDireccion_socio() + "','" + getFecha_ingreso() + "','" + getNumero_cuenta() + "','TRUE')";
        return con.accion(sql);

    }

    public List<Socio> socios() {

        try {
            String sql = "SELECT * FROM socio WHERE estado_socio='true' AND nombre_socio<>'Cuenta' "
                    + "ORDER BY fecha_ingreso_socio DESC";
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
            String sql = "SELECT * FROM socio WHERE";
            sql += " UPPER(cedula_socio) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(nombre_socio) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(apellido_socio) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(correo_socio) like UPPER('%" + aguja + "%')";
 

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
                + getDireccion_socio()+ "'WHERE codigo_socio=" + id+ ";";
        return con.accion(sql);
    }

    public boolean inactivar_socio(String ced) {
        String sql = "UPDATE socio SET estado_socio='FALSE'" + "WHERE cedula_socio='" + ced + "';";
        return con.accion(sql);
    }

    public boolean reactivarSocio(String ced) {
        String sql= "UPDATE socio SET estado_socio='TRUE'" + "WHERE cedula_socio='" + ced + "';";    
        return con.accion(sql);
    }

    public List<Socio> nuevaCuenta(int num) {

        try {
            String sql = "SELECT * FROM socio WHERE numero_de_cuenta=" + num + ";";
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

    public int validarCed() {
        int fila = 0;
        String sql = "SELECT * from socio where cedula_socio='" + getCedula_socio() + "';";
        ResultSet rs = con.consulta(sql);

        try {
            while (rs.next()) {
                fila++;
            }
            return fila;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public String[] nombres(String cedula) {

        String[] socio = new String[3];

        String sql = "SELECT nombre_socio, apellido_socio, tipo_rol from socio s join usuario u on s.codigo_socio=u.codigo_socio join rol r on u.codigo_rol="
                + " r.codigo_rol  where cedula_socio= '" + cedula + "'";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                socio[0] = rs.getString("nombre_socio");
                socio[1] = rs.getString("apellido_socio");
                socio[2] = rs.getString("tipo_rol");
            }
            return socio;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public String[] nombres2(String cedula) {

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
