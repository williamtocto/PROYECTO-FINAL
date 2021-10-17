package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Multa;
import modelo.Multa;
import modelo.Rol;
import vista.Vista_Multa;

public class Control_Multa {

    private Modelo_Multa modelo;
    private Vista_Multa vista;

    public Control_Multa(Modelo_Multa modelo, Vista_Multa vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Cobrar Multas");
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtn_buscar().addActionListener(l-> listar());

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
            lista.stream().forEach(r -> {
                String[] multa = {String.valueOf(r.getCedula()), r.getNombre(),r.getEstado(),r.getFecha_multa()};
                tblModel.addRow(multa);
            });

        } else {
            JOptionPane.showMessageDialog(null, " Ingrese una fecha para buscar", "", 2);
        }

    }

}
