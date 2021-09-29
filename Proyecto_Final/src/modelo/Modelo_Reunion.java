package modelo;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    /*public void Guardar() throws ParseException {
        String formato = null;
        // Tranformar la fecha a String

        int verificarFecha;

        if (getFecha_reunion() == null || "".equals(getDuracion_reunion()) || "".equals(getTopico_reunion())) {

            JOptionPane.showMessageDialog(null, " EXISTEN CAMPOS VACIOS DEBE LLENAR TODOS", "TEOLAM", 0);

        } else {

            verificarFecha = ValidarFechaIngreso();
            if (verificarFecha == -1) {
                JOptionPane.showMessageDialog(null, " LA FECHA ES INCORRECTA", "TEOLAM", 0);

            } else {

                if (getFecha_reunion() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(getFecha_reunion());
                }
                String format = null;
                int fila = 0;

                if (getFecha_reunion() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    format = sdf.format(getFecha_reunion());
                }
                String sql = " SELECT fecha_reunion from reunion where fecha_reunion= '" + format + " ';";
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

                if (fila <= 0) {
                    Reunion objtreu;
                    try {
                        objtreu = new Reunion();
                        objtreu.setFecha_reunion(format);
                        objtreu.setTopico_reunion(getTopico_reunion());
                        objtreu.setDuracion_reunion(getDuracion_reunion());
                        String sentenciaSql = new String();
                        sentenciaSql = "INSERT INTO reunion (fecha_reunion,duracion_reunion,topico_reunion)";
                        sentenciaSql = sentenciaSql + "VALUES('" + objtreu.getFecha_reunion() + "','" + objtreu.getDuracion_reunion() + "','" + objtreu.getTopico_reunion() + "')";
                        con.accion(sentenciaSql);
                        JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE");
                        JOptionPane.showMessageDialog(null, "AHORA DEBE TOMAR LA ASISTENCIA", "TEOLAM", 1);

                        String sql2 = "SELECT codigo_reunion from reunion where fecha_reunion='" + format + "';";
                        int codigo_reunion = 0;
                        while (rs.next()) {
                            codigo_reunion = rs.getInt("codigo_reunion");
                        }

                        //Asistencia_Ventana asis = new Asistencia_Ventana(formato, codigo_reunion);
                        //asis.setVisible(true);

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                    }

                }
            }
        }
    }
    
    
    
    
   
    
    /*public void Modificar() {
        Date fecha = null;
        String format = null;
        int fila = 0;

        if (getFecha_reunion() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            format = sdf.format(getFecha_reunion());
        }

        int resp;
        resp = JOptionPane.showConfirmDialog(rootPane, "¿ESTA SEGURO DE MODIFICAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (fila <= 0) {
                Reunion objtreu;
                objtreu = new Reunion();
                objtreu.setFecha_reunion(format);
                objtreu.setTopico_reunion(getTopico_reunion());
                objtreu.setDuracion_reunion(getDuracion_reunion());
                String sentenciaSql = new String();
                sentenciaSql = "UPDATE reunion SET fecha_reunion='" + format + "',duracion_reunion='" + getDuracion_reunion() + "',topico_reunion='" + getTopico_reunion() + "'WHERE codigo_reunion='" + getCodigo_reunion() + "'";
                con.accion(sentenciaSql);
                JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
        }
    }*/
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

}
