package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Asistencia extends Socio {

    ConexionPG con = new ConexionPG();
    Socio soc = new Socio();
    Asistencia asis = new Asistencia();

    public Modelo_Asistencia(int codigo_socio, String cedula_socio, String nombre_socio, String apellido_socio, String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio, String fecha_ingreso, int numero_cuenta) {
        super(codigo_socio, cedula_socio, nombre_socio, apellido_socio, correo_socio, fecha_nac_socio, telefono_socio, direccion_socio, fecha_ingreso, numero_cuenta);
    }

    public void ListarSocios() {

        String sql = "SELECT codigo_socio,cedula_socio,nombre_socio,apellido_socio "
                + "from socio where estado_socio= 'true' order by apellido_socio;";

        ResultSet rs = con.consulta(sql);
        List<Socio> lista = new ArrayList<Socio>();
        try {
            while (rs.next()) {
                Socio so = new Socio();
                so.setCodigo_socio(rs.getInt("codigo_socio"));
                so.setCedula_socio(rs.getString("cedula_socio"));
                so.setNombre_socio(rs.getString("nombre_socio"));
                so.setApellido_socio(rs.getString("apellido_socio"));
                lista.add(so);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void GuardarLista() {
        String sql = "  INSERT INTO asistencia(codigo_socio_asis,codigo_reunion,estado_asistencia) VALUES "
                + "(" + asis.getCod_socio() + "," + asis.getCod_reunion() + ",'" + asis.getEstado() + "');";
        con.accion(sql);
    }

    public int Codigo_Asis() throws SQLException {
        int codigoAsistencia = 0;
        String sql = "SELECT codigo_asistencia from asistencia where codigo_socio_asis="
                + asis.getCod_socio() + " and codigo_reunion=" + asis.getCod_reunion();
        ResultSet rs = con.consulta(sql);

        while (rs.next()) {
            codigoAsistencia = rs.getInt("codigo_asistencia");
        }
        return codigoAsistencia;
    }

}
