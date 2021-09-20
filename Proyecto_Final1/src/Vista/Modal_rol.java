
package Vista;

import static Vista.Modal_usuario.resultado;
import conexion.Conexion_sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Rol;
import Modelo.Usuario;

/**
 *
 * @author Paola
 */
public class Modal_rol extends javax.swing.JDialog {

    ArrayList<Rol> mirol = new ArrayList<>();
    Agregar_Rol ro = new Agregar_Rol();

    private int codigo_rol;
    private String tipo_rol;
    static ResultSet resultado = null;

    public int getCodigo_rol() {
        return codigo_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }
    DefaultTableModel modelo;

    public Modal_rol() {
        initComponents();
    }

    public Modal_rol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Código Rol");
        modelo.addColumn("Nombre Rol");
        this.TablaRol.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        ButtonBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRol = new javax.swing.JTable();
        LblFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("BUSCAR ROLES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        LblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(0, 0, 204));
        LblNombre.setText("Nombre del rol");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, 40));

        ButtonBusca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonBusca.setForeground(new java.awt.Color(0, 153, 153));
        ButtonBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        ButtonBusca.setText("BUSCAR");
        ButtonBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        ButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, 50));

        TablaRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TablaRol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TablaRol.setForeground(new java.awt.Color(0, 153, 153));
        TablaRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        TablaRol.setGridColor(new java.awt.Color(0, 153, 153));
        TablaRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRol);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 90));

        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscaActionPerformed
        // TODO add your handling code here:
        try {
            Conexion_sql.Conexion();
            mirol.clear();

            String sql = "SELECT * FROM rol WHERE UPPER(tipo_rol) LIKE UPPER('%" + TxtNombre.getText() + "%');";
            resultado = Conexion_sql.Resultados(sql);
            int cantfila = TablaRol.getRowCount();

            for (int i = cantfila - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            Rol objrol;

            while (resultado.next()) {
                objrol = new Rol();
                objrol.setCodigo_rol(resultado.getInt("codigo_rol"));
                objrol.setTipo_rol(resultado.getString("tipo_rol"));
                mirol.add(objrol);
            }
            String[] datos;
            for (Rol elemento : mirol) {
                datos = new String[2];
                datos[0] = Integer.toString(elemento.getCodigo_rol());
                datos[1] = elemento.getTipo_rol();
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }
        Conexion_sql.CerrarConexion();

    }//GEN-LAST:event_ButtonBuscaActionPerformed

    private void TablaRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRolMouseClicked
        // TODO add your handling code here:

        try {
            int i = TablaRol.getSelectedRow();
            codigo_rol = mirol.get(i).getCodigo_rol();
            tipo_rol = mirol.get(i).getTipo_rol();

            this.dispose();

        } catch (NullPointerException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_TablaRolMouseClicked

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "ERROR! DEBE INGRESAR SOLO LETRAS");
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBusca;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTable TablaRol;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
