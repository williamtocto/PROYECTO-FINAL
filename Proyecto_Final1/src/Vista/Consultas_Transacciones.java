/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import Modelo.Socio;
import Modelo.Transaccion;
import java.sql.Timestamp;

public class Consultas_Transacciones extends javax.swing.JInternalFrame {

    java.sql.Connection conexion1 = null;
    DefaultTableModel modelo;
    double saldo;
    String t_transaccion = null;
    static int cod_socio;

    public Consultas_Transacciones() {

        initComponents();
        combox.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblFondo1 = new javax.swing.JLabel();
        jDatedesde = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jDatehasta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_buscar1 = new javax.swing.JButton();
        combox = new javax.swing.JComboBox<>();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CEDULA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_dineroTotal = new javax.swing.JTextField();
        LblTitulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        LblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDatedesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 233, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Fecha desde:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 106, 24));
        getContentPane().add(jDatehasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 233, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Fecha hasta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 51));
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 680, 370));

        btn_buscar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_buscar1.setForeground(new java.awt.Color(0, 153, 153));
        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        btn_buscar1.setText("CONSULTAR ");
        btn_buscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 60));

        combox.setForeground(new java.awt.Color(0, 255, 51));
        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE PARA ORDENAR", "ORDENAR POR APELLIDO ASCENDENTE", "ORDENAR POR APELLIDO DESCENDENTE", "ORDENAR POR FECHA ASCENDENTE", "ORDENAR POR FECHA DESCENDENTE" }));
        combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxActionPerformed(evt);
            }
        });
        getContentPane().add(combox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 260, -1));

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
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, -1));

        txt_nombre.setEditable(false);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 210, -1));

        txt_apellido.setEditable(false);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 230, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, -1, -1));

        CEDULA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CEDULA.setForeground(new java.awt.Color(0, 0, 204));
        CEDULA.setText("Cédula:");
        getContentPane().add(CEDULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpia.png"))); // NOI18N
        jButton1.setText("LIMPIAR CAMPOS");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 60));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar_repo.png"))); // NOI18N
        jButton2.setText("IMPRIMIR REPORTE");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, 60));

        txt_dineroTotal.setEditable(false);
        txt_dineroTotal.setBackground(new java.awt.Color(204, 204, 255));
        txt_dineroTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_dineroTotal.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txt_dineroTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 150, 50));

        LblTitulo.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(51, 51, 255));
        LblTitulo.setText("CONSULTAS TRANSACCIONES");
        getContentPane().add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("DINERO TOTAL EN CAJA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        boolean bandera = false;
        Date date1 = jDatedesde.getDate();
        Date date2 = jDatehasta.getDate();
        // String estadoMulta = (String) combo_multa.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else {
            int codigo_socio = 0;

            if (!"".equals(txt_cedula.getText())) {
                bandera = true;
                combox.setEditable(false);
                combox.setEnabled(false);
                Mostrar(bandera);
            } else {
                combox.setEnabled(true);
                Mostrar(bandera);
            }

        }

    }//GEN-LAST:event_btn_buscar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxActionPerformed
        String sql = null;
        Date fecha = null, fecha1 = null;
        String formato = null;
        String formato1 = null;

        // Tranformar la fecha a String
        if (jDatedesde.getDate() != null) {
            fecha = jDatedesde.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            formato = sdf.format(fecha);
        }
        if (jDatehasta.getDate() != null) {
            fecha1 = jDatehasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            formato1 = sdf.format(fecha1);
        }
        System.out.println(formato);
        System.out.println(formato1);
        String consulta = (String) combox.getSelectedItem();
        boolean bandera = false;

        if (consulta.equalsIgnoreCase("ORDENAR POR APELLIDO ASCENDENTE")) {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and s.numero_de_cuenta<> 1001 order by s.apellido_socio";
            System.out.println("1");

        } else if (consulta.equalsIgnoreCase("ORDENAR POR FECHA ASCENDENTE")) {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and s.numero_de_cuenta<> 1001 order by t.fecha_trans";
            System.out.println("2");

        } else if (consulta.equalsIgnoreCase("ORDENAR POR APELLIDO DESCENDENTE")) {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and s.numero_de_cuenta<> 1001 order by s.apellido_socio desc";
            System.out.println("3");

        } else if (consulta.equalsIgnoreCase("ORDENAR POR FECHA DESCENDENTE")) {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and s.numero_de_cuenta<> 1001 order by t.fecha_trans desc";
            System.out.println("4");

        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA PARA ORDENAR", "TEOLAM", 2);
            bandera = true;
        }
        if (bandera == false) {

            modelo = new DefaultTableModel();
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("FECHA");
            modelo.addColumn("TIPO TRANSACCION");
            modelo.addColumn("MONTO");
            modelo.addColumn("SALDO");
            this.jTable1.setModel(modelo);
            System.out.println(sql);
            ResultSet resul;
            resul = Conexion_sql.Resultados(sql);
            String[] matriss = new String[6];
            int fila = 0;
            try {
                while (resul.next()) {
                    cod_socio = resul.getInt("codigo_socio");
                    matriss[0] = resul.getString("nombre_socio");
                    matriss[1] = resul.getString("apellido_socio");
                    matriss[2] = resul.getString("fecha_trans");
                    matriss[3] = resul.getString("tipo_transaccion");
                    matriss[4] = resul.getString("monto");
                    matriss[5] = resul.getString("saldo");
                    modelo.addRow(matriss);
                    fila++;
                    
                }
                if (fila <= 0) {
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUN RESULTADO", "", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, " ERROR " + ex.getMessage(), "", 2);
            }

        }


    }//GEN-LAST:event_comboxActionPerformed
    public void Reportes() {
        String sql = null;
        Date fecha = null, fecha1 = null;
        String formato = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jDatedesde.getDate() != null) {
            fecha = jDatedesde.getDate();
            //formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(fecha);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        System.out.println(formato);
        if (jDatehasta.getDate() != null) {
            fecha1 = jDatehasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
            // formato1 = new SimpleDateFormat("d/M/y H:m:s").format(fecha1);
        }
        formato = formato + " 00:00:00";
        formato1 = formato1 + " 11:59:59";
        System.out.println(formato);
        System.out.println(formato1);
        try {
            Conexion_sql con = new Conexion_sql();
            conexion1 = con.getConexion();
            JasperReport reporte = null;
            if ("".equals(txt_cedula.getText())) {
                String path = "src\\reportes\\ReporteTransaccioneTodos.jasper";
                Timestamp fc = Timestamp.valueOf(formato);
                Timestamp fc1 = Timestamp.valueOf(formato1);
                System.out.println(" holaaaaaaaaaaaaaaaaaaaaaaaaaa");
                Map parametro = new HashMap();
                parametro.put("fecha_inicio", fc);
                parametro.put("fecha_fin", fc1);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } else {

                String path = "src\\reportes\\ReporteTransacciones.jasper";
                Timestamp fc = Timestamp.valueOf(formato);
                Timestamp fc1 = Timestamp.valueOf(formato1);
         
                Map parametro = new HashMap();
                parametro.put("cedula", txt_cedula.getText());
                parametro.put("fecha_inicio", fc);
                parametro.put("fecha_fin", fc1);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conexion1);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);

            }

        } catch (JRException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean bandera = false;
        Date date1 = jDatedesde.getDate();
        Date date2 = jDatehasta.getDate();
        // String estadoMulta = (String) combo_multa.getSelectedItem();
        if (date1 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE INICIO", "TEOLAM", 2);
        } else if (date2 == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR LA FECHA DE FIN", "TEOLAM", 2);
        } else {
            Reportes();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

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

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql = "SELECT sum(saldo) from transaccion t1\n"
                + "where fecha_trans=( "
                + "SELECT max(fecha_trans) "
                + "FROM transaccion t2 "
                + "where t1.codigo_socio=t2.codigo_socio "
                + ") and tipo_transaccion <> 'PAGO_MULTA';";
        ResultSet resul=Conexion_sql.Resultados(sql);
        
        try {
            while(resul.next()){
                txt_dineroTotal.setText(String.valueOf(resul.getDouble("sum")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas_Transacciones.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    public void Limpiar() {
        txt_nombre.setText("");
        txt_cedula.setText("");
        txt_apellido.setText("");
        jDatedesde.setDate(null);
        jDatehasta.setDate(null);
        txt_dineroTotal.setText("");
    }

    public void Mostrar(boolean bandera) {

        String sql = null;
        Date fecha = null, fecha1 = null;
        String formato = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jDatedesde.getDate() != null) {
            fecha = jDatedesde.getDate();
            //formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(fecha);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        System.out.println(formato);
        if (jDatehasta.getDate() != null) {
            fecha1 = jDatehasta.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
            // formato1 = new SimpleDateFormat("d/M/y H:m:s").format(fecha1);
        }
        formato = formato + " 00:00:00";
        formato1 = formato1 + " 11:59:59";
        System.out.println(formato);
        System.out.println(formato1);

        if (bandera == true) {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and cedula_socio= '" + txt_cedula.getText() + "' order by fecha_trans;";
            modelo = new DefaultTableModel();
            modelo.addColumn("FECHA");
            modelo.addColumn("TIPO TRANSACCION");
            modelo.addColumn("MONTO");
            modelo.addColumn("SALDO");
            this.jTable1.setModel(modelo);

            ResultSet resul;
            resul = Conexion_sql.Resultados(sql);
            String[] matriss = new String[4];
            int fila = 0;
            try {
                while (resul.next()) {
                    txt_nombre.setText(resul.getString("nombre_socio"));
                    txt_apellido.setText(resul.getString("apellido_socio"));
                    cod_socio = resul.getInt("codigo_socio");
                    matriss[0] = resul.getString("fecha_trans");
                    matriss[1] = resul.getString("tipo_transaccion");
                    matriss[2] = resul.getString("monto");
                    matriss[3] = resul.getString("saldo");
                    modelo.addRow(matriss);
                    fila++;
                }
                if (fila <= 0) {
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUN RESULTADO", "", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, " ERROR " + ex.getMessage(), "", 2);
            }
        } else {
            sql = "SELECT s.codigo_socio,nombre_socio,apellido_socio,tipo_transaccion,fecha_trans,monto,saldo "
                    + "FROM socio s, transaccion t where (fecha_trans) "
                    + "between '" + formato + "' and '" + formato1 + "' and s.codigo_socio=t.codigo_socio "
                    + "and s.numero_de_cuenta<> 1001 order by fecha_trans;";

            modelo = new DefaultTableModel();
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("FECHA");
            modelo.addColumn("TIPO TRANSACCION");
            modelo.addColumn("MONTO");
            modelo.addColumn("SALDO");
            this.jTable1.setModel(modelo);

            ResultSet resul;
            resul = Conexion_sql.Resultados(sql);
            String[] matriss = new String[6];
            int fila = 0;
            try {
                while (resul.next()) {
                    cod_socio = resul.getInt("codigo_socio");
                    matriss[0] = resul.getString("nombre_socio");
                    matriss[1] = resul.getString("apellido_socio");
                    matriss[2] = resul.getString("fecha_trans");
                    matriss[3] = resul.getString("tipo_transaccion");
                    matriss[4] = resul.getString("monto");
                    matriss[5] = resul.getString("saldo");
                    modelo.addRow(matriss);
                    fila++;
                }
                if (fila <= 0) {
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUN RESULTADO", "", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, " ERROR " + ex.getMessage(), "", 2);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEDULA;
    private javax.swing.JLabel LblFondo1;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDatedesde;
    private com.toedter.calendar.JDateChooser jDatehasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_dineroTotal;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
