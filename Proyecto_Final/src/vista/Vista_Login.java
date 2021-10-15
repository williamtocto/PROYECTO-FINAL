package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Vista_Login extends javax.swing.JFrame {

    public Vista_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JLabel getLblContraseña() {
        return LblContraseña;
    }

    public void setLblContraseña(JLabel LblContraseña) {
        this.LblContraseña = LblContraseña;
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

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JButton getbtnIngresar() {
        return jbIngresar;
    }

    public void setbtnIngresar(JButton jbIngresar) {
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
        txt_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, 40));

        TxtUsuari.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtUsuari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuariKeyPressed(evt);
            }
        });
        getContentPane().add(TxtUsuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, 30));

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/usuario.png"))); // NOI18N
        LblUsuario.setText("Usuario:");
        getContentPane().add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 50));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/contraseña.png"))); // NOI18N
        LblContraseña.setText("Contraseña:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 40));

        jbIngresar.setBackground(new java.awt.Color(153, 204, 0));
        jbIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("Ingresar");
        jbIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 140, 30));

        txt_Password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/hexa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 310, 390));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/financial-profit (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 70, 110));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed

    }//GEN-LAST:event_jbIngresarActionPerformed

    private void TxtUsuariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuariKeyPressed

        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            System.out.println("se presiono la tecla Enter");
            txt_Password.requestFocus();
        }
    }//GEN-LAST:event_TxtUsuariKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JTextField TxtUsuari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
