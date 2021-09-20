package Vista;

import static Vista.Ventana_Actas.resultado;
import conexion.Conexion_sql;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import Modelo.Acta;

public class Consulta_Actas extends javax.swing.JDialog {

    DefaultTableModel Modelo = new DefaultTableModel();

    Ventana_Actas v_acta = new Ventana_Actas();
    public static ArrayList<Acta> arrayConsulta = new ArrayList<Acta>();
    private String fecha;
    int codigo_reunion = 0;
    private int Cod_reunion, num_acta;
    private Date fecha_reunion;
    private String orden_dia, desarrollo, estado_acta;
    String[] registros = new String[3];

    public Consulta_Actas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Modelo.addColumn("FECHA ACTA");
        Modelo.addColumn("NUMERO ACTA");
        Modelo.addColumn("ESTADO ACTA");
        jTable1.setRowHeight(30);
        this.jTable1.setModel(Modelo);

    }

    public DefaultTableModel getModelo() {
        return Modelo;
    }

    public void setModelo(DefaultTableModel Modelo) {
        this.Modelo = Modelo;
    }

    public Date getFecha_reunion() {
        return fecha_reunion;
    }

    public void setFecha_reunion(Date fecha_reunion) {
        this.fecha_reunion = fecha_reunion;
    }

    public int getCod_reunion() {
        return Cod_reunion;
    }

    public void setCod_reunion(int Cod_reunion) {
        this.Cod_reunion = Cod_reunion;
    }

    public int getNum_acta() {
        return num_acta;
    }

    public void setNum_acta(int num_acta) {
        this.num_acta = num_acta;
    }

    public String getOrden_dia() {
        return orden_dia;
    }

    public void setOrden_dia(String orden_dia) {
        this.orden_dia = orden_dia;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getEstado_acta() {
        return estado_acta;
    }

    public void setEstado_acta(String estado_acta) {
        this.estado_acta = estado_acta;
    }

    static java.sql.Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM acta";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_desarrollo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jdateHasta = new com.toedter.calendar.JDateChooser();
        jdateDesde = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        LblFondo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE ACTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 410, 47));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_acta.png"))); // NOI18N
        jButton1.setText("BUSCAR EN DESAROLLO");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 240, 50));

        txt_desarrollo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_desarrolloKeyTyped(evt);
            }
        });
        jPanel1.add(txt_desarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, 40));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 520, 350));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_acta.png"))); // NOI18N
        btnMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 49));
        jPanel2.add(jdateHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));
        jPanel2.add(jdateDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Reunión ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        LblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel2.add(LblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Date fech = null;
        String formato = null;
        Date fecha1 = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jdateDesde.getDate() != null) {
            fech = jdateDesde.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fech);
        }
        if (jdateHasta.getDate() != null) {
            fecha1 = jdateHasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
        }

        if (jdateDesde.getDate() == null || jdateHasta.getDate() == null) {
            JOptionPane.showMessageDialog(null, "ELIJA LAS DOS FECHAS", "TEOLAM", 0);
        } else {

            int cantfila = jTable1.getRowCount();
            for (int i = cantfila - 1; i >= 0; i--) {
                Modelo.removeRow(i);
            }
            String sql = "select fecha_reunion,a.num_acta,a.estado_acta,a.orden_dia_acta,a.desarrollo_acta from reunion r, "
                    + "acta a where r.codigo_reunion=a.codigo_reunion and (fecha_reunion) BETWEEN '" + formato + "' AND '" + formato1 + "'";

            ResultSet resultado1 = Conexion_sql.Resultados(sql);
            try {
                Acta objetoActa;
                while (resultado1.next()) {
                    registros[0] = resultado1.getString("fecha_reunion");
                    registros[1] = String.valueOf(resultado1.getInt("num_acta"));
                    registros[2] = resultado1.getString("estado_acta");
                    Modelo.addRow(registros);
                    fecha = resultado1.getString("fecha_reunion");
                    objetoActa = new Acta();
                    objetoActa.setFecha(resultado1.getString("fecha_reunion"));
                    objetoActa.setEstado_acta(resultado1.getString("estado_acta"));
                    objetoActa.setNum_acta(resultado1.getInt("num_acta"));
                    objetoActa.setOrden_dia(resultado1.getString("orden_dia_acta"));
                    objetoActa.setDesarrollo(resultado1.getString("desarrollo_acta"));
                    arrayConsulta.add(objetoActa);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
        Conexion_sql.CerrarConexion();


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        arrayConsulta.clear();
        String sql = " SELECT fecha_reunion,num_acta,estado_acta,orden_dia_acta,desarrollo_acta FROM reunion r,acta a where UPPER (desarrollo_acta) like UPPER('%" + txt_desarrollo.getText() + "%') and r.codigo_reunion=a.codigo_reunion ;";

        int fila = 0;

        resultado = Conexion_sql.Resultados(sql);

        try {
            Acta objetoActa;
            while (resultado.next()) {
                System.out.println("hola");
                registros[0] = resultado.getString("fecha_reunion");
                registros[1] = String.valueOf(resultado.getInt("num_acta"));
                registros[2] = resultado.getString("estado_acta");
                Modelo.addRow(registros);
                objetoActa = new Acta();
                objetoActa.setFecha(resultado.getString("fecha_reunion"));
                objetoActa.setEstado_acta(resultado.getString("estado_acta"));
                objetoActa.setNum_acta(resultado.getInt("num_acta"));
                objetoActa.setOrden_dia(resultado.getString("orden_dia_acta"));
                objetoActa.setDesarrollo(resultado.getString("desarrollo_acta"));
                arrayConsulta.add(objetoActa);
                fila++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERROR" + ex.getMessage(), "", 2);
        }
        if (fila <= 0) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO COINCIDENCIAS DE ESTA ACTA", "TEOLAM", 0);
        }
        Conexion_sql.CerrarConexion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     

        
        try {
            int i = jTable1.getSelectedRow();
            //jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            String fecha1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            estado_acta = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            num_acta = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            orden_dia = arrayConsulta.get(i).getOrden_dia();
            desarrollo = arrayConsulta.get(i).getDesarrollo();
            fecha_reunion = (Date) sdf.parse(fecha1);
            
            String[] registros = new String[3];
            registros[0] = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            registros[1] = arrayConsulta.get(i).getOrden_dia();
            registros[2] = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            Modelo.addRow(registros);
            this.setModelo(Modelo);
            this.dispose();

        } catch (NullPointerException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Consulta_Actas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_desarrolloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desarrolloKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_desarrolloKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFondo2;
    private javax.swing.JButton btnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdateDesde;
    private com.toedter.calendar.JDateChooser jdateHasta;
    private javax.swing.JTextField txt_desarrollo;
    // End of variables declaration//GEN-END:variables
}
