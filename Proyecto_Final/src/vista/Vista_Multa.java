
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Vista_Multa extends javax.swing.JInternalFrame {


    public Vista_Multa() {
        initComponents();
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }
    public JComboBox<String> getjComboTipoMulta() {
        return jComboTipoMulta;
    }

    public void setjComboTipoMulta(JComboBox<String> jComboTipoMulta) {
        this.jComboTipoMulta = jComboTipoMulta;
    }

    public JTable getjTdatosMulta() {
        return jTdatosMulta;
    }

    public void setjTdatosMulta(JTable jTdatosMulta) {
        this.jTdatosMulta = jTdatosMulta;
    }

    public JDateChooser getJdFechaFin() {
        return jdFechaFin;
    }

    public void setJdFechaFin(JDateChooser jdFechaFin) {
        this.jdFechaFin = jdFechaFin;
    }

    public JDateChooser getJdFechaInicio() {
        return jdFechaInicio;
    }

    public void setJdFechaInicio(JDateChooser jdFechaInicio) {
        this.jdFechaInicio = jdFechaInicio;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtCedulaSocio() {
        return txtCedulaSocio;
    }

    public void setTxtCedulaSocio(JTextField txtCedulaSocio) {
        this.txtCedulaSocio = txtCedulaSocio;
    }

    public JTextField getTxtCod() {
        return txtCod;
    }

    public void setTxtCod(JTextField txtCod) {
        this.txtCod = txtCod;
    }

    public JTextField getTxtEstadoMulta() {
        return txtEstadoMulta;
    }

    public void setTxtEstadoMulta(JTextField txtEstadoMulta) {
        this.txtEstadoMulta = txtEstadoMulta;
    }


    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        jdFechaFin = new com.toedter.calendar.JDateChooser();
        jComboTipoMulta = new javax.swing.JComboBox<>();
        txtCedulaSocio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEstadoMulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdatosMulta = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha desde:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setText("Fecha hasta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setText("Tipo de multa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setText("Cédula del socio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(jdFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 142, 20));
        getContentPane().add(jdFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 142, 20));

        jComboTipoMulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAGADA", "PENDIENTE" }));
        getContentPane().add(jComboTipoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));
        getContentPane().add(txtCedulaSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INFORMACIÓN DEL SOCIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONSULTA DE HISTORIAL DE MULTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 30));

        jLabel7.setText("Código:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel9.setText("Apellido:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel10.setText("Estado de la multa;");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 70, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 150, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 150, -1));
        getContentPane().add(txtEstadoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 150, -1));

        jTdatosMulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Estado Multa", "Fecha Reunión", "Fecha de Pago"
            }
        ));
        jScrollPane1.setViewportView(jTdatosMulta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 550, 420));

        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnImprimir.setText("Imprimir Reporte");
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> jComboTipoMulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdatosMulta;
    private com.toedter.calendar.JDateChooser jdFechaFin;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedulaSocio;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEstadoMulta;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
