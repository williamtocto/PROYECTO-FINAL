package Vista;

import static Vista.Consulta_Actas.resultado;
import static Vista.Socio_Ventana.resultado;
import conexion.Conexion_sql;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Acta;
import Modelo.Reunion;
import Modelo.Socio;

public class Ventana_Actas extends javax.swing.JFrame {

    ArrayList<Reunion> lista = new ArrayList<>();
    ArrayList<Acta> actas = new ArrayList<>();
    ArrayList<String> array = new ArrayList<>();

    int codigo_reunion = 0;
    static java.sql.Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM acta";

    String[] registros = new String[5];
    String[] columnas = {"CODIGO REUNION", "Nº ACTA", "Estado del acta", "Orden del día", "Desarrollo"};
    DefaultTableModel modelo;

    public Ventana_Actas() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("FECHA ACTA");
        modelo.addColumn("NUMERO DE ACTA");
        modelo.addColumn("ESTADO DEL ACTA");
        this.JTDatosActa.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lab_Fecha = new javax.swing.JLabel();
        LblHora = new javax.swing.JLabel();
        LblAsunto = new javax.swing.JLabel();
        LblFondo2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDatosActa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtOrden = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtDesarrollo = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        jDateReunion = new com.toedter.calendar.JDateChooser();
        btnModificar1 = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btn_aprobar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("DATOS DE ACTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 240, -1));

        jPanel1.setBackground(new java.awt.Color(10, 158, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_Fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lab_Fecha.setForeground(new java.awt.Color(0, 0, 204));
        lab_Fecha.setText("Fecha de  reunión:");
        jPanel1.add(lab_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LblHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblHora.setForeground(new java.awt.Color(0, 0, 204));
        LblHora.setText("Orden del día:");
        jPanel1.add(LblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        LblAsunto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblAsunto.setForeground(new java.awt.Color(0, 0, 204));
        LblAsunto.setText("Desarrollo:");
        jPanel1.add(LblAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        LblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/36847.jpg"))); // NOI18N
        jPanel1.add(LblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 560));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar.setText("MAS BUSQUEDAS");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, 120, 60));

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(0, 153, 153));
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 120, 60));

