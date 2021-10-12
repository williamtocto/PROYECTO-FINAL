package modelo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Modelo_Acta extends Acta {

    ConexionPG con = new ConexionPG();

    public Modelo_Acta() {
    }

    public Modelo_Acta(int num_acta, String fecha, int cod_reunion, String estado_acta, byte[] archivo_acta) {
        super(num_acta, fecha, cod_reunion, estado_acta, archivo_acta);
    }

    public boolean Agregar(File ruta) {
        byte[] pdf1;
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            pdf1 = pdf;
            setArchivo_acta(pdf);
        } catch (IOException ex) {
            pdf1 = null;
        }
        try {
            String sql = "Insert into acta(estado_acta,codigo_reunion,archivo_acta) values (?,?,?);";
            PreparedStatement ps = null;
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, getEstado_acta());
            ps.setInt(2, getCod_reunion());
            ps.setBytes(3, pdf1);

            boolean ejecutar = false;
            if (ps.executeUpdate() == 1) {
                ejecutar = true;
            }
            return ejecutar;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No existe esta Reunion","",0);
            System.out.println(ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public boolean Modificar(File ruta) {
        byte[] pdf1;
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            pdf1 = pdf;
            setArchivo_acta(pdf);
        } catch (IOException ex) {
            pdf1 = null;
        }
        try {

            String sql = "UPDATE acta SET estado_acta= ?, codigo_reunion=?, archivo_acta=? "
                    + " WHERE num_acta = " + getNum_acta();
            System.out.println(getNum_acta() + " NUMERO DE ACTA1111");
            PreparedStatement ps = null;

            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, getEstado_acta());
            ps.setInt(2, getCod_reunion());
            ps.setBytes(3, pdf1);
            boolean ejecutar = false;
            ps.execute();
            if (ps.executeUpdate() == 1) {
                ejecutar = true;
                System.out.println("aaaaa");
            }
            return ejecutar;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "", 0);
            System.out.println(ex.getMessage());
            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "", 0);
            return false;
        }

    }

    public List<Acta> ListarActas(String aguja) {
        List<Acta> lista = new ArrayList<>();
        String sql = "Select fecha_reunion,num_acta,estado_acta,codigo_reunion,archivo_acta from acta "
                + "join reunion using (codigo_reunion) where ";
        sql += " UPPER(estado_acta) like UPPER('%" + aguja + "%') OR ";
        sql += "fecha_reunion::text  like '%" + aguja + "%' OR ";
        sql += " num_acta::text like '%" + aguja + "%';";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                Acta ac = new Acta();
                ac.setFecha(rs.getString("fecha_reunion"));
                ac.setNum_acta(rs.getInt("num_acta"));
                ac.setCod_reunion(rs.getInt("codigo_reunion"));
                ac.setEstado_acta(rs.getString("estado_acta"));
                ac.setArchivo_acta(rs.getBytes("archivo_acta"));
                lista.add(ac);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Acta.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public List<Acta> ListarActa(String fecha) {
        List<Acta> lista = new ArrayList<>();
        String sql = "Select fecha_reunion,num_acta,estado_acta,codigo_reunion,archivo_acta from acta "
                + "join reunion using (codigo_reunion) where fecha_reunion= '" + fecha + "'";
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                Acta ac = new Acta();
                ac.setFecha(rs.getString("fecha_reunion"));
                ac.setNum_acta(rs.getInt("num_acta"));
                ac.setCod_reunion(rs.getInt("codigo_reunion"));
                ac.setEstado_acta(rs.getString("estado_acta"));
                ac.setArchivo_acta(rs.getBytes("archivo_acta"));
                lista.add(ac);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Acta.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }

    }

    public boolean Eliminar(int id) {
        String sql;
        sql = "DELETE from acta where num_acta=" + id + ";";
        return con.accion(sql);
    }

    public boolean AprobarActa() {
        String sql = "update acta set estado_acta= 'Aprobada' where num_acta= " + getNum_acta();
        return con.accion(sql);

    }

    public void ejecutar_archivoPDF(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
        try {
            ps = con.getCon().prepareStatement("SELECT archivo_acta FROM acta WHERE num_acta = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);
            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            con.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
        
    }
}
        
        
     


