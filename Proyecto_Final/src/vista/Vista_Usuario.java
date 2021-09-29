
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


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
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        combo_box = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuario = new javax.swing.JTable();
        lbl_contrasenia_nueva = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        lbl_cedula1 = new javax.swing.JLabel();
        lbl_cedula2 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCodigo_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCodigo_rol.setForeground(new java.awt.Color(0, 0, 204));
        LblCodigo_rol.setText("TIPO DE ROL:");
        getContentPane().add(LblCodigo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        LblNombre_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNombre_usuario.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre_usuario.setText("INGRESE EL NOMBRE DEL USUARIO:");
        getContentPane().add(LblNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(0, 0, 204));
        LblContraseña.setText(" CONFIRME COMCONTRASEÑA:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 153, 153));
        btn_agregar.setText("AGREGAR USUARIO");
        btn_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 130, 50));

        txt_confirma_contrasenia.setBackground(new java.awt.Color(240, 240, 240));
        txt_confirma_contrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_confirma_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, -1));

        txt_cedula.setBackground(new java.awt.Color(240, 240, 240));
        txt_cedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 240, -1));

        txt_usuario.setBackground(new java.awt.Color(240, 240, 240));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 240, -1));

        lbl_titulo.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 204));
        lbl_titulo.setText("AGREGAR USUARIO");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, -1, 50));

        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 153, 153));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 130, 50));

        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 153, 153));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 130, 50));

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, -1));

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
        getContentPane().add(lbl_contrasenia_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txt_contrasenia.setBackground(new java.awt.Color(240, 240, 240));
        txt_contrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, -1));

        txt_nombre.setEditable(false);
        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 240, -1));

        txt_apellido.setEditable(false);
        txt_apellido.setBackground(new java.awt.Color(240, 240, 240));
        txt_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 240, -1));

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 0, 204));
        lbl_cedula.setText("Cedula:");
        getContentPane().add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lbl_cedula1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cedula1.setForeground(new java.awt.Color(0, 0, 204));
        lbl_cedula1.setText("Nombre:");
        getContentPane().add(lbl_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lbl_cedula2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_cedula2.setForeground(new java.awt.Color(0, 0, 204));
        lbl_cedula2.setText("Apellido");
        getContentPane().add(lbl_cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 150, -1));

        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 46, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    public JLabel getLblCodigo_rol() {
        return LblCodigo_rol;
    }

    public void setLblCodigo_rol(JLabel LblCodigo_rol) {
        this.LblCodigo_rol = LblCodigo_rol;
    }

    public JLabel getLblContraseña() {
        return LblContraseña;
    }

    public void setLblContraseña(JLabel LblContraseña) {
        this.LblContraseña = LblContraseña;
    }

    public JButton getBtn_modificar() {
        return btn_modificar;
    }

    public void setBtn_modificar(JButton btm_modificar) {
        this.btn_modificar = btm_modificar;
    }

    public JButton getBtn_agregar() {
        return btn_agregar;
    }

    public void setBtn_agregar(JButton btn_agregar) {
        this.btn_agregar = btn_agregar;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }

 

    public JButton getBtn_eliminar() {
        return btn_eliminar;
    }

    public void setBtn_eliminar(JButton btn_eliminar) {
        this.btn_eliminar = btn_eliminar;
    }

    public JComboBox<String> getCombo_box() {
        return combo_box;
    }

    public void setCombo_box(JComboBox<String> combo_box) {
        this.combo_box = combo_box;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JTable getTabla_usuario() {
        return tabla_usuario;
    }

    public void setTabla_usuario(JTable tabla_usuario) {
        this.tabla_usuario = tabla_usuario;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JTextField getTxt_confirma_contrasenia() {
        return txt_confirma_contrasenia;
    }

    public void setTxt_confirma_contrasenia(JTextField txt_confirma_contrasenia) {
        this.txt_confirma_contrasenia = txt_confirma_contrasenia;
    }

    public JTextField getTxt_contrasenia() {
        return txt_contrasenia;
    }

    public void setTxt_contrasenia(JTextField txt_contrasenia) {
        this.txt_contrasenia = txt_contrasenia;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public JTextField getTxt_usuario() {
        return txt_usuario;
    }

    public void setTxt_usuario(JTextField txt_usuario) {
        this.txt_usuario = txt_usuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCodigo_rol;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblNombre_usuario;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_cedula1;
    private javax.swing.JLabel lbl_cedula2;
    private javax.swing.JLabel lbl_contrasenia_nueva;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tabla_usuario;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_confirma_contrasenia;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
