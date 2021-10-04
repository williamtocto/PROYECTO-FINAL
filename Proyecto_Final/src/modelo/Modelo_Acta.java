package modelo;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Modelo_Acta extends Acta{

    ConexionPG con = new ConexionPG();

    public Modelo_Acta() {
    }
    

    public Modelo_Acta(int num_acta, int cod_reunion, String estado_acta, byte[] archivo_acta) {
        super(num_acta, cod_reunion, estado_acta, archivo_acta);
    }
    
    
    public void Agregar() {
        String sql= "";
        
        
    }

   
    
    

}
