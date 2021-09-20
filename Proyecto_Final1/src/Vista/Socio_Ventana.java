package Vista;

import conexion.Conexion_sql;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import Modelo.Socio;

public class Socio_Ventana extends javax.swing.JInternalFrame {

    java.sql.Connection conexion1 = null;
    Socio so = new Socio();
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = new GregorianCalendar();

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM socio";
    public static ArrayList<Socio> lista = new ArrayList();
    DefaultTableModel modelo;

    public Socio_Ventana() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("CORREO");
        modelo.addColumn("FECHA NACIMIENTO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("N. CUENTA");
        jTable1.setRowHeight(25);
        this.jTable1.setModel(modelo);
        ActualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtCedula = new javax.swing.JTextField();
        LblCedula = new javax.swing.JLabel();
        LblApellidos = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        LblEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jdateFechaNac = new com.toedter.calendar.JDateChooser();
        LblFecha = new javax.swing.JLabel();
        lbl_fecha_Ingreso = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Button_Registra = new javax.swing.JButton();
        Button_Mostrar = new javax.swing.JButton();
        Button_Actualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_codigo_socio = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        jDateFeechaIngreso = new com.toedter.calendar.JDateChooser();
        numero_cuenta = new javax.swing.JLabel();
        txt_numeroCuenta = new javax.swing.JTextField();
        bnt_Cuenta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_socios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("INGRESO DE DATOS SOCIO");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre.setText("Nombre");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        TxtNombre.setBackground(new java.awt.Color(240, 240, 240));
        TxtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));

        TxtCedula.setBackground(new java.awt.Color(240, 240, 240));
        TxtCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCedulaFocusLost(evt);
            }
        });
        TxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaActionPerformed(evt);
            }
        });
        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));

        LblCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCedula.setForeground(new java.awt.Color(0, 0, 204));
        LblCedula.setText("Cédula");
        getContentPane().add(LblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 20));

        LblApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblApellidos.setForeground(new java.awt.Color(0, 0, 204));
        LblApellidos.setText("Apellido");
        getContentPane().add(LblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        TxtApellidos.setBackground(new java.awt.Color(240, 240, 240));
        TxtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(TxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Dirección");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        TxtDireccion.setBackground(new java.awt.Color(240, 240, 240));
        TxtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 180, -1));

        LblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblEmail.setForeground(new java.awt.Color(0, 0, 204));
        LblEmail.setText("E-mail");
        getContentPane().add(LblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        TxtEmail.setBackground(new java.awt.Color(240, 240, 240));
        TxtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtEmailFocusLost(evt);
            }
        });
        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 180, -1));
        getContentPane().add(jdateFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, -1));

        LblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblFecha.setForeground(new java.awt.Color(0, 0, 204));
        LblFecha.setText("Fecha de Nacimiento");
        getContentPane().add(LblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 30));

        lbl_fecha_Ingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fecha_Ingreso.setForeground(new java.awt.Color(0, 0, 204));
        lbl_fecha_Ingreso.setText("Fecha de Ingreso");
        getContentPane().add(lbl_fecha_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        TxtTelefono.setBackground(new java.awt.Color(240, 240, 240));
        TxtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 180, -1));

        btn_Buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Buscar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        btn_Buscar.setText("BUSCAR ");
        btn_Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, 170, 50));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("DATOS SOCIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        Button_Registra.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        Button_Registra.setForeground(new java.awt.Color(0, 153, 153));
        Button_Registra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registra_so.png"))); // NOI18N
        Button_Registra.setText("REGISTRAR SOCIO");
        Button_Registra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Button_Registra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RegistraActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Registra, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 170, 50));

        Button_Mostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Mostrar.setForeground(new java.awt.Color(0, 153, 153));
        Button_Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/socio_acti.png"))); // NOI18N
        Button_Mostrar.setText("SOCIOS ACTIVOS");
        Button_Mostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        Button_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 170, 50));

        Button_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Actualizar.setForeground(new java.awt.Color(0, 153, 153));
        Button_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar (2).png"))); // NOI18N
        Button_Actualizar.setText("MODIFICAR");
        Button_Actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        Button_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 170, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inactivar.png"))); // NOI18N
        jButton1.setText("INACTIVAR SOCIO");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, 170, 50));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO SOCIO", "CEDULA", "NOMBRES", "APELLIDOS", "FECHA NACIMIENTO", "DIRRECCION", "TELEFONO", "E-MAIL"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 153, 153));
        jTable1.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 1220, 280));

        lbl_codigo_socio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigo_socio.setForeground(new java.awt.Color(0, 0, 204));
        lbl_codigo_socio.setText("Codigo del socio:");
        getContentPane().add(lbl_codigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        txt_codigo.setEditable(false);
        txt_codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, -1));

        lbl_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(0, 0, 204));
        lbl_telefono.setText("Teléfono");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        getContentPane().add(jDateFeechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 180, -1));

        numero_cuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numero_cuenta.setForeground(new java.awt.Color(0, 0, 204));
        numero_cuenta.setText("Generar numero de Cuenta");
        getContentPane().add(numero_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        txt_numeroCuenta.setEditable(false);
        txt_numeroCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_numeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 120, 30));

        bnt_Cuenta.setText("+");
        bnt_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_CuentaActionPerformed(evt);
            }
        });
        getContentPane().add(bnt_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 40, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpia_cam.png"))); // NOI18N
        jButton2.setText("LIMPIAR CAMPOS");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 170, 50));

        btn_socios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_socios.setForeground(new java.awt.Color(0, 153, 153));
        btn_socios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte_socio.png"))); // NOI18N
        btn_socios.setText("REPORTE SOCIOS");
        btn_socios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sociosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1280, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed

    }//GEN-LAST:event_TxtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if ("".equals(TxtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else if ("".equals(TxtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else if ("".equals(TxtApellidos.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else if ("".equals(TxtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else if (jdateFechaNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else if (jDateFeechaIngreso.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN SOCIO DE LA TABLA", "", 0);
        } else {
            int op = JOptionPane.showOptionDialog(null,
                    "ESTA SEGURO QUE DESEA INACTIVAR A ESTE SOCIO", "WILLIAM TOCTO", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
            if (op == 0) {
                try {
                    String sql = "UPDATE socio SET estado_socio=" + "'FALSE'" + "WHERE codigo_socio=" + txt_codigo.getText() + ";";
                    Conexion_sql.Ejecutar(sql);
                    ActualizarTabla();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL INACTIVAR", "TEOLAM", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, " LISTO ACCION CANCELADA", "TEOLAM", 1);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button_RegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RegistraActionPerformed

        boolean bandera1 = false;

        if ("".equals(TxtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL NUMERO DE CEDULA", "", 0);
        } else if ("".equals(TxtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL NOMBRE", "", 0);
        } else if ("".equals(TxtApellidos.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL APELLIDO", "", 0);
        } else if ("".equals(TxtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA DIRECCION", "", 0);
        } else if (jdateFechaNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA FECHA DE NACIMIENTO", "", 0);
        } else if (jDateFeechaIngreso.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA FECHA DE INGRESO", "", 0);
        } else {
            //valida cedula ecuatoriana
            if (bandera1 == false) {
                boolean ced = false;
                ced = so.ValidaCed(TxtCedula.getText());
                if (ced == true) {
                    JOptionPane.showMessageDialog(null, "  LA CEDULA NO ES ECUATORIANA ");
                } else {
                    int edad = 0;
                    int fechaIngreso = 0;
                    int fechaNac = 0;
                    try {
                        fechaIngreso = ValidarFechaIngreso();
                        fechaNac = ValidarFechaNac();
                    } catch (ParseException ex) {
                        Logger.getLogger(Socio_Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (fechaIngreso == -1 || fechaNac == -1) {
                        if (fechaIngreso == -1) {
                            JOptionPane.showMessageDialog(null, " LA FECHA DE INGRESO SOBRESPASA A LA ACTUAL", "TEOLAM", 0);
                        } else {
                            JOptionPane.showMessageDialog(null, " LA FECHA DE NACIMIENTO SOBRESPASA A LA ACTUAL", "TEOLAM", 0);
                        }

                    } else if (fechaIngreso == 0) {
                        sentencia = Conexion_sql.Conexion();
                        Date fecha = null;
                        String formato = null;
                        Date fecha1 = null;
                        String formato1 = null;
                        // Tranformar la fecha a String
                        if (jdateFechaNac.getDate() != null) {
                            fecha = jdateFechaNac.getDate();
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            formato = sdf.format(fecha);
                            edad = so.getEdad(formato);
                        }

                        if (edad >= 18) {
                            if (jDateFeechaIngreso.getDate() != null) {
                                fecha1 = jDateFeechaIngreso.getDate();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                formato1 = sdf.format(fecha);
                            }
                            resultado = Conexion_sql.ConsultaCedulaSocio(TxtCedula.getText());
                            boolean bandera = false;
                            boolean continuar = true;
                            int fila = 0;
                            try {
                                while (resultado.next()) {
                                    fila++;
                                }
                                if (fila > 0) {
                                    JOptionPane.showMessageDialog(null, "LA CEDULA YA EXISTE NO SE PÚEDE CREAR", "TEOLAM", 0);
                                }
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                            }

                            if (fila <= 0) {
                                Socio objtSocio;
                                int numero_cuenta = 0;
                                try {
                                    numero_cuenta = Integer.parseInt(txt_numeroCuenta.getText());
                                } catch (Exception e) {
                                    continuar = false;
                                    JOptionPane.showMessageDialog(null, "INGRESE EL NUMERO DE CUENTA", "TEOLAM", 0);

                                }

                                try {
                                    objtSocio = new Socio();
                                    objtSocio.setCedula_socio(TxtCedula.getText());
                                    objtSocio.setNombre_socio(TxtNombre.getText());
                                    objtSocio.setApellido_socio(TxtApellidos.getText());
                                    objtSocio.setCorreo_socio(TxtEmail.getText());
                                    objtSocio.setFecha_nac_socio(formato);
                                    objtSocio.setTelefono_socio(TxtTelefono.getText());
                                    objtSocio.setDireccion_socio(TxtDireccion.getText());
                                    objtSocio.setFecha_ingreso(formato1);
                                    objtSocio.setNumero_cuenta(numero_cuenta);
                                    String sentenciaSql = new String();
                                    sentenciaSql = "INSERT INTO socio (cedula_socio,nombre_socio,apellido_socio,correo_socio,fecha_nac_socio,telefono_socio,direccion_socio,fecha_ingreso_socio,numero_de_cuenta,estado_socio)";
                                    sentenciaSql = sentenciaSql + "VALUES('" + objtSocio.getCedula_socio() + "','" + objtSocio.getNombre_socio() + "','" + objtSocio.getApellido_socio() + "','"
                                            + objtSocio.getCorreo_socio() + "','" + objtSocio.getFecha_nac_socio() + "','" + objtSocio.getTelefono_socio() + "','" + objtSocio.getDireccion_socio()
                                            + "','" + objtSocio.getFecha_ingreso() + "','" + objtSocio.getNumero_cuenta() + "','TRUE')";
                                    sentencia.execute(sentenciaSql);
                                    JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE");

                                    ActualizarTabla();

                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "EL SOCION NO PUEDE SER MENOR DE EDAD", "TEOLAM", 0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "FECHA DE INGRESO INCORRECTA", "TEOLAM", 0);
                    }
                }
            }
        }

    }//GEN-LAST:event_Button_RegistraActionPerformed


    private void Button_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MostrarActionPerformed
        JOptionPane.showMessageDialog(null, "SE MUESTRA LA LISTA DE LOS SOCIOS ACTIVOS ACTUALMENTE", "TEOLAM", 1);
        ActualizarTabla();
    }//GEN-LAST:event_Button_MostrarActionPerformed

    public void ActualizarTabla() {

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        lista.clear();
        resultado = Conexion_sql.ConsulTablaSocio();
        int cantfila = jTable1.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        try {
            ArrayList<Socio> lista = new ArrayList<>();
            Socio obtSocio;
            while (resultado.next()) {
                obtSocio = new Socio();
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
                lista.add(obtSocio);
            }
            String[] datos;
            for (Socio elemento : lista) {
                datos = new String[10];
                datos[0] = Integer.toString(elemento.getCodigo_socio());
                datos[1] = elemento.getCedula_socio();
                datos[2] = elemento.getNombre_socio();
                datos[3] = elemento.getApellido_socio();
                datos[4] = elemento.getCorreo_socio();
                datos[5] = elemento.getFecha_nac_socio();
                datos[6] = elemento.getTelefono_socio();
                datos[7] = elemento.getDireccion_socio();
                datos[8] = elemento.getFecha_ingreso();
                datos[9] = Integer.toString(elemento.getNumero_cuenta());
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Conexion_sql.CerrarConexion();

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha1 = null;
            Date fecha2 = null;
            String date1 = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString().trim();
            String date2 = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString().trim();
            fecha1 = (Date) sdf.parse(date1);
            fecha2 = (Date) sdf.parse(date2);
            txt_codigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            TxtCedula.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            TxtNombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            TxtApellidos.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            TxtDireccion.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
            TxtEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            TxtTelefono.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            jdateFechaNac.setDate(fecha1);
            jDateFeechaIngreso.setDate(fecha2);
            txt_numeroCuenta.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

        sentencia = Conexion_sql.Conexion();
        int numero_cuenta1 = 0;
        try {
            if (txt_numeroCuenta.getText() != null) {
                numero_cuenta1 = Integer.parseInt(txt_numeroCuenta.getText());
            }
        } catch (Exception e) {

        }
        Date fecha = null;
        String formato = null;
        Date fecha1 = null;
        String formato1 = null;
        // Tranformar la fecha a String
        if (jdateFechaNac.getDate() != null) {
            fecha = jdateFechaNac.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        if (jDateFeechaIngreso.getDate() != null) {
            fecha1 = jDateFeechaIngreso.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato1 = sdf.format(fecha1);
        }

        String cedula = null, nombre = null, apellido = null, correo = null, direccion = null, telefono = null;
        cedula = TxtCedula.getText();
        nombre = TxtNombre.getText();
        apellido = TxtApellidos.getText();
        correo = TxtEmail.getText();
        direccion = TxtDireccion.getText();
        telefono = TxtTelefono.getText();

        if (cedula.length() == 0) {
            cedula = null;
        }
        if (nombre.length() == 0) {
            nombre = null;
        }
        if (apellido.length() == 0) {
            apellido = null;
        }
        if (correo.length() == 0) {
            correo = null;
        }
        if (direccion.length() == 0) {
            direccion = null;
        }
        if (telefono.length() == 0) {
            telefono = null;
        }
        resultado = Conexion_sql.ConsulCamposSocio(cedula, nombre, apellido, correo, formato,
                telefono, direccion, formato1, numero_cuenta1);

        int cantfila = jTable1.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        try {
            lista.clear();
            Socio obtSocio;
            while (resultado.next()) {
                obtSocio = new Socio();
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
                lista.add(obtSocio);
            }
            String[] datos;
            for (Socio elemento : lista) {
                datos = new String[10];
                datos[0] = Integer.toString(elemento.getCodigo_socio());
                datos[1] = elemento.getCedula_socio();
                datos[2] = elemento.getNombre_socio();
                datos[3] = elemento.getApellido_socio();
                datos[4] = elemento.getCorreo_socio();
                datos[5] = elemento.getFecha_nac_socio();
                datos[6] = elemento.getTelefono_socio();
                datos[7] = elemento.getDireccion_socio();
                datos[8] = elemento.getFecha_ingreso();
                datos[9] = Integer.toString(elemento.getNumero_cuenta());
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed


    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed


    private void Button_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ActualizarActionPerformed
        if ("".equals(TxtCedula.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL NUMERO DE CEDULA", "", 0);
        } else if ("".equals(TxtNombre.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL NOMBRE", "", 0);
        } else if ("".equals(TxtApellidos.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL APELLIDO", "", 0);
        } else if ("".equals(TxtDireccion.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA DIRECCION", "", 0);
        } else if (jdateFechaNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA FECHA DE NACIMIENTO", "", 0);
        } else if (jDateFeechaIngreso.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA FECHA DE INGRESO", "", 0);
        } else {
            int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE MODIFICAR A ESTE SOCIO", "TEOLAM", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                    new Object[]{"SI", "NO"}, null);
            if (op == 0) {
                int numero_cuenta1 = 0;
                try {
                    if (txt_numeroCuenta.getText() != null) {
                        numero_cuenta1 = Integer.parseInt(txt_numeroCuenta.getText());
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "NUMERO DE CUENTA INCORRECTO", "TEOLAM", 0);
                }
                Date fecha = null;
                String formato = null;
                Date fecha1 = null;
                String formato1 = null;
                // Tranformar la fecha a String
                if (jdateFechaNac.getDate() != null) {
                    fecha = jdateFechaNac.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(fecha);
                }
                if (jDateFeechaIngreso.getDate() != null) {
                    fecha1 = jDateFeechaIngreso.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato1 = sdf.format(fecha1);
                }
                try {
                    //sentencia = Conexion_sql.Conexion();
                    String sql = "UPDATE socio SET nombre_socio='" + TxtNombre.getText() + "',apellido_socio='"
                            + TxtApellidos.getText() + "',correo_socio='" + TxtEmail.getText() + "',fecha_nac_socio='"
                            + formato + "',telefono_socio='" + TxtTelefono.getText() + "',direccion_socio='" + TxtDireccion.getText()
                            + "',fecha_ingreso_socio='" + formato1 + "'WHERE codigo_socio=" + txt_codigo.getText() + ";";
                    Conexion_sql.Ejecutar(sql);

                    Conexion_sql.CerrarConexion();
                    ActualizarTabla();
                    //JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE", "TEOLAM", 0);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR", "TEOLAM", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "LISTO NO SE MODIFICO NADA", "TEOLAM", 1);
            }
        }
    }//GEN-LAST:event_Button_ActualizarActionPerformed

    private void bnt_CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_CuentaActionPerformed
        String sql = "SELECT numero_de_cuenta FROM socio ORDER BY numero_de_cuenta DESC LIMIT 1";
        int numero;
        resultado = Conexion_sql.DiferentesConsultas(sql);
        Socio obtSocio;
        try {
            while (resultado.next()) {
                numero = resultado.getInt("numero_de_cuenta");
                txt_numeroCuenta.setText(String.valueOf(numero + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Socio_Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bnt_CuentaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_codigo.setText("");
        TxtCedula.setText("");
        TxtApellidos.setText("");
        TxtNombre.setText("");
        TxtDireccion.setText("");
        TxtTelefono.setText("");
        TxtEmail.setText("");
        txt_numeroCuenta.setText("");
        jdateFechaNac.setCalendar(null);
        jDateFeechaIngreso.setCalendar(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void btn_sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sociosActionPerformed
        try {
            Conexion_sql con = new Conexion_sql();
            conexion1 = con.getConexion();
            JasperReport reporte = null;
            String path = "src\\reportes\\Reporte1.jasper";
            Map parametro = new HashMap();
            parametro.put("cedula", "0106217393");
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conexion1);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            // java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_sociosActionPerformed

    private void TxtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCedulaFocusLost
        // TODO add your handling code here:
        if (TxtCedula.getText().length() < 10) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "LA CEDULA NO PUEDE SER MENOR DE DIGITOS", "", 0);
        }
    }//GEN-LAST:event_TxtCedulaFocusLost

    private void TxtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyTyped
        // TODO add your handling code here:
        Character validar = evt.getKeyChar();
        //MENOR A 10 CARACTERES
        if (TxtCedula.getText().length() == 10) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR! LA CEDULA DEBE TENER 10 DÍGITOS");
        } else if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! LA CEDULA DEBE TENER SOLO NÚMEROS");
        }
    }//GEN-LAST:event_TxtCedulaKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidosKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_TxtApellidosKeyTyped

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO NÚMEROS");
        }
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void TxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaActionPerformed

    private void TxtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtEmailFocusLost

        if (so.ValidaCorreo(TxtEmail.getText())) {

        } else {
            JOptionPane.showMessageDialog(null, "EL CORREO ES INCORRECTO");
        }
    }//GEN-LAST:event_TxtEmailFocusLost

    public int ValidarFechaIngreso() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaIngreso = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (jDateFeechaIngreso.getDate() != null) {
            fecha = jDateFeechaIngreso.getDate();
            fechaIngreso = sdf.format(fecha);
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaIngreso);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;

    }

    public int ValidarFechaNac() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaNac = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (jdateFechaNac.getDate() != null) {
            fecha = jdateFechaNac.getDate();
            fechaNac = sdf.format(fecha);
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaNac);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Actualizar;
    private javax.swing.JButton Button_Mostrar;
    private javax.swing.JButton Button_Registra;
    private javax.swing.JLabel LblApellidos;
    private javax.swing.JLabel LblCedula;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton bnt_Cuenta;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_socios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateFeechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdateFechaNac;
    private javax.swing.JLabel lbl_codigo_socio;
    private javax.swing.JLabel lbl_fecha_Ingreso;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel numero_cuenta;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_numeroCuenta;
    // End of variables declaration//GEN-END:variables
}
