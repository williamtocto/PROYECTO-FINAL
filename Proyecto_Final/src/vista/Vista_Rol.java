/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author PCX
 */
public class Vista_Rol extends javax.swing.JInternalFrame {

    public Vista_Rol() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_codigo_rol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_roles = new javax.swing.JTable();
        txt_cod_rol = new javax.swing.JTextField();
        txt_nombreRol = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblFondo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Roles");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Agregar Roles.");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        lbl_codigo_rol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo_rol.setText("Código:");
        getContentPane().add(lbl_codigo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        tabla_roles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla_roles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "                   Codigo", "                 Tipo Rol"
            }
        ));
        tabla_roles.setGridColor(new java.awt.Color(255, 153, 51));
        tabla_roles.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabla_roles.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(tabla_roles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 120));

        txt_cod_rol.setEditable(false);
        txt_cod_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_rolActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cod_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, -1));

        txt_nombreRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreRolActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombreRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, 40));

        btn_modificar.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 110, 40));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/agregar-rol.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Rol:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreRolActionPerformed

    private void txt_cod_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_rolActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
     
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public void setBtn_modificar(JButton btn_modificar) {
        this.btn_modificar = btn_modificar;
    }

    public JButton getBtn_registrar() {
        return btn_registrar;
    }

    public void setBtn_registrar(JButton btn_registrar) {
        this.btn_registrar = btn_registrar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTextField2() {
        return txt_nombreRol;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.txt_nombreRol = jTextField2;
    }

    public JTextField getTxt_nombreRol() {
        return txt_nombreRol;
    }

    public void setTxt_nombreRol(JTextField txt_nombreRol) {
        this.txt_nombreRol = txt_nombreRol;
    }

    public JLabel getLbl_codigo_rol() {
        return lbl_codigo_rol;
    }

    public void setLbl_codigo_rol(JLabel lbl_codigo_rol) {
        this.lbl_codigo_rol = lbl_codigo_rol;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JTable getTabla_roles() {
        return tabla_roles;
    }

    public void setTabla_roles(JTable tabla_roles) {
        this.tabla_roles = tabla_roles;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

    public JTextField getTxt_cod_rol() {
        return txt_cod_rol;
    }

    public void setTxt_cod_rol(JTextField txt_cod_rol) {
        this.txt_cod_rol = txt_cod_rol;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFondo;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo_rol;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tabla_roles;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cod_rol;
    private javax.swing.JTextField txt_nombreRol;
    // End of variables declaration//GEN-END:variables
}
