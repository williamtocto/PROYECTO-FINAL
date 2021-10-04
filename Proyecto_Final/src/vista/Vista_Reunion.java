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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Mateo
 */
public class Vista_Reunion extends javax.swing.JInternalFrame {

    
    
    public JButton getBtnConsultar() {
        return BtnConsultar;
    }

    public void setBtnConsultar(JButton BtnConsultar) {
        this.BtnConsultar = BtnConsultar;
    }

    public JButton getBtnEliminar() {
        return BtnEliminar;
    }

    public void setBtnEliminar(JButton BtnEliminar) {
        this.BtnEliminar = BtnEliminar;
    }

    public JButton getBtnGuardar() {
        return BtnGuardar;
    }

    public void setBtnGuardar(JButton BtnGuardar) {
        this.BtnGuardar = BtnGuardar;
    }

    public JButton getBtnLimpiar() {
        return BtnLimpiar;
    }

    public void setBtnLimpiar(JButton BtnLimpiar) {
        this.BtnLimpiar = BtnLimpiar;
    }

    public JButton getBtnModificar() {
        return BtnModificar;
    }

    public void setBtnModificar(JButton BtnModificar) {
        this.BtnModificar = BtnModificar;
    }

    public JTable getJTdatos() {
        return JTdatos;
    }

    public void setJTdatos(JTable JTdatos) {
        this.JTdatos = JTdatos;
    }

    public JDateChooser getJdFecha() {
        return JdFecha;
    }

    public void setJdFecha(JDateChooser JdFecha) {
        this.JdFecha = JdFecha;
    }

    public JLabel getLblCodigo_reun() {
        return LblCodigo_reun;
    }

    public void setLblCodigo_reun(JLabel LblCodigo_reun) {
        this.LblCodigo_reun = LblCodigo_reun;
    }

    public JLabel getLblDuracion() {
        return LblDuracion;
    }

    public void setLblDuracion(JLabel LblDuracion) {
        this.LblDuracion = LblDuracion;
    }

    public JLabel getLblFecha() {
        return LblFecha;
    }

    public void setLblFecha(JLabel LblFecha) {
        this.LblFecha = LblFecha;
    }

    public JLabel getLblTopico() {
        return LblTopico;
    }

    public void setLblTopico(JLabel LblTopico) {
        this.LblTopico = LblTopico;
    }

    public JTextField getTxtCodReu() {
        return TxtCodReu;
    }

    public void setTxtCodReu(JTextField TxtCodReu) {
        this.TxtCodReu = TxtCodReu;
    }

    public JTextField getTxtDuracion() {
        return TxtDuracion;
    }

    public void setTxtDuracion(JTextField TxtDuracion) {
        this.TxtDuracion = TxtDuracion;
    }

    public JTextField getTxtTopic() {
        return TxtTopic;
    }

    public void setTxtTopic(JTextField TxtTopic) {
        this.TxtTopic = TxtTopic;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

   
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JButton getBtn_Buscar_consult() {
        return Btn_Buscar_consult;
    }

    public void setBtn_Buscar_consult(JButton Btn_Buscar_consult) {
        this.Btn_Buscar_consult = Btn_Buscar_consult;
    }

    public JDialog getDgReunion() {
        return dgReunion;
    }

    public void setDgReunion(JDialog dgReunion) {
        this.dgReunion = dgReunion;
    }

    public JDateChooser getjDcDesde() {
        return jDcDesde;
    }

    public void setjDcDesde(JDateChooser jDcDesde) {
        this.jDcDesde = jDcDesde;
    }

    public JDateChooser getjDcHasta() {
        return jDcHasta;
    }

    public void setjDcHasta(JDateChooser jDcHasta) {
        this.jDcHasta = jDcHasta;
    }

    public JLabel getjLabel2() {
        return lbldesde;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.lbldesde = jLabel2;
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
        return lblhasta;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.lblhasta = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getJtConsultar() {
        return jtConsultar;
    }

    public void setJtConsultar(JTable jtConsultar) {
        this.jtConsultar = jtConsultar;
    }
    
    

    /**
     * Creates new form Vista_Reunion
     */
    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public Vista_Reunion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dgReunion = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConsultar = new javax.swing.JTable();
        lbldesde = new javax.swing.JLabel();
        lblhasta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDcDesde = new com.toedter.calendar.JDateChooser();
        jDcHasta = new com.toedter.calendar.JDateChooser();
        Btn_Buscar_consult = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblCodigo_reun = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        LblDuracion = new javax.swing.JLabel();
        LblTopico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTdatos = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        TxtCodReu = new javax.swing.JTextField();
        JdFecha = new com.toedter.calendar.JDateChooser();
        TxtDuracion = new javax.swing.JTextField();
        TxtTopic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        dgReunion.setTitle("Consultar Reuniones");
        dgReunion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultar Reunión.");
        dgReunion.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 40));

        jtConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jtConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "       Código Reunión", "       Fecha Reunión", "         Duración", "         Tópico"
            }
        ));
        jScrollPane2.setViewportView(jtConsultar);

        dgReunion.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 470, 170));

        lbldesde.setForeground(new java.awt.Color(255, 255, 255));
        lbldesde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/buscar.png"))); // NOI18N
        lbldesde.setText("Consultar reunión desde:");
        dgReunion.getContentPane().add(lbldesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblhasta.setForeground(new java.awt.Color(255, 255, 255));
        lblhasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/buscar.png"))); // NOI18N
        lblhasta.setText("Consultar reunión hasta:");
        dgReunion.getContentPane().add(lblhasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Resultados de búsqueda:");
        dgReunion.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));
        dgReunion.getContentPane().add(jDcDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, 20));
        dgReunion.getContentPane().add(jDcHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, -1));

        Btn_Buscar_consult.setText("Buscar");
        Btn_Buscar_consult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        dgReunion.getContentPane().add(Btn_Buscar_consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 70, 30));

        LblFondo.setForeground(new java.awt.Color(255, 255, 255));
        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        dgReunion.getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 430));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reuniones.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 11, -1, -1));

        LblCodigo_reun.setText("Código");
        getContentPane().add(LblCodigo_reun, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        LblFecha.setText("Fecha de la Reunion:");
        getContentPane().add(LblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        LblDuracion.setText("Duración estimada:");
        getContentPane().add(LblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        LblTopico.setText("Tòpico de la Reunion:");
        getContentPane().add(LblTopico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        JTdatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        JTdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "             Código", "           Fecha", "           Duración", "          Tópico"
            }
        ));
        jScrollPane1.setViewportView(JTdatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 630, 230));

        BtnGuardar.setText("Guardar");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 30));

        BtnModificar.setText("Modificar");
        BtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 80, 30));

        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 70, 30));

        BtnConsultar.setText("Consultar");
        BtnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        getContentPane().add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 90, 30));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 70, 30));
        getContentPane().add(TxtCodReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));
        getContentPane().add(JdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));
        getContentPane().add(TxtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 107, -1));
        getContentPane().add(TxtTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 107, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo internas.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton Btn_Buscar_consult;
    private javax.swing.JTable JTdatos;
    private com.toedter.calendar.JDateChooser JdFecha;
    private javax.swing.JLabel LblCodigo_reun;
    private javax.swing.JLabel LblDuracion;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblTopico;
    private javax.swing.JTextField TxtCodReu;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtTopic;
    private javax.swing.JDialog dgReunion;
    private com.toedter.calendar.JDateChooser jDcDesde;
    private com.toedter.calendar.JDateChooser jDcHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtConsultar;
    private javax.swing.JLabel lbldesde;
    private javax.swing.JLabel lblhasta;
    // End of variables declaration//GEN-END:variables
}
