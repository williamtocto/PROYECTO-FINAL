/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
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

    public JButton getBtnSocioActivo() {
        return btnSocioActivo;
    }

    public void setBtnSocioActivo(JButton btnSocioActivo) {
        this.btnSocioActivo = btnSocioActivo;
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
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        LblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        TxtCedula = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jdFechaIng = new com.toedter.calendar.JDateChooser();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatosSocio = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSocioActivo = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        TxtNumCuenta = new javax.swing.JTextField();
        btnNuevaCuenta = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblNombre.setText("Datos Socio.");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 160, 50));

        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 20));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 10));

        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 10));

        jLabel5.setText("E-mail:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 190, 20));
        getContentPane().add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, 20));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, 20));
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, 20));
        getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 190, 20));

        jLabel6.setText("No. Cuenta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 120, 30));

        jLabel7.setText("Dirección:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 30));

        jLabel8.setText("Fecha Nac:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 40));

        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 110, 40));

        jLabel10.setText("Fecha de Ingreso:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 40));
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 250, 20));
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, -1));
        getContentPane().add(jdFechaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 250, -1));
        getContentPane().add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 250, -1));

        jtDatosSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombres", "Apellidos", "E-mail", "Dirección", "Teléfono", "Fecha Nacimiento", "Fecha Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jtDatosSocio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1070, 220));

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 30));

        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 30));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 70, 30));

        btnSocioActivo.setText("Socios Activos");
        btnSocioActivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        getContentPane().add(btnSocioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 90, 30));

        btnInactivar.setText("Inactivar Socio");
        btnInactivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        getContentPane().add(btnInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 90, 30));
        getContentPane().add(TxtNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 160, 20));

        btnNuevaCuenta.setText("+");
        getContentPane().add(btnNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, 20));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 190, -1));

        jLabel11.setText("Buscar:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 20));

        btnImprimir.setText("Imprimir Reporte");
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo internas.jpg"))); // NOI18N
        LblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1120, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSocioActivo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaIng;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTable jtDatosSocio;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
