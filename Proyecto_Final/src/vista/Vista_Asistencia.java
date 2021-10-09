/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author PCX
 */
public class Vista_Asistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Asistencia
     */
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

    public JTextField getTxt_Nreunion() {
        return txt_Nreunion;
    }

    public void setTxt_Nreunion(JTextField txt_Nreunion) {
        this.txt_Nreunion = txt_Nreunion;
    }

    public JTextField getTxt_buscar() {
        return txt_buscar;
    }

    public void setTxt_buscar(JTextField txt_buscar) {
        this.txt_buscar = txt_buscar;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Nreunion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_cargarLista = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        btn_guardarFaltas = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 671, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ASISTENCIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        txt_Nreunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NreunionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nreunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, 16));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reunión:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btn_cargarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/carga lista.png"))); // NOI18N
        btn_cargarLista.setText("Cargar Lista");
        btn_cargarLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_cargarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 110, -1));
        getContentPane().add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 112, 14));

        btn_guardarFaltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/guardar.png"))); // NOI18N
        btn_guardarFaltas.setText("Guardar ");
        btn_guardarFaltas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_guardarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarFaltasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardarFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, -1));

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 90, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 148, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 40, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NreunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NreunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NreunionActionPerformed

    private void btn_guardarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarFaltasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarLista;
    private javax.swing.JButton btn_guardarFaltas;
    private javax.swing.JButton btn_imprimir;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_Nreunion;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
