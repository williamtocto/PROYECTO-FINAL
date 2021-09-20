package Vista;

import static Vista.Agregar_Rol.resultado;
import conexion.Conexion_sql;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Rol;
import Modelo.Usuario;

public class Login extends javax.swing.JFrame {

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM usuario";
    static Rol objRol;
    
    DefaultTableModel modelo;
   
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TxtUsuari = new javax.swing.JTextField();
        LblUsuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 180, 40));
        getContentPane().add(TxtUsuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 290, 30));

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usu.png"))); // NOI18N
        LblUsuario.setText("USUARIO:");
        getContentPane().add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 40));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lock.png"))); // NOI18N
        LblContraseña.setText("CONTRASEÑA:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jbIngresar.setBackground(new java.awt.Color(255, 255, 0));
        jbIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(0, 102, 102));
        jbIngresar.setText("INGRESAR");
        jbIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 255, 153), new java.awt.Color(0, 204, 255)));
        jbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 220, 50));

        LblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        LblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 340, 150));

        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hexa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 320, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 560));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        ValidarUsuario();

    }//GEN-LAST:event_jbIngresarActionPerformed

    public void ValidarUsuario() {
        String clave = String.valueOf(txt_Password.getPassword());
        String usuario = TxtUsuari.getText();
        String sente = "SELECT * FROM usuario where usuario='" + usuario + "' and contrasenia='" + clave + "'";
        // where  ='" + usuario + "' and contrasenia='" + clave + "'";
        try {
            Usuario user = null;
            sentencia = Conexion_sql.Conexion();
            ResultSet rs = sentencia.executeQuery(sente);
            if (rs.next()) {
                int rol = rs.getInt("codigo_rol");
                Ventana_principal pri = new Ventana_principal(rol);
                pri.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR USUARIO NO REGISTRADO", "TEOLAM", 2);
            }
            Conexion_sql.CerrarConexion();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JTextField TxtUsuari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
