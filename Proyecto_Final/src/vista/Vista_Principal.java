
package vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Vista_Principal extends javax.swing.JFrame {

    public Vista_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_agregarSocio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_registrarReunion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_asistencia = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_actas = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btn_transacciones = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btn_multas = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btn_imprimirReporte = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        desk_Principal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_socio = new javax.swing.JMenu();
        submenu_socio = new javax.swing.JMenuItem();
        menu_reunion = new javax.swing.JMenu();
        submenu_reunion = new javax.swing.JMenuItem();
        menuActas = new javax.swing.JMenuItem();
        menu_asistencia = new javax.swing.JMenuItem();
        menu_transaccion = new javax.swing.JMenu();
        submenuTransaccion = new javax.swing.JMenuItem();
        menu_Multas = new javax.swing.JMenu();
        menuMulta = new javax.swing.JMenuItem();
        menuPrincipal_rol = new javax.swing.JMenu();
        menuRol = new javax.swing.JMenuItem();
        menu_privilegios = new javax.swing.JMenuItem();
        menu_usuario = new javax.swing.JMenu();
        menu_MantenimientoUser = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caja de Ahorro y Crédito");
        setBackground(new java.awt.Color(255, 204, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        btn_agregarSocio.setBackground(new java.awt.Color(0, 51, 102));
        btn_agregarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/añadir_usuario.png"))); // NOI18N
        btn_agregarSocio.setToolTipText("Agregar socio");
        btn_agregarSocio.setFocusable(false);
        btn_agregarSocio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregarSocio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agregarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarSocioActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_agregarSocio);
        jToolBar1.add(jSeparator2);

        btn_registrarReunion.setBackground(new java.awt.Color(0, 51, 102));
        btn_registrarReunion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/agendar reunion.png"))); // NOI18N
        btn_registrarReunion.setToolTipText("Registrar Reunión");
        btn_registrarReunion.setFocusable(false);
        btn_registrarReunion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrarReunion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarReunionActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_registrarReunion);
        jToolBar1.add(jSeparator3);

        btn_asistencia.setBackground(new java.awt.Color(0, 51, 102));
        btn_asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/asistencia.png"))); // NOI18N
        btn_asistencia.setToolTipText("Asistencia");
        btn_asistencia.setFocusable(false);
        btn_asistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_asistencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asistenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_asistencia);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.add(jSeparator4);

        btn_actas.setBackground(new java.awt.Color(0, 51, 102));
        btn_actas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/acta.png"))); // NOI18N
        btn_actas.setToolTipText("Actas");
        btn_actas.setFocusable(false);
        btn_actas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_actas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_actas);
        jToolBar1.add(jSeparator7);

        btn_transacciones.setBackground(new java.awt.Color(0, 51, 102));
        btn_transacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/transaccion.png"))); // NOI18N
        btn_transacciones.setToolTipText("Transacciones");
        btn_transacciones.setFocusable(false);
        btn_transacciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_transacciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_transacciones);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator9);

        btn_multas.setText("Multas");
        btn_multas.setFocusable(false);
        btn_multas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_multas);
        jToolBar1.add(jSeparator10);

        btn_imprimirReporte.setBackground(new java.awt.Color(0, 51, 102));
        btn_imprimirReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprimirReporte.setToolTipText("Imprimir reporte socios");
        btn_imprimirReporte.setFocusable(false);
        btn_imprimirReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_imprimirReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_imprimirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirReporteActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_imprimirReporte);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 40));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        desk_Principal.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout desk_PrincipalLayout = new javax.swing.GroupLayout(desk_Principal);
        desk_Principal.setLayout(desk_PrincipalLayout);
        desk_PrincipalLayout.setHorizontalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        desk_PrincipalLayout.setVerticalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(desk_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1380, 630));

        jLabel2.setText("Bienvenido...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 1300, 20));

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        menu_socio.setText("Socios");

        submenu_socio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        submenu_socio.setText("Registro y datos del socio");
        submenu_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_socioActionPerformed(evt);
            }
        });
        menu_socio.add(submenu_socio);

        jMenuBar1.add(menu_socio);

        menu_reunion.setText("Reunión");

        submenu_reunion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        submenu_reunion.setText("Crear Reunión");
        submenu_reunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_reunionActionPerformed(evt);
            }
        });
        menu_reunion.add(submenu_reunion);

        menuActas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuActas.setText("Actas");
        menuActas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActasActionPerformed(evt);
            }
        });
        menu_reunion.add(menuActas);

        menu_asistencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_asistencia.setText("Asistencia");
        menu_asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_asistenciaActionPerformed(evt);
            }
        });
        menu_reunion.add(menu_asistencia);

        jMenuBar1.add(menu_reunion);

        menu_transaccion.setText("Transacción");

        submenuTransaccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        submenuTransaccion.setText("Registrar Transaccion");
        menu_transaccion.add(submenuTransaccion);

        jMenuBar1.add(menu_transaccion);

        menu_Multas.setText("Multa");

        menuMulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuMulta.setText("Cobrar Multas");
        menu_Multas.add(menuMulta);

        jMenuBar1.add(menu_Multas);

        menuPrincipal_rol.setText("Rol");

        menuRol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRol.setText("Roles");
        menuRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRolActionPerformed(evt);
            }
        });
        menuPrincipal_rol.add(menuRol);

        menu_privilegios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_privilegios.setText("Privilegios");
        menuPrincipal_rol.add(menu_privilegios);

        jMenuBar1.add(menuPrincipal_rol);

        menu_usuario.setText("Usuario");

        menu_MantenimientoUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_MantenimientoUser.setText("Matenimiento Usuarios");
        menu_MantenimientoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_MantenimientoUserActionPerformed(evt);
            }
        });
        menu_usuario.add(menu_MantenimientoUser);

        jMenuBar1.add(menu_usuario);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_MantenimientoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_MantenimientoUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_MantenimientoUserActionPerformed

    public JMenuItem getMenu_asistencia() {
        return menu_asistencia;
    }

    public void setMenu_asistencia(JMenuItem menu_asistencia) {
        this.menu_asistencia = menu_asistencia;
    }

    public JMenuItem getMenuRol() {
        return menuRol;
    }

    public void setMenuRol(JMenuItem menuRol) {
        this.menuRol = menuRol;
    }

    public JMenu getMenu_socio() {
        return menu_socio;
    }

    public void setMenu_socio(JMenu menu_socio) {
        this.menu_socio = menu_socio;
    }

    public JMenuItem getSubmenu_socio() {
        return submenu_socio;
    }

    public void setSubmenu_socio(JMenuItem submenu_socio) {
        this.submenu_socio = submenu_socio;
    }
    

    private void menuRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRolActionPerformed

    private void submenu_socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_socioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submenu_socioActionPerformed

    private void menuActasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActasActionPerformed

    private void btn_imprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirReporteActionPerformed

    private void btn_agregarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarSocioActionPerformed

    private void btn_registrarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarReunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarReunionActionPerformed

    private void btn_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_asistenciaActionPerformed

    private void menu_asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_asistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_asistenciaActionPerformed

    private void submenu_reunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_reunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submenu_reunionActionPerformed

    public JDesktopPane getDesk_Principal() {
        return desk_Principal;
    }

    public void setDesk_Principal(JDesktopPane desk_Principal) {
        this.desk_Principal = desk_Principal;
    }

    public JButton getBtn_actas() {
        return btn_actas;
    }

    public void setBtn_actas(JButton btn_actas) {
        this.btn_actas = btn_actas;
    }

    public JButton getBtn_agregarSocio() {
        return btn_agregarSocio;
    }

    public void setBtn_agregarSocio(JButton btn_agregarSocio) {
        this.btn_agregarSocio = btn_agregarSocio;
    }

    public JButton getBtn_asistencia() {
        return btn_asistencia;
    }

    public void setBtn_asistencia(JButton btn_asistencia) {
        this.btn_asistencia = btn_asistencia;
    }

    public JButton getBtn_imprimirReporte() {
        return btn_imprimirReporte;
    }

    public void setBtn_imprimirReporte(JButton btn_imprimirReporte) {
        this.btn_imprimirReporte = btn_imprimirReporte;
    }

   

    public JButton getBtn_registrarReunion() {
        return btn_registrarReunion;
    }

    public void setBtn_registrarReunion(JButton btn_registrarReunion) {
        this.btn_registrarReunion = btn_registrarReunion;
    }

    public JButton getBtn_transacciones() {
        return btn_transacciones;
    }

    public void setBtn_transacciones(JButton btn_transacciones) {
        this.btn_transacciones = btn_transacciones;
    }
    
    

    public JMenuItem getMenu_MantenimientoUser() {
        return menu_MantenimientoUser;
    }

    public JMenuItem getMenuActas() {
        return menuActas;
    }

    public void setMenuActas(JMenuItem menuActas) {
        this.menuActas = menuActas;
    }

    public void setMenu_MantenimientoUser(JMenuItem menu_MantenimientoUser) {
        this.menu_MantenimientoUser = menu_MantenimientoUser;
    }


    public void setMenu_rol(JMenu menu_rol) {
        this.menuPrincipal_rol = menu_rol;
    }

    public JMenu getMenuPrincipal_rol() {
        return menuPrincipal_rol;
    }

    public void setMenuPrincipal_rol(JMenu menuPrincipal_rol) {
        this.menuPrincipal_rol = menuPrincipal_rol;
    }

    public JButton getBtn_multas() {
        return btn_multas;
    }

    public void setBtn_multas(JButton btn_multas) {
        this.btn_multas = btn_multas;
    }

    public JMenuItem getMenu_privilegios() {
        return menu_privilegios;
    }

    public void setMenu_privilegios(JMenuItem menu_privilegios) {
        this.menu_privilegios = menu_privilegios;
    }

    public JMenuItem getSubmenuTransaccion() {
        return submenuTransaccion;
    }

    public void setSubmenuTransaccion(JMenuItem submenuTransaccion) {
        this.submenuTransaccion = submenuTransaccion;
    }

    public JMenu getMenu_reunion() {
        return menu_reunion;
    }

    public void setMenu_reunion(JMenu menu_reunion) {
        this.menu_reunion = menu_reunion;
    }

    public JMenu getMenu_transaccion() {
        return menu_transaccion;
    }

    public void setMenu_transaccion(JMenu menu_transaccion) {
        this.menu_transaccion = menu_transaccion;
    }

    public JMenuItem getSubmenu_reunion() {
        return submenu_reunion;
    }

    public void setSubmenu_reunion(JMenuItem submenu_reunion) {
        this.submenu_reunion = submenu_reunion;
    }

    public JMenu getMenu_Multas() {
        return menu_Multas;
    }

    public void setMenu_Multas(JMenu menu_Multas) {
        this.menu_Multas = menu_Multas;
    }

    public JMenu getMenu_usuario() {
        return menu_usuario;
    }

    public void setMenu_usuario(JMenu menu_usuario) {
        this.menu_usuario = menu_usuario;
    }

    public JMenuItem getMenuMulta() {
        return menuMulta;
    }

    public void setMenuMulta(JMenuItem menuMulta) {
        this.menuMulta = menuMulta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actas;
    private javax.swing.JButton btn_agregarSocio;
    private javax.swing.JButton btn_asistencia;
    private javax.swing.JButton btn_imprimirReporte;
    private javax.swing.JButton btn_multas;
    private javax.swing.JButton btn_registrarReunion;
    private javax.swing.JButton btn_transacciones;
    private javax.swing.JDesktopPane desk_Principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuActas;
    private javax.swing.JMenuItem menuMulta;
    private javax.swing.JMenu menuPrincipal_rol;
    private javax.swing.JMenuItem menuRol;
    private javax.swing.JMenuItem menu_MantenimientoUser;
    private javax.swing.JMenu menu_Multas;
    private javax.swing.JMenuItem menu_asistencia;
    private javax.swing.JMenuItem menu_privilegios;
    private javax.swing.JMenu menu_reunion;
    private javax.swing.JMenu menu_socio;
    private javax.swing.JMenu menu_transaccion;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JMenuItem submenuTransaccion;
    private javax.swing.JMenuItem submenu_reunion;
    private javax.swing.JMenuItem submenu_socio;
    // End of variables declaration//GEN-END:variables
}
