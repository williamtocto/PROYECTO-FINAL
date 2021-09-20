package Vista;

import static Vista.Socio_Ventana.resultado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import conexion.Conexion_sql;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Modelo.Rol;

public class Asignar_roles_opciones extends javax.swing.JInternalFrame {

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = null;
    Rol r = new Rol();
    DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());

    public Asignar_roles_opciones() {
        initComponents();

        combo_box.setModel(combo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_nombre = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JButton();
        B_MODIFICAR = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlabel_opciones_menu = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        rad_socio = new javax.swing.JRadioButton();
        rad_trans = new javax.swing.JRadioButton();
        rad_reunion = new javax.swing.JRadioButton();
        rad_multa = new javax.swing.JRadioButton();
        rad_usuario = new javax.swing.JRadioButton();
        rad_rol = new javax.swing.JRadioButton();
        combo_box = new javax.swing.JComboBox<>();
        lbl_fondo = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_nombre.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_nombre.setText("Nombre Tipo de rol:");
        getContentPane().add(jlabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        btn_Agregar.setBackground(new java.awt.Color(0, 153, 0));
        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(0, 153, 153));
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btn_Agregar.setText("GUARDAR ");
        btn_Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 220, 60));

        B_MODIFICAR.setBackground(new java.awt.Color(255, 255, 153));
        B_MODIFICAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_MODIFICAR.setForeground(new java.awt.Color(0, 153, 153));
        B_MODIFICAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifica.png"))); // NOI18N
        B_MODIFICAR.setText("MODIFICAR ");
        B_MODIFICAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        B_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_MODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(B_MODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 220, 60));

        jButton_Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Eliminar.setForeground(new java.awt.Color(0, 153, 153));
        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton_Eliminar.setText("ELIMINAR PRIVILEGIOS");
        jButton_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, 60));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("ASIGNAR PRIVILIGEGIOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 290, 40));

        jlabel_opciones_menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_opciones_menu.setForeground(new java.awt.Color(0, 0, 204));
        jlabel_opciones_menu.setText("Opciones Menú:");
        getContentPane().add(jlabel_opciones_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        TxtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 70, 30));

        rad_socio.setBackground(new java.awt.Color(153, 204, 255));
        rad_socio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_socio.setText("MENU SOCIOS");
        rad_socio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 5));
        getContentPane().add(rad_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 160, -1));

        rad_trans.setBackground(new java.awt.Color(153, 204, 255));
        rad_trans.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_trans.setText("MENU TRANSACIONES");
        rad_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_transActionPerformed(evt);
            }
        });
        getContentPane().add(rad_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, -1));

        rad_reunion.setBackground(new java.awt.Color(153, 204, 255));
        rad_reunion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_reunion.setText("MENU REUNIONES");
        getContentPane().add(rad_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 160, -1));

        rad_multa.setBackground(new java.awt.Color(153, 204, 255));
        rad_multa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_multa.setText("MENU MULTAS");
        getContentPane().add(rad_multa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 160, -1));

        rad_usuario.setBackground(new java.awt.Color(153, 204, 255));
        rad_usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_usuario.setText("MENU USUARIOS");
        getContentPane().add(rad_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 160, -1));

        rad_rol.setBackground(new java.awt.Color(153, 204, 255));
        rad_rol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rad_rol.setText("MENU ROL");
        getContentPane().add(rad_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, -1));

        combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_boxItemStateChanged(evt);
            }
        });
        combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_boxActionPerformed(evt);
            }
        });
        getContentPane().add(combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 40));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        lbl_fondo.setToolTipText("");
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 940, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if ("".equals(TxtCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR ANTES EL ROL", "", 0);
        } else {
            String sente = "SELECT cod_rol from relacion_rol_opciones where cod_rol= " + TxtCodigo.getText();
            resultado = Conexion_sql.Resultados(sente);
            int fila = 0;
            try {
                while (resultado.next()) {
                    fila++;
                }
                if (fila > 0) {
                    JOptionPane.showMessageDialog(null, "ESTE ROL YA TIENE ASIGANADO PRIVILEGIOS", "TEOLAM", 0);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
            }

            if (fila <= 0) {
                String estadoElegido = null;
                int cod_opcion = 0;
                int codigo_rol = Integer.parseInt(TxtCodigo.getText());
                String sql = null;
                if (rad_socio.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 1;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 1;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }
                if (rad_trans.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 2;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 2;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }

                if (rad_reunion.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 3;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 3;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }

                if (rad_multa.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 4;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 4;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }

                if (rad_usuario.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 5;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 5;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }
                if (rad_rol.isSelected()) {
                    estadoElegido = "TRUE";
                    cod_opcion = 6;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                } else {
                    estadoElegido = "FALSE";
                    cod_opcion = 6;
                    sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) VALUES (" + codigo_rol + ", " + cod_opcion + ", '" + estadoElegido + "');";
                    Conexion_sql.Asistencia(sql);
                }
                Limpiar();
                JOptionPane.showMessageDialog(null, "PRIVILEGIOS ASIGNADOS CORRECTAMENTE");
                Conexion_sql.CerrarConexion();

            }
        }


    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void B_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_MODIFICARActionPerformed
        if ("".equals(TxtCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR ANTES EL ROL", "", 0);
        } else {
            int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE MODIFICAR LOS PRIVILEGIOS", "TEOLAM", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                    new Object[]{"SI", "NO"}, null);
            if (op == 0) {

                try {
                    String estadoElegido = null;
                    int cod_opcion = 0;
                    int codigo_rol = Integer.parseInt(TxtCodigo.getText());
                    String sql = null;

                    if (rad_socio.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 1;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 1;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    }
                    if (rad_trans.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 2;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 2;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    }

                    if (rad_reunion.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 3;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 3;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    }

                    if (rad_multa.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 4;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 4;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    }

                    if (rad_usuario.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 5;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 5;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    }
                    if (rad_rol.isSelected()) {
                        estadoElegido = "TRUE";
                        cod_opcion = 6;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);
                    } else {
                        estadoElegido = "FALSE";
                        cod_opcion = 6;
                        sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + estadoElegido + "' WHERE cod_rol=" + codigo_rol + "and cod_opcion= " + cod_opcion + ";";
                        Conexion_sql.Resultados(sql);

                    }
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "PRIVILEGIOS MODIFICADOS CORRECTAMENTE CORRECTAMENTE");
                  
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR", "TEOLAM", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "LISTO NO SE MODIFICO NADA", "TEOLAM", 1);
            }
        }
    }//GEN-LAST:event_B_MODIFICARActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        elimina();
    }//GEN-LAST:event_jButton_EliminarActionPerformed
    
    public void Limpiar() {
        rad_multa.setSelected(false);
        rad_reunion.setSelected(false);
        rad_socio.setSelected(false);
        rad_trans.setSelected(false);
        rad_usuario.setSelected(false);
        rad_rol.setSelected(false);
        TxtCodigo.setText("");
        combo_box.setModel(combo);
    }

    public void elimina() {

        if (TxtCodigo.getText() != null) {
            int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR LOS PRIVILEGIOS DE ESTE ROL", "CONFIRME", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                try {
                    String sql = "delete from relacion_rol_opciones where cod_rol='" + TxtCodigo.getText() + "';";
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
        Conexion_sql.CerrarConexion();
    }

    private void combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_boxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Rol r = (Rol) combo_box.getSelectedItem();
            String sql = "SELECT * FROM rol where codigo_rol =" + r.getCodigo_rol();
            resultado = Conexion_sql.Resultados(sql);
            try {
                while (resultado.next()) {
                    TxtCodigo.setText(String.valueOf(resultado.getInt("codigo_rol")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Asignar_roles_opciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_combo_boxItemStateChanged

    private void rad_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_transActionPerformed

    }//GEN-LAST:event_rad_transActionPerformed

    private void combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_boxActionPerformed

    }//GEN-LAST:event_combo_boxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_MODIFICAR;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabel_nombre;
    private javax.swing.JLabel jlabel_opciones_menu;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JRadioButton rad_multa;
    private javax.swing.JRadioButton rad_reunion;
    private javax.swing.JRadioButton rad_rol;
    private javax.swing.JRadioButton rad_socio;
    private javax.swing.JRadioButton rad_trans;
    private javax.swing.JRadioButton rad_usuario;
    // End of variables declaration//GEN-END:variables
}
