package Vista;

import static Vista.Socio_Ventana.resultado;
import conexion.Conexion_sql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Modelo.Asistencia;
import Modelo.Socio;

public class Asistencia_Ventana extends javax.swing.JFrame {

    static Connection conexion = null;
    static Statement sentencia = null;
    static ResultSet resultado = null;
    static String consulta = "SELECT *FROM socio";
    ArrayList<Asistencia> array = new ArrayList<Asistencia>();

    public static ArrayList<Socio> lista = new ArrayList();
    JComboBox comboBox = new JComboBox();
    Asistencia asis = new Asistencia();
    DefaultTableModel Modelo = new DefaultTableModel();
    Object[] fila = new Object[Modelo.getColumnCount()];

    public Asistencia_Ventana() {
    }

    public Asistencia_Ventana(String fecha, int codigo) {
        initComponents();
        Txt_Fecha_reunion.setText(fecha);
        Txtcod_reunion.setText(String.valueOf(codigo));
        Modelo.addColumn("CODIGO");
        Modelo.addColumn("CEDULA");
        Modelo.addColumn("NOMBRE");
        Modelo.addColumn("APELLIDO");
        Modelo.addColumn("ESTADO");
        tbAsistencia.setRowHeight(30);
        this.tbAsistencia.setModel(Modelo);
        CargarComboBox(tbAsistencia, tbAsistencia.getColumnModel().getColumn(4));
        CargarBase();
    }

    public void CargarComboBox(JTable tabla, TableColumn columna) {

        comboBox.addItem("PRESENTE");
        comboBox.addItem("FALTA");
        columna.setCellEditor(new DefaultCellEditor(comboBox));
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setToolTipText("SELECCIONA AQUI");
        columna.setCellRenderer(render);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        LblCodReunion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Cobrar = new javax.swing.JButton();
        Txtcod_reunion = new javax.swing.JTextField();
        Txt_Fecha_reunion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAsistencia = new javax.swing.JTable();
        LblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        LblTitulo.setText("ASISTENCIAS");
        getContentPane().add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        LblCodReunion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCodReunion.setForeground(new java.awt.Color(0, 0, 204));
        LblCodReunion.setText("Numero  reunion");
        getContentPane().add(LblCodReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Fecha de Reunión");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Button_Cobrar.setBackground(new java.awt.Color(0, 153, 0));
        Button_Cobrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_Cobrar.setForeground(new java.awt.Color(0, 153, 153));
        Button_Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        Button_Cobrar.setText("GUARDAR");
        Button_Cobrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Button_Cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CobrarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 180, 60));

