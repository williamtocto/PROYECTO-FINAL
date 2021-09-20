package Vista;

import static Vista.Ventana_RegistrarReunion.arrayReunion;
import static Vista.Ventana_RegistrarReunion.resultado;
import conexion.Conexion_sql;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Reunion;

public class Modal_reunion extends javax.swing.JDialog {

    Ventana_RegistrarReunion vrr = new Ventana_RegistrarReunion();

    public static ArrayList<Reunion> arraymodal = new ArrayList<Reunion>();

    private int codigo_reunion;
    private Date fecha_reunion;
    private String duracion_reunion;
    private String topico_reunion;

    Modal_reunion() {
    }

    public int getCodigo_reunion() {
        return codigo_reunion;
    }

    public Date getFecha_reunion() {
        return fecha_reunion;
    }

    public String getDuracion_reunion() {
        return duracion_reunion;
    }

    public String getTopico_reunion() {
        return topico_reunion;
    }

    DefaultTableModel modelo;

    public Modal_reunion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO REUNION");
        modelo.addColumn("FECHA");
        modelo.addColumn("DURACION");
        modelo.addColumn("TOPICO");
        this.jtConsultar.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDcDesde = new com.toedter.calendar.JDateChooser();
        jDcHasta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        LblTiluto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDcDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));
        getContentPane().add(jDcHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("BUSCAR DESDE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 115, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("BUSCAR HASTA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 115, -1));

        jtConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO REUNION", "FECHA REUNION", "DURACION", "TOPICO"
            }
        ));
        jtConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtConsultarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtConsultar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 467, 190));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_usua.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        LblTiluto.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        LblTiluto.setForeground(new java.awt.Color(0, 0, 204));
        LblTiluto.setText("CONSULTA REUNION");
        getContentPane().add(LblTiluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 490, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date date1 = jDcDesde.getDate();
        Date date2 = jDcHasta.getDate();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else {
            Consultar();
            arraymodal.clear();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtConsultarMouseClicked
        arraymodal.clear();
        int i = jtConsultar.getSelectedRow();
        String codigo = jtConsultar.getValueAt(jtConsultar.getSelectedRow(), 0).toString();
        String fecha = jtConsultar.getValueAt(jtConsultar.getSelectedRow(), 1).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            codigo_reunion = codigo_reunion = Integer.parseInt(codigo);
            fecha_reunion = (Date) sdf.parse(fecha);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        duracion_reunion = jtConsultar.getValueAt(jtConsultar.getSelectedRow(), 2).toString();
        topico_reunion = jtConsultar.getValueAt(jtConsultar.getSelectedRow(), 3).toString();
        this.dispose();
        //Conexion_sql.CerrarConexion();
    }//GEN-LAST:event_jtConsultarMouseClicked

    public void Consultar() {
        arraymodal.clear();
        Conexion_sql.Conexion();
        Date fecha = null;
        String formato = null;
        Date fecha1 = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jDcDesde.getDate() != null) {
            fecha = jDcDesde.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (jDcHasta.getDate() != null) {
            fecha1 = jDcHasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
        }
        int fila = 0;

        String sql = "SELECT * FROM reunion WHERE (fecha_reunion) BETWEEN '" + formato + "' AND '" + formato1 + "'";
        resultado = Conexion_sql.ConsulTablaReunion(sql);
        int cafilas = jtConsultar.getRowCount();
        for (int i = cafilas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        try {
            Reunion obreunion;
            while (resultado.next()) {
                obreunion = new Reunion();
                obreunion.setCodigo_reunion(resultado.getInt("codigo_reunion"));
                obreunion.setFecha_reunion(resultado.getString("fecha_reunion"));
                obreunion.setTopico_reunion(resultado.getString("duracion_reunion"));
                obreunion.setDuracion_reunion(resultado.getString("topico_reunion"));
                arraymodal.add(obreunion);
                fila++;
            }

            if (fila <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN RESULTADO", "", 2);
            } else {
                String[] datosconsult;
                for (Reunion elemento : arraymodal) {
                    datosconsult = new String[4];
                    datosconsult[0] = Integer.toString(elemento.getCodigo_reunion());
                    datosconsult[1] = elemento.getFecha_reunion();
                    datosconsult[2] = elemento.getTopico_reunion();
                    datosconsult[3] = elemento.getDuracion_reunion();
                    modelo.addRow(datosconsult);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Conexion_sql.CerrarConexion();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTiluto;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDcDesde;
    private com.toedter.calendar.JDateChooser jDcHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultar;
    // End of variables declaration//GEN-END:variables
}
