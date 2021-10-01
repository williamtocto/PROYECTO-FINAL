/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author PCX
 */
public class Vista_Privilegios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Privilegios
     */
    public Vista_Privilegios() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_nombre = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        B_MODIFICAR = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlabel_opciones_menu = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        rad_socio = new javax.swing.JRadioButton();
        rad_trans = new javax.swing.JRadioButton();
        rad_reunion = new javax.swing.JRadioButton();
        rad_multa = new javax.swing.JRadioButton();
        rad_usuario = new javax.swing.JRadioButton();
        rad_rol = new javax.swing.JRadioButton();
        combo_box = new javax.swing.JComboBox<>();
        jlabel_nombre1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_nombre.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_nombre.setText("Nombre Tipo de rol:");
        getContentPane().add(jlabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        btn_Agregar.setBackground(new java.awt.Color(0, 153, 0));
        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Agregar.setText("GUARDAR ");
        btn_Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        getContentPane().add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 40));

        B_MODIFICAR.setBackground(new java.awt.Color(255, 255, 153));
        B_MODIFICAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_MODIFICAR.setForeground(new java.awt.Color(0, 153, 153));
        B_MODIFICAR.setText("MODIFICAR ");
        B_MODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        B_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(B_MODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, 40));

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 153, 153));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 80, 40));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("ASIGNAR PRIVILIGEGIOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 290, 40));

        jlabel_opciones_menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_opciones_menu.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_opciones_menu.setText("Opciones Menú:");
        getContentPane().add(jlabel_opciones_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        TxtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, 30));

        rad_socio.setBackground(new java.awt.Color(153, 204, 255));
        rad_socio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_socio.setText("MENU SOCIOS");
        rad_socio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 5));
        getContentPane().add(rad_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));

        rad_trans.setBackground(new java.awt.Color(153, 204, 255));
        rad_trans.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_trans.setText("MENU TRANSACIONES");
        rad_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_transActionPerformed(evt);
            }
        });
        getContentPane().add(rad_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 160, -1));

        rad_reunion.setBackground(new java.awt.Color(153, 204, 255));
        rad_reunion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_reunion.setText("MENU REUNIONES");
        getContentPane().add(rad_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, -1));

        rad_multa.setBackground(new java.awt.Color(153, 204, 255));
        rad_multa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_multa.setText("MENU MULTAS");
        getContentPane().add(rad_multa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, -1));

        rad_usuario.setBackground(new java.awt.Color(153, 204, 255));
        rad_usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_usuario.setText("MENU USUARIOS");
        getContentPane().add(rad_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, -1));

        rad_rol.setBackground(new java.awt.Color(153, 204, 255));
        rad_rol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_rol.setText("MENU ROL");
        getContentPane().add(rad_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 160, -1));

        getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, -1));

        jlabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_nombre1.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_nombre1.setText("Codigo");
        getContentPane().add(jlabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rad_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_transActionPerformed

    }//GEN-LAST:event_rad_transActionPerformed

    private void B_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MODIFICARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_MODIFICARActionPerformed

    public JButton getB_MODIFICAR() {
        return B_MODIFICAR;
    }

    public void setB_MODIFICAR(JButton B_MODIFICAR) {
        this.B_MODIFICAR = B_MODIFICAR;
    }

    public JTextField getTxtCodigo() {
        return TxtCodigo;
    }

    public void setTxtCodigo(JTextField TxtCodigo) {
        this.TxtCodigo = TxtCodigo;
    }

    public JButton getBtn_Agregar() {
        return btn_Agregar;
    }

    public void setBtn_Agregar(JButton btn_Agregar) {
        this.btn_Agregar = btn_Agregar;
    }

    public JComboBox<String> getCombo_box() {
        return combo_box;
    }

    public void setCombo_box(JComboBox<String> combo_box) {
        this.combo_box = combo_box;
    }

    public JRadioButton getRad_multa() {
        return rad_multa;
    }

    public void setRad_multa(JRadioButton rad_multa) {
        this.rad_multa = rad_multa;
    }

    public JRadioButton getRad_reunion() {
        return rad_reunion;
    }

    public void setRad_reunion(JRadioButton rad_reunion) {
        this.rad_reunion = rad_reunion;
    }

    public JRadioButton getRad_rol() {
        return rad_rol;
    }

    public void setRad_rol(JRadioButton rad_rol) {
        this.rad_rol = rad_rol;
    }

    public JRadioButton getRad_socio() {
        return rad_socio;
    }

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public void setRad_socio(JRadioButton rad_socio) {
        this.rad_socio = rad_socio;
    }

    public JRadioButton getRad_trans() {
        return rad_trans;
    }

    public void setRad_trans(JRadioButton rad_trans) {
        this.rad_trans = rad_trans;
    }

    public JRadioButton getRad_usuario() {
        return rad_usuario;
    }

    public void setRad_usuario(JRadioButton rad_usuario) {
        this.rad_usuario = rad_usuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_MODIFICAR;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabel_nombre;
    private javax.swing.JLabel jlabel_nombre1;
    private javax.swing.JLabel jlabel_opciones_menu;
    private javax.swing.JRadioButton rad_multa;
    private javax.swing.JRadioButton rad_reunion;
    private javax.swing.JRadioButton rad_rol;
    private javax.swing.JRadioButton rad_socio;
    private javax.swing.JRadioButton rad_trans;
    private javax.swing.JRadioButton rad_usuario;
    // End of variables declaration//GEN-END:variables
}
