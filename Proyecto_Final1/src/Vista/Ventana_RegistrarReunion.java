package Vista;

import static Vista.Socio_Ventana.resultado;
import java.sql.*;
import java.util.Date;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Reunion;

public class Ventana_RegistrarReunion extends javax.swing.JFrame {

    static java.sql.Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM reunion";

    DefaultTableModel modelo;

    public static ArrayList<Reunion> arrayReunion = new ArrayList<>();

    public Ventana_RegistrarReunion() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO REUNION");
        modelo.addColumn("FECHA");
        modelo.addColumn("DURACION");
        modelo.addColumn("TOPICO");
        JTdatos.getColumnModel().getColumn(0).setPreferredWidth(10);
        JTdatos.getColumnModel().getColumn(2).setPreferredWidth(10);
        this.JTdatos.setModel(modelo);
        Mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblCodigo_reun = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblTopico = new javax.swing.JLabel();
        LblDuracion = new javax.swing.JLabel();
        TxtCodReu = new javax.swing.JTextField();
        JdFecha = new com.toedter.calendar.JDateChooser();
        TxtDurac = new javax.swing.JTextField();
        TxtTopic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTdatos = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar_campos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR REUNIÓN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 40));

        LblCodigo_reun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCodigo_reun.setForeground(new java.awt.Color(0, 0, 204));
        LblCodigo_reun.setText("Código de la Reunión:");
        getContentPane().add(LblCodigo_reun, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        LblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblFecha.setForeground(new java.awt.Color(0, 0, 204));
        LblFecha.setText("Fecha:");
        getContentPane().add(LblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 176, -1, -1));

        LblTopico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblTopico.setForeground(new java.awt.Color(0, 0, 204));
        LblTopico.setText("Tópico");
        getContentPane().add(LblTopico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        LblDuracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDuracion.setForeground(new java.awt.Color(0, 0, 204));
        LblDuracion.setText("Duración estimada: ");
        getContentPane().add(LblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        TxtCodReu.setEditable(false);
        TxtCodReu.setBackground(new java.awt.Color(102, 102, 102));
        TxtCodReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodReuActionPerformed(evt);
            }
        });
        TxtCodReu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodReuKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCodReu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, -1));
        getContentPane().add(JdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, -1));

        TxtDurac.setBackground(new java.awt.Color(240, 240, 240));
        TxtDurac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtDurac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDuracActionPerformed(evt);
            }
        });
        TxtDurac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDuracKeyTyped(evt);
            }
        });
        getContentPane().add(TxtDurac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, -1));

        TxtTopic.setBackground(new java.awt.Color(240, 240, 240));
        TxtTopic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtTopic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTopicKeyTyped(evt);
            }
        });
        getContentPane().add(TxtTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 230, -1));

        JTdatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO REUNION", "FECHA", "DURACION", "TOPICO"
            }
        ));
        JTdatos.setGridColor(new java.awt.Color(0, 153, 153));
        JTdatos.setRowHeight(25);
        JTdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTdatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 750, 370));

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 153, 153));
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 60));

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 153, 153));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_rol.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 150, 50));

        jbConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(0, 153, 153));
        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar.png"))); // NOI18N
        jbConsultar.setText("CONSULTAR");
        jbConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 50));

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 153, 153));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar_r.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 60));

        jbLimpiar_campos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimpiar_campos.setForeground(new java.awt.Color(0, 153, 153));
        jbLimpiar_campos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpia_cam.png"))); // NOI18N
        jbLimpiar_campos.setText("LIMPIAR CAMPOS");
        jbLimpiar_campos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbLimpiar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar_camposActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 50));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 380, 230));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "REUNIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        jPanel2.add(jLabel7);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodReuActionPerformed
        // TODO add your handling code here:
        TxtCodReu.setText("");
    }//GEN-LAST:event_TxtCodReuActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if (JdFecha.getDate() == null || "".equals(TxtDurac.getText()) || "".equals(TxtTopic.getText())) {
            JOptionPane.showMessageDialog(null, " DEBE SELECCIONAR UNA REUNION", "TEOLAM", 0);

        } else {
            Modificar();
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (JdFecha.getDate() == null || "".equals(TxtDurac.getText()) || "".equals(TxtTopic.getText())) {
            JOptionPane.showMessageDialog(null, " DEBE SELECCIONAR UNA REUNION", "TEOLAM", 0);

        } else {
            Eliminar();

        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {
            Guardar();

        } catch (ParseException ex) {
            Logger.getLogger(Ventana_RegistrarReunion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void JTdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTdatosMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat nuevof = new SimpleDateFormat("yyyy-MM-dd");

        // Tranformar la fecha a Strin
        try {
            Date fecha = null;
            String date1 = JTdatos.getValueAt(JTdatos.getSelectedRow(), 1).toString().trim();
            fecha = (Date) nuevof.parse(date1);
            TxtCodReu.setText(JTdatos.getValueAt(JTdatos.getSelectedRow(), 0).toString());
            TxtDurac.setText(JTdatos.getValueAt(JTdatos.getSelectedRow(), 2).toString());
            TxtTopic.setText(JTdatos.getValueAt(JTdatos.getSelectedRow(), 3).toString());
            JdFecha.setDate(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_JTdatosMouseClicked

    private void TxtDuracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDuracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDuracActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
        Modal_reunion mr = new Modal_reunion(this, true);
        mr.setVisible(true);
        String codigo = String.valueOf(mr.getCodigo_reunion());
        this.TxtCodReu.setText(codigo);
        this.JdFecha.setDate(mr.getFecha_reunion());
        this.TxtDurac.setText(mr.getDuracion_reunion());
        this.TxtTopic.setText(mr.getTopico_reunion());
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void TxtDuracKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDuracKeyTyped
        // TODO add your handling code here:
        Character validar = evt.getKeyChar();
        //NO TENGAN LETRAS
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "SOLO DEBE INGRESAR NUMEROS", "ERROR", 0);
            TxtDurac.setText("");
            TxtDurac.requestFocus();
        }
        TxtDurac.setText("");
        TxtDurac.requestFocus();
    }//GEN-LAST:event_TxtDuracKeyTyped

    private void TxtTopicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTopicKeyTyped
        // TODO add your handling code here:
        /*Character val = evt.getKeyChar();
        //MENOR A 10 CARACTERES
        if (Character.isDigit(val)) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "NO SE DEBE INGRESAR NUMEROS", "ERROR", 0);
            TxtTopic.setText("");
            TxtTopic.requestFocus();
        }*/
    }//GEN-LAST:event_TxtTopicKeyTyped

    private void TxtCodReuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodReuKeyTyped
        // TODO add your handling code here:
        //NO TENGAN LETRAS
        Character validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "SOLO DEBE INGRESAR VALORES NUMERICOS", "ERROR", 0);
        }
        TxtCodReu.setText("");
    }//GEN-LAST:event_TxtCodReuKeyTyped

    private void jbLimpiar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar_camposActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jbLimpiar_camposActionPerformed

    public void Mostrar() {
        JTdatos.getColumnModel().getColumn(0).setPreferredWidth(10);
        JTdatos.getColumnModel().getColumn(2).setPreferredWidth(10);
        arrayReunion.clear();
        resultado = Conexion_sql.ConsultaReunion();
        int cafilas = JTdatos.getRowCount();
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
                arrayReunion.add(obreunion);
            }
            String[] datosmostrar;
            for (Reunion elemento : arrayReunion) {
                datosmostrar = new String[4];
                datosmostrar[0] = Integer.toString(elemento.getCodigo_reunion());
                datosmostrar[1] = elemento.getFecha_reunion();
                datosmostrar[2] = elemento.getTopico_reunion();
                datosmostrar[3] = elemento.getDuracion_reunion();
                modelo.addRow(datosmostrar);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void Limpiar() {
        TxtCodReu.setText("");
        JdFecha.setCalendar(null);
        TxtDurac.setText("");
        TxtTopic.setText("");
    }

    public void Guardar() throws ParseException {

        Date fecha = null;
        String formato = null;
        // Tranformar la fecha a String

        int verificarFecha;

        if (JdFecha.getDate() == null || "".equals(TxtDurac.getText()) || "".equals(TxtTopic.getText())) {

            JOptionPane.showMessageDialog(null, " EXISTEN CAMPOS VACIOS DEBE LLENAR TODOS", "TEOLAM", 0);

        } else {

            verificarFecha = ValidarFechaIngreso();
            if (verificarFecha == -1) {
                JOptionPane.showMessageDialog(null, " LA FECHA ES INCORRECTA", "TEOLAM", 0);

            } else {

                if (JdFecha.getDate() != null) {
                    fecha = JdFecha.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(fecha);
                }
                arrayReunion.clear();
                sentencia = Conexion_sql.Conexion();
                String format = null;
                int fila = 0;

                if (JdFecha.getDate() != null) {
                    fecha = JdFecha.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    format = sdf.format(fecha);
                }
                String sql = " SELECT fecha_reunion from reunion where fecha_reunion= '" + format + " ';";
                resultado = Conexion_sql.Resultados(sql);
                try {
                    while (resultado.next()) {
                        fila++;
                    }
                    if (fila > 0) {
                        JOptionPane.showMessageDialog(null, "LA REUNION YA EXISTE NO SE PÚEDE CREAR", "TEOLAM", 0);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                }

                if (fila <= 0) {
                    Reunion objtreu;
                    try {
                        objtreu = new Reunion();
                        objtreu.setFecha_reunion(format);
                        objtreu.setTopico_reunion(TxtTopic.getText());
                        objtreu.setDuracion_reunion(TxtDurac.getText());
                        String sentenciaSql = new String();
                        sentenciaSql = "INSERT INTO reunion (fecha_reunion,duracion_reunion,topico_reunion)";
                        sentenciaSql = sentenciaSql + "VALUES('" + objtreu.getFecha_reunion() + "','" + objtreu.getDuracion_reunion() + "','" + objtreu.getTopico_reunion() + "')";
                        sentencia.execute(sentenciaSql);
                        JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE");
                        JOptionPane.showMessageDialog(null, "AHORA DEBE TOMAR LA ASISTENCIA", "TEOLAM", 1);

                        String sql2 = "SELECT codigo_reunion from reunion where fecha_reunion='" + format + "';";
                        int codigo_reunion = 0;
                        ResultSet resul = null;
                        resul = Conexion_sql.Resultados(sql2);

                        while (resul.next()) {
                            codigo_reunion = resul.getInt("codigo_reunion");
                        }

                        Asistencia_Ventana asis = new Asistencia_Ventana(formato, codigo_reunion);
                        asis.setVisible(true);

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                    }

                }
                Limpiar();
                Mostrar();
            }

        }

    }

    public int ValidarFechaIngreso() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaIngreso = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (JdFecha.getDate() != null) {
            fecha = JdFecha.getDate();
            fechaIngreso = sdf.format(fecha);
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaIngreso);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;

    }

    public void Modificar() {
        arrayReunion.clear();
        sentencia = Conexion_sql.Conexion();
        Date fecha = null;
        String format = null;
        int fila = 0;

        if (JdFecha.getDate() != null) {
            fecha = JdFecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            format = sdf.format(fecha);
        }

        int resp;
        resp = JOptionPane.showConfirmDialog(rootPane, "¿ESTA SEGURO DE MODIFICAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (fila <= 0) {
                Reunion objtreu;
                try {
                    objtreu = new Reunion();
                    objtreu.setFecha_reunion(format);
                    objtreu.setTopico_reunion(TxtTopic.getText());
                    objtreu.setDuracion_reunion(TxtDurac.getText());
                    String sentenciaSql = new String();
                    sentenciaSql = "UPDATE reunion SET fecha_reunion='" + format + "',duracion_reunion='" + TxtDurac.getText() + "',topico_reunion='" + TxtTopic.getText() + "'WHERE codigo_reunion='" + TxtCodReu.getText() + "'";
                    sentencia.execute(sentenciaSql);
                    JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
        }
        Mostrar();
        Limpiar();
    }

    public void Eliminar() {
        arrayReunion.clear();
        sentencia = Conexion_sql.Conexion();
        Date fecha = null;
        String format = null;
        int fila = 0;

        if (JdFecha.getDate() != null) {
            fecha = JdFecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            format = sdf.format(fecha);
        }

        int resp;
        resp = JOptionPane.showConfirmDialog(rootPane, "¿DESEA ELIMNAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (fila <= 0) {
                Reunion objtreu;
                try {
                    objtreu = new Reunion();
                    objtreu.setFecha_reunion(format);
                    objtreu.setTopico_reunion(TxtTopic.getText());
                    objtreu.setDuracion_reunion(TxtDurac.getText());
                    String sentenciaSql = new String();
                    sentenciaSql = "DELETE FROM reunion WHERE codigo_reunion='" + TxtCodReu.getText() + "'";
                    sentencia.execute(sentenciaSql);
                    JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR ESTA REUNION","",2);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
        }
        Mostrar();
        Limpiar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTdatos;
    private com.toedter.calendar.JDateChooser JdFecha;
    private javax.swing.JLabel LblCodigo_reun;
    private javax.swing.JLabel LblDuracion;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblTopico;
    private javax.swing.JTextField TxtCodReu;
    private javax.swing.JTextField TxtDurac;
    private javax.swing.JTextField TxtTopic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar_campos;
    private javax.swing.JButton jbModificar;
    // End of variables declaration//GEN-END:variables
}
