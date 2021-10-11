package modelo;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modelo_transaccion extends Transaccion {

    public Modelo_transaccion() {
    }
    ConexionPG con = new ConexionPG();

    public List<Transaccion> listaTransaccion(String cedula) {
        try {
            String sql = "SELECT nombre_socio,apellido_socio,s.codigo_socio,telefono_socio,direccion_socio,"
                    + "numero_de_cuenta,fecha_trans,tipo_transaccion,monto,saldo,codigo_transaccion FROM socio s join "
                    + "transaccion t on s.codigo_socio=t.codigo_socio and s.cedula_socio = '" + cedula + "' order by fecha_trans";
            ResultSet rs = con.consulta(sql);
            ArrayList<Transaccion> lt = new ArrayList<Transaccion>();

            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setNombre(rs.getString("nombre_socio"));
                t.setApellido(rs.getString("apellido_socio"));
                t.setNumero_cuenta(rs.getInt("numero_de_cuenta"));
                t.setTelefono(rs.getString("telefono_socio"));
                t.setDireccion(rs.getString("direccion_socio"));
                t.setCod_transaccion(rs.getInt("codigo_transaccion"));
                t.setCodigo_socio(rs.getInt("codigo_socio"));
                System.out.println(rs.getInt("codigo_socio"));
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

    public Double CatidadCuenta() {

        String sql = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + getCodigo_socio() + " "
                + "ORDER BY fecha_trans DESC LIMIT 1;";
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

    public boolean AgregarTransaccion() {
        String sql = "INSERT INTO transaccion(codigo_socio,monto,saldo,tipo_transaccion,fecha_trans)"
                + "VALUES('" + getCodigo_socio() + "','" + getMonto() + "','" + getSaldo() 
                + "','" + getTipo_transaccion() + "','"+getFecha_trans()+"')";
        return con.accion(sql);
    }

}
