package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modelo_Multa extends Multa {

    public Modelo_Multa(String cedula, String nombre, String estado, String fecha_multa, String fecha_pago, int codigo_multa, int codigo_asistencia, String estado_multa) {
        super(cedula, nombre, estado, fecha_multa, fecha_pago, codigo_multa, codigo_asistencia, estado_multa);
    }

    public Modelo_Multa() {
    }
    ConexionPG con = new ConexionPG();

    public boolean AsignarMulta() {
   
        String sql = "Insert into multa(codigo_asistencia,estado_multa) values ('" + getCodigo_asistencia() + "','" + getEstado_multa() + "');";
        return con.accion(sql);
    }

    public boolean EliminarMulta() {
     
        String sql1 = "DELETE FROM multa WHERE codigo_asistencia=" + getCodigo_asistencia() + " AND estado_multa='Pendiente';";
        return con.accion(sql1);
    }

    public List<Multa> listar(String fecha) {
        try {
          
            String sql = "select  cedula_socio,nombre_socio ||' '|| apellido_socio as nombres,fecha_reunion,codigo_multa,estado_multa,codigo_multa,m.fecha_pago "
                    + "from socio s join asistencia a on s.codigo_socio=a.codigo_socio_asis join reunion r on  r.codigo_reunion=a.codigo_reunion "
                    + "join multa m on m.codigo_asistencia=a.codigo_asistencia where fecha_reunion= '" + fecha + "' order by fecha_reunion;";
            ResultSet rs = con.consulta(sql);
            List<Multa> lista = new ArrayList<Multa>();
            while (rs.next()) {
                Multa m = new Multa();
                m.setCodigo_multa(rs.getInt("codigo_multa"));
                m.setCedula(rs.getString("cedula_socio"));
                m.setNombre(rs.getString("nombres"));
                m.setEstado(rs.getString("estado_multa"));
                m.setFecha_multa(rs.getString("fecha_reunion"));
                m.setFecha_pago(rs.getString("fecha_pago"));
                lista.add(m);
            }
            rs.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Multa.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public double dineroMultas() {
     
        String sql = "SELECT sum(monto) from transaccion where tipo_transaccion='Pago Multa';";
        ResultSet rs = con.consulta(sql);
        double dinero = 0;
        try {
            while (rs.next()) {
                dinero = rs.getDouble("sum");
            }
            rs.close();
            return dinero;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return dinero;
        }
    }

    public void modificarMulta(String fecha) {
        System.out.println(getCodigo_multa());
        String sql = "Update multa set estado_multa='Pagada', fecha_pago= '" + fecha + "' where codigo_multa= " + getCodigo_multa();
        ConexionPG con = new ConexionPG();
        con.accion(sql);
    }

    public List<Multa> buscarAguja(String aguja) {
        try {
            String sql = "select  cedula_socio,nombre_socio ||' '|| apellido_socio as nombres,fecha_reunion,codigo_multa,estado_multa,codigo_multa,m.fecha_pago "
                    + "from socio s join asistencia a on s.codigo_socio=a.codigo_socio_asis join reunion r on  r.codigo_reunion=a.codigo_reunion "
                    + "join multa m on m.codigo_asistencia=a.codigo_asistencia where "
                    + " cedula_socio like '%" + aguja + "%' or "
                    + " UPPER(nombre_socio) like UPPER('%" + aguja + "%') or "
                    + " UPPER(apellido_socio) like UPPER('%" + aguja + "%') or "
                    + " UPPER(apellido_socio) like UPPER('%" + aguja + "%') or "
                    + " UPPER(estado_multa) like  UPPER ('%" + aguja + "%')"
                    + " order by fecha_reunion;";

            ResultSet rs = con.consulta(sql);
            List<Multa> lista = new ArrayList<Multa>();
            while (rs.next()) {
                Multa m = new Multa();
                m.setCodigo_multa(rs.getInt("codigo_multa"));
                m.setCedula(rs.getString("cedula_socio"));
                m.setNombre(rs.getString("nombres"));
                m.setEstado(rs.getString("estado_multa"));
                m.setFecha_multa(rs.getString("fecha_reunion"));
                m.setFecha_pago(rs.getString("fecha_pago"));
                lista.add(m);
            }
            rs.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Multa.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
