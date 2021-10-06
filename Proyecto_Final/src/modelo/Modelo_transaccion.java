package modelo;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    
    public boolean AgregarTransaccion() {
        String sql = "INSERT INTO transaccion(codigo_socio,monto,saldo,tipo_transaccion,fecha_trans)"
                + "VALUES('" + getCodigo_socio() + "','" + getMonto() + "','" + getSaldo()+ "','" + getTipo_transaccion() + "','" + getFecha_trans() + "')";
        return con.accion(sql);
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
