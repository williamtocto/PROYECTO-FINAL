package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    public JLabel getLblContraseña() {
        return LblContraseña;
    }

    public void setLblContraseña(JLabel LblContraseña) {
        this.LblContraseña = LblContraseña;
    }

    public JLabel getLblFondo() {
        return LblFondo;
    }

    public void setLblFondo(JLabel LblFondo) {
        this.LblFondo = LblFondo;
    }

    public JLabel getLblUsuario() {
        return LblUsuario;
    }

    public void setLblUsuario(JLabel LblUsuario) {
        this.LblUsuario = LblUsuario;
    }

    public JTextField getTxtUsuari() {
        return TxtUsuari;
    }

    public void setTxtUsuari(JTextField TxtUsuari) {
        this.TxtUsuari = TxtUsuari;
    }

    public JLabel getjLabel1() {
        return lbl_fondo;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.lbl_fondo = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JButton getJbIngresar() {
        return jbIngresar;
    }

    public void setJbIngresar(JButton jbIngresar) {
        this.jbIngresar = jbIngresar;
    }

    public JPasswordField getTxt_Password() {
        return txt_Password;
    }

    public void setTxt_Password(JPasswordField txt_Password) {
        this.txt_Password = txt_Password;
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
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO AL SISTEMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 280, 40));
        getContentPane().add(TxtUsuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, 30));

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("USUARIO:");
        getContentPane().add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setText("CONTRASEÑA:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jbIngresar.setBackground(new java.awt.Color(255, 255, 255));
        jbIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(0, 102, 102));
        jbIngresar.setText("INGRESAR");
        jbIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 30));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 180, 130));

        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 180, 30));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("¿qué taaaaal?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 150, 20));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/free-vector-texturas-background.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed

    }//GEN-LAST:event_jbIngresarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton jbIngresar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
