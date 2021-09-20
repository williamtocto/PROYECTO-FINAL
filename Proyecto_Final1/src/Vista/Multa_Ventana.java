package Vista;

import static Vista.Asistencia_Ventana.resultado;
import static Vista.Ventana_ConsulAsis.lista;
import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import Modelo.Multa;
import Modelo.Socio;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Multa_Ventana extends javax.swing.JInternalFrame {
    
    JComboBox comboBox = new JComboBox();
    String codigoAsis;
    String[] registro;
    
    Multa mul = new Multa();
    String[] registros = new String[6];
    DefaultTableModel Modelo = new DefaultTableModel();
    public static ArrayList<Socio> lista = new ArrayList();
    
    public Multa_Ventana() {
        initComponents();
        Modelo.addColumn("COD");
        Modelo.addColumn("CEDULA");
        Modelo.addColumn("NOMBRE");
        Modelo.addColumn("APELLIDO");
        Modelo.addColumn("FECHA");
        Modelo.addColumn("ESTADO MULTA");
        Tabla_Multas.setRowHeight(30);
        Tabla_Multas.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.Tabla_Multas.setModel(Modelo);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Multas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        LblFechaReunion = new javax.swing.JLabel();
        LblFechaPago = new javax.swing.JLabel();
        jdateChooserHasta = new com.toedter.calendar.JDateChooser();
        jDateChooserDesde = new com.toedter.calendar.JDateChooser();
        Button_Cobrar = new javax.swing.JButton();
        combo_multa = new javax.swing.JComboBox<>();
        txt_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblFechaPago1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LblFondoPanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblFechaReunion1 = new javax.swing.JLabel();
        LblFechaReunion2 = new javax.swing.JLabel();
        LblFechaReunion3 = new javax.swing.JLabel();
        LblFechaReunion4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        LblFechaReunion5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        LblFondoPanel2 = new javax.swing.JLabel();
        txt_dineroMulta = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LblFondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        LblTitulo.setText(" MULTAS");
        getContentPane().add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 160, 40));

        Tabla_Multas.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Multas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Tabla_Multas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tabla_Multas.setForeground(new java.awt.Color(0, 0, 255));
        Tabla_Multas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Estado", "Fecha Reunión", "Fecha Pago"
            }
        ));
        Tabla_Multas.setGridColor(new java.awt.Color(0, 153, 153));
        Tabla_Multas.setSelectionForeground(new java.awt.Color(204, 204, 255));
        Tabla_Multas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tabla_MultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Multas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 560, 460));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 0, 204));
        lbl_cedula.setText("CEDULA:");
        jPanel1.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 142, -1, -1));

        LblFechaReunion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion.setText("FECHA DESDE:");
        jPanel1.add(LblFechaReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 24, -1, -1));

        LblFechaPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaPago.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaPago.setText("ESTADO MULTA:");
        jPanel1.add(LblFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 106, -1, -1));
        jPanel1.add(jdateChooserHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 57, 172, -1));
        jPanel1.add(jDateChooserDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 19, 172, -1));

        Button_Cobrar.setBackground(new java.awt.Color(0, 204, 153));
        Button_Cobrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Cobrar.setForeground(new java.awt.Color(0, 153, 153));
        Button_Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        Button_Cobrar.setText("CONSULTAR");
        Button_Cobrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Button_Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CobrarActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 150, -1));

        combo_multa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "PENDIENTE", "PAGADA", "TODAS" }));
        jPanel1.add(combo_multa, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 104, 172, -1));

        txt_cedula.setToolTipText("ES OPCIONAL");
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 142, 172, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 104, 99, -1));

        LblFechaPago1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaPago1.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaPago1.setText("FECHA HASTA:");
        jPanel1.add(LblFechaPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 62, 120, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actas.png"))); // NOI18N
        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 150, -1));

        LblFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel1.add(LblFondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 550, 190));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblFechaReunion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion1.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion1.setText("NOMBRE:");
        jPanel2.add(LblFechaReunion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, -1, -1));

        LblFechaReunion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion2.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion2.setText("APELLIDO:");
        jPanel2.add(LblFechaReunion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        LblFechaReunion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion3.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion3.setText("FECHA:");
        jPanel2.add(LblFechaReunion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        LblFechaReunion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion4.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion4.setText("ESTADO MULTA:");
        jPanel2.add(LblFechaReunion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt_nombre.setEditable(false);
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre.setToolTipText("");
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 191, 30));

        txt_apellido.setEditable(false);
        txt_apellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_apellido.setToolTipText("");
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 191, 30));

        txt_estado.setEditable(false);
        txt_estado.setBackground(new java.awt.Color(204, 204, 255));
        txt_estado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_estado.setToolTipText("");
        txt_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 191, 30));

        txt_fecha.setEditable(false);
        txt_fecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_fecha.setToolTipText("");
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 191, 30));

        txt_codigo.setEditable(false);
        jPanel2.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 6, 60, -1));

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(0, 0, 204));
        lbl_codigo.setText("COD.");
        jPanel2.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txt_monto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_montoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 30));

        LblFechaReunion5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReunion5.setForeground(new java.awt.Color(0, 0, 204));
        LblFechaReunion5.setText("MONTO:");
        jPanel2.add(LblFechaReunion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cobrar.png"))); // NOI18N
        jButton1.setText("COBRAR MULTA");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 180, 50));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actas.png"))); // NOI18N
        jButton4.setText("LIMPIAR CAMPOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 180, 50));

        LblFondoPanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel2.add(LblFondoPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 550, 250));

        txt_dineroMulta.setBackground(new java.awt.Color(204, 204, 255));
        txt_dineroMulta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_dineroMulta.setForeground(new java.awt.Color(0, 0, 204));
        txt_dineroMulta.setToolTipText("");
        getContentPane().add(txt_dineroMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 160, 50));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar.png"))); // NOI18N
        jButton3.setText("TOTAL MULTA");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 210, -1));

        LblFondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblFondo.setForeground(new java.awt.Color(255, 255, 255));
        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed
    
    public void Limpiar() {
        txt_codigo.setText("");
        txt_apellido.setText("");
        txt_nombre.setText("");
        txt_fecha.setText("");
        txt_estado.setText("");
        txt_monto.setText("");
        jDateChooserDesde.setDate(null);
        jdateChooserHasta.setDate(null);
        
    }
    
    public void Buscar() {
        Tabla_Multas.getColumnModel().getColumn(0).setPreferredWidth(8);
        boolean cedula = false;
        String sql = null;
        boolean bandera = false;
        Date fecha = null;
        String formato = null;
        Date fecha1 = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jDateChooserDesde.getDate() != null) {
            fecha = jDateChooserDesde.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (jdateChooserHasta.getDate() != null) {
            fecha1 = jdateChooserHasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
        }
        
        String estadoMulta = (String) combo_multa.getSelectedItem();
        System.out.println(estadoMulta);
        
        if (!"".equals(txt_cedula.getText())) {
            
            if (estadoMulta.equalsIgnoreCase("PENDIENTE") || estadoMulta.equalsIgnoreCase("PAGADA")) {
                sql = "select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,m.estado_multa,m.codigo_multa "
                        + "from socio s,reunion r,asistencia a, multa m "
                        + "where  s.codigo_socio=a.codigo_socio_asis and m.codigo_asistencia=a.codigo_asistencia  "
                        + "and  m.estado_multa='" + estadoMulta + "' and cedula_socio= '" + txt_cedula.getText()
                        + "' and r.codigo_reunion=a.codigo_reunion and (fecha_reunion) between '" + formato + ""
                        + "'and '" + formato1 + "' order by fecha_reunion;";
                cedula = true;
                
            } else {
                sql = "select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,m.estado_multa, m.codigo_multa "
                        + "from socio s,reunion r,asistencia a, multa m "
                        + "where  s.codigo_socio=a.codigo_socio_asis and m.codigo_asistencia=a.codigo_asistencia  "
                        + "and cedula_socio= '" + txt_cedula.getText()
                        + "' and r.codigo_reunion=a.codigo_reunion and (fecha_reunion) between '" + formato + ""
                        + "'and '" + formato1 + "' order by fecha_reunion;";
                cedula = true;
            }
            
        } else if (estadoMulta.equalsIgnoreCase("PENDIENTE") || estadoMulta.equalsIgnoreCase("PAGADA") && cedula == false) {
            sql = "select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,m.estado_multa, m.codigo_multa  "
                    + "from socio s,reunion r,asistencia a, multa m "
                    + "where  s.codigo_socio=a.codigo_socio_asis and m.codigo_asistencia=a.codigo_asistencia  and  m.estado_multa= '" + estadoMulta
                    + "' and r.codigo_reunion=a.codigo_reunion and (fecha_reunion) "
                    + "between '" + formato + "'and '" + formato1 + "' order by fecha_reunion;";
        } else if (estadoMulta.equalsIgnoreCase("TODAS") && cedula == false) {
            sql = "select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,m.estado_multa , m.codigo_multa "
                    + "from socio s,reunion r,asistencia a, multa m "
                    + "where  s.codigo_socio=a.codigo_socio_asis and m.codigo_asistencia=a.codigo_asistencia "
                    + "and r.codigo_reunion=a.codigo_reunion and (fecha_reunion) "
                    + "between '" + formato + "'and '" + formato1 + "' order by fecha_reunion;";
            
        }
        int fila = 0;
        lista.clear();
        int cantfila = Tabla_Multas.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            Modelo.removeRow(i);
        }
        
        try {
            resultado = Conexion_sql.Resultados(sql);
            while (resultado.next()) {
                registros[0] = resultado.getString("codigo_multa");
                registros[1] = resultado.getString("cedula_socio");
                registros[2] = resultado.getString("nombre_socio");
                registros[3] = resultado.getString("apellido_socio");
                registros[4] = resultado.getString("fecha_reunion");
                registros[5] = resultado.getString("estado_multa");
                Modelo.addRow(registros);
                fila++;
            }
            if (fila <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE ENCUENTRARON RESULTADOS", "", 2);
            }
            
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    private void Button_CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CobrarActionPerformed
        Date date1 = jDateChooserDesde.getDate();
        Date date2 = jdateChooserHasta.getDate();
        String estadoMulta = (String) combo_multa.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else if (estadoMulta.equalsIgnoreCase("SELECCIONE")) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA ESTADO DE LA MULTA", "TEOLAM", 2);
        } else {
            Buscar();
          //  Limpiar();
        }
        

    }//GEN-LAST:event_Button_CobrarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadoActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void Tabla_MultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_MultasMousePressed
        
        try {
            txt_codigo.setText(Tabla_Multas.getValueAt(Tabla_Multas.getSelectedRow(), 0).toString());
            txt_nombre.setText(Tabla_Multas.getValueAt(Tabla_Multas.getSelectedRow(), 2).toString());
            txt_apellido.setText(Tabla_Multas.getValueAt(Tabla_Multas.getSelectedRow(), 3).toString());
            txt_fecha.setText(Tabla_Multas.getValueAt(Tabla_Multas.getSelectedRow(), 4).toString());
            txt_estado.setText(Tabla_Multas.getValueAt(Tabla_Multas.getSelectedRow(), 5).toString());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_Tabla_MultasMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int cod_socio = 1;
        String tipo_transaccion = "PAGO_MULTA";
        double saldo = 0;
        double monto = 0;
        
        String sql1 = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + cod_socio + " ORDER BY fecha_trans DESC LIMIT 1;";
        ResultSet resul = null;
        resul = Conexion_sql.Resultados(sql1);
        double cantidad = 0;
        try {
            while (resul.next()) {
                cantidad = resul.getDouble("saldo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        System.out.println(cantidad + " saldo");
        
        java.util.Date date = new Date();
        
        String strDateFormat = "dd-MM-yyyy hh:mm:ss"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        String fecha = objSDF.format(date);
        System.out.println(fecha);
        
        Multa objtoMulta;
        if ("".equals(txt_codigo.getText())) {
            JOptionPane.showMessageDialog(null, "PRIMERO DEBE ELEGIR UN SOCIO DE LA TABLA", "TEOLAM", 2);
        } else if ("".equals(txt_monto.getText())) {
            JOptionPane.showMessageDialog(null, "INGRESE EL MONTO", "TEOLAM", 2);
        } else {
            int op = JOptionPane.showOptionDialog(null, "SE VA COBRAR LA CATIDAD DE " + txt_monto.getText() + " A ESTE SOCIO", "CONFIRME", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                    new Object[]{"SI", "NO"}, null);
            if (op == 0) {
                try {
                    objtoMulta = new Multa();
                    objtoMulta.setCodigo_multa(Integer.parseInt(txt_codigo.getText()));
                    objtoMulta.setEstado_multa(txt_estado.getText());
                    if (objtoMulta.getEstado_multa().equalsIgnoreCase("PAGADA")) {
                        JOptionPane.showMessageDialog(null, "ESTA MULTA YA ESTA PAGADA", "", 0);
                    } else {
                        objtoMulta.setEstado_multa("PAGADA");
                        String sql = " UPDATE multa SET estado_multa= '" + objtoMulta.getEstado_multa()
                                + "' WHERE codigo_multa=" + objtoMulta.getCodigo_multa();
                        monto = Double.parseDouble(txt_monto.getText());
                        saldo = cantidad + monto;
                        Conexion_sql.Asistencia(sql);
                        /* String sql3 = "select codigo_socio_asis from asistencia a,multa m where a.codigo_asistencia=m.codigo_asistencia and m.codigo_multa=" + objtoMulta.getCodigo_multa() + ";";
                        resultado = Conexion_sql.Resultados(sql3);
                        while (resultado.next()) {
                            cod_socio = resultado.getInt("codigo_socio_asis");
                        }*/
                        String sql2 = "INSERT INTO transaccion(codigo_socio,fecha_trans,tipo_transaccion,monto,saldo)";
                        sql2 = sql2 + "VALUES (" + cod_socio + ",'" + fecha + "','" + tipo_transaccion + "'," + monto + "," + saldo + ");";
                        Conexion_sql.Asistencia(sql2);
                        Conexion_sql.CerrarConexion();
                        JOptionPane.showMessageDialog(null, "ACCION REALIZADA CORRECTAMENTE", "TEOLAM", 1);
                        Buscar();
                        Limpiar();
                    }
                } catch (Exception e) {
                  //  JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "TEOLAM", 2);
                }
            }
            
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoKeyTyped
        Character validar = evt.getKeyChar();
        //NO TENGAN LETRAS
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "SOLO DEBE INGRESAR NUMEROS", "ERROR", 0);
            txt_monto.setText("");
            txt_monto.requestFocus();
        }
        txt_monto.setText("");
        txt_monto.requestFocus();
    }//GEN-LAST:event_txt_montoKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        // TODO add your handling code here:
        Character validar = evt.getKeyChar();
        //MENOR A 10 CARACTERES
        if (txt_cedula.getText().length() == 10) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR! LA CEDULA DEBE TENER 10 DÍGITOS");
        }
        //NO   LETRAS
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! LA CEDULA DEBE TENER SOLO NÚMEROS");
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String path = null;
        Date date1 = jDateChooserDesde.getDate();
        Date date2 = jdateChooserHasta.getDate();
        String estadoMulta = (String) combo_multa.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else if (estadoMulta.equalsIgnoreCase("SELECCIONE")) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA ESTADO DE LA MULTA", "TEOLAM", 2);
        } else {
            Reportes();
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql = "SELECT sum(monto) from transaccion where tipo_transaccion='PAGO_MULTA';";
        ResultSet resul = Conexion_sql.Resultados(sql);
        
        try {
            while (resul.next()) {
                txt_dineroMulta.setText(resul.getString("sum"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    public void Reportes() {
        java.sql.Connection conexion1 = null;
        Conexion_sql con = new Conexion_sql();
        conexion1 = con.getConexion();
        String path = null;
        JasperReport reporte = null;
        boolean cedula = false;
        String sql = null;
        boolean bandera = false;
        Date fecha = null;
        String formato = null;
        Date fecha1 = null;
        String formato1 = null;
        if (jDateChooserDesde.getDate() != null) {
            fecha = jDateChooserDesde.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (jdateChooserHasta.getDate() != null) {
            fecha1 = jdateChooserHasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
        }
        
        String estadoMulta = (String) combo_multa.getSelectedItem();
        System.out.println(estadoMulta);
        
        if (!"".equals(txt_cedula.getText())) {
            
            if (estadoMulta.equalsIgnoreCase("PENDIENTE") || estadoMulta.equalsIgnoreCase("PAGADA")) {
                try {
                    path = "src\\reportes\\Reporte_Multa_xSocio.jasper";
                    Map parametro = new HashMap();
                    parametro.put("estado", estadoMulta);
                    parametro.put("cedula", txt_cedula.getText());
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                    
                } catch (JRException ex) {
                    java.util.logging.Logger.getLogger(Multa_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                cedula = true;
                
            } else {
                try {
                    path = "src\\reportes\\Reporte_Multa_xSocio_Todos.jasper";
                    Map parametro = new HashMap();
                    parametro.put("estado", estadoMulta);
                    parametro.put("cedula", txt_cedula.getText());
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                    
                } catch (JRException ex) {
                    java.util.logging.Logger.getLogger(Multa_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                cedula = true;
            }
            
        } else if (estadoMulta.equalsIgnoreCase("PENDIENTE") || estadoMulta.equalsIgnoreCase("PAGADA") && cedula == false) {
            
            try {
                path = "src\\reportes\\Reporte_Multa.jasper";
                Map parametro = new HashMap();
                parametro.put("estado", estadoMulta);
                parametro.put("cedula", txt_cedula.getText());
                parametro.put("fecha_inicio", fecha);
                parametro.put("fecha_fin", fecha1);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } catch (JRException ex) {
                java.util.logging.Logger.getLogger(Multa_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else if (estadoMulta.equalsIgnoreCase("TODAS") && cedula == false) {
            try {
                path = "src\\reportes\\Reporte_Multa_todos.jasper";
                Map parametro = new HashMap();
                parametro.put("fecha_inicio", fecha);
                parametro.put("fecha_fin", fecha1);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } catch (JRException ex) {
                java.util.logging.Logger.getLogger(Multa_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cobrar;
    private javax.swing.JLabel LblFechaPago;
    private javax.swing.JLabel LblFechaPago1;
    private javax.swing.JLabel LblFechaReunion;
    private javax.swing.JLabel LblFechaReunion1;
    private javax.swing.JLabel LblFechaReunion2;
    private javax.swing.JLabel LblFechaReunion3;
    private javax.swing.JLabel LblFechaReunion4;
    private javax.swing.JLabel LblFechaReunion5;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblFondoPanel;
    private javax.swing.JLabel LblFondoPanel2;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTable Tabla_Multas;
    private javax.swing.JComboBox<String> combo_multa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooserDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateChooserHasta;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_dineroMulta;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
