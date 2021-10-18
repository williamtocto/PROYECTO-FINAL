
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;


public class Vista_Asistencia extends javax.swing.JInternalFrame {

   
    public Vista_Asistencia() {
        initComponents();
    }

    public JButton getBtn_cargarLista() {
        return btn_cargarLista;
    }

    public void setBtn_cargarLista(JButton btn_cargarLista) {
        this.btn_cargarLista = btn_cargarLista;
    }

    public JButton getBtn_guardarFaltas() {
        return btn_guardarFaltas;
    }

    public void setBtn_guardarFaltas(JButton btn_guardarFaltas) {
        this.btn_guardarFaltas = btn_guardarFaltas;
    }

    public JButton getBtn_imprimir() {
        return btn_imprimir;
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

    public JDateChooser getDateFin() {
        return dateFin;
    }

    public void setDateFin(JDateChooser dateFin) {
        this.dateFin = dateFin;
    }

    public JDateChooser getDateInicio() {
        return dateInicio;
    }

    public void setDateInicio(JDateChooser dateInicio) {
        this.dateInicio = dateInicio;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public void setBtn_imprimir(JButton btn_imprimir) {
        this.btn_imprimir = btn_imprimir;
    }

    public JDateChooser getDate_chooser() {
        return date_chooser;
    }

    public void setDate_chooser(JDateChooser date_chooser) {
        this.date_chooser = date_chooser;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        dateInicio = new com.toedter.calendar.JDateChooser();
        dateFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_cargarLista = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        btn_guardarFaltas = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jDialog1.setTitle("Asistencia");
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialog1.getContentPane().add(dateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, -1));
        jDialog1.getContentPane().add(dateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione las fechas para el Reporte");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Fin:");
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Inicio:");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 70, 20));

        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setClosable(true);
        setTitle("Asistencia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                    N°", "                 Nombre", "                 Apellido  ", "                   Faltas"
            }
        ));
        tabla.setGridColor(new java.awt.Color(255, 153, 51));
        tabla.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 650, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ASISTENCIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        btn_cargarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/carga lista.png"))); // NOI18N
        btn_cargarLista.setText("Cargar Lista");
        btn_cargarLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_cargarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, 40));
        getContentPane().add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 70, 130, 20));

        btn_guardarFaltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/guardar.png"))); // NOI18N
        btn_guardarFaltas.setText("Guardar ");
        btn_guardarFaltas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_guardarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarFaltasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardarFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 110, -1));

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarFaltasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btn_cargarLista;
    private javax.swing.JButton btn_guardarFaltas;
    private javax.swing.JButton btn_imprimir;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
