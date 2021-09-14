package vista;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Ventana_principal extends javax.swing.JFrame {   

    public Ventana_principal() {
        initComponents();
    
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public void setjMenu3(JMenu jMenu3) {
        this.jMenu3 = jMenu3;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public void setjMenu4(JMenu jMenu4) {
        this.jMenu4 = jMenu4;
    }

    public JMenu getjMenu5() {
        return jMenu5;
    }

    public void setjMenu5(JMenu jMenu5) {
        this.jMenu5 = jMenu5;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    public void setjMenuBar2(JMenuBar jMenuBar2) {
        this.jMenuBar2 = jMenuBar2;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JMenuItem getjMenuItem2() {
        return jMenuItem2;
    }

    public void setjMenuItem2(JMenuItem jMenuItem2) {
        this.jMenuItem2 = jMenuItem2;
    }

    public JMenuItem getjMenuItem3() {
        return jMenuItem3;
    }

    public void setjMenuItem3(JMenuItem jMenuItem3) {
        this.jMenuItem3 = jMenuItem3;
    }

    public JMenuItem getMenu_actas() {
        return menu_actas;
    }

    public void setMenu_actas(JMenuItem menu_actas) {
        this.menu_actas = menu_actas;
    }

    public JMenu getMenu_multas() {
        return menu_multas;
    }

    public void setMenu_multas(JMenu menu_multas) {
        this.menu_multas = menu_multas;
    }

    public JMenu getMenu_reunion() {
        return menu_reunion;
    }

    public void setMenu_reunion(JMenu menu_reunion) {
        this.menu_reunion = menu_reunion;
    }

    public JMenu getMenu_rol() {
        return menu_rol;
    }

    public void setMenu_rol(JMenu menu_rol) {
        this.menu_rol = menu_rol;
    }

    public JMenu getMenu_socios() {
        return menu_socios;
    }

    public void setMenu_socios(JMenu menu_socios) {
        this.menu_socios = menu_socios;
    }

    public JMenu getMenu_transaccion() {
        return menu_transaccion;
    }

    public void setMenu_transaccion(JMenu menu_transaccion) {
        this.menu_transaccion = menu_transaccion;
    }

    public JMenu getMenu_usuario() {
        return menu_usuario;
    }

    public void setMenu_usuario(JMenu menu_usuario) {
        this.menu_usuario = menu_usuario;
    }

    public JMenuItem getSub_menu_Asistencias() {
        return sub_menu_Asistencias;
    }

    public void setSub_menu_Asistencias(JMenuItem sub_menu_Asistencias) {
        this.sub_menu_Asistencias = sub_menu_Asistencias;
    }

    public JMenuItem getSub_menu_crearReunion() {
        return sub_menu_crearReunion;
    }

    public void setSub_menu_crearReunion(JMenuItem sub_menu_crearReunion) {
        this.sub_menu_crearReunion = sub_menu_crearReunion;
    }

    public JMenuItem getSub_menu_pagarMultas() {
        return sub_menu_pagarMultas;
    }

    public void setSub_menu_pagarMultas(JMenuItem sub_menu_pagarMultas) {
        this.sub_menu_pagarMultas = sub_menu_pagarMultas;
    }

    public JMenuItem getSub_menu_rol() {
        return sub_menu_rol;
    }

    public void setSub_menu_rol(JMenuItem sub_menu_rol) {
        this.sub_menu_rol = sub_menu_rol;
    }

    public JMenuItem getSub_menu_roles() {
        return sub_menu_roles;
    }

    public void setSub_menu_roles(JMenuItem sub_menu_roles) {
        this.sub_menu_roles = sub_menu_roles;
    }

    public JMenuItem getSub_menu_socios() {
        return sub_menu_socios;
    }

    public void setSub_menu_socios(JMenuItem sub_menu_socios) {
        this.sub_menu_socios = sub_menu_socios;
    }

    public JMenuItem getSub_menu_transaccion() {
        return sub_menu_transaccion;
    }

    public void setSub_menu_transaccion(JMenuItem sub_menu_transaccion) {
        this.sub_menu_transaccion = sub_menu_transaccion;
    }

    public JMenuItem getSub_menu_usuario() {
        return sub_menu_usuario;
    }

    public void setSub_menu_usuario(JMenuItem sub_menu_usuario) {
        this.sub_menu_usuario = sub_menu_usuario;
    }

    public Ventana_principal(int rol) {
        initComponents(); 
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
 
    }//GEN-LAST:event_sub_menu_transaccionActionPerformed

    private void sub_menu_sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_sociosActionPerformed

    }//GEN-LAST:event_sub_menu_sociosActionPerformed

    private void sub_menu_crearReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_crearReunionActionPerformed
     
    }//GEN-LAST:event_sub_menu_crearReunionActionPerformed

    private void sub_menu_pagarMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_pagarMultasActionPerformed
 
    }//GEN-LAST:event_sub_menu_pagarMultasActionPerformed

    private void sub_menu_AsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_AsistenciasActionPerformed


    }//GEN-LAST:event_sub_menu_AsistenciasActionPerformed

    private void sub_menu_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_usuarioActionPerformed


    }//GEN-LAST:event_sub_menu_usuarioActionPerformed

    private void sub_menu_rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_rolesActionPerformed

    }//GEN-LAST:event_sub_menu_rolesActionPerformed

    private void sub_menu_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_rolActionPerformed

    }//GEN-LAST:event_sub_menu_rolActionPerformed

    private void menu_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_usuarioActionPerformed

    private void menu_actasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_actasActionPerformed

    }//GEN-LAST:event_menu_actasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
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
