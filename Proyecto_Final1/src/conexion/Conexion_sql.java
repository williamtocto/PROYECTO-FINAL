package conexion;

import static conexion.Conexion_sql.conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion_sql {

    static String bd = "jdbc:postgresql://localhost:5432/proyecto_final";
    static String usuario = "postgres";
    static String contra = "1234";
    static String cadenaDrive = "org.postgresql.Driver";

    private String cadenaConexion="jdbc:postgresql://localhost:5432/proyecto_final";
    private String usuarioPG="postgres";
    private String contrasPG="1234";
    
     private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public void conexi() {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException ex) {
            //No encontramos driver
            Logger.getLogger(Conexion_sql.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection(cadenaConexion, usuarioPG, contrasPG);
            System.out.println("conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_sql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = null;
    Connection conexion1 = null;

    public Connection getConexion() {
        try {
            Class.forName(cadenaDrive);
            conexion1 = DriverManager.getConnection(bd, usuario, contra);
            System.out.println("conectado");
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion1;
    }

    public static Statement Conexion() {
        //consulta = "SELECT *FROM rol";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            //resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sentencia;
    }

    public static ResultSet ConsultaRol() {
        consulta = "SELECT *FROM rol";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;

    }

    public static ResultSet ConsulTablaSocio() {
        consulta = "SELECT *FROM socio where estado_socio='TRUE' order by fecha_ingreso_socio";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;

    }

    public static ResultSet DiferentesConsultas(String consulta) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;

    }

    public static ResultSet ConsultaUsuario() {
        consulta = "SELECT *FROM usuario";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static ResultSet ConsulCamposSocio(String cedula_socio, String nombre_socio, String apellido_socio,
            String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio,
            String fecha_ingreso, int numero_cuenta) {

        System.out.println(cedula_socio);

        if (cedula_socio != null) {
            consulta = "select * from socio where cedula_socio like'%" + cedula_socio + "%';";
        } else if (nombre_socio != null) {
            consulta = "select * from socio where UPPER(nombre_socio)  like UPPER('%" + nombre_socio + "%');";
        } else if (apellido_socio != null) {
            consulta = "select * from socio where UPPER(apellido_socio) like UPPER( '%" + apellido_socio + "%');";
        } else if (correo_socio != null) {
            consulta = "select * from socio where UPPER(correo_socio)  like UPPER('%" + correo_socio + "%');";
        } else if (fecha_nac_socio != null) {
            consulta = "select * from socio where fecha_nac_socio='" + fecha_nac_socio + "';";
        } else if (telefono_socio != null) {
            consulta = "select * from socio where telefono_socio like '%" + telefono_socio + "%';";
        } else if (direccion_socio != null) {
            consulta = "select * from socio where UPPER(direccion_socio) like UPPER('%" + direccion_socio + "%');";
        } else if (fecha_ingreso != null) {
            consulta = "select * from socio where fecha_ingreso_socio ='" + fecha_ingreso + "';";
        } else if (numero_cuenta != 0) {
            consulta = "select * from socio where numero_de_cuenta like '%" + numero_cuenta + "%';";
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE ALGUN CAMPO PARA BUSCAR", "", 2);
        }

        // consulta = "select * from socio where nombre_socio='" + nombre_socio + "';";
        try {
            Class.forName(cadenaDrive);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
        return resultado;
    }

    public static ResultSet ConsultaReunion() {
        consulta = "SELECT *FROM reunion order by fecha_reunion desc";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void ModificarSocio(String sql) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE", "TEOLAM", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR", "TEOLAM", 0);
            // e.printStackTrace();
        }

    }

    public static ResultSet ConsulTablaReunion(String sql) {
        consulta = sql;
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;

    }

    public static void Ejecutar(String sql) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ACCION RELIZADA CORRECTAMENTE", "TEOLAM", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "TEOLAM", 0);

        }

    }

    public static void EliminarRol(String sql) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ACCION RELIZADA CORRECTAMENTE", "TEOLAM", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR ESTE ROL ESTA SIENDO UTILIZADO", "TEOLAM", 0);

        }

    }

    public static void Asistencia(String sql) {
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "TEOLAM", 0);
        }

    }

    //  public static ResultSet ConsulCamposSocio(String cedula_socio, String nombre_socio, String apellido_socio, String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio, String fecha_ingreso, int numero_cuenta) {
    public static ResultSet ConsultaCedulaSocio(String cedula) {

        consulta = "select * from socio where cedula_socio='" + cedula + "';";

        try {
            Class.forName(cadenaDrive);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public static ResultSet Resultados(String sql) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            resultado = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "TEOLAM", 0);
        }
        return resultado;

    }

    public static ResultSet Result(String sql) {

        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            PreparedStatement ps = conexion.prepareStatement(sql);
            resultado = ps.executeQuery();
        } catch (Exception e) {

        }
        return resultado;

    }

    public static ResultSet ConsultaActas() {
        consulta = "SELECT *FROM acta";
        try {
            Class.forName(cadenaDrive);
            conexion = DriverManager.getConnection(bd, usuario, contra);
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public static void CerrarConexion() {
        conexion = null;
        if (resultado != null) {

            try {
                resultado.close();
            } catch (Exception e) {

            }

        }
        if (sentencia != null) {
            try {
                sentencia.close();
            } catch (Exception e) {

            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (Exception e) {

            }
        }
    }
}
