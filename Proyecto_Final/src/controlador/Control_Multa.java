package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionPG;
import modelo.Modelo_Multa;
import modelo.Modelo_transaccion;
import modelo.Multa;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.Vista_Multa;

public class Control_Multa {

    private Modelo_Multa modelo;
    private Vista_Multa vista;
    Modelo_transaccion modelot = new Modelo_transaccion();

    public Control_Multa(Modelo_Multa modelo, Vista_Multa vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Cobrar Multas");
        vista.setVisible(true);
        vista.getBtn_cobrar().setEnabled(false);
    }

    public void iniciarControl() {

        KeyListener k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                buscar();
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        vista.getTabla().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        vista.getBtn_imprimir().addActionListener(l -> imprimir());
        vista.getBtn_buscar().addActionListener(l -> listar());
        vista.getBtn_cobrar().addActionListener(l -> abrirDialogo());
        vista.getBtn_aceptar().addActionListener(l -> cobrar());
        vista.getTxt_buscar().addKeyListener(k);
    }

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {
        cargarDatosTabla();
        int fila = vista.getTabla().getSelectedRow();
        String estado = String.valueOf(vista.getTabla().getValueAt(fila, 3));
        if (estado.equals("Pendiente")) {
            vista.getBtn_cobrar().setEnabled(true);
        } else {
            vista.getBtn_cobrar().setEnabled(false);
        }
    }

    public void buscar() {

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTabla().getModel();
        tblModel.setNumRows(0);
        List<Multa> lista = modelo.buscarAguja(vista.getTxt_buscar().getText());
        lista.stream().forEach(r -> {
            String[] multa = {String.valueOf(r.getCodigo_multa()), r.getCedula(), r.getNombre(), r.getEstado(), r.getFecha_multa(), r.getFecha_pago()};
            tblModel.addRow(multa);
        });

    }

    public void listar() {
        vista.getBtn_cobrar().setEnabled(false);
        String fecha = "";
        Date fech = null;
        if (vista.getDateChooser().getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fech = vista.getDateChooser().getDate();
            fecha = sdf.format(fech);
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel) vista.getTabla().getModel();
            tblModel.setNumRows(0);
            List<Multa> lista = modelo.listar(fecha);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No exite multas en esta fecha", "", 2);
            } else {
                lista.stream().forEach(r -> {
                    String[] multa = {String.valueOf(r.getCodigo_multa()), r.getCedula(), r.getNombre(), r.getEstado(), r.getFecha_multa(), r.getFecha_pago()};
                    tblModel.addRow(multa);
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, " Ingrese una fecha para buscar", "", 2);
        }
    }

    public void abrirDialogo() {
        vista.getjDialog2().setSize(400,300);
        vista.getjDialog2().setVisible(true);
    }

    public void cobrar() {

        if (vista.getTxt_monto().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el monto a depositar", "", 1);
        } else {
            int cod_socio = 1;
            String tipo_transaccion = "Pago Multa";
            double monto = 0;
            double saldo = cantidadCuenta();
            monto = Double.valueOf(vista.getTxt_monto().getText());
            modelot.setMonto(monto);
            modelot.setFecha_trans(fecha());
            modelot.setCodigo_socio(cod_socio);
            modelot.setTipo_transaccion(tipo_transaccion);
            saldo = saldo + monto;
            modelot.setSaldo(saldo);
            if (modelot.AgregarTransaccion()) {
                int fila = vista.getTabla().getSelectedRow();
                modelo.setCodigo_multa(Integer.parseInt(vista.getTabla().getValueAt(fila, 0).toString()));
                modelo.modificarMulta(fecha());
                vista.getjDialog2().dispose();
                listar();
                JOptionPane.showMessageDialog(null, "Accion realizada con exito", "", 1);
            }
        }
    }

    public double cantidadCuenta() {
        modelot.setCodigo_socio(1);
        return modelot.CatidadCuenta();
    }

    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fecha1 = sdf.format(fecha);
        return fecha1;
    }

    public void cargarDatosTabla() {
        int fila = vista.getTabla().getSelectedRow();
        vista.getTxt_cedula().setText(String.valueOf(vista.getTabla().getValueAt(fila, 1)));
        vista.getTxt_nombre().setText(String.valueOf(vista.getTabla().getValueAt(fila, 2)));
    }

    public void imprimir() {

        try {
            ConexionPG con = new ConexionPG();
            Date date1 = null;
            if (vista.getDateChooser().getDate() != null) {
                date1 = vista.getDateChooser().getDate();
                JasperReport ruta = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/reporte_multas.jasper"));
                Map<String, Object> parametro = new HashMap<String, Object>();
                parametro.put("fecha_inicio", date1);
                JasperPrint jp = JasperFillManager.fillReport(ruta, parametro, con.getCon());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un fecha para imprimir reporte", "", 2);
            }
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(Control_Multa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
    }

}
