/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Rol;
import static Vista.Login.sentencia;
import conexion.Conexion_sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Usuario;
import static Vista.Asignar_roles_opciones.resultado;
import static Vista.Asistencia_Ventana.resultado;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Agregar_Usuario extends javax.swing.JFrame {

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String con = null;
    static String consulta = "SELECT *FROM usuario";
    Rol r = new Rol();
    DefaultTableModel modelo;
    DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());
    String[] registros = new String[7];

    public Agregar_Usuario() {

        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TIPO ROL");
        modelo.addColumn("USUARIO");
        modelo.addColumn("CONTRASEÑA");
        combo_box.setModel(combo);
        this.jTabla_agre.setModel(modelo);
        muestra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblCodigo_rol = new javax.swing.JLabel();
        LblNombre_usuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        TxtContraseña = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        TxtNombre_u = new javax.swing.JTextField();
        LblTiluto = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        jB_Eliminar = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        TxtCodigo_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla_agre = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_box = new javax.swing.JComboBox<>();
        txt_codigo = new javax.swing.JTextField();
        Lblingrese_cod1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCodigo_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblCodigo_rol.setForeground(new java.awt.Color(0, 0, 204));
        LblCodigo_rol.setText("TIPO DE ROL:");
        getContentPane().add(LblCodigo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        LblNombre_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblNombre_usuario.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre_usuario.setText("INGRESE EL NOMBRE DEL USUARIO:");
        getContentPane().add(LblNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        LblContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblContraseña.setForeground(new java.awt.Color(0, 0, 204));
        LblContraseña.setText(" CONTRASEÑA:");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jbAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 153, 153));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar_usua.png"))); // NOI18N
        jbAgregar.setText("AGREGAR USUARIO");
        jbAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 180, 50));

        TxtContraseña.setBackground(new java.awt.Color(240, 240, 240));
        TxtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 240, -1));

        txt_cedula.setBackground(new java.awt.Color(240, 240, 240));
        txt_cedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 240, -1));

        TxtNombre_u.setBackground(new java.awt.Color(240, 240, 240));
        TxtNombre_u.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(TxtNombre_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 240, -1));

        LblTiluto.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        LblTiluto.setForeground(new java.awt.Color(0, 0, 204));
        LblTiluto.setText("AGREGAR USUARIO");
        getContentPane().add(LblTiluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 50));

        btn_consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(0, 153, 153));
        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_usua.png"))); // NOI18N
        btn_consultar.setText("BUSCAR");
        btn_consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 130, 50));

        jB_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jB_Eliminar.setForeground(new java.awt.Color(0, 153, 153));
        jB_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_usua.png"))); // NOI18N
        jB_Eliminar.setText("ELIMINAR");
        jB_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 130, 50));

        Modifica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Modifica.setForeground(new java.awt.Color(0, 153, 153));
        Modifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_usua.png"))); // NOI18N
        Modifica.setText("MODIFICAR");
        Modifica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });
        getContentPane().add(Modifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 130, 50));

        TxtCodigo_Usuario.setEditable(false);
        TxtCodigo_Usuario.setBackground(new java.awt.Color(204, 204, 255));
        TxtCodigo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigo_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCodigo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Cod. Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 90, 30));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "USUARIOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabla_agre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabla_agre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "CODIGO SOCIO", "CODIGO ROL", "NOMBRE USUARIO"
            }
        ));
        jTabla_agre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabla_agreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla_agre);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 720, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 820, 260));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/degradado.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 180));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 360, 210));

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_boxItemStateChanged(evt);
            }
        });
        getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 240, -1));

        txt_codigo.setEditable(false);
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 60, -1));

        Lblingrese_cod1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lblingrese_cod1.setForeground(new java.awt.Color(0, 0, 204));
        Lblingrese_cod1.setText("INGRESE LA CEDULA DEL SOCIO:");
        getContentPane().add(Lblingrese_cod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 990, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        int i = 0;
        String sql3 = "select * from usuario where codigo_rol= " + txt_codigo.getText() + ";";
        resultado = Conexion_sql.Resultados(sql3);
        try {
            while (resultado.next()) {
                i++;
            }

            if (i <= 0) {
                int fila = 0;
                int codigo_socio = 0;
                String sql1 = "select codigo_socio from socio where cedula_socio ='" + txt_cedula.getText() + "' and estado_socio='TRUE'";
                ResultSet resul = Conexion_sql.Resultados(sql1);
                try {
                    while (resul.next()) {
                        codigo_socio = resul.getInt("codigo_socio");
                        fila++;
                    }
                    if (fila <= 0) {
                        JOptionPane.showMessageDialog(null, "EL SOCIO NO EXISTE", "", 0);
                    } else {
                        fila = 0;
                        sentencia = Conexion_sql.Conexion();
                        Usuario objetoUser;
                        String sql = "SELECT * FROM usuario WHERE codigo_socio= " + codigo_socio;
                        resultado = Conexion_sql.Resultados(sql);
                        try {
                            while (resultado.next()) {
                                fila++;
                            }
                            if (fila > 0) {
                                JOptionPane.showMessageDialog(null, "EL SOCIO YA ESTA REGISTRADO", "", 0);
                            }
                            if (fila <= 0) {
                                try {
                                    Rol obj_rol;
                                    obj_rol = new Rol();
                                    objetoUser = new Usuario();
                                    // objetoUser.setCodigo_socio(Integer.parseInt(txt_codigo.getText()));
                                    objetoUser.setUsuario(TxtNombre_u.getText());
                                    objetoUser.setContrasenia(TxtContraseña.getText());

                                    System.out.println(txt_codigo.getText() + " CODIGO");
                                    System.out.println(codigo_socio + "codigo socio");
                                    String sentenciaSql = new String();
                                    sentenciaSql = "INSERT INTO usuario(codigo_socio,codigo_rol,usuario,contrasenia)";
                                    sentenciaSql = sentenciaSql + "VALUES(" + codigo_socio + ","
                                            + txt_codigo.getText() + ",'" + objetoUser.getUsuario() + "','"
                                            + objetoUser.getContrasenia() + "')";
                                    sentencia.execute(sentenciaSql);
                                    JOptionPane.showMessageDialog(null, "GUARDADO CORRECTAMENTE");

                                } catch (SQLException e) {

                                    JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS ");

                                }
                                Limpia();
                                muestra();
                            }

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "ERROR" + ex.getMessage());
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "ESTE ROL YA TIENE UN USUARIO", "", 0);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERROR" + ex.getMessage());
        }


    }//GEN-LAST:event_jbAgregarActionPerformed

    public void Limpia() {
        TxtNombre_u.setText("");
        txt_codigo.setText("");
        TxtContraseña.setText("");
        txt_cedula.setText("");
        TxtCodigo_Usuario.setText("");
        combo_box.setModel(combo);

    }
    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // muestra();
        Modal_usuario usu = new Modal_usuario(this, true);
        usu.setVisible(true);
        String codigo_so = String.valueOf(usu.getCodigo_socio());
        String codigo_rol = String.valueOf(usu.getCodig_rol());
        this.txt_cedula.setText(codigo_so);
        this.txt_codigo.setText(codigo_rol);
        this.TxtNombre_u.setText(usu.getUsuario());
        this.TxtContraseña.setText(usu.getContrasenia());
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void jTabla_agreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabla_agreMouseClicked
        // TODO add your handling code here:
        try {
            TxtCodigo_Usuario.setText(jTabla_agre.getValueAt(jTabla_agre.getSelectedRow(), 0).toString());
            txt_cedula.setText(jTabla_agre.getValueAt(jTabla_agre.getSelectedRow(), 1).toString());
            //  TxtCod_rol.setText(jTabla_agre.getValueAt(jTabla_agre.getSelectedRow(), 2).toString());
            TxtNombre_u.setText(jTabla_agre.getValueAt(jTabla_agre.getSelectedRow(), 5).toString());
            TxtContraseña.setText(jTabla_agre.getValueAt(jTabla_agre.getSelectedRow(), 6).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTabla_agreMouseClicked
    //metodo eliminar
    public void elimina() {
        if ("".equals(TxtCodigo_Usuario.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN USUARIO DE LA TABLA", "", 0);
        } else if ("".equals(TxtNombre_u.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN USUARIO DE LA TABLA", "", 0);
        } else if ("".equals(txt_cedula.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN USUARIO DE LA TABLA", "", 0);
        } else if ("".equals(TxtContraseña.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN USUARIO DE LA TABLA", "", 0);
        } else {

            if (txt_cedula.getText() != null) {
                int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR UN USUARIO", "CONFIRME", JOptionPane.YES_NO_OPTION);
                if (op == 0) {
                    try {
                        String sql = "delete from usuario where codigo_usuario='" + TxtCodigo_Usuario.getText() + "';";
                        Conexion_sql.Ejecutar(sql);
                        Conexion_sql.CerrarConexion();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
                }
            } else {
                JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS ");
            }
        }

    }

    //metodo mostrar
    public void muestra() {

        int cantfila = jTabla_agre.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        String sql = " SELECT s.cedula_socio,s.nombre_socio,s.apellido_socio,u.codigo_usuario,u.codigo_socio,"
                + "r.tipo_rol,u.usuario,u.contrasenia from socio s,usuario u,rol r where u.codigo_socio=s.codigo_socio and u.codigo_rol=r.codigo_rol;";

        resultado = Conexion_sql.Resultados(sql);

        try {
            while (resultado.next()) {
                registros[0] = resultado.getString("codigo_usuario");
                registros[1] = resultado.getString("cedula_socio");
                registros[2] = resultado.getString("nombre_socio");
                registros[3] = resultado.getString("apellido_socio");
                // registros[4] = resultado.getString("codigo_socio");
                registros[4] = resultado.getString("tipo_rol");
                registros[5] = resultado.getString("usuario");
                registros[6] = resultado.getString("contrasenia");
                modelo.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* try {
            ArrayList<Usuario> lista = new ArrayList<>();

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
            String[] datos;
            for (Usuario elemento : lista) {
                datos = new String[5];
                datos[0] = Integer.toString(elemento.getCodigo_usuario());
                datos[1] = Integer.toString(elemento.getCodigo_socio());
                datos[2] = Integer.toString(elemento.getCodig_rol());
                datos[3] = elemento.getUsuario();
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {

        }*/
        Conexion_sql.CerrarConexion();
    }

    //metodo modificar
    public void Modifica() {

        if ("".equals(txt_cedula.getText())) {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS", "", 0);
        } else if ("".equals(TxtNombre_u.getText())) {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS", "", 0);
        } else if ("".equals(TxtContraseña.getText())) {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS", "", 0);
        } else {
            int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE MODIFICAR UN USUARIO", "CONFIRME", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                try {
                    int convierte = Integer.parseInt(TxtCodigo_Usuario.getText());
                    //UPDATE usuario SET usuario='paolacg31',contrasenia='3101'where codigo_socio ='1';
                    String sql = "UPDATE usuario set usuario='" + TxtNombre_u.getText() + "',contrasenia='" + TxtContraseña.getText()
                            + "' where codigo_usuario=" + convierte + ";";
                    Conexion_sql.Ejecutar(sql);
                    Conexion_sql.CerrarConexion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }

    }
    private void jB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EliminarActionPerformed
        elimina();
        muestra();
        Limpia();
    }//GEN-LAST:event_jB_EliminarActionPerformed

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        // TODO add your handling code here:
        Modifica();
        muestra();
        Limpia();
    }//GEN-LAST:event_ModificaActionPerformed

    private void TxtCodigo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigo_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigo_UsuarioActionPerformed

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        // TODO add your handling code here:
        Character validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE CONTENER SOLO NÚMEROS");
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_boxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Rol r = (Rol) combo_box.getSelectedItem();
            String sql = "SELECT * FROM rol where codigo_rol =" + r.getCodigo_rol();
            resultado = Conexion_sql.Resultados(sql);
            try {
                while (resultado.next()) {
                    txt_codigo.setText(String.valueOf(resultado.getInt("codigo_rol")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Asignar_roles_opciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_combo_boxItemStateChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCodigo_rol;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblNombre_usuario;
    private javax.swing.JLabel LblTiluto;
    private javax.swing.JLabel Lblingrese_cod1;
    private javax.swing.JButton Modifica;
    private javax.swing.JTextField TxtCodigo_Usuario;
    private javax.swing.JTextField TxtContraseña;
    private javax.swing.JTextField TxtNombre_u;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jB_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla_agre;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
}
