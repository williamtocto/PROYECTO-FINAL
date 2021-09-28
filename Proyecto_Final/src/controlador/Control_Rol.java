package controlador;

import Modelo.Rol;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Rol;
import vista.Vista_Rol;

public class Control_Rol {

    private Modelo_Rol modelo;
    private Vista_Rol vista;

    String nombreRol;

    public Control_Rol(Modelo_Rol modelo, Vista_Rol vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Crud Roles");
        vista.setVisible(true);
        cargarLista();

    }

    public void iniciaControl() {
        
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {     
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarLista();
            }
        };
        
        MouseListener ml= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {  
                CargarDatos();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
        
        };
  
        vista.getBtn_registrar().addActionListener(l -> grabarUsuario());
        vista.getBtn_eliminar().addActionListener(l-> eliminarRol());
        vista.getBtn_modificar().addActionListener(l-> modificarRol() );
        vista.getTabla_roles().addMouseListener(ml);
        vista.getTxt_buscar().addKeyListener(kl);
    }

    public void grabarUsuario() {
        nombreRol = vista.getTxt_nombreRol().getText();
        modelo.setTipo_rol(nombreRol);

        if (modelo.grabarRol()) {
            JOptionPane.showMessageDialog(null, "Rol guardado correctamente");
            cargarLista();
        } else {
            JOptionPane.showMessageDialog(null, "Error no se podido registrar este rol");
        }

    }

    public void caragarDatos() {
        
        
    }
    public void cargarLista() {
        String aguja=vista.getTxt_buscar().getText();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTabla_roles().getModel();
        tblModel.setNumRows(0);
        List<Rol> lista = modelo.listaRol(aguja);
        lista.stream().forEach(r -> {
            String[] rol1 = {String.valueOf(r.getCodigo_rol()), r.getTipo_rol()};
            tblModel.addRow(rol1);
        });
    }

    public void modificarRol() {
        nombreRol = vista.getTxt_nombreRol().getText();
        int codigo = Integer.parseInt(vista.getTxt_cod_rol().getText());
        modelo.setTipo_rol(nombreRol);
        modelo.setCodigo_rol(codigo);
        if (modelo.modificarRol()) {
            cargarLista();
            JOptionPane.showMessageDialog(null, "MODIFICADO ELIMINADO CORRECTAMENTE");
        }

    }
    
    public void CargarDatos() {
        int fila=vista.getTabla_roles().getSelectedRow();
        vista.getTxt_cod_rol().setText(String.valueOf(vista.getTabla_roles().getValueAt(fila, 0)));
        vista.getTxt_nombreRol().setText(String.valueOf(vista.getTabla_roles().getValueAt(fila, 1)));
    }

    public void eliminarRol() {
        int fila = vista.getTabla_roles().getSelectedRow();
        String idRol = String.valueOf(vista.getTabla_roles().getValueAt(fila, 0));
        if (modelo.eliminarRol(idRol)) {          
            JOptionPane.showMessageDialog(null, "Rol elimnado correctamente");
            cargarLista();
        } else {
            JOptionPane.showMessageDialog(null, "No se a podido eliminar este rol");
        }
    }

}
