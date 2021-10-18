/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import JTextField_Especial.JtxtSoloLetras;
import JTextField_Especial.JtxtSoloNumeros;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class Vista_Socio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Socio
     */
    public Vista_Socio() {
        initComponents();
    }

    public JtxtSoloNumeros getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JtxtSoloNumeros txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JtxtSoloLetras getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JtxtSoloLetras txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JtxtSoloLetras getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JtxtSoloLetras txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JtxtSoloNumeros getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JtxtSoloNumeros txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JLabel getLblFondo() {
        return LblFondo;
    }

    public void setLblFondo(JLabel LblFondo) {
        this.LblFondo = LblFondo;
    }

    public JLabel getLblNombre() {
        return LblNombre;
    }

    public void setLblNombre(JLabel LblNombre) {
        this.LblNombre = LblNombre;
    }

    public JTextField getTxtCodigo() {
        return TxtCodigo;
    }

    public void setTxtCodigo(JTextField TxtCodigo) {
        this.TxtCodigo = TxtCodigo;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxtEmail() {
        return TxtEmail;
    }

    public void setTxtEmail(JTextField TxtEmail) {
        this.TxtEmail = TxtEmail;
    }

    public JTextField getTxtNumCuenta() {
        return TxtNumCuenta;
    }

    public void setTxtNumCuenta(JTextField TxtNumCuenta) {
        this.TxtNumCuenta = TxtNumCuenta;
    }

    public JButton getBtnInactivar() {
        return btnInactivar;
    }

    public void setBtnInactivar(JButton btnInactivar) {
        this.btnInactivar = btnInactivar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JButton getBtnActivar() {
        return btnActivar;
    }

    public void setBtnActivar(JButton btnActivar) {
        this.btnActivar = btnActivar;
    }

    public JButton getBtnRefrescar() {
        return btnRefrescar;
    }

    public void setBtnRefrescar(JButton btnRefrescar) {
        this.btnRefrescar = btnRefrescar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnNuevaCuenta() {
        return btnNuevaCuenta;
    }

    public void setBtnNuevaCuenta(JButton btnNuevaCuenta) {
        this.btnNuevaCuenta = btnNuevaCuenta;
    }

    public JTextField getTxtFechaIngreso() {
        return txtFechaIngreso;
    }

    public void setTxtFechaIngreso(JTextField txtFechaIngreso) {
        this.txtFechaIngreso = txtFechaIngreso;
    }

    public JDateChooser getJdFechaNac() {
        return jdFechaNac;
    }

    public void setJdFechaNac(JDateChooser jdFechaNac) {
        this.jdFechaNac = jdFechaNac;
    }

    public JTable getJtDatosSocio() {
        return jtDatosSocio;
    }

    public void setJtDatosSocio(JTable jtDatosSocio) {
        this.jtDatosSocio = jtDatosSocio;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JDialog getJDialogo() {
        return JDialogo;
    }

    public void setJDialogo(JDialog JDialogo) {
        this.JDialogo = JDialogo;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JLabel getLblCodigo() {
        return lblCodigo;
    }

    public void setLblCodigo(JLabel lblCodigo) {
        this.lblCodigo = lblCodigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogo = new javax.swing.JDialog();
        TxtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxtNumCuenta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnNuevaCuenta = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCedula = new JTextField_Especial.JtxtSoloNumeros();
        txtNombre = new JTextField_Especial.JtxtSoloLetras();
        txtApellido = new JTextField_Especial.JtxtSoloLetras();
        txtTelefono = new JTextField_Especial.JtxtSoloNumeros();
        txtFechaIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosSocio = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        JDialogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDialogo.setTitle("Socios");
        JDialogo.setResizable(false);
        JDialogo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JDialogo.getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 170, -1));

        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código:");
        JDialogo.getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 50, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre:");
        JDialogo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dirección:");
        JDialogo.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 60, 20));

        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });
        JDialogo.getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 170, -1));
        TxtDireccion.getAccessibleContext().setAccessibleName("");
        TxtDireccion.getAccessibleContext().setAccessibleDescription("");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("E-mail:");
        JDialogo.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 70, 20));
        JDialogo.getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 170, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Teléfono:");
        JDialogo.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 50));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cédula:");
        JDialogo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido:");
        JDialogo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fecha Ingreso:");
        JDialogo.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 90, 20));
        JDialogo.getContentPane().add(TxtNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("No. Cuenta:");
        JDialogo.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 30));

        btnNuevaCuenta.setText("+");
        JDialogo.getContentPane().add(btnNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 40, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha de Nac:");
        JDialogo.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 90, 30));
        JDialogo.getContentPane().add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 170, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/acepta.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        JDialogo.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 110, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/cancela.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        JDialogo.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 100, 30));

        txtCedula.setText("");
        JDialogo.getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, -1));

        txtNombre.setText("");
        JDialogo.getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));

        txtApellido.setText("");
        JDialogo.getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, -1));

        txtTelefono.setText("");
        JDialogo.getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, -1));
        JDialogo.getContentPane().add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 170, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JDialogo.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Socios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(255, 255, 255));
        LblNombre.setText("Datos Socio.");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 160, 50));

        jtDatosSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jtDatosSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "               Código", "               Cédula ", "              Nombres", "               Apellidos", "                E-mail", "              Dirección", "            Teléfono", "    Fecha Nacimiento", "         Fecha Ingreso"
            }
        ));
        jtDatosSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtDatosSocio.setGridColor(new java.awt.Color(255, 153, 51));
        jtDatosSocio.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jtDatosSocio.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(jtDatosSocio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1070, 220));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/añadir_usuario.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 100, 40));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 100, 40));

        btnInactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/inactivar-socio.png"))); // NOI18N
        btnInactivar.setText("Inactivar ");
        btnInactivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 100, 40));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 190, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 40));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btnImprimir.setText("Imprimir Reporte");
        btnImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, 40));

        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/activa.png"))); // NOI18N
        btnActivar.setText("Reactivar");
        btnActivar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        getContentPane().add(btnActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 110, 40));

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/Refresca.png"))); // NOI18N
        btnRefrescar.setText("Refrescar");
        btnRefrescar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 1, true));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, 40));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        LblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void TxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefrescarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDialogo;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNumCuenta;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTable jtDatosSocio;
    private javax.swing.JLabel lblCodigo;
    private JTextField_Especial.JtxtSoloLetras txtApellido;
    private javax.swing.JTextField txtBuscar;
    private JTextField_Especial.JtxtSoloNumeros txtCedula;
    private javax.swing.JTextField txtFechaIngreso;
    private JTextField_Especial.JtxtSoloLetras txtNombre;
    private JTextField_Especial.JtxtSoloNumeros txtTelefono;
    // End of variables declaration//GEN-END:variables
}
