package controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_transaccion;
import vista.Vista_transaccion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Transaccion;

/**
 *
 * @author Mateo
 */
public class Control_transaccion {

    private Modelo_transaccion modelot;
    private Vista_transaccion vistat;
    String ruta = "";
    int fila = -1;
    int m;

    Modelo_transaccion transac = new Modelo_transaccion();

    public Control_transaccion(Modelo_transaccion transac, Vista_transaccion vista) {
        this.modelot = transac;
        this.vistat = vista;
        //INICIALIZADORES
        vista.setTitle("TRANSACCIONES");
        vista.setVisible(true);
    }

    public void inicarTransacciones() {

    }

    public void cargarDatos(String aguja) {
        //vistat.getjTabla_tran().setDefaultRenderer(Object.class, new Render());
        vistat.getjTabla_tran().setRowHeight(100);
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        DefaultTableModel tbModel;
        tbModel = (DefaultTableModel) vistat.getjTabla_tran().getModel();
        tbModel.setNumRows(0);
        ArrayList<Transaccion> lista = modelot.listaTransaccion(aguja);
        int columnass = tbModel.getColumnCount();
        for (int i = 0; i < lista.size(); i++) {
            Transaccion ts = new Transaccion();
            tbModel.addRow(new Object[columnass]);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getCod_transaccion(), i, 0);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getCodigo_socio(), i, 1);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getMonto(), i, 2);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getSaldo(), i, 3);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getTipo_transaccion(), i, 4);
            vistat.getjTabla_tran().setValueAt(lista.get(i).getFecha_trans(), i, 5);
        }
    }

    public void guardarTransaccion() {

        int codigo_socio = Integer.parseInt(vistat.getTxtCodigo_socio().getText());
        String t_transaccion = null;
        double sald = 0;//MUCHO OJO AQUI
        double drcantidad = Double.valueOf(vistat.getTxtDeposito().getText());
        double valor_cuenta = Double.valueOf(vistat.getTxtValor_cuenta().getText());
        if (vistat.getRbRetiro().isSelected()) {
            t_transaccion = "Retiro";
            if (valor_cuenta < 0) {
                JOptionPane.showMessageDialog(vistat, "NO EXISTE FONDOS EN SU CUENTA", "ERROR", 1);
            } else if (valor_cuenta < drcantidad) {
                JOptionPane.showMessageDialog(vistat, "NO CUENTA CON LOS FONDOS SUFICIENTES EN SU CUENTA", "ERROR", 1);
            } else {
                JOptionPane.showMessageDialog(vistat, "EL RETIRO SE REALIZO EXITOSAMENTE", "APROBADO", 1);
            }
        }
        if (vistat.getRbDeposito().isSelected()) {
            sald = valor_cuenta + drcantidad;
            JOptionPane.showMessageDialog(vistat, "EL DEPOSITO SE REALIZO EXITOSAMENTE", "APROBADO", 1);
            t_transaccion = "Deposito";
        }

        transac.setCodigo_socio(codigo_socio);
        transac.setMonto(drcantidad);
        transac.setSaldo(sald);//MUCHO OJO AQUI
        transac.setTipo_transaccion(t_transaccion);
        //transac.setFecha_trans(ruta);

    }
    
    java.util.Date fecha(String fecha) throws ParseException {
        try {
            DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sourceFormat.parse(fecha);
            return date;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error de formato en la fecha", "Error Parseo", 0);
        }
        return null;
    }

    public void Datos() {
        fila = vistat.getjTabla_tran().getSelectedRow();
        String codigo_socio = vistat.getTxtCodigo_socio().getText();
        String monto = vistat.getTxtDeposito().getText();
        String saldo = vistat.getTxtValor_cuenta().getText();

    }

    public void mostrarDatos() {
        String t_transaccion = null;
        if (vistat.getRbRetiro().isSelected()) {
            t_transaccion = "Retiro";
        } else if(vistat.getRbDeposito().isSelected()){
            t_transaccion = "Deposito";
        }
        fila = vistat.getjTabla_tran().getSelectedRow();
        vistat.getTxtCodigo_socio().setText(String.valueOf(vistat.getjTabla_tran().getValueAt(fila, 0)));
        vistat.getTxtDeposito().setText(String.valueOf(vistat.getjTabla_tran().getValueAt(fila, 1)));
        vistat.getTxtValor_cuenta().setText(String.valueOf(vistat.getjTabla_tran().getValueAt(fila, 2)));
        t_transaccion= String.valueOf(vistat.getjTabla_tran().getValueAt(fila, 3));
    }
}
