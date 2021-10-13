
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Vista_Acta extends javax.swing.JInternalFrame {
    
    public Vista_Acta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btn_seleccionar = new javax.swing.JButton();
        dateChooser_reunion = new com.toedter.calendar.JDateChooser();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lbl_fecha = new javax.swing.JLabel();
        lbñ_iconoPdf = new javax.swing.JLabel();
        lbl_nombreArchivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_actas = new javax.swing.JLabel();
        date_chooserBuscar = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acta = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_aprobar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jDialog1.setTitle("Consultar");
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/selecciona.png"))); // NOI18N
        btn_seleccionar.setText("Seleccionar Acta....");
        btn_seleccionar.setToolTipText("Seleccione una acta para guardar");
        btn_seleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(btn_seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 190, 40));
        jDialog1.getContentPane().add(dateChooser_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 184, -1));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 40));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/cancela.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 127, 40));

        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("Fecha:");
        jDialog1.getContentPane().add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 50, 40));
        jDialog1.getContentPane().add(lbñ_iconoPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 153, 126));
        jDialog1.getContentPane().add(lbl_nombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 240, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 420));

        setClosable(true);
        setTitle("Actas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_actas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_actas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actas.setText("Actas");
        getContentPane().add(lbl_actas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 110, -1));
        getContentPane().add(date_chooserBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        btn_buscar.setText("Buscar Fecha");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 40));

        tabla_acta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        tabla_acta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                     Fecha", "                     N° Acta", "                  Estado Acta", "                      Archivo"
            }
        ));
        tabla_acta.setGridColor(new java.awt.Color(255, 153, 51));
        tabla_acta.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabla_acta.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(tabla_acta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 830, 260));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 90, 40));

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/editar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 100, 40));

        btn_aprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/vista.vista_iconos.png"))); // NOI18N
        btn_aprobar.setText("Aprobar");
        btn_aprobar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprobarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 90, 40));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/nueva_acta.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 90, 40));

        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/Refresca.png"))); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 100, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aprobarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_seleccionarActionPerformed

    public JButton getBtn_guardar() {
        return btn_guardar;
    }

    public void setBtn_guardar(JButton btn_guardar) {
        this.btn_guardar = btn_guardar;
    }

    

    public JButton getBtn_aprobar() {
        return btn_aprobar;
    }

    public void setBtn_aprobar(JButton btn_aprobar) {
        this.btn_aprobar = btn_aprobar;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

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

    public JButton getBtn_refrescar() {
        return btn_refrescar;
    }

    public void setBtn_refrescar(JButton btn_refrescar) {
        this.btn_refrescar = btn_refrescar;
    }

    public JButton getBtn_nuevo() {
        return btn_nuevo;
    }

    public void setBtn_nuevo(JButton btn_nuevo) {
        this.btn_nuevo = btn_nuevo;
    }

    public JButton getBtn_seleccionar() {
        return btn_seleccionar;
    }

    public void setBtn_seleccionar(JButton btn_seleccionar) {
        this.btn_seleccionar = btn_seleccionar;
    }

    public JDateChooser getDateChooser_reunion() {
        return dateChooser_reunion;
    }

    public void setDateChooser_reunion(JDateChooser dateChooser_reunion) {
        this.dateChooser_reunion = dateChooser_reunion;
    }

    public JDateChooser getDate_chooserBuscar() {
        return date_chooserBuscar;
    }

    public void setDate_chooserBuscar(JDateChooser date_chooserBuscar) {
        this.date_chooserBuscar = date_chooserBuscar;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JLabel getjLabel3() {
        return lbl_fecha;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.lbl_fecha = jLabel3;
    }


    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbl_actas() {
        return lbl_actas;
    }

    public void setLbl_actas(JLabel lbl_actas) {
        this.lbl_actas = lbl_actas;
    }

    public JTable getTabla_acta() {
        return tabla_acta;
    }

    public void setTabla_acta(JTable tabla_acta) {
        this.tabla_acta = tabla_acta;
    }

    public JLabel getLbl_nombreArchivo() {
        return lbl_nombreArchivo;
    }

    public void setLbl_nombreArchivo(JLabel lbl_nombreArchivo) {
        this.lbl_nombreArchivo = lbl_nombreArchivo;
    }

    public JLabel getLbñ_iconoPdf() {
        return lbñ_iconoPdf;
    }

    public void setLbñ_iconoPdf(JLabel lbñ_iconoPdf) {
        this.lbñ_iconoPdf = lbñ_iconoPdf;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aprobar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JButton btn_seleccionar;
    private com.toedter.calendar.JDateChooser dateChooser_reunion;
    private com.toedter.calendar.JDateChooser date_chooserBuscar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_actas;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_nombreArchivo;
    private javax.swing.JLabel lbñ_iconoPdf;
    private javax.swing.JTable tabla_acta;
    // End of variables declaration//GEN-END:variables
}