        Txtcod_reunion.setEditable(false);
        getContentPane().add(Txtcod_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 260, 30));

        Txt_Fecha_reunion.setEditable(false);
        getContentPane().add(Txt_Fecha_reunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 260, 30));

        tbAsistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));
        tbAsistencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Socio", "Cedula", "Nombre", "Apellido", "Estado"
            }
        ));
        tbAsistencia.setGridColor(new java.awt.Color(0, 153, 153));
        tbAsistencia.setSelectionBackground(new java.awt.Color(0, 51, 204));
        tbAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAsistenciaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbAsistencia);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 1010, 360));

        LblFondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFondo.setForeground(new java.awt.Color(255, 255, 255));
        LblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vintage.jpg"))); // NOI18N
        getContentPane().add(LblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CargarBase() {
        String sql = "SELECT codigo_socio,cedula_socio,nombre_socio,apellido_socio "
                + "from socio where estado_socio= 'true' order by apellido_socio;";

        resultado = Conexion_sql.Resultados(sql);
        lista.clear();
        int cantfila = tbAsistencia.getRowCount();
        for (int i = cantfila - 1; i >= 0; i--) {
            Modelo.removeRow(i);
        }

        try {
            ArrayList<Socio> lista = new ArrayList<>();
            Socio obtSocio;
            while (resultado.next()) {
                obtSocio = new Socio();
                obtSocio.setCodigo_socio(resultado.getInt("codigo_socio"));
                obtSocio.setCedula_socio(resultado.getString("cedula_socio"));
                obtSocio.setNombre_socio(resultado.getString("nombre_socio"));
                obtSocio.setApellido_socio(resultado.getString("apellido_socio"));
                lista.add(obtSocio);
            }
            String[] datos;
            for (Socio elemento : lista) {
                datos = new String[5];
                datos[0] = Integer.toString(elemento.getCodigo_socio());
                datos[1] = elemento.getCedula_socio();
                datos[2] = elemento.getNombre_socio();
                datos[3] = elemento.getApellido_socio();
                datos[4] = null;
                Modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Conexion_sql.CerrarConexion();
    }


    private void tbAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAsistenciaMouseClicked
        int row = evt.getY() / tbAsistencia.getRowHeight();
        tbAsistencia.getValueAt(row, 0);


    }//GEN-LAST:event_tbAsistenciaMouseClicked

    private void Button_CobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CobrarActionPerformed

        boolean multa = false;

        int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE GUARDAR ESTOS DATOS", "TEOLAM", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                new Object[]{"SI", "NO"}, null);

        if (op == 0) {
            String cedula, nombre, apellido, estado;
            boolean bandera = true;
            for (int i = 0; i < tbAsistencia.getRowCount(); i++) {
                estado = (String) tbAsistencia.getValueAt(i, 4);
                nombre = (String) tbAsistencia.getValueAt(i, 2);
                apellido = (String) tbAsistencia.getValueAt(i, 3);
                if (estado == null) {
                    JOptionPane.showMessageDialog(null, "SELECCIONE EL ESTADO DE ASISTENCIA DEL SOCIO " + nombre + " " + apellido, "TEOLAM", 0);
                    bandera = false;
                    break;
                }
            }
            if (bandera == true) {
                for (int i = 0; i < tbAsistencia.getRowCount(); i++) {
                    multa = false;
                    int codigo_socio = Integer.parseInt((String) tbAsistencia.getValueAt(i, 0));
                    estado = (String) tbAsistencia.getValueAt(i, 4);
                    if (estado != null) {
                        if (estado.equalsIgnoreCase("PRESENTE")) {
                            estado = "TRUE";
                        } else {
                            estado = "FALSE";
                            multa = true;
                        }
                        String sql = "  INSERT INTO asistencia(codigo_socio_asis,codigo_reunion,estado_asistencia) VALUES "
                                + "(" + codigo_socio + "," + Txtcod_reunion.getText() + ",'" + estado + "');";
                        Conexion_sql.Asistencia(sql);
                        bandera = false;
                        if (multa == true) {

                            int codigoAsistencia = 0;
                            try {
                                String sql3 = "SELECT codigo_asistencia from asistencia where codigo_socio_asis=" + codigo_socio + " and codigo_reunion=" + Txtcod_reunion.getText();
                                ResultSet result = Conexion_sql.Resultados(sql3);

                                while (result.next()) {
                                    codigoAsistencia = result.getInt("codigo_asistencia");
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Asistencia_Ventana.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            String sql2 = "INSERT INTO multa(codigo_asistencia,estado_multa) VALUES (" + codigoAsistencia + ",'PENDIENTE');";
                            Conexion_sql.Asistencia(sql2);
                            Conexion_sql.CerrarConexion();
                        }
                    }
                }
                if (bandera == false) {
                    JOptionPane.showMessageDialog(null, "ASISTENCIA GUARDADO EXITOSAMENTE", "TEOLAM", 1);

                }

            }
        }


    }//GEN-LAST:event_Button_CobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cobrar;
    private javax.swing.JLabel LblCodReunion;
    private javax.swing.JLabel LblFondo;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTextField Txt_Fecha_reunion;
    private javax.swing.JTextField Txtcod_reunion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbAsistencia;
    // End of variables declaration//GEN-END:variables
}
