package Vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Rol;
import conexion.Conexion_sql;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agregar_Rol extends javax.swing.JFrame {

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM rol";
    static Rol objRol;
    DefaultTableModel modelo;

    private int ancho;
    private int alto;

    public Agregar_Rol() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("TIPO ROL");
        this.jtable_rol.setModel(modelo);
        this.setLocationRelativeTo(null);
        Consulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_nombre = new javax.swing.JLabel();
        txt_tipo_rol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LblCodigo = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_rol = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        B_MODIFICAR = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        B_MODIFICAR1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel_nombre.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_nombre.setText("NOMBRE TIPO DE ROL:");
        getContentPane().add(jlabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        txt_tipo_rol.setBackground(new java.awt.Color(240, 240, 240));
        txt_tipo_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipo_rolActionPerformed(evt);
            }
        });
        txt_tipo_rol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tipo_rolKeyTyped(evt);
            }
        });
        getContentPane().add(txt_tipo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 250, 40));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("AGREGAR  ROLES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 220, 40));

        LblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCodigo.setForeground(new java.awt.Color(0, 0, 204));
        LblCodigo.setText("CODIGO ROL:");
        getContentPane().add(LblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        TxtCodigo.setEditable(false);
        TxtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 30));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ROLES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jtable_rol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        jtable_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtable_rol.setForeground(new java.awt.Color(0, 153, 153));
        jtable_rol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "TIPO ROL"
            }
        ));
        jtable_rol.setToolTipText("");
        jtable_rol.setGridColor(new java.awt.Color(0, 153, 102));
        jtable_rol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_rolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_rol);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 740, 420));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ACCIONES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(0, 153, 153));
        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar_rol.png"))); // NOI18N
        btn_consultar.setText("BUSCAR");
        btn_consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 120, 60));

        B_MODIFICAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_MODIFICAR.setForeground(new java.awt.Color(0, 153, 153));
        B_MODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        B_MODIFICAR.setText("MODIFICAR");
        B_MODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        B_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MODIFICARActionPerformed(evt);
            }
        });
        jPanel2.add(B_MODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 60));

        jButton_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Eliminar.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_rol.png"))); // NOI18N
        jButton_Eliminar.setText("ELIMINAR");
        jButton_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, 60));

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 153, 153));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpia_cam.png"))); // NOI18N
        btn_limpiar.setText("Limpiar Campos");
        btn_limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 160, 60));

        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_rol.png"))); // NOI18N
        btn_Agregar.setText("AGREGAR NUEVO ROL");
        btn_Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 470, 270));

        lbl_fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_fondo.setForeground(new java.awt.Color(0, 153, 153));
        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 520));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ACCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 390, 200));

        B_MODIFICAR1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_MODIFICAR1.setForeground(new java.awt.Color(0, 153, 153));
        B_MODIFICAR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        B_MODIFICAR1.setText("MODIFICAR");
        B_MODIFICAR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        B_MODIFICAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MODIFICAR1ActionPerformed(evt);
            }
        });
        getContentPane().add(B_MODIFICAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if ("".equals(txt_tipo_rol.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NOMBRE DE ROL", "", 0);
        } else {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿ESTAS SEGURO DE AGREGAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (op == 0) {
                int fila = 0;
                String sql2 = "select * from rol where UPPER(tipo_rol)= UPPER('" + txt_tipo_rol.getText() + "')";

                resultado = Conexion_sql.Resultados(sql2);
                try {
                    while (resultado.next()) {
                        fila++;
                    }
                    if (fila <= 0) {
                        String sql = "SELECT * from rol where tipo_rol ";
                        sentencia = Conexion_sql.Conexion();
                        ArrayList<Rol> lista = new ArrayList<>();
                        Rol objetoRol;
                        try {
                            objetoRol = new Rol();
                            objetoRol.setTipo_rol(txt_tipo_rol.getText());
                            String sentenciaSql = new String();
                            sentenciaSql = "INSERT INTO rol(tipo_rol)";
                            sentenciaSql = sentenciaSql + "VALUES('" + objetoRol.getTipo_rol() + "')";
                            sentencia.execute(sentenciaSql);
                            JOptionPane.showMessageDialog(null, "DEBE DESIGNAR LOS PRIVILEGIOS PARA ESTE ROL");
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                        }
                        txt_tipo_rol.setText("");
                        Consulta();
                        limpiar();
                    } else {
                        JOptionPane.showInternalMessageDialog(null, "EL ROL YA ESTA REGISTRADO", "", 0);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage(), "", 0);
                }

            }
        }


    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed

        Modal_rol rol = new Modal_rol(this, true);
        rol.setVisible(true);
        String codigo_rol = String.valueOf(rol.getCodigo_rol());
        this.TxtCodigo.setText(codigo_rol);
        this.txt_tipo_rol.setText(rol.getTipo_rol());
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        Eliminar();
        Consulta();
        limpiar();
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void B_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MODIFICARActionPerformed
        // TODO add your handling code here:
        Modificar();
        Consulta();
        limpiar();
    }//GEN-LAST:event_B_MODIFICARActionPerformed

    private void jtable_rolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_rolMouseClicked
        // TODO add your handling code here:
        try {
            TxtCodigo.setText(jtable_rol.getValueAt(jtable_rol.getSelectedRow(), 0).toString());
            txt_tipo_rol.setText(jtable_rol.getValueAt(jtable_rol.getSelectedRow(), 1).toString());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtable_rolMouseClicked

    private void txt_tipo_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipo_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipo_rolActionPerformed

    private void txt_tipo_rolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipo_rolKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }


    }//GEN-LAST:event_txt_tipo_rolKeyTyped

    private void B_MODIFICAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MODIFICAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_MODIFICAR1ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    public void Limpiar() {
        TxtCodigo.setText("");
        txt_tipo_rol.setText("");
    }

    //METODOS
    //CONSULTAR
    public void Consulta() {
        resultado = Conexion_sql.ConsultaRol();
        int cantfila = jtable_rol.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        try {
            ArrayList<Rol> lista = new ArrayList<>();
            Rol objRol;
            while (resultado.next()) {
                objRol = new Rol();
                objRol.setCodigo_rol(resultado.getInt("codigo_rol"));
                objRol.setTipo_rol(resultado.getString("tipo_rol"));
                lista.add(objRol);
            }
            String[] datos;
            for (Rol elemento : lista) {
                datos = new String[2];
                datos[0] = Integer.toString(elemento.getCodigo_rol());
                datos[1] = elemento.getTipo_rol();
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Conexion_sql.CerrarConexion();
    }

    //ELIMINAR
    public void Eliminar() {
        if ("".equals(txt_tipo_rol.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN ROL DE LA TABLA", "", 0);
        } else {
            boolean bandera = false;
            if ("".equals(TxtCodigo.getText()) || "".equals(txt_tipo_rol.getText())) {
                JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS");
                bandera = true;
            }
            if (bandera == false) {
                int op = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO DE ELIMINAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    try {
                        String sql = "delete from rol where tipo_rol='" + txt_tipo_rol.getText() + "';";
                        Conexion_sql.EliminarRol(sql);
                        Conexion_sql.CerrarConexion();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
                }
            }
        }

    }

    public void limpiar() {
        TxtCodigo.setText("");
        txt_tipo_rol.setText("");
    }

    //MODIFICAR
    public void Modificar() {

        if ("".equals(txt_tipo_rol.getText())) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN ROL DE LA TABLA", "", 0);
        } else {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿ESTAS SEGURO DE MODIFICAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                try {
                    int convierte = Integer.parseInt(TxtCodigo.getText());
                    String sql = "UPDATE rol set tipo_rol='" + txt_tipo_rol.getText() + "' where codigo_rol='" + convierte + "';";
                    Conexion_sql.Ejecutar(sql);
                    Conexion_sql.CerrarConexion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "NO SE MODIFICO PORQUE EXISTEN CAMPOS VACIOS");
                }
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_MODIFICAR;
    private javax.swing.JButton B_MODIFICAR1;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_nombre;
    private javax.swing.JTable jtable_rol;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JTextField txt_tipo_rol;
    // End of variables declaration//GEN-END:variables
}
