package modelo;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo
 */
public class Modelo_transaccion extends Transaccion {

    public Modelo_transaccion(int cod_transaccion, String tipo_transaccion, int codigo_socio, String fecha_trans, double monto, double saldo) {
        super(cod_transaccion, tipo_transaccion, codigo_socio, fecha_trans, monto, saldo);
    }

    public Modelo_transaccion() {
    }

    ConexionPG con = new ConexionPG();

    public ConexionPG getCon() {
        return con;
    }

    public void setCon(ConexionPG con) {
        this.con = con;
    }

    Transaccion tran = new Transaccion();
    Socio sc = new Socio();

    public List<Transaccion> listaTransaccion(String aguja) {
        try {
            String sql = "select * from transaccion where codigo_transaccion::text like '%" + aguja + "%'; ";
            ResultSet rs = con.consulta(sql);
            ArrayList<Transaccion> lt = new ArrayList<Transaccion>();
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setCod_transaccion(rs.getInt("codigo_transaccion"));
                t.setCodigo_socio(rs.getInt("codigo_socio"));
                t.setMonto(rs.getDouble("monto"));
                t.setSaldo(rs.getDouble("saldo"));
                t.setTipo_transaccion(rs.getString("tipo_transaccion"));
                t.setFecha_trans(rs.getString("fecha_trans"));
                lt.add(t);
            }
            rs.close();
            return lt;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_transaccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean guardar() throws SQLException {
        String sql1 = "INSERT INTO transaccion(codigo_socio,monto,tipo_transaccion,saldo,fecha_trans)"
                + "VALUES (?,?,?,?,?);";
        PreparedStatement ps = null;
        ps = con.getCon().prepareStatement(sql1);
        ps.setInt(1, getCodigo_socio());
        ps.setDouble(2, getMonto());
        ps.setDouble(3, getSaldo());
        ps.setString(4, getTipo_transaccion());
        ps.setString(5, getFecha_trans());
        Boolean ejecutar = false;

        if (ps.executeUpdate() == 1) {
            ejecutar = true;
        }
        return ejecutar;
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
