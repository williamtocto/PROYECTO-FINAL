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

    public void busquedaSocio() throws SQLException {
        /*sc.setApellido_socio(rs.getString("apellido_socio"));
        sc.setCodigo_socio(rs.getShort("codigo_socio"));
        int fila = 0;
        boolean bandera = false;
        if ("".equals(sc.setCedula_socio(sql).getText()) || "".equals(sc.setCedula_socio(sql).getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe primero ingresar una cedula", "", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } else {
            modelo = new DefaultTableModel();
            modelo.addColumn("FECHA");
            modelo.addColumn("TIPO TRANSACCION");
            modelo.addColumn("MONTO");
            modelo.addColumn("SALDO");
            this.jTabla_tran.setModel(modelo);
            String sql = "SELECT nombre_socio,apellido_socio,s.codigo_socio,telefono_socio,direccion_socio,"
                    + "numero_de_cuenta,fecha_trans,tipo_transaccion,monto,saldo FROM socio s,"
                    + "transaccion t WHERE s.cedula_socio = '" + TxtCedula_soc.getText() + "' and s.codigo_socio=t.codigo_socio "
                    + "order by fecha_trans desc;";
            ResultSet rs = con.consulta(sql);
            String[] matriss = new String[4];

            try {
                while (rs.next()) {
                    TxtNumero_cu.setText(rs.getString("numero_de_cuenta"));
                    Txtnombre.setText(rs.getString("nombre_socio"));
                    lefono.setText(rs.getString("telefono_socio"));
                    TxtDireccion.setText(rs.getString("direccion_socio"));
                    matriss[0] = rs.getString("fecha_trans");
                    matriss[1] = rs.getString("tipo_transaccion");
                    matriss[2] = rs.getString("monto");
                    matriss[3] = rs.getString("saldo");
                    cod_socio = Integer.parseInt(rs.getString("codigo_socio"));
                    modelo.addRow(matriss);
                    fila++;
                }

                if (fila <= 0) {
                    JOptionPane.showMessageDialog(null, "ESTE SOCIO NO TIENE NINGUNA TRASACCION", "", 2);
                } else {
                    String sql1 = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + cod_socio + " ORDER BY fecha_trans DESC LIMIT 1;";
                    ResultSet result = null;

                    double cantidad = 0;
                    try {
                        while (rs.next()) {
                            cantidad = rs.getDouble("saldo");
                            TxtValor_cuenta.setText(String.valueOf(cantidad));
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
                //SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= '1' ORDER BY fecha_trans DESC LIMIT 1;

            } catch (SQLException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, " ERROR " + ex.getMessage(), "", 2);
            }
        }
      }*/
    }

}
