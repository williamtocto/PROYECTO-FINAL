package controlador;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionPG;
import modelo.Modelo_Reunion;
import modelo.Reunion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.Vista_Reunion;

/**
 *
 * @author Mateo
 */
public class Control_Reunion {

    private Modelo_Reunion modelo;
    private Vista_Reunion vista;

    int codigo_reunion;
    String fecha_reunion;
    String duracion_reunion;
    String topico_reunion;
    Date fecha = null;
    String formato = null;
    String formato2 = null;
    String ruta = "";
    int fila;
    int n;

    public Control_Reunion(Modelo_Reunion modelo, Vista_Reunion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("REUNION");
        vista.setVisible(true);
        cargarLista("");
    }

    public Control_Reunion() {
    }
    
    public void iniciaControl(){
        KeyListener kl = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarLista(vista.getTxtCodReu().getText());
            }
            
        };
        
        MouseListener ml = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //cargarDatos();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        };
       //vu.getBtn_aceptar().addActionListener(l -> DefinirMetodo(n));
       vista.getBtnGuardar().addActionListener(l -> {
            try {
                guardarReunion();
            } catch (ParseException ex) {
                Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
       
       vista.getBtnModificar().addActionListener(l -> modificarReunion());
       vista.getBtnEliminar().addActionListener(l -> eliminarReunion());
       vista.getBtnConsultar().addActionListener(l -> {
            try {
                cargarDialogo(1);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getJTdatos().addMouseListener(ml);
        vista.getTxtCodReu().addKeyListener(kl);
    }

    public void guardarReunion() throws ParseException {
        //cargarDatos();
        int verificarFecha;
        if (vista.getJdFecha() == null || "".equals(vista.getTxtDuracion()) || "".equals(vista.getTxtTopic())) {

            JOptionPane.showMessageDialog(null, " EXISTEN CAMPOS VACIOS DEBE LLENAR TODOS", "TEOLAM", 0);

        } else {

            verificarFecha = ValidarFechaIngreso();
            if (verificarFecha == -1) {
                JOptionPane.showMessageDialog(null, " LA FECHA ES INCORRECTA", "TEOLAM", 0);

            } else {

                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formato = sdf.format(vista.getJdFecha().getDate());
                }
                String format = null;
                int fila = 0;

                if (vista.getJdFecha().getDate() != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    format = sdf.format(vista.getJdFecha().getDate());
                }

                if (fila <= 0) {

                    modelo.setCodigo_reunion(codigo_reunion);
                    modelo.setFecha_reunion(fecha_reunion);
                    modelo.setDuracion_reunion(duracion_reunion);
                    modelo.setTopico_reunion(topico_reunion);
                    int codigo_reunion = 0;
                    codigo_reunion = Integer.parseInt(vista.getTxtCodReu().getText());
                    if (modelo.AgregarReunion()) {
                        JOptionPane.showInputDialog(null, "Se ha guardado correctamente", "", 1);
                    } else {
                        JOptionPane.showInputDialog(null, "Error", "", 0);
                    }
                    //Asistencia_Ventana asis = new Asistencia_Ventana(formato, codigo_reunion);
                    //asis.setVisible(true);
                }
            }

        }

    }

    public void modificarReunion() {
        //cargarDatos();
        modelo.setCodigo_reunion(codigo_reunion);
        modelo.setFecha_reunion(fecha_reunion);
        modelo.setDuracion_reunion(duracion_reunion);
        modelo.setTopico_reunion(topico_reunion);
        if (modelo.modificarReunion()) {
            JOptionPane.showInputDialog(null, "Se ha modificado correctamente", "", 1);
        } else {
            JOptionPane.showInputDialog(null, "Error", "", 0);
        }
    }

    public void eliminarReunion() {
        fila = vista.getJTdatos().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "ADVERTENCIA", 2);
        } else {
            modelo.setCodigo_reunion(Integer.parseInt(String.valueOf(vista.getJTdatos().getValueAt(fila, 0))));
            int resp;
            Component rootPane = null;
            resp = JOptionPane.showConfirmDialog(rootPane, "¿DESEA ELIMNAR?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                if (fila <= 0) {
                    if (modelo.eliminarReunion()) {
                        //cargarDatos();
                        JOptionPane.showMessageDialog(null, "La reunion fue ELIMINADA con Exito", "", 0);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se a podido eliminar", "", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
            }
        }
    }
    
    public void cargarLista(String aguja){
        //aguja=vista.getTxtCodReu().getText();
        DefaultTableModel tblModel;
        tblModel= (DefaultTableModel) vista.getJTdatos().getModel();
        tblModel.setNumRows(0);
        List<Reunion> lista = modelo.listaReunion(aguja);
        lista.stream().forEach(r -> {
            String[] reuni1 = {String.valueOf(r.getCodigo_reunion()),r.getFecha_reunion(), r.getDuracion_reunion(), r.getTopico_reunion()};
            tblModel.addRow(reuni1);
        });
    }

    /*public void cargarDatos() {
        fila= vista.getJTdatos().getSelectedRow();
        vista.getTxtCodReu().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 0)));
        vista.getJdFecha().setDateFormatString(String.valueOf(vista.getJTdatos().getValueAt(fila, 1)));
        vista.getTxtDuracion().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 2)));
        //vista.getTxtTopic().setText(String.valueOf(vista.getJTdatos().getValueAt(fila, 3)));

    */

    public String formatoFecha() {
        if (vista.getJdFecha().getDate() != null) {
            fecha = vista.getJdFecha().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        return formato;
    }

    private void cargarDialogo(int origen) throws SQLException {
        vista.getDgReunion().setSize(600, 600);
        vista.getDgReunion().setLocationRelativeTo(vista);
        fila = vista.getJTdatos().getSelectedRow();
        if (origen == 1) {
            vista.getDgReunion().setTitle("Consultar Reunion");
            n = 1;
            vista.getDgReunion().setVisible(true);
        }
    }

    public int ValidarFechaIngreso() throws ParseException {
        Date fechaDispositivo = new Date();
        int f = 0;
        Date fecha = null;
        String fechaIngreso = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = sdf.format(fechaDispositivo);
        // Tranformar la fecha a String
        if (vista.getJdFecha() != null) {
            fechaIngreso = sdf.format(vista.getJdFecha());
            // PARSE PARA COMPARAR LAS FECHAS
            fechaDispositivo = sdf.parse(fechaActual);
            fecha = sdf.parse(fechaIngreso);
            f = fechaDispositivo.compareTo(fecha);
        }
        return f;
    }
    
    private void imprimirPersonas() {
        ConexionPG con = new ConexionPG();
        try {
            JasperReport reporte = null;
            String path = "C:\\Users\\Mateo\\Documents\\NetBeansProjects\\mvc\\src\\vista\\reportes\\Listar_Personas.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map<String, Object> params= new HashMap<String,Object>();
            /*String miaguja=vista.getTxtBuscar().getText();
            params.put("aguja", "%"+miaguja+"%");//PARAMETROS PARA REPORTES
            params.put("titulo", "LISTADO DE PERSONAS INSCRITAS POR REVIZAR");
            params.put("footer", "Super Mercado Santa Cecilia, Ave Huaynacapac");*/
            //SUPER MERCADOS S.A. Ave. Americas
            
            JasperPrint jp = JasperFillManager.fillReport(reporte, params, con.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_Reunion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
