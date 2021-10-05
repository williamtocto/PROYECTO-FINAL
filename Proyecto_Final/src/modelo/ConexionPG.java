
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionPG {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    //Datos de su conexion local:
    private String cadenaConexion="jdbc:postgresql://localhost:5432/proyecto_final";
    private String usuarioPG="postgres";
    private String contrasPG="1234";

    public ConexionPG() {
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch (ClassNotFoundException ex) {
            //No encontramos driver
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
           con= DriverManager.getConnection(cadenaConexion, usuarioPG, contrasPG);
            System.out.println("conectado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ResultSet consulta(String sqlc){
    
        try {
            st= con.createStatement();
            ResultSet rs=st.executeQuery(sqlc);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean accion(String sqla){
        try {
            st=con.createStatement();
            boolean rb=st.execute(sqla);
            st.close();
            return true; //rb;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void desconectar() {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
