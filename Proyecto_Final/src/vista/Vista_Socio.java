/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

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
public class Vista_Socio extends javax.swing.JInternalFrame{

    /**
     * Creates new form Vista_Socio
     */
    public Vista_Socio() {
        initComponents();
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

    public JTextField getTxtApellido() {
        return TxtApellido;
    }

    public void setTxtApellido(JTextField TxtApellido) {
        this.TxtApellido = TxtApellido;
    }

    public JTextField getTxtCedula() {
        return TxtCedula;
    }

    public void setTxtCedula(JTextField TxtCedula) {
        this.TxtCedula = TxtCedula;
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

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtNumCuenta() {
        return TxtNumCuenta;
    }

    public void setTxtNumCuenta(JTextField TxtNumCuenta) {
        this.TxtNumCuenta = TxtNumCuenta;
    }

    public JTextField getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(JTextField TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public JButton getBtnInactivar() {
        return btnInactivar;
    }

    public void setBtnInactivar(JButton btnInactivar) {
        this.btnInactivar = btnInactivar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
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

//    public JButton getBtnSocioActivo() {
//        return btnSocioActivo;
//    }
//
//    public void setBtnSocioActivo(JButton btnSocioActivo) {
//        this.btnSocioActivo = btnSocioActivo;
//    }

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
    

    public JDateChooser getJdFechaIng() {
        return jdFechaIng;
    }

    public void setJdFechaIng(JDateChooser jdFechaIng) {
        this.jdFechaIng = jdFechaIng;
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
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogo = new javax.swing.JDialog();
        TxtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        TxtCedula = new javax.swing.JTextField();
        jdFechaIng = new com.toedter.calendar.JDateChooser();
        TxtNumCuenta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnNuevaCuenta = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
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
        LblFondo = new javax.swing.JLabel();

        JDialogo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JDialogo.getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Código:");
        JDialogo.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre:");
        JDialogo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 10));
        JDialogo.getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Dirección:");
        JDialogo.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 20));
        JDialogo.getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("E-mail:");
        JDialogo.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        JDialogo.getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Teléfono:");
        JDialogo.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 60, 40));
        JDialogo.getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cédula:");
        JDialogo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido:");
        JDialogo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, 10));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fecha Ingreso:");
        JDialogo.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 80, 40));
        JDialogo.getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 160, -1));
        JDialogo.getContentPane().add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 160, -1));
        JDialogo.getContentPane().add(jdFechaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 160, -1));
        JDialogo.getContentPane().add(TxtNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 110, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("No. Cuenta:");
        JDialogo.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 80, 30));

        btnNuevaCuenta.setText("+");
        JDialogo.getContentPane().add(btnNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 50, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha de Nac.:");
        JDialogo.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 90, 40));
        JDialogo.getContentPane().add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 160, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        JDialogo.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 110, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/cancela.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        JDialogo.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 30));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        JDialogo.getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 90, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        JDialogo.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 380));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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
                "               Código", "               Cédula ", "              Nombres", "               Apellidos", "                E-mail", "              Dirección", "            Teléfono", "    Fecha Nacimiento", "            Fecha Ingreso"
            }
        ));
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
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 40));

        btnInactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/inactivar-socio.png"))); // NOI18N
        btnInactivar.setText("Inactivar ");
        btnInactivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, 40));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 190, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 40));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btnImprimir.setText("Imprimir Reporte");
        btnImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 140, -1));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        LblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInactivarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDialogo;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumCuenta;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private com.toedter.calendar.JDateChooser jdFechaIng;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTable jtDatosSocio;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
