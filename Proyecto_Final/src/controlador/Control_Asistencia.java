package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Asistencia;
import modelo.ConexionPG;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Multa;
import modelo.Modelo_Reunion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.Vista_Asistencia;

public class Control_Asistencia {

    private Modelo_Asistencia modelo;
    private Vista_Asistencia vista;
    int codigo_reunion;

    int array2[];
    int Boton;

    public Control_Asistencia(Modelo_Asistencia modelo, Vista_Asistencia vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Asistencia");
        vista.setVisible(true);
        vista.getBtn_guardarFaltas().setEnabled(false);

    }

    //Metodo para habilitar los botones cuando le de clic a un dato de la tabla
    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = vista.getTabla().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vista.getTabla().getRowHeight();
        if (row < vista.getTabla().getRowCount() && row >= 0 && column < vista.getTabla().getColumnCount() && column >= 0) {
            vista.getBtn_guardarFaltas().setEnabled(true);
        } else {
            String name = "" + vista.getTabla().getValueAt(row, 1);
        }

    }

    public void iniciarControl() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vista.getDate_chooser()) {
                    char caracter = e.getKeyChar();

                    // Verificar si la tecla pulsada no es un digito
                    char c = e.getKeyChar();
                    if (Character.isDigit(c) == false) {
                    } else {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo letras en este campo", "ERROR", 0);
                    }
                }
                if (e.getSource() == vista.getDate_chooser()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    if (((caracter < '0')
                            || (caracter > '9'))
                            && (caracter != '\b')) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo numeros en este campo", "ERROR", 0);// ignorar el evento de teclado
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };

        vista.getBtn_cargarLista().addActionListener(l -> Cargar());
        vista.getBtn_guardarFaltas().addActionListener(l -> GuardarDatos());
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vista.getDate_chooser().addKeyListener(kl);
        vista.getTabla().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });
        vista.getBtn_imprimir().addActionListener(l -> abrirDialogo());
        vista.getBtnAceptar().addActionListener(l -> imprimir());
        vista.getBtnCancelar().addActionListener(l -> vista.getjDialog1().dispose());
    }

    public void abrirDialogo() {
        vista.getjDialog1().setSize(370, 280);
        vista.getjDialog1().setVisible(true);
        vista.getjDialog1().setLocationRelativeTo(vista);
    }

    public void imprimir() {

        ConexionPG con = new ConexionPG();
        vista.getjDialog1().dispose();
        Date date1 = null;
        Date date2 = null;
        if (vista.getDateInicio().getDate() != null) {
            date1 = vista.getDateInicio().getDate();
        }
        if (vista.getDateFin().getDate() != null) {
            date2 = vista.getDateFin().getDate();
        }
        try {
            JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/ReporteAsistencia_1_1.jasper"));
            Map<String, Object> parametro = new HashMap<String, Object>();
            parametro.put("fecha_inicio", date1);
            parametro.put("fecha_fin", date2);
            JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_Asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Cargar() {
        Date date = null;
        String formato = null;
        boolean b = false;
        if (vista.getDate_chooser().getDate() != null) {
            date = vista.getDate_chooser().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(date);
            b = true;
        }
        if (b) {
            String fecha = formato;
            Modelo_Reunion mr = new Modelo_Reunion();
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel) vista.getTabla().getModel();
            tblModel.setNumRows(0);
            vista.getTabla().getColumnModel().getColumn(0).setPreferredWidth(5);
            vista.getTabla().getColumnModel().getColumn(3).setPreferredWidth(3);

            codigo_reunion = mr.codigoReunion(fecha);

            if (codigo_reunion == 0) {
                JOptionPane.showMessageDialog(null, "No existe esta reunion", "", 0);
            } else {
                List<Asistencia> lista = modelo.listarSocioFecha(codigo_reunion);
                Boton = 1;
                if (lista.isEmpty()) {
                    lista = modelo.ListarSocios();
                    Boton = 0;
                }
                lista.stream().forEach(a -> {
                    a.setCod_asistencia(codigo_reunion);
                    String[] asistencia = {String.valueOf(a.getCod_socio()), a.getNombre(),
                        a.getApellido(), String.valueOf(a.getEstado())};
                    tblModel.addRow(asistencia);
                });
            }
            array2 = new int[vista.getTabla().getRowCount()];
            int estado;
            for (int i = 0; i < vista.getTabla().getRowCount(); i++) {
                estado = Integer.parseInt((String) vista.getTabla().getValueAt(i, 3));
                array2[i]=estado;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fecha", "", 0);
        }

    }

    public void GuardarDatos() {

        boolean a = false;
        boolean b = false;
        Modelo_Multa mMulta = new Modelo_Multa();

        int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE GUARDAR ESTOS DATOS", "",
                JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);

        if (op == 0) {
            int codigo_socio = 0;
            int estado = 0;
            int array1[] = new int[vista.getTabla().getRowCount()];
            
            for (int i = 0; i < vista.getTabla().getRowCount(); i++) {
                try {
                    codigo_socio = Integer.parseInt((String) vista.getTabla().getValueAt(i, 0));
                    estado = Integer.parseInt((String) vista.getTabla().getValueAt(i, 3));
                    if (estado != 0 && estado != 1) {
                        JOptionPane.showMessageDialog(null, "Registro Socio: " + vista.getTabla().getValueAt(i, 1) + " "
                                + vista.getTabla().getValueAt(i, 2), "", 0);
                        b = true;
                        break;
                    }
                    array1[i] = estado;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor incorrecto: " + vista.getTabla().getValueAt(i, 1) + " "
                            + vista.getTabla().getValueAt(i, 2), "", 0);
                    b = true;
                    break;
                }
            }

            if (b == false) {
                for (int i = 0; i < vista.getTabla().getRowCount(); i++) {
                    codigo_socio = Integer.parseInt((String) vista.getTabla().getValueAt(i, 0));
                    estado = Integer.parseInt((String) vista.getTabla().getValueAt(i, 3));
                    modelo.setCod_socio(codigo_socio);
                    modelo.setEstado(estado);
                    modelo.setCod_reunion(codigo_reunion);
                    if (Boton == 0) {
                        if (modelo.GuardarLista()) {
                            a = true;
                        }
                        if (estado == 1) {
                            mMulta.setEstado_multa("Pendiente");
                            mMulta.setCodigo_asistencia(modelo.codAsistencia());
                            mMulta.AsignarMulta();
                        }
                    } else {

                        if (modelo.Editar()) {
                            b = false;
                        }
                        if (array2[i] != array1[i]) {
                            if (estado == 1) {
                                mMulta.setEstado_multa("Pendiente");
                                mMulta.setCodigo_asistencia(modelo.codAsistencia());
                                mMulta.AsignarMulta();
                            } else {
                                mMulta.setCodigo_asistencia(modelo.codAsistencia());
                                mMulta.EliminarMulta();
                            }
                        }
                        array2[i] = array1[i];
                    }

                }
            }
            if (a == true) {
                Cargar();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "", 1);
            } else if (b == false) {
                Cargar();
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente", "", 1);
            }

        }

    }

}