        JTDatosActa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Reunión", "Nº Acta", "Estado del Acta"
            }
        ));
        JTDatosActa.setToolTipText("");
        JTDatosActa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTDatosActa.setGridColor(new java.awt.Color(0, 153, 153));
        JTDatosActa.setRowHeight(25);
        JTDatosActa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTDatosActaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTDatosActa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 410, 140));

        TxtOrden.setColumns(20);
        TxtOrden.setRows(5);
        jScrollPane2.setViewportView(TxtOrden);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 660, 140));

        TxtDesarrollo.setColumns(20);
        TxtDesarrollo.setRows(5);
        jScrollPane3.setViewportView(TxtDesarrollo);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 1090, 340));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 153, 153));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifica.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 140, 60));
        getContentPane().add(jDateReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, 30));

        btnModificar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(0, 153, 153));
        btnModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpia.png"))); // NOI18N
        btnModificar1.setText("LIMPIAR ");
        btnModificar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 130, 60));

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(0, 153, 153));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_acta.png"))); // NOI18N
        btnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 100, 50));

        btn_aprobar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_aprobar.setForeground(new java.awt.Color(0, 153, 153));
        btn_aprobar.setText("APROBAR ACTA");
        btn_aprobar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_aprobar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aprobarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Consulta_Actas consultar = new Consulta_Actas(this, true);
        consultar.setVisible(true);
        this.jDateReunion.setDate(consultar.getFecha_reunion());
        this.TxtDesarrollo.setText(consultar.getDesarrollo());
        this.TxtOrden.setText(consultar.getOrden_dia());
        //this.JTDatosActa.setModel(consultar.getModelo());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (jDateReunion.getDate() == null || "".equals(TxtDesarrollo.getText()) || "".equals(TxtOrden.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA FECHA DE LA REUNION Y LLENAR LOS CAMPOS", "TEOLAM", 2);
        } else {
            int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE DESEA GUARDAR ESTA ACTA", "CONFIRME", JOptionPane.YES_NO_OPTION);

            if (op == 0) {
                Date fecha = null;
                String formato = null;
                // Tranformar la fecha a String
                if (jDateReunion.getDate() != null) {
                    fecha = jDateReunion.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(fecha);
                }
                int fila = 0;
                String consulta = "SELECT * from reunion where fecha_reunion= '" + formato + "';";
                resultado = Conexion_sql.Resultados(consulta);
                Reunion objReunion;
                boolean bandera = false;
                try {
                    while (resultado.next()) {
                        fila++;
                        codigo_reunion = resultado.getInt("codigo_reunion");
                    }
                    if (fila <= 0) {
                        JOptionPane.showMessageDialog(null, "ESTA REUNION NO EXISTE", "TEOLAM", 0);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                }

                int cod_r = 0;
                ResultSet resultado2 = null;
                String consulta2 = "SELECT codigo_reunion from acta where codigo_reunion= '" + codigo_reunion + "';";

                resultado2 = Conexion_sql.Resultados(consulta2);

                try {
                    while (resultado2.next()) {
                        cod_r++;
                    }
                    if (cod_r > 0) {
                        JOptionPane.showMessageDialog(null, "NO SE PUEDE CREAR OTRA ACTA DE ESTA REUNION", "TEOLAM", 0);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana_Actas.class.getName()).log(Level.SEVERE, null, ex);
                }

                sentencia = Conexion_sql.Conexion();

                if (fila > 0 && cod_r <= 0) {
                    Acta objetoActa;
                    try {
                        objetoActa = new Acta();
                        objetoActa.setCod_reunion(codigo_reunion);
                        objetoActa.setEstado_acta("PENDIENTE");
                        objetoActa.setOrden_dia(TxtOrden.getText());
                        objetoActa.setDesarrollo(TxtDesarrollo.getText());
                        String sentenciaSql = new String();
                        sentenciaSql = "INSERT INTO acta (estado_acta,orden_dia_acta,desarrollo_acta,codigo_reunion)";
                        sentenciaSql = sentenciaSql + "VALUES('" + objetoActa.getEstado_acta() + "','" + objetoActa.getOrden_dia() + "','"
                                + objetoActa.getDesarrollo() + "','" + objetoActa.getCod_reunion() + " ')";
                        sentencia.execute(sentenciaSql);
                        JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE", "TEOLAM", 1);
                        MostrarActa();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                        e.getStackTrace();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "DEBE INGRESAR NUMEROS", "", 1);
                    } catch (Exception e) {
                        System.out.println("ERROR " + e.getMessage());
                    }
                }

            }

        }


    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (jDateReunion.getDate() == null || TxtDesarrollo.getText() == null || TxtOrden.getText() == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA ACTA DE LA TABLA", "TEOLAM", 2);
        } else {
            Modificar();
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void JTDatosActaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTDatosActaMouseClicked

        String cod_reunion = null;
        String fecha = null;
        String numero_Acta = JTDatosActa.getValueAt(JTDatosActa.getSelectedRow(), 1).toString();
        System.out.println("A");
        System.out.println(numero_Acta + "numero de acta");
        String sql = "SELECT * FROM acta where num_acta=" + numero_Acta;
        ResultSet resul = Conexion_sql.Resultados(sql);
        try {
            while (resul.next()) {
                this.TxtOrden.setText(resul.getString("orden_dia_acta"));
                this.TxtDesarrollo.setText(resul.getString("desarrollo_acta"));
                cod_reunion = resul.getString("codigo_reunion");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.getStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha2;

        System.out.println(cod_reunion + " codigo_reunio");
        ResultSet resul2;
        String sql2 = "SELECT fecha_reunion from reunion where codigo_reunion=" + cod_reunion;
        resul2 = Conexion_sql.Resultados(sql2);
        try {
            while (resul2.next()) {
                System.out.println("c");
                fecha = resul2.getString("fecha_reunion");
            }
            fecha2 = (Date) sdf.parse(fecha);
            jDateReunion.setDate(fecha2);
        } catch (SQLException e) {
            System.out.println("p");
            e.getStackTrace();
            System.out.println("B");

        } catch (ParseException ex) {
            ex.getStackTrace();
            Logger.getLogger(Ventana_Actas.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_JTDatosActaMouseClicked

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed

        if (jDateReunion.getDate() == null && "".equals(TxtDesarrollo.getText()) && "".equals(TxtOrden.getText())) {
            JOptionPane.showMessageDialog(null, "LOS CAMPOS SE ENCUENTRAN VACIOS", "TEOLAM", 2);
        } else {
            int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE DESEA BORRAR TODA LA INFORMACION",
                    "CONFIRME", JOptionPane.YES_NO_OPTION);

            if (op == 0) {
                Limpiar();
            }

        }

    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed

        if (jDateReunion.getDate() == null) {
            JOptionPane.showMessageDialog(null, " PRIMERO DEBE SELECCIONAR UNA FECHA PARA BUSCAR", "TEOLAM", 2);
        } else {
            Date fecha = null;
            String formato = null;
            // Tranformar la fecha a String
            if (jDateReunion.getDate() != null) {
                fecha = jDateReunion.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                formato = sdf.format(fecha);
            }

            int fila = 0;
            String consulta = "SELECT codigo_reunion from reunion where fecha_reunion= '" + formato + "';";
            resultado = Conexion_sql.Resultados(consulta);
            boolean bandera = false;
            try {
                while (resultado.next()) {
                    fila++;
                    codigo_reunion = resultado.getInt("codigo_reunion");
                }
                if (fila <= 0) {
                    JOptionPane.showMessageDialog(null, "ESTA REUNION NO EXISTE", "TEOLAM", 0);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
            }
            MostrarActa();
        }


    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btn_aprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aprobarActionPerformed
        if (TxtDesarrollo.getText() == null || jDateReunion.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCONAR UNA ACTA DE LA TABLA", "TEOLAM", 0);
        } else {
            AprobarActa();
            MostrarActa();
        }
    }//GEN-LAST:event_btn_aprobarActionPerformed

    public void MostrarActa() {
        this.JTDatosActa.setModel(modelo);
        int numfilas = JTDatosActa.getRowCount();
        for (int i = numfilas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        String sql = "select fecha_reunion,a.num_acta,a.estado_acta from reunion r,"
                + "acta a where r.codigo_reunion=a.codigo_reunion and r.codigo_reunion=" + codigo_reunion + ";";

        ResultSet resultado1 = Conexion_sql.Resultados(sql);
        try {
            while (resultado1.next()) {
                registros[0] = resultado1.getString("fecha_reunion");
                registros[1] = String.valueOf(resultado1.getInt("num_acta"));
                registros[2] = resultado1.getString("estado_acta");
                modelo.addRow(registros);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void Limpiar() {
        jDateReunion.setDate(null);
        TxtOrden.setText("");
        TxtDesarrollo.setText("");
        this.JTDatosActa.setModel(modelo);
        int numfilas = JTDatosActa.getRowCount();
        for (int i = numfilas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

    public void AprobarActa() {
        
        

        int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE APROBAR ESTA ACTA", "CONFIRME", JOptionPane.YES_NO_OPTION);

        if (op == 0) {
            Date fecha = null;
            String formato = null;
            // Tranformar la fecha a String
            if (jDateReunion.getDate() != null) {
                fecha = jDateReunion.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                formato = sdf.format(fecha);
            }
            String consulta1 = "SELECT * from reunion where fecha_reunion= '" + formato + "';";
            resultado = Conexion_sql.Resultados(consulta1);
            try {
                while (resultado.next()) {
                    codigo_reunion = resultado.getInt("codigo_reunion");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
            }
            String sql = "SELECT estado_acta FROM acta where codigo_reunion=" + codigo_reunion + "AND estado_acta='APROBADA'";
            resultado = Conexion_sql.Resultados(sql);
            int fila = 0;
            try {
                while (resultado.next()) {
                    fila++;
                }
                if (fila > 0) {
                    JOptionPane.showMessageDialog(null, "ESTA ACTA YA ESTA APROBADA", "TEOLAM", 0);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
            }
            if (fila <= 0) {
                String sql1 = "UPDATE acta SET estado_acta='APROBADA' WHERE codigo_reunion=" + codigo_reunion;
                Conexion_sql.Ejecutar(sql1);
                Conexion_sql.CerrarConexion();
            }
            MostrarActa();
        }

    }

    public void Modificar() {
        boolean bandera = false;
        String sql = "SELECT estado_acta FROM acta where estado_acta='APROBADA' and codigo_reunion='" + codigo_reunion + "'";
        resultado = Conexion_sql.Resultados(sql);
        int fila = 0;
        try {
            while (resultado.next()) {
                fila++;
            }
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "EL ACTA YA SE ENCUENTRA APROBADA NO SE PUEDE MODIFICAR", "TEOLAM", 0);
                bandera = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }

        int op = 0;
        if (bandera == false) {
            op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO QUE DESEA MODIFICAR ESTA ACTA", "CONFIRME", JOptionPane.YES_NO_OPTION);
        }

        if (op == 0) {

            if ("".equals(TxtDesarrollo.getText()) || "".equals(TxtOrden.getText())) {
                JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
                bandera = true;
            }
            if (bandera == false) {

                sentencia = Conexion_sql.Conexion();
                Acta objetoActa;
                try {
                    objetoActa = new Acta();
                    objetoActa.setOrden_dia(TxtOrden.getText());
                    objetoActa.setDesarrollo(TxtDesarrollo.getText());
                    String sentenciaSql = new String();
                    sentenciaSql = "UPDATE acta SET orden_dia_acta='" + TxtOrden.getText() + "',desarrollo_acta='" + TxtDesarrollo.getText() + "'WHERE codigo_reunion='" + codigo_reunion + "'";
                    sentencia.execute(sentenciaSql);
                    JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE");
                    this.JTDatosActa.setModel(modelo);
                    int numfilas = JTDatosActa.getRowCount();
                    for (int i = numfilas - 1; i >= 0; i--) {
                        modelo.removeRow(i);
                    }
                    MostrarActa();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                }

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTable JTDatosActa;
    private javax.swing.JLabel LblAsunto;
    private javax.swing.JLabel LblFondo2;
    private javax.swing.JLabel LblHora;
    private javax.swing.JTextArea TxtDesarrollo;
    private javax.swing.JTextArea TxtOrden;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btn_aprobar;
    private com.toedter.calendar.JDateChooser jDateReunion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lab_Fecha;
    // End of variables declaration//GEN-END:variables
}
