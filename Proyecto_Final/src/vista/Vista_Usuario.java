
package vista;


public class Vista_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Usuario
     */
    public Vista_Usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblCodigo_rol = new javax.swing.JLabel();
        LblNombre_usuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        txt_confirma_contrasenia = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btm_modificar = new javax.swing.JButton();
        combo_box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        lbl_contrasenia_nueva = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCodigo_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCodigo_rol.setForeground(new java.awt.Color(0, 0, 204));
        LblCodigo_rol.setText("TIPO DE ROL:");
        getContentPane().add(LblCodigo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        LblNombre_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNombre_usuario.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre_usuario.setText("INGRESE EL NOMBRE DEL USUARIO:");
        getContentPane().add(LblNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(0, 0, 204));
        LblContraseña.setText(" CONFIRME COMCONTRASEÑA:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 153, 153));
        btn_agregar.setText("AGREGAR USUARIO");
        btn_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 180, 50));

        txt_confirma_contrasenia.setBackground(new java.awt.Color(240, 240, 240));
        txt_confirma_contrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_confirma_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 240, -1));

        txt_cedula.setBackground(new java.awt.Color(240, 240, 240));
        txt_cedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 240, -1));

        txt_usuario.setBackground(new java.awt.Color(240, 240, 240));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 240, -1));

        lbl_titulo.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 204));
        lbl_titulo.setText("AGREGAR USUARIO");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 50));

        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 153, 153));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 130, 50));

        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 153, 153));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 130, 50));

        btm_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_modificar.setForeground(new java.awt.Color(0, 153, 153));
        btm_modificar.setText("MODIFICAR");
        btm_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btm_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btm_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 130, 50));

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 240, -1));

        tabla_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "CODIGO SOCIO", "CODIGO ROL", "NOMBRE USUARIO"
            }
        ));
        jScrollPane1.setViewportView(tabla_usuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 720, 210));

        lbl_contrasenia_nueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_contrasenia_nueva.setForeground(new java.awt.Color(0, 0, 204));
        lbl_contrasenia_nueva.setText(" CONTRASEÑA:");
        getContentPane().add(lbl_contrasenia_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txt_contrasenia.setBackground(new java.awt.Color(240, 240, 240));
        txt_contrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btm_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btm_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCodigo_rol;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblNombre_usuario;
    private javax.swing.JButton btm_modificar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contrasenia_nueva;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tabla_usuario;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_confirma_contrasenia;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
