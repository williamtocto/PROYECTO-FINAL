package Vista;

import Modelo.Usuario;
import Vista.*;
import static Vista.Login.resultado;
import conexion.Conexion_sql;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Vista.Ventana_Actas;
import Modelo.ImgenFondo;

public class Ventana_principal extends javax.swing.JFrame {

    Usuario user;
    int rol;

    public Ventana_principal() {
        initComponents();
        //escritorio.setBorder(new ImgenFondo());
        //this.setExtendedState(Ventana_principal.MAXIMIZED_BOTH);
    }

    public Ventana_principal(int rol) {
        initComponents();
        escritorio.setBorder(new ImgenFondo());
        this.setExtendedState(Ventana_principal.MAXIMIZED_BOTH);
        int id_opcion = 0;
        boolean estado = false;
        try {
            String se = "SELECT * FROM  relacion_rol_opciones where cod_rol=" + rol;
            resultado = Conexion_sql.Resultados(se);

            while (resultado.next()) {
                id_opcion = resultado.getInt("cod_opcion");
                estado = resultado.getBoolean("estado_rol");
                System.out.println(id_opcion + " id    " + estado + " estado");
                setLocationRelativeTo(null);

                if (id_opcion == 1) {
                    if (estado == true) {
                        this.menu_socios.setEnabled(true);
                    } else {
                        this.menu_socios.setEnabled(false);
                    }
                } else if (id_opcion == 2) {
                    if (estado == true) {
                        this.menu_transaccion.setEnabled(true);
                    } else {
                        this.menu_transaccion.setEnabled(false);
                    }
                } else if (id_opcion == 3) {
                    if (estado == true) {
                        this.menu_reunion.setEnabled(true);
                    } else {
                        this.menu_reunion.setEnabled(false);
                    }
                } else if (id_opcion == 4) {
                    if (estado == true) {
                        this.menu_multas.setEnabled(true);
                    } else {
                        this.menu_multas.setEnabled(false);
                    }
                } else if (id_opcion == 5) {
                    if (estado == true) {
                        this.menu_usuario.setEnabled(true);
                    } else {
                        this.menu_usuario.setEnabled(false);
                    }
                } else if (id_opcion == 6) {
                    if (estado == true) {
                        this.menu_rol.setVisible(true);
                    } else {
                        this.menu_rol.setEnabled(false);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_socios = new javax.swing.JMenu();
        sub_menu_socios = new javax.swing.JMenuItem();
        menu_transaccion = new javax.swing.JMenu();
        sub_menu_transaccion = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_reunion = new javax.swing.JMenu();
        sub_menu_crearReunion = new javax.swing.JMenuItem();
        sub_menu_Asistencias = new javax.swing.JMenuItem();
        menu_actas = new javax.swing.JMenuItem();
        menu_multas = new javax.swing.JMenu();
        sub_menu_pagarMultas = new javax.swing.JMenuItem();
        menu_usuario = new javax.swing.JMenu();
        sub_menu_usuario = new javax.swing.JMenuItem();
        menu_rol = new javax.swing.JMenu();
        sub_menu_roles = new javax.swing.JMenuItem();
        sub_menu_rol = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        jMenuBar1.add(jMenu1);

        menu_socios.setForeground(new java.awt.Color(0, 0, 204));
        menu_socios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/socio1.png"))); // NOI18N
        menu_socios.setText("SOCIOS");
        menu_socios.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N

        sub_menu_socios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sub_menu_socios.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_socios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu socio.png"))); // NOI18N
        sub_menu_socios.setText("MENU SOCIOS");
        sub_menu_socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_sociosActionPerformed(evt);
            }
        });
        menu_socios.add(sub_menu_socios);

        jMenuBar1.add(menu_socios);

        menu_transaccion.setForeground(new java.awt.Color(0, 0, 204));
        menu_transaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/transacciones.png"))); // NOI18N
        menu_transaccion.setText("TRASACCION");
        menu_transaccion.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        menu_transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_transaccionActionPerformed(evt);
            }
        });

        sub_menu_transaccion.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_transaccion.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_transaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu transaccion.png"))); // NOI18N
        sub_menu_transaccion.setText("MENU DE TRANSACCIONES");
        sub_menu_transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_transaccionActionPerformed(evt);
            }
        });
        menu_transaccion.add(sub_menu_transaccion);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes_asis.png"))); // NOI18N
        jMenuItem3.setText("REPORTES");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_transaccion.add(jMenuItem3);

        jMenuBar1.add(menu_transaccion);

        menu_reunion.setBackground(new java.awt.Color(255, 255, 255));
        menu_reunion.setForeground(new java.awt.Color(0, 0, 204));
        menu_reunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reunion.png"))); // NOI18N
        menu_reunion.setText("REUNION");
        menu_reunion.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N

        sub_menu_crearReunion.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_crearReunion.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_crearReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agendar_re.png"))); // NOI18N
        sub_menu_crearReunion.setText("CREAR REUNION");
        sub_menu_crearReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_crearReunionActionPerformed(evt);
            }
        });
        menu_reunion.add(sub_menu_crearReunion);

        sub_menu_Asistencias.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_Asistencias.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_Asistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asistencias.png"))); // NOI18N
        sub_menu_Asistencias.setText("CONSULTAR ASISTENCIAS");
        sub_menu_Asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_AsistenciasActionPerformed(evt);
            }
        });
        menu_reunion.add(sub_menu_Asistencias);

        menu_actas.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        menu_actas.setForeground(new java.awt.Color(0, 153, 153));
        menu_actas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actas.png"))); // NOI18N
        menu_actas.setText("MENU DE ACTAS");
        menu_actas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_actasActionPerformed(evt);
            }
        });
        menu_reunion.add(menu_actas);

        jMenuBar1.add(menu_reunion);

        menu_multas.setForeground(new java.awt.Color(0, 0, 204));
        menu_multas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/multa.png"))); // NOI18N
        menu_multas.setText("MULTAS");
        menu_multas.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N

        sub_menu_pagarMultas.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_pagarMultas.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_pagarMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu multa.png"))); // NOI18N
        sub_menu_pagarMultas.setText("MENU MULTAS");
        sub_menu_pagarMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_pagarMultasActionPerformed(evt);
            }
        });
        menu_multas.add(sub_menu_pagarMultas);

        jMenuBar1.add(menu_multas);

        menu_usuario.setForeground(new java.awt.Color(0, 0, 204));
        menu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        menu_usuario.setText("USUARIO");
        menu_usuario.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        menu_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_usuarioActionPerformed(evt);
            }
        });

        sub_menu_usuario.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_usuario.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar usu.png"))); // NOI18N
        sub_menu_usuario.setText("AGREGAR USUARIO");
        sub_menu_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_usuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(sub_menu_usuario);

        jMenuBar1.add(menu_usuario);

        menu_rol.setForeground(new java.awt.Color(0, 0, 204));
        menu_rol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rol.png"))); // NOI18N
        menu_rol.setText("ROL");
        menu_rol.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N

        sub_menu_roles.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_roles.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_roles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu rol.png"))); // NOI18N
        sub_menu_roles.setText("MENU DE ROLES");
        sub_menu_roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_rolesActionPerformed(evt);
            }
        });
        menu_rol.add(sub_menu_roles);

        sub_menu_rol.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        sub_menu_rol.setForeground(new java.awt.Color(0, 153, 153));
        sub_menu_rol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/privilegio.png"))); // NOI18N
        sub_menu_rol.setText("DESIGNAR PRIVILEGIOS");
        sub_menu_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_rolActionPerformed(evt);
            }
        });
        menu_rol.add(sub_menu_rol);

        jMenuBar1.add(menu_rol);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_transaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_transaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_transaccionActionPerformed

    private void sub_menu_transaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_transaccionActionPerformed
        Ventana_transaccion vent = new Ventana_transaccion();
        escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_sub_menu_transaccionActionPerformed

    private void sub_menu_sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_sociosActionPerformed
        Socio_Ventana socio = new Socio_Ventana();
        escritorio.add(socio);
        socio.show();
    }//GEN-LAST:event_sub_menu_sociosActionPerformed

    private void sub_menu_crearReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_crearReunionActionPerformed
        Ventana_RegistrarReunion reg = new Ventana_RegistrarReunion();
        reg.setVisible(true);
    }//GEN-LAST:event_sub_menu_crearReunionActionPerformed

    private void sub_menu_pagarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_pagarMultasActionPerformed
        Multa_Ventana multa = new Multa_Ventana();
        escritorio.add(multa);
        multa.show();
    }//GEN-LAST:event_sub_menu_pagarMultasActionPerformed

    private void sub_menu_AsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_AsistenciasActionPerformed
        Ventana_ConsulAsis consul = new Ventana_ConsulAsis();
        escritorio.add(consul);
        consul.show();

    }//GEN-LAST:event_sub_menu_AsistenciasActionPerformed

    private void sub_menu_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_usuarioActionPerformed
        Agregar_Usuario agr = new Agregar_Usuario();
        agr.setVisible(true);

    }//GEN-LAST:event_sub_menu_usuarioActionPerformed

    private void sub_menu_rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_rolesActionPerformed
        Agregar_Rol rol = new Agregar_Rol();
        rol.setVisible(true);
    }//GEN-LAST:event_sub_menu_rolesActionPerformed

    private void sub_menu_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_rolActionPerformed
        Asignar_roles_opciones asig = new Asignar_roles_opciones();
        escritorio.add(asig);
        asig.show();
    }//GEN-LAST:event_sub_menu_rolActionPerformed

    private void menu_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_usuarioActionPerformed

    private void menu_actasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_actasActionPerformed
        Ventana_Actas ven = new Ventana_Actas();
        ven.setVisible(true);
    }//GEN-LAST:event_menu_actasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Consultas_Transacciones consul=new Consultas_Transacciones();
        escritorio.add(consul);
        consul.show();       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menu_actas;
    private javax.swing.JMenu menu_multas;
    private javax.swing.JMenu menu_reunion;
    private javax.swing.JMenu menu_rol;
    private javax.swing.JMenu menu_socios;
    private javax.swing.JMenu menu_transaccion;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JMenuItem sub_menu_Asistencias;
    private javax.swing.JMenuItem sub_menu_crearReunion;
    private javax.swing.JMenuItem sub_menu_pagarMultas;
    private javax.swing.JMenuItem sub_menu_rol;
    private javax.swing.JMenuItem sub_menu_roles;
    private javax.swing.JMenuItem sub_menu_socios;
    private javax.swing.JMenuItem sub_menu_transaccion;
    private javax.swing.JMenuItem sub_menu_usuario;
    // End of variables declaration//GEN-END:variables
}
