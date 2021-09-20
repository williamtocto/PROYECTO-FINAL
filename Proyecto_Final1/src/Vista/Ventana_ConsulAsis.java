package Vista;

import static Vista.Asistencia_Ventana.resultado;
import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import static java.time.Period.between;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import Modelo.Asistencia;
import Modelo.Socio;

public class Ventana_ConsulAsis extends javax.swing.JInternalFrame {

    java.sql.Connection conexion1 = null;
    String codigoAsis;
    String[] registro;

    String[] registros = new String[6];
    JComboBox comboBox = new JComboBox();
    DefaultTableModel Modelo = new DefaultTableModel();
    public static ArrayList<Socio> lista = new ArrayList();

    public Ventana_ConsulAsis() {
        initComponents();
        Modelo.addColumn("COD");
        Modelo.addColumn("CEDULA");
        Modelo.addColumn("NOMBRE");
        Modelo.addColumn("APELLIDO");
        Modelo.addColumn("FECHA");
        Modelo.addColumn("ESTADO");
        j_table.setRowHeight(30);
        j_table.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.j_table.setModel(Modelo);
        // CargarComboBox(j_table, j_table.getColumnModel().getColumn(5));
    }

    /*public void CargarComboBox(JTable tabla, TableColumn columna) {
        comboBox.addItem("PRESENTE");
        comboBox.addItem("FALTA");
        columna.setCellEditor(new DefaultCellEditor(comboBox));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("SELECCIONA AQUI");
        columna.setCellRenderer(render);
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_table = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        combo_asistencia = new javax.swing.JComboBox<>();
        jdateChooserHasta = new com.toedter.calendar.JDateChooser();
        jDateChooserDesde = new com.toedter.calendar.JDateChooser();
        LblFechaReu = new javax.swing.JLabel();
        LblFechaReu1 = new javax.swing.JLabel();
        LblFechaReu2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        LblFechaReu3 = new javax.swing.JLabel();
        btn_reportes = new javax.swing.JButton();
        btn_reporte = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        LblFondoPanel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setLayer(6);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE ASISTENCIAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 420, -1));

        j_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        j_table.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula Socio", "Nombre", "Apellido", "Asistencia", "Fecha "
            }
        ));
        j_table.setGridColor(new java.awt.Color(0, 153, 153));
        j_table.setRowHeight(25);
        j_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 560, 440));

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);

        jLabel4.setText("CONSULTA DE ASISTENCIAS");

        jLabel5.setText("Tipo de Asistencia:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asiste", "No Asiste" }));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula Socio", "Nombre", "Apellido", "Asistencia", "Fecha "
            }
        ));
        jtable.setRowHeight(25);
        jScrollPane2.setViewportView(jtable);

        jLabel6.setText("Fecha de reunión:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 184, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo_asistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Asiste", "No Asiste", "Todos" }));
        combo_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_asistenciaActionPerformed(evt);
            }
        });
        jPanel1.add(combo_asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, -1));
        jPanel1.add(jdateChooserHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 240, -1));
        jPanel1.add(jDateChooserDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 240, -1));

        LblFechaReu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReu.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaReu.setText("Fecha  de reunión hasta:");
        jPanel1.add(LblFechaReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, -1));

        LblFechaReu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReu1.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaReu1.setText("Fecha  de reunión desde:");
        jPanel1.add(LblFechaReu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, -1));

        LblFechaReu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReu2.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaReu2.setText("Tipo de Asistencia");
        jPanel1.add(LblFechaReu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 120, 50));

        txt_cedula.setToolTipText("ESTE ES OPCIONAL");
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
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, -1));

        LblFechaReu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaReu3.setForeground(new java.awt.Color(255, 255, 255));
        LblFechaReu3.setText("Buscar por CI.");
        jPanel1.add(LblFechaReu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, -1));

        btn_reportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reportes.setForeground(new java.awt.Color(0, 153, 153));
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes_asis.png"))); // NOI18N
        btn_reportes.setText("IMPRIMIR");
        btn_reportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, 50));

        btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel1.add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 630, 230));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setEditable(false);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 260, 30));

        txt_apellido.setEditable(false);
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 260, 30));

        txt_fecha.setEditable(false);
        jPanel2.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 260, 30));

        txt_estado.setEditable(false);
        jPanel2.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado de Asistencia");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifica.png"))); // NOI18N
        btnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 120, 50));

        LblFondoPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel2.add(LblFondoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 630, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Date date1 = jDateChooserDesde.getDate();
        Date date2 = jdateChooserHasta.getDate();
        String estadoAsist = (String) combo_asistencia.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);

        } else if (estadoAsist.equalsIgnoreCase("SELECCIONE")) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR EL TIPO DE ASISTENCIA", "TEOLAM", 2);
        } else {
            Buscar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void Buscar() {

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

        String estadoAsistencia = (String) combo_asistencia.getSelectedItem();
        if (estadoAsistencia.equalsIgnoreCase("Asiste")) {
            estadoAsistencia = "TRUE";
        }
        if (estadoAsistencia.equalsIgnoreCase("No Asiste")) {
            estadoAsistencia = "FALSE";
        }
        if (estadoAsistencia.equalsIgnoreCase("Todos")) {
            bandera = true;
        }

        if (!"".equals(txt_cedula.getText()) && bandera == true) {
            System.out.println("cedula vacia");
            sql = "  select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,a.codigo_asistencia,a.estado_asistencia "
                    + "from socio s,reunion r, asistencia a where "
                    + " s.codigo_socio=a.codigo_socio_asis and r.codigo_reunion= a.codigo_reunion and "
                    + "cedula_socio= '" + txt_cedula.getText() + "' and (fecha_reunion) between '" + formato + "' "
                    + "and '" + formato1 + "' order by fecha_reunion;";
            cedula = true;
        }

        if (cedula == false && !"".equals(txt_cedula.getText())) {
            System.out.println("cedula vacia");
            sql = "  select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,a.codigo_asistencia,a.estado_asistencia "
                    + "from socio s,reunion r, asistencia a where "
                    + " s.codigo_socio=a.codigo_socio_asis and r.codigo_reunion= a.codigo_reunion and "
                    + "cedula_socio= '" + txt_cedula.getText() + "' and (fecha_reunion) between '" + formato + "' "
                    + "and '" + formato1 + "' and estado_asistencia= '" + estadoAsistencia + "' order by fecha_reunion;";
            cedula = true;
        }

        if (bandera == true && cedula == false) {
            System.out.println("legxcdscdcdc");
            sql = "  select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,a.codigo_asistencia,a.estado_asistencia "
                    + "from socio s,reunion r, asistencia a where "
                    + " s.codigo_socio=a.codigo_socio_asis and r.codigo_reunion= a.codigo_reunion  and (fecha_reunion) "
                    + "between '" + formato + "' and '" + formato1 + "' order by fecha_reunion;";

        }
        if (bandera == false && cedula == false) {
            System.out.println("hola");
            sql = "  select  cedula_socio,nombre_socio,apellido_socio,fecha_reunion,a.codigo_asistencia,a.estado_asistencia "
                    + "from socio s,reunion r, asistencia a where "
                    + " s.codigo_socio=a.codigo_socio_asis and a.estado_asistencia= '" + estadoAsistencia
                    + "' AND r.codigo_reunion= a.codigo_reunion AND (fecha_reunion) between '" + formato + "' "
                    + "and '" + formato1 + "' order by fecha_reunion;";
        }
        lista.clear();
        int fila = 0;

        int cantfila = j_table.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            Modelo.removeRow(i);
        }
        String asistencia;
        try {
            System.out.println("holaaaaa");
            resultado = Conexion_sql.Resultados(sql);
            while (resultado.next()) {
                registros[0] = resultado.getString("codigo_asistencia");
                registros[1] = resultado.getString("cedula_socio");
                registros[2] = resultado.getString("nombre_socio");
                registros[3] = resultado.getString("apellido_socio");
                registros[4] = resultado.getString("fecha_reunion");
                asistencia = String.valueOf(resultado.getBoolean("estado_asistencia"));
                if (asistencia.equalsIgnoreCase("true")) {
                    asistencia = "PRESENTE";
                } else {
                    asistencia = "FALTA";
                }
                registros[5] = asistencia;
                Modelo.addRow(registros);
                fila++;
            }
            if (fila <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON RESULTADOS", "", 2);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed

        if ("".equals(txt_apellido.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_fecha.getText())) {

            JOptionPane.showMessageDialog(null, "PRIMERO DEBE SELECCIONAR UN SOCIO DE LA TABLA", "TEOLAM", 2);

        } else {

            String cedula, nombre, apellido, estado = null;
            boolean bandera = false;
            int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE GUARDAR ESTOS DATOS", "TEOLAM", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                    new Object[]{"SI", "NO"}, null);

            if (op == 0) {
                if (txt_estado.getText().equalsIgnoreCase("PRESENTE")) {

                    estado = "FALSE";
                    String sql = "UPDATE asistencia SET estado_asistencia= '" + estado + "' WHERE codigo_asistencia=" + codigoAsis;
                    Conexion_sql.Asistencia(sql);
                    String sql2 = "INSERT INTO multa(codigo_asistencia,estado_multa) VALUES (" + codigoAsis + ",'PENDIENTE');";
                    Conexion_sql.Asistencia(sql2);
                    bandera = true;
                } else {
                    estado = "TRUE";
                    String sql = "UPDATE asistencia SET estado_asistencia= '" + estado + "' WHERE codigo_asistencia=" + codigoAsis;
                    Conexion_sql.Asistencia(sql);
                    String sql1 = "DELETE FROM multa WHERE codigo_asistencia=" + codigoAsis + " AND estado_multa='PENDIENTE';";
                    Conexion_sql.Asistencia(sql1);
                    bandera = true;
                }
                if (bandera == true) {
                    JOptionPane.showMessageDialog(null, "CAMBIO GUARDADO CON EXITO");
                    Buscar();
                    Limpiar();

                }

            }

        }


    }//GEN-LAST:event_btnBuscar1ActionPerformed

    public void Limpiar() {
        txt_fecha.setText("");
        txt_apellido.setText("");
        txt_estado.setText("");
        txt_nombre.setText("");
    }


    private void combo_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_asistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_asistenciaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void j_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_tableMouseClicked

        try {
            codigoAsis = j_table.getValueAt(j_table.getSelectedRow(), 0).toString();
            txt_nombre.setText(j_table.getValueAt(j_table.getSelectedRow(), 2).toString());
            txt_apellido.setText(j_table.getValueAt(j_table.getSelectedRow(), 3).toString());
            txt_fecha.setText(j_table.getValueAt(j_table.getSelectedRow(), 4).toString());
            txt_estado.setText(j_table.getValueAt(j_table.getSelectedRow(), 5).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_j_tableMouseClicked

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        
        
        String sql = null;
        Date fecha = null, fecha1 = null;
        String formato = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jDateChooserDesde.getDate() != null) {
            fecha = jDateChooserDesde.getDate();
            //formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(fecha);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        System.out.println(formato);
        if (jdateChooserHasta.getDate() != null) {
            fecha1 = jdateChooserHasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
            // formato1 = new SimpleDateFormat("d/M/y H:m:s").format(fecha1);
        }

        Conexion_sql con = new Conexion_sql();
        conexion1 = con.getConexion();
        JasperReport reporte = null;
        String path = null;

        boolean bandera = false;
        boolean cedula = false;
        boolean estado = false;

        Date date1 = jDateChooserDesde.getDate();
        Date date2 = jdateChooserHasta.getDate();
        String estadoAsist = (String) combo_asistencia.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else if (estadoAsist.equalsIgnoreCase("SELECCIONE")) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR EL TIPO DE ASISTENCIA", "TEOLAM", 2);
        } else {
            String estadoAsistencia = (String) combo_asistencia.getSelectedItem();
            if (estadoAsistencia.equalsIgnoreCase("Asiste")) {
                estado = true;
            }
            if (estadoAsistencia.equalsIgnoreCase("No Asiste")) {
                estado = false;
            }
            if (estadoAsistencia.equalsIgnoreCase("Todos")) {
                bandera = true;
            }
            if (bandera == false && !"".equals(txt_cedula.getText())) {
                try {
                    path = "src\\reportes\\ReporteAsistencia_xSocio_1.jasper";
                    Map parametro = new HashMap();
                    parametro.put("estado", estado);
                    parametro.put("cedula", txt_cedula.getText());
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);

                } catch (JRException ex) {
//                    java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                System.out.println("a");

                cedula = true;
            }

            if (bandera == true && !"".equals(txt_cedula.getText())) {
                try {
                    path = "src\\reportes\\ReporteAsistencia_xSocio.jasper";
                    Map parametro = new HashMap();
                    parametro.put("cedula", txt_cedula.getText());
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);

                } catch (JRException ex) {
                    //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                System.out.println("b");
                cedula = true;

            }

            if (bandera == false && cedula == false) {
                try {
                    path = "src\\reportes\\ReporteAsistencia_1.jasper";
                    Map parametro = new HashMap();
                    parametro.put("estado", estado);
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);

                } catch (JRException ex) {
                   // java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                System.out.println("c");
                cedula = true;
            }
            if (bandera == true && cedula == false) {
                try {
                    path = "src\\reportes\\ReporteAsistencia.jasper";
                    Map parametro = new HashMap();
                    parametro.put("fecha_inicio", fecha);
                    parametro.put("fecha_fin", fecha1);
                    reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                    JasperViewer view = new JasperViewer(jprint, false);
                    view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                    System.out.println("d");

                } catch (JRException ex) {
                    //java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_btn_reportesActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFechaReu;
    private javax.swing.JLabel LblFechaReu1;
    private javax.swing.JLabel LblFechaReu2;
    private javax.swing.JLabel LblFechaReu3;
    private javax.swing.JLabel LblFondoPanel1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JLabel btn_reporte;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JComboBox<String> combo_asistencia;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooserDesde;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable j_table;
    private com.toedter.calendar.JDateChooser jdateChooserHasta;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
