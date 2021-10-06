package modelo;

import com.itextpdf.text.log.Logger;
import java.awt.Component;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Reunion> listaReunion(String aguja) {
        try {
            String sql = "select * from reunion where codigo_reunion= " + getCodigo_reunion();
            ResultSet rs = con.consulta(sql);
            List<Reunion> lr = new ArrayList<Reunion>();
            while (rs.next()) {
                reu.setCodigo_reunion(rs.getInt("codigo_reunion"));
                reu.setFecha_reunion(rs.getString("fecha_reunion"));
                reu.setDuracion_reunion(rs.getString("duracion_reunion"));
                reu.setTopico_reunion(rs.getString("topico_reunion"));
                lr.add(reu);
            }
            rs.close();
            return lr;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Modelo_Reunion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return null;
        }

    }
    
    
    
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
