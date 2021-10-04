package controlador;

import com.toedter.calendar.demo.DateChooserPanel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Modelo_Acta;
import vista.Vista_Acta;

public class Control_Acta {

    Modelo_Acta ma=new Modelo_Acta();
    private Vista_Acta vista;
    int codigo;
    String ruta, fecha,estado_acta, num_acta, archivoActa;

    public Control_Acta(Modelo_Acta modelo, Vista_Acta vista) {
        this.ma = modelo;
        this.vista = vista;
        vista.setTitle("Acta");
        vista.setVisible(true);
    }

    public void inciarControl() {

    }

    public void SeleccionarPdf() {

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        jfc.setFileFilter(fi);

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta = jfc.getSelectedFile().getAbsolutePath();
            vista.getBtn_aprobar().setText("" + jfc.getSelectedFile().getName());

        }

    }

    public void Guardar() {

        File rutaArchivo = new File(ruta);

    }

    public void cargarDatos() {

        Date date = null;
        String formato = null;
        if (vista.getDate_chooser().getDate() != null) {
            date = vista.getDate_chooser().getDate();
            //formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(fecha);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        }
        fecha=formato;
        //codigo=;
        
        
        ma.setNum_acta(0);
        ma.setCod_reunion(0);
        ma.setEstado_acta(num_acta);
    

    }

}
