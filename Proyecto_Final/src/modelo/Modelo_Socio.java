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
/**
 *
 * @author TUF Gaming
 */
public class Modelo_Socio extends Socio {
        public Modelo_Socio(int codigo_socio, String cedula_socio, String nombre_socio, String apellido_socio, String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio, String fecha_ingreso, int numero_cuenta) {
        super(codigo_socio, cedula_socio, nombre_socio, apellido_socio, correo_socio, fecha_nac_socio, telefono_socio, direccion_socio, fecha_ingreso, numero_cuenta);
    }
    public Modelo_Socio(){
    }
    
    ConexionPG con= new ConexionPG();      

    public List<Socio> socios() {

        try {
            String sql = "SELECT FROM* socio";
            ResultSet rs = con.consulta(sql);
            List<Socio> lp = new ArrayList<Socio>();
        
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
                
                lp.add(socio);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Socio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
