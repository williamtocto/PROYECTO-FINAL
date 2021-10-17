
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JButton getBtn_cobrar() {
        return btn_cobrar;
    }

    public void setBtn_cobrar(JButton btn_cobrar) {
        this.btn_cobrar = btn_cobrar;
    }

    public JDateChooser getDateChooser() {
        return dateChooser;
    }

    public void setDateChooser(JDateChooser dateChooser) {
        this.dateChooser = dateChooser;
    }

    public JComboBox<String> getjComboTipoMulta() {
        return jComboTipoMulta;
    }

    public void setjComboTipoMulta(JComboBox<String> jComboTipoMulta) {
        this.jComboTipoMulta = jComboTipoMulta;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
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

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
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

    public JTextField getTxtCedulaSocio() {
        return txtCedulaSocio;
    }

    public void setTxtCedulaSocio(JTextField txtCedulaSocio) {
        this.txtCedulaSocio = txtCedulaSocio;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        jdFechaFin = new com.toedter.calendar.JDateChooser();
        jComboTipoMulta = new javax.swing.JComboBox<>();
        txtCedulaSocio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        btn_cobrar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha desde:");
        jDialog1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("Fecha hasta:");
        jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Tipo de multa:");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setText("Cédula del socio:");
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jDialog1.getContentPane().add(jdFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 142, 20));
        jDialog1.getContentPane().add(jdFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 142, 20));

        jComboTipoMulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAGADA", "PENDIENTE" }));
        jDialog1.getContentPane().add(jComboTipoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));
        jDialog1.getContentPane().add(txtCedulaSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jDialog1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 30));

        btnConsultar.setText("Consultar");
        jDialog1.getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnImprimir.setText("Imprimir Reporte");
        jDialog1.getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONSULTA DE HISTORIAL DE MULTAS");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, -1));

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Estado", "Fecha Multa", "Fecha de Pago"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informacion de las Multas");

        btn_buscar.setText("Consultar");
        btn_buscar.setToolTipText("Cosultar multa por fecha");

        btn_cobrar.setText("Cobrar");

        jLabel7.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_buscar)
                        .addGap(48, 48, 48)
                        .addComponent(btn_cobrar)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_cobrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cobrar;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JComboBox<String> jComboTipoMulta;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaFin;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCedulaSocio;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
