package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Multa;
import modelo.Modelo_transaccion;
import modelo.Multa;
import vista.Vista_Multa;

public class Control_Multa {

    private Modelo_Multa modelo;
    private Vista_Multa vista;
    private Modelo_transaccion modelot;

    public Control_Multa(Modelo_Multa modelo, Vista_Multa vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Cobrar Multas");
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtn_buscar().addActionListener(l -> listar());
        vista.getBtn_cobrar().addActionListener(l -> abrirDialogo());
        vista.getBtn_aceptar().addActionListener(l -> cobrar());

    }

    public void listar() {
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
                JOptionPane.showMessageDialog(null, "No exite multas en esta fecha", "", 1);
            } else {
                lista.stream().forEach(r -> {
                    String[] multa = {String.valueOf(r.getCedula()), r.getNombre(), r.getEstado(), r.getFecha_multa()};
                    tblModel.addRow(multa);
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, " Ingrese una fecha para buscar", "", 2);
        }
    }

    public void abrirDialogo() {
        vista.getjDialog2().setSize(485, 410);
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
                JOptionPane.showMessageDialog(null, "Accion realizada con exito", "", 1);
            }
        }
    }

    public double cantidadCuenta() {
        String codigo_socio = "1";
        modelot.setCodigo_socio(Integer.parseInt(codigo_socio));
        return modelot.CatidadCuenta();
    }
    

    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fecha1 = sdf.format(fecha);
        return fecha1;
    }
    
    public void cargarDatosTabla() {
        
        int fila=vista.getTabla().getSelectedRow();
        vista.getTxt_cedula().setText(String.valueOf(vista.getTabla().getValueAt(fila, 0)));
        
        
        
        
        
        
        
    }

}
