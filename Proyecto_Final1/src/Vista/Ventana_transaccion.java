package Vista;

import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Socio;
import Modelo.Transaccion;
import java.sql.Timestamp;
import java.util.Date;

public class Ventana_transaccion extends javax.swing.JInternalFrame {

    int cod_socio;
    static java.sql.Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM socio";

    DefaultTableModel modelo;

    public static ArrayList<Transaccion> arraytransac = new ArrayList<Transaccion>();
    public static ArrayList<Socio> arraysocio = new ArrayList();

    double sald;
    String t_transaccion = null;

    public double getSald() {
        return sald;
    }

    public Ventana_transaccion() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO TRANSACCION");
        modelo.addColumn("FECHA TRANSACCION");
        modelo.addColumn("MONTO");
        modelo.addColumn("SALDO");
        this.jTabla_tran.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_tipo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        LblCedula_so = new javax.swing.JLabel();
        TxtCedula_soc = new javax.swing.JTextField();
        LblNombre = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        LblDireccion = new javax.swing.JLabel();
        LblNume_cuenta = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtNumero_cu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabla_tran = new javax.swing.JTable();
        BtnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtValor_cuenta = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        TxtCodigo_socio = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TxtDeposito = new javax.swing.JTextField();
        rbRetiro = new javax.swing.JRadioButton();
        rbDeposito = new javax.swing.JRadioButton();
        LblTipo_transa = new javax.swing.JLabel();
        LblIngrese_monto = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        LblFondo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("TRANSACCIONES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, 30));

        LblCedula_so.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCedula_so.setForeground(new java.awt.Color(0, 0, 204));
        LblCedula_so.setText("Cédula de Socio:");
        getContentPane().add(LblCedula_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        TxtCedula_soc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtCedula_soc.setForeground(new java.awt.Color(0, 0, 204));
        TxtCedula_soc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedula_socActionPerformed(evt);
            }
        });
        TxtCedula_soc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedula_socKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCedula_soc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre.setText("Nombre:");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        LblApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(0, 0, 204));
        LblApellido.setText("Apellido:");
        getContentPane().add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        LblTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblTelefono.setForeground(new java.awt.Color(0, 0, 204));
        LblTelefono.setText("Télefono:");
        getContentPane().add(LblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        LblDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblDireccion.setForeground(new java.awt.Color(0, 0, 204));
        LblDireccion.setText("Dirección:");
        getContentPane().add(LblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        LblNume_cuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNume_cuenta.setForeground(new java.awt.Color(0, 0, 204));
        LblNume_cuenta.setText("Número de Cuenta:");
        getContentPane().add(LblNume_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        Txtnombre.setEditable(false);
        Txtnombre.setBackground(new java.awt.Color(153, 153, 153));
        Txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(Txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, -1));

        TxtApellido.setEditable(false);
        TxtApellido.setBackground(new java.awt.Color(153, 153, 153));
        TxtApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, -1));

        TxtTelefono.setEditable(false);
        TxtTelefono.setBackground(new java.awt.Color(153, 153, 153));
        TxtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, -1));

        TxtDireccion.setEditable(false);
        TxtDireccion.setBackground(new java.awt.Color(153, 153, 153));
        TxtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 170, -1));

        TxtNumero_cu.setEditable(false);
        TxtNumero_cu.setBackground(new java.awt.Color(153, 153, 153));
        TxtNumero_cu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtNumero_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, -1));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "LISTA DE TRANSACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jTabla_tran.setBackground(new java.awt.Color(204, 204, 255));
        jTabla_tran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jTabla_tran.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTabla_tran.setForeground(new java.awt.Color(0, 0, 153));
        jTabla_tran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO TRANSACCION", "FECHA", "MONTO", "SALDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla_tran.setGridColor(new java.awt.Color(0, 102, 255));
        jTabla_tran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabla_tranMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabla_tran);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 610, 480));

        BtnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        BtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnConsultar.setForeground(new java.awt.Color(0, 153, 153));
        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar.png"))); // NOI18N
        BtnConsultar.setText("CONSULTAR HISTORIAL");
        BtnConsultar.setToolTipText("");
        BtnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 210, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Cantidad en la cuenta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        TxtValor_cuenta.setBackground(new java.awt.Color(153, 153, 153));
        TxtValor_cuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtValor_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValor_cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtValor_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, -1));

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(0, 0, 204));
        jlCodigo.setText("Código Socio:");
        getContentPane().add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        TxtCodigo_socio.setEditable(false);
        TxtCodigo_socio.setBackground(new java.awt.Color(153, 153, 153));
        TxtCodigo_socio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtCodigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, -1));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 153, 153));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpia_cam.png"))); // NOI18N
        jbLimpiar.setText("LIMPIAR CAMPOS");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 210, 60));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "TRAMITE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtDeposito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(TxtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 140, -1));

        rbRetiro.setBackground(new java.awt.Color(153, 204, 255));
        Grupo_tipo.add(rbRetiro);
        rbRetiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbRetiro.setText("RETIRO");
        rbRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRetiroActionPerformed(evt);
            }
        });
        jPanel1.add(rbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 90, 30));

        rbDeposito.setBackground(new java.awt.Color(153, 204, 255));
        Grupo_tipo.add(rbDeposito);
        rbDeposito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbDeposito.setText("DEPOSITO");
        rbDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDepositoActionPerformed(evt);
            }
        });
        jPanel1.add(rbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 30));

        LblTipo_transa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblTipo_transa.setForeground(new java.awt.Color(0, 0, 204));
        LblTipo_transa.setText("Tipo de Transacción:");
        jPanel1.add(LblTipo_transa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        LblIngrese_monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblIngrese_monto.setForeground(new java.awt.Color(0, 0, 204));
        LblIngrese_monto.setText("Monto:");
        jPanel1.add(LblIngrese_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jbAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbAceptar.setForeground(new java.awt.Color(0, 153, 153));
        jbAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar_t.png"))); // NOI18N
        jbAceptar.setText("REGISTRAR");
        jbAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, 60));

        LblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel1.add(LblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 540, 180));

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDepositoActionPerformed

    }//GEN-LAST:event_rbDepositoActionPerformed

    private void TxtCedula_socActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedula_socActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedula_socActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        Llenarcampos();
        boolean bandera = false;
        if ("".equals(TxtCedula_soc.getText()) || "".equals(TxtDeposito.getText())) {
            JOptionPane.showMessageDialog(rootPane, "DEBE PRIMERO LLENAR LOS CAMPOS", "", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } else {
            Guardar();
            Mostrar();
          
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    public double cantidad_cuenta(int cod_so) {
        String sql = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + cod_so + " ORDER BY fecha_trans DESC LIMIT 1;";
        ResultSet resul = null;
        resul = Conexion_sql.Resultados(sql);
        double cantidad = 0;
        try {
            while (resul.next()) {
                cantidad = resul.getDouble("saldo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return cantidad;
    }


    private void rbRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRetiroActionPerformed

    private void TxtCedula_socKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedula_socKeyTyped
        Character validar = evt.getKeyChar();
        //MENOR A 10 CARACTERES
        if (TxtCedula_soc.getText().length() == 10) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR! LA CEDULA DEBE TENER 10 DÍGITOS");
        }
        //NO   LETRAS
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! LA CEDULA DEBE TENER SOLO NÚMEROS");
        }
    }//GEN-LAST:event_TxtCedula_socKeyTyped

    private void jTabla_tranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabla_tranMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            double drcantidad = Double.valueOf(TxtDeposito.getText());
            int nume = Integer.valueOf(TxtNumero_cu.getText());
            double valor_cuenta = Double.valueOf(TxtValor_cuenta.getText());
            if (rbRetiro.isSelected()) {
                t_transaccion = "Retiro";
                if (valor_cuenta < 0) {
                    JOptionPane.showMessageDialog(null, "NO EXISTE FONDOS EN LA CUENTA :O");
                } else if (valor_cuenta < drcantidad) {
                    JOptionPane.showMessageDialog(null, "NO cuenta con fondos suficientes");
                } else {
                    JOptionPane.showMessageDialog(null, "El retiro se realizo correctamente");
                    sald = valor_cuenta - drcantidad;
                }
            }
            if (rbDeposito.isSelected()) {
                sald = valor_cuenta + drcantidad;
                JOptionPane.showMessageDialog(null, "El deposito se realizo correctamente");
                t_transaccion = "Deposito";
            }
            String total;
            total = String.valueOf(sald);
            TxtNumero_cu.setText(jTabla_tran.getValueAt(jTabla_tran.getSelectedRow(), 0).toString());
            t_transaccion = jTabla_tran.getValueAt(jTabla_tran.getSelectedRow(), 1).toString();
            TxtDeposito.setText(jTabla_tran.getValueAt(jTabla_tran.getSelectedRow(), 2).toString());
            total = jTabla_tran.getValueAt(jTabla_tran.getSelectedRow(), 3).toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jTabla_tranMouseClicked

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        Mostrar();
    }//GEN-LAST:event_BtnConsultarActionPerformed


    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void TxtValor_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValor_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValor_cuentaActionPerformed

    private void TxtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtnombreActionPerformed
    public void Mostrar() {
        int fila = 0;
        boolean bandera = false;
        if ("".equals(TxtCedula_soc.getText()) || "".equals(TxtCedula_soc.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe primero ingresar una cedula", "", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } else {
            modelo = new DefaultTableModel();
            modelo.addColumn("FECHA");
            modelo.addColumn("TIPO TRANSACCION");
            modelo.addColumn("MONTO");
            modelo.addColumn("SALDO");
            this.jTabla_tran.setModel(modelo);
            String sql = "SELECT nombre_socio,apellido_socio,s.codigo_socio,telefono_socio,direccion_socio,"
                    + "numero_de_cuenta,fecha_trans,tipo_transaccion,monto,saldo FROM socio s,"
                    + "transaccion t WHERE s.cedula_socio = '" + TxtCedula_soc.getText() + "' and s.codigo_socio=t.codigo_socio "
                    + "order by fecha_trans desc;";
            ResultSet resul;
            resul = Conexion_sql.Resultados(sql);
            String[] matriss = new String[4];

            try {
                while (resul.next()) {
                    TxtNumero_cu.setText(resul.getString("numero_de_cuenta"));
                    Txtnombre.setText(resul.getString("nombre_socio"));
                    TxtApellido.setText(resul.getString("apellido_socio"));
                    TxtCodigo_socio.setText(resul.getString("codigo_socio"));
                    TxtTelefono.setText(resul.getString("telefono_socio"));
                    TxtDireccion.setText(resul.getString("direccion_socio"));
                    matriss[0] = resul.getString("fecha_trans");
                    matriss[1] = resul.getString("tipo_transaccion");
                    matriss[2] = resul.getString("monto");
                    matriss[3] = resul.getString("saldo");
                    cod_socio = Integer.parseInt(resul.getString("codigo_socio"));
                    modelo.addRow(matriss);
                    fila++;
                }

                if (fila <= 0) {
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "ESTE SOCIO NO TIENE NINGUNA TRASACCION", "", 2);
                } else {
                    String sql1 = "SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= " + cod_socio + " ORDER BY fecha_trans DESC LIMIT 1;";
                    ResultSet result = null;
                    resul = Conexion_sql.Resultados(sql1);

                    double cantidad = 0;
                    try {
                        while (resul.next()) {
                            cantidad = resul.getDouble("saldo");
                            TxtValor_cuenta.setText(String.valueOf(cantidad));
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
                //SELECT saldo,fecha_trans FROM transaccion WHERE codigo_socio= '1' ORDER BY fecha_trans DESC LIMIT 1;

            } catch (SQLException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, " ERROR " + ex.getMessage(), "", 2);
            }
        }

    }

    public void Limpiar() {
        TxtCedula_soc.setText("");
        Txtnombre.setText("");
        TxtApellido.setText("");
        TxtCodigo_socio.setText("");
        TxtTelefono.setText("");
        TxtDireccion.setText("");
        TxtNumero_cu.setText("");
        TxtValor_cuenta.setText("");
        TxtDeposito.setText("");
        rbRetiro.setSelected(false);
        rbDeposito.setSelected(false);
    }

    public void Llenarcampos() {
        int fila = 0;
        arraysocio.clear();
        sentencia = Conexion_sql.Conexion();
        String cedula = null;
        cedula = TxtCedula_soc.getText();
        resultado = Conexion_sql.ConsultaCedulaSocio(cedula);
        int n_cuenta = 0;
        try {
            while (resultado.next()) {
                Socio obtSocio = new Socio();
                obtSocio.setCodigo_socio(resultado.getInt("codigo_socio"));
                obtSocio.setCedula_socio(resultado.getString("cedula_socio"));
                obtSocio.setNombre_socio(resultado.getString("nombre_socio"));
                obtSocio.setApellido_socio(resultado.getString("apellido_socio"));
                obtSocio.setCorreo_socio(resultado.getString("correo_socio"));
                obtSocio.setFecha_nac_socio(resultado.getString("fecha_nac_socio"));
                obtSocio.setTelefono_socio(resultado.getString("telefono_socio"));
                obtSocio.setDireccion_socio(resultado.getString("direccion_socio"));
                obtSocio.setFecha_ingreso(resultado.getString("fecha_ingreso_socio"));
                obtSocio.setNumero_cuenta(resultado.getInt("numero_de_cuenta"));
                arraysocio.add(obtSocio);
                n_cuenta = resultado.getInt("numero_de_cuenta");
                fila++;
            }
            if (fila <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN SOCIO");
            } else {
                double cantidad_cuenta = cantidad_cuenta(n_cuenta);
                TxtValor_cuenta.setText(String.valueOf(cantidad_cuenta));
                for (Socio elemento : arraysocio) {
                    Txtnombre.setText(elemento.getNombre_socio());
                    TxtApellido.setText(elemento.getApellido_socio());
                    TxtCodigo_socio.setText(String.valueOf(elemento.getCodigo_socio()));
                    TxtTelefono.setText(elemento.getTelefono_socio());
                    TxtDireccion.setText(elemento.getDireccion_socio());
                    TxtNumero_cu.setText(String.valueOf(elemento.getNumero_cuenta()));
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Conexion_sql.CerrarConexion();
    }

    public void Guardar() {

        System.out.println(sald + "saldo");
        String sql = "SELECT codigo_socio from socio where cedula_socio='" + TxtCedula_soc.getText() + "'";
        ResultSet resul;
        resul = Conexion_sql.Resultados(sql);
        boolean bandera = false;
        try {
            while (resul.next()) {
                cod_socio = Integer.parseInt(resul.getString("codigo_socio"));
                System.out.println(cod_socio);
            }
            sald = cantidad_cuenta(cod_socio);
            java.util.Date fecha = new Date();
            String formato = "";

            //formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(fecha);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
            formato = sdf.format(fecha);
            System.out.println(formato);
            sentencia = Conexion_sql.Conexion();

            Transaccion objtrans = new Transaccion();
            Socio objsocio = new Socio();
            String t_transaccion = null;
            double drcantidad = Double.valueOf(TxtDeposito.getText());
            int nume = Integer.valueOf(TxtNumero_cu.getText());
            if (rbRetiro.isSelected()) {
                t_transaccion = "RETIRO";
                if (sald < 0 || sald < drcantidad) {
                    JOptionPane.showMessageDialog(null, "NO EXISTE FONDOS EN LA CUENTA");
                    bandera = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El retiro se realizo correctamente");
                    sald = sald - drcantidad;
                }
            }
            if (rbDeposito.isSelected()) {
                t_transaccion = "DEPOSITO";
                sald = sald + drcantidad;
                JOptionPane.showMessageDialog(null, "El deposito se realizo correctamente");
            }
            if (bandera == false) {
                objsocio.setNumero_cuenta(nume);
                objtrans.setMonto(drcantidad);
                objtrans.setSaldo(sald);
                Timestamp fc = Timestamp.valueOf(formato);
                String sentenciaSql = new String();
                System.out.println(cod_socio + " codigo socio");
                sentenciaSql = "INSERT INTO transaccion(codigo_socio,monto,tipo_transaccion,saldo,fecha_trans)";
                sentenciaSql = sentenciaSql + " VALUES(" + cod_socio + "," + TxtDeposito.getText() + ",'" + t_transaccion + "'," + sald + ",'" + fc + "')";
                try {
                    sentencia.execute(sentenciaSql);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Ventana_transaccion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //  Mostrar();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.ButtonGroup Grupo_tipo;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCedula_so;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblFondo2;
    private javax.swing.JLabel LblIngrese_monto;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNume_cuenta;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JLabel LblTipo_transa;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula_soc;
    private javax.swing.JTextField TxtCodigo_socio;
    private javax.swing.JTextField TxtDeposito;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNumero_cu;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtValor_cuenta;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabla_tran;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JRadioButton rbDeposito;
    private javax.swing.JRadioButton rbRetiro;
    // End of variables declaration//GEN-END:variables
}
