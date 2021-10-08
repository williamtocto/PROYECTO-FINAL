/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        desk_Principal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_socio = new javax.swing.JMenu();
        submenu_socio = new javax.swing.JMenuItem();
        menu_transaccion = new javax.swing.JMenu();
        submenuTransaccion = new javax.swing.JMenuItem();
        menu_usuario = new javax.swing.JMenu();
        menu_MantenimientoUser = new javax.swing.JMenuItem();
        menuPrincipal_rol = new javax.swing.JMenu();
        menuRol = new javax.swing.JMenuItem();
        menu_privilegios = new javax.swing.JMenuItem();
        menu_reunion = new javax.swing.JMenu();
        submenu_reunion = new javax.swing.JMenuItem();
        menuActas = new javax.swing.JMenuItem();
        menu_multas = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Bienvenido...");

        desk_Principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desk_PrincipalLayout = new javax.swing.GroupLayout(desk_Principal);
        desk_Principal.setLayout(desk_PrincipalLayout);
        desk_PrincipalLayout.setHorizontalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desk_PrincipalLayout.setVerticalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desk_PrincipalLayout.createSequentialGroup()
                .addGap(0, 600, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        menu_socio.setText("Socio");

        submenu_socio.setText("Registro y datos del socio");
        submenu_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_socioActionPerformed(evt);
            }
        });
        menu_socio.add(submenu_socio);

        jMenuBar1.add(menu_socio);

        menu_transaccion.setText("Transaccion");

        submenuTransaccion.setText("Registrar Transaccion");
        menu_transaccion.add(submenuTransaccion);

        jMenuBar1.add(menu_transaccion);

        menu_usuario.setText("Usuario");

        menu_MantenimientoUser.setText("Matenimiento Usuarios");
        menu_MantenimientoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_MantenimientoUserActionPerformed(evt);
            }
        });
        menu_usuario.add(menu_MantenimientoUser);

        jMenuBar1.add(menu_usuario);

        menuPrincipal_rol.setText("Rol");

        menuRol.setText("Roles");
        menuRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRolActionPerformed(evt);
            }
        });
        menuPrincipal_rol.add(menuRol);

        menu_privilegios.setText("Privilegios");
        menuPrincipal_rol.add(menu_privilegios);

        jMenuBar1.add(menuPrincipal_rol);

        menu_reunion.setText("Reunion");

        submenu_reunion.setText("Crear Reunion");
        menu_reunion.add(submenu_reunion);

        menuActas.setText("Actas");
        menuActas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActasActionPerformed(evt);
            }
        });
        menu_reunion.add(menuActas);

        jMenuBar1.add(menu_reunion);

        menu_multas.setText("Multas");
        jMenuBar1.add(menu_multas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
            .addComponent(desk_Principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desk_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_MantenimientoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_MantenimientoUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_MantenimientoUserActionPerformed

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

    public JDesktopPane getDesk_Principal() {
        return desk_Principal;
    }

    public void setDesk_Principal(JDesktopPane desk_Principal) {
        this.desk_Principal = desk_Principal;
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

    public JMenu getMenu_multas() {
        return menu_multas;
    }

    public void setMenu_multas(JMenu menu_multas) {
        this.menu_multas = menu_multas;
    }

    public JMenu getMenu_usuario() {
        return menu_usuario;
    }

    public void setMenu_usuario(JMenu menu_usuario) {
        this.menu_usuario = menu_usuario;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk_Principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuActas;
    private javax.swing.JMenu menuPrincipal_rol;
    private javax.swing.JMenuItem menuRol;
    private javax.swing.JMenuItem menu_MantenimientoUser;
    private javax.swing.JMenu menu_multas;
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
