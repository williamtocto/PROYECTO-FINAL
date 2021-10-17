package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modelo_Asistencia extends Asistencia {

    ConexionPG con = new ConexionPG();

    public Modelo_Asistencia() {
    }

    public Modelo_Asistencia(int cod_asistencia, int cod_socio, int cod_reunion, int estado, String nombre, String apellido, String cedula) {
        super(cod_asistencia, cod_socio, cod_reunion, estado, nombre, apellido, cedula);
    }

    public List<Asistencia> ListarSocios() {

        String sql = "SELECT codigo_socio,cedula_socio,nombre_socio,apellido_socio "
                + "from socio  where estado_socio= 'true' order by apellido_socio;";

        ResultSet rs = con.consulta(sql);
        List<Asistencia> lista = new ArrayList<Asistencia>();
        try {
            while (rs.next()) {
                Asistencia so = new Asistencia();
                so.setCod_socio(rs.getInt("codigo_socio"));
                so.setCedula(rs.getString("cedula_socio"));
                so.setNombre(rs.getString("nombre_socio"));
                so.setApellido(rs.getString("apellido_socio"));
                so.setEstado(0);
                lista.add(so);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public int codAsistencia() {
        int cod = 0;
        try {
            String sql = "Select codigo_Asistencia from asistencia where codigo_socio_asis= " + getCod_socio() + " and codigo_reunion = " + getCod_reunion() + ";";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                cod = rs.getInt("codigo_asistencia");
            }
            System.out.println(cod);
            rs.close();
            return cod;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
            return cod;
        }

    }

    public List<Asistencia> listarSocioFecha(int reunion) {

        try {
            String sql = "SELECT codigo_asistencia,a.codigo_socio_asis,cedula_socio,nombre_socio,apellido_socio,estado_asistencia,codigo_reunion "
                    + "from socio s join asistencia a on s.codigo_socio=a.codigo_socio_asis  where estado_socio= 'true' and codigo_reunion=" + reunion;
            ResultSet rs = con.consulta(sql);
            List<Asistencia> lista = new ArrayList<>();
            while (rs.next()) {
                Asistencia a = new Asistencia();
                a.setNombre(rs.getString("nombre_socio"));
                a.setApellido(rs.getString("apellido_socio"));
                a.setCod_socio(rs.getInt("codigo_socio_asis"));
                a.setCod_asistencia(rs.getInt("codigo_asistencia"));
                a.setCedula(rs.getString("cedula_socio"));
                a.setCod_reunion(rs.getInt("codigo_reunion"));
                a.setEstado(rs.getInt("estado_asistencia"));
                lista.add(a);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
            return null;
        }

    }

    public boolean GuardarLista() {
        String sql = "  INSERT INTO asistencia(codigo_socio_asis,codigo_reunion,estado_asistencia) VALUES "
                + "(" + getCod_socio() + "," + getCod_reunion() + "," + getEstado() + ");";
        return con.accion(sql);
    }

    public boolean Editar() {
        String sql = " UPDATE asistencia set estado_asistencia=" + getEstado() + " "
                + "where codigo_socio_asis=" + getCod_socio() + " and codigo_reunion= " + getCod_reunion();
        return con.accion(sql);
    }

}
