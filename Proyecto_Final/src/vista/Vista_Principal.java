/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author PCX
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
        initComponents();
    }

    public Vista_Principal(int codig_rol) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        desk_Principal = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_MantenimientoUser = new javax.swing.JMenuItem();
        menu_rol = new javax.swing.JMenu();
        menuRol = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout desk_PrincipalLayout = new javax.swing.GroupLayout(desk_Principal);
        desk_Principal.setLayout(desk_PrincipalLayout);
        desk_PrincipalLayout.setHorizontalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        desk_PrincipalLayout.setVerticalGroup(
            desk_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jMenu1.setText("Socio");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaccion");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Usuario");

        menu_MantenimientoUser.setText("Matenimiento Usuarios");
        menu_MantenimientoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_MantenimientoUserActionPerformed(evt);
            }
        });
        jMenu3.add(menu_MantenimientoUser);

        jMenuBar1.add(jMenu3);

        menu_rol.setText("Rol");

        menuRol.setText("Roles");
        menuRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRolActionPerformed(evt);
            }
        });
        menu_rol.add(menuRol);

        jMenuBar1.add(menu_rol);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addComponent(desk_Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desk_Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_MantenimientoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_MantenimientoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_MantenimientoUserActionPerformed

    private void menuRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRolActionPerformed

    public JDesktopPane getDesk_Principal() {
        return desk_Principal;
    }

    public void setDesk_Principal(JDesktopPane desk_Principal) {
        this.desk_Principal = desk_Principal;
    }

    public JMenuItem getMenu_MantenimientoUser() {
        return menu_MantenimientoUser;
    }

    public void setMenu_MantenimientoUser(JMenuItem menu_MantenimientoUser) {
        this.menu_MantenimientoUser = menu_MantenimientoUser;
    }

    public JMenu getMenu_rol() {
        return menu_rol;
    }

    public void setMenu_rol(JMenu menu_rol) {
        this.menu_rol = menu_rol;
    }

    public JMenuItem getMenuRol() {
        return menuRol;
    }

    public void setMenuRol(JMenuItem menuRol) {
        this.menuRol = menuRol;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuRol;
    private javax.swing.JMenuItem menu_MantenimientoUser;
    private javax.swing.JMenu menu_rol;
    // End of variables declaration//GEN-END:variables
}
