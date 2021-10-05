package modelo;

import java.awt.Component;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Mateo
 */
public class Modelo_Reunion extends Reunion {

    public Modelo_Reunion(int codigo_reunion, String fecha_reunion, String duracion_reunion, String topico_reunion) {
        super(codigo_reunion, fecha_reunion, duracion_reunion, topico_reunion);
    }

    public Modelo_Reunion() {
    }

    ConexionPG con = new ConexionPG();

    public ConexionPG getCon() {
        return con;
    }

    public void setCon(ConexionPG con) {
        this.con = con;
    }

    Reunion reu = new Reunion();
    Component rootPane = null;

    public boolean AgregarReunion() {
        String sql = "INSERT INTO reunion (fecha_reunion,duracion_reunion,topico_reunion)"
                + "VALUES('" + getFecha_reunion() + "','" + getDuracion_reunion() + "','" + getTopico_reunion() + "')";
        return con.accion(sql);
    }

    public boolean modificarReunion() {
        String sql = "UPDATE reunion SET fecha_reunion='" + getFecha_reunion() + "',duracion_reunion='" + getDuracion_reunion() + "',topico_reunion='" + getTopico_reunion() + "'WHERE codigo_reunion='" + getCodigo_reunion() + "'";
        return con.accion(sql);
    }

    public boolean eliminarReunion() {
        String sql = "DELETE FROM reunion WHERE codigo_reunion='" + getCodigo_reunion() + "'";
        return con.accion(sql);
    }

    public boolean consultaFecha() {
        int fila = 0;
        String sql = " SELECT fecha_reunion from reunion where fecha_reunion= '" + getFecha_reunion() + " ';";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                fila++;
            }
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "LA REUNION YA EXISTE NO SE PÚEDE CREAR", "TEOLAM", 0);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }
        return con.accion(sql);//MUCHO OJO
    }

    public void Eliminar() {
        String format = null;
        int fila = 0;

        if (getFecha_reunion() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            format = sdf.format(getFecha_reunion());
        }
        int resp;
        resp = JOptionPane.showConfirmDialog(rootPane, "¿DESEA ELIMNAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (fila <= 0) {
                Reunion objtreu;
                objtreu = new Reunion();
                objtreu.setFecha_reunion(format);
                objtreu.setTopico_reunion(getTopico_reunion());
                objtreu.setDuracion_reunion(getDuracion_reunion());
                String sentenciaSql = new String();
                sentenciaSql = "DELETE FROM reunion WHERE codigo_reunion='" + getCodigo_reunion() + "'";
                con.accion(sentenciaSql);
                JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
        }
    }

    public double cantidad_cuenta(int cod_so) {
        String sql = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + cod_so + " ORDER BY fecha_trans DESC LIMIT 1;";
        ResultSet rs = con.consulta(sql);
        double cantidad = 0;
        try {
            while (rs.next()) {
                cantidad = rs.getDouble("saldo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return cantidad;
    }
    
    public int codigoReunion(String fecha) {
        String sql = "Select codigo_reunion from reunion where fecha_reunion = '" + fecha + "'";
        ResultSet rs = con.consulta(sql);
        int codigo = 0;
        try {
            while (rs.next()) {
                codigo = rs.getInt("codigo_reunion");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

}
