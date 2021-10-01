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
    //String sql = "SELECT FROM* transaccion";

    public ArrayList<Transaccion> listaTransaccion(String aguja) {
        try {
            String sql = "select * from socio WHERE ";
            sql += " UPPER(idpersona) like UPPER('%" + aguja + "%') ";
            ResultSet rs = con.consulta(sql);
            ArrayList<Transaccion> lt = new ArrayList<Transaccion>();
            while (rs.next()) {
                tran.setCod_transaccion(rs.getInt("codigo_transaccion"));
                tran.setCodigo_socio(rs.getInt("codigo_socio"));
                tran.setMonto(rs.getDouble("monto"));
                tran.setSaldo(rs.getDouble("saldo"));
                tran.setTipo_transaccion(rs.getString("tipo_transaccion"));
                tran.setTipo_transaccion(rs.getString("fecha_trans"));
                lt.add(tran);
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

}
