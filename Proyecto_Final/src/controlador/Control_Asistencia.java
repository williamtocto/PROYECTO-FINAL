package controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Control_Asistencia {
    
    
  

    public void GuardarAsistencia() {

        int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO DE GUARDAR ESTOS DATOS", "TEOLAM", JOptionPane.YES_NO_CANCEL_OPTION, 3, null,
                new Object[]{"SI", "NO"}, null);
        
        if (op==0) {
            
            
        }

    }
    
    public void CargarLista() {
        
        DefaultTableModel tblModel;
        // tblModel = (DefaultTableModel) vista.getTblPersonas().getModel();
        
        
    }

}
