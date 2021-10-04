package controlador;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Modelo_Acta;
import vista.Vista_Acta;

public class Control_Acta {

    private Modelo_Acta modelo;
    private Vista_Acta vista;
    String ruta;

    public Control_Acta(Modelo_Acta modelo, Vista_Acta vista) {
        this.modelo = modelo;
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

        //  sql s = new sql();
        //   int codigo = s.auto_increment("SELECT MAX(codigopdf) FROM pdf;");
        File rutaArchivo = new File(ruta);
 
        /* if (nombre.trim().length() != 0 && ruta_archivo.trim().length() != 0) {
            guardar_pdf(codigo, nombre, ruta);
            tpdf.visualizar_PdfVO(tabla);
            ruta_archivo = "";
            activa_boton(false, false, false);
            txtname.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }*/
    }

}
