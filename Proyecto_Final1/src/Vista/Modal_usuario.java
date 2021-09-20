package Vista;

import conexion.Conexion_sql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Modelo.Usuario;

/**
 *
 * @author Paola
 */
public class Modal_usuario extends javax.swing.JDialog {

    ArrayList<Usuario> lista = new ArrayList<>();
    Agregar_Usuario usua = new Agregar_Usuario();
    private int codigo;
    private int codigo_usario;
    private int codigo_socio;
    private int codig_rol;
    private String usuario;
    private String contrasenia;
    static ResultSet resultado = null;

    public int getCodigo() {
        return codigo;
    }

    public int getCodigo_usario() {
        return codigo_usario;
    }

    public int getCodigo_socio() {
        return codigo_socio;
    }

    public int getCodig_rol() {
        return codig_rol;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    DefaultTableModel modelo;

    public Modal_usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO SOCIO");
        modelo.addColumn("USUARIO");
        modelo.addColumn("CONTRASEÑA");
        this.TablaBusca.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBuscaU = new javax.swing.JTextField();
        Button_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBusca = new javax.swing.JTable();
        LblFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("BUSCAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        getContentPane().add(TxtBuscaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 30));

        Button_Buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Buscar.setForeground(new java.awt.Color(0, 153, 153));
        Button_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca.png"))); // NOI18N
        Button_Buscar.setText("BUSCAR");
        Button_Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        Button_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_BuscarMouseClicked(evt);
            }
        });
        Button_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 50));

        TablaBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        TablaBusca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        TablaBusca.setGridColor(new java.awt.Color(0, 153, 153));
        TablaBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBusca);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 410, 150));

        LblFondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BuscarActionPerformed
        if ("".equals(TxtBuscaU.getText())) {
            JOptionPane.showMessageDialog(null, "INGRESE EL USUARIO PARA BUSACAR", "", 0);
        } else {
            try {
                Conexion_sql.Conexion();
                lista.clear();

                String sql = "SELECT * FROM usuario WHERE usuario LIKE'%" + TxtBuscaU.getText() + "%';";
                resultado = Conexion_sql.Resultados(sql);
                int cantfila = TablaBusca.getRowCount();

                for (int i = cantfila - 1; i >= 0; i--) {
                    modelo.removeRow(i);
                }

                Usuario objetoUser;
                while (resultado.next()) {
                    objetoUser = new Usuario();
                    objetoUser.setCodigo_usuario(resultado.getInt("codigo_usuario"));
                    objetoUser.setCodigo_socio(resultado.getInt("codigo_socio"));
                    objetoUser.setCodig_rol(resultado.getInt("codigo_rol"));
                    objetoUser.setUsuario(resultado.getString("usuario"));
                    objetoUser.setContrasenia(resultado.getString("contrasenia"));
                    lista.add(objetoUser);
                }
                String[] datos;
                for (Usuario elemento : lista) {
                    datos = new String[3];
                    //datos[0] = Integer.toString(elemento.getCodigo_usuario());
                    datos[0] = Integer.toString(elemento.getCodigo_socio());
                    //datos[2] = Integer.toString(elemento.getCodig_rol());
                    datos[1] = elemento.getUsuario();
                    datos[2] = elemento.getContrasenia();
                    modelo.addRow(datos);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
            }
            Conexion_sql.CerrarConexion();

        }

    }//GEN-LAST:event_Button_BuscarActionPerformed

    private void Button_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BuscarMouseClicked

    }//GEN-LAST:event_Button_BuscarMouseClicked

    private void TablaBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBuscaMouseClicked
        try {
            int i = TablaBusca.getSelectedRow();
            codigo = lista.get(i).getCodigo_usuario();
            codigo_socio = lista.get(i).getCodigo_socio();
            codig_rol = lista.get(i).getCodig_rol();
            usuario = lista.get(i).getUsuario();
            contrasenia = lista.get(i).getContrasenia();
            this.dispose();

        } catch (NullPointerException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_TablaBuscaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Buscar;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JTable TablaBusca;
    private javax.swing.JTextField TxtBuscaU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
