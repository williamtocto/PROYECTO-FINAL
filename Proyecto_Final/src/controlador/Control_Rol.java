package controlador;

import modelo.Rol;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Rol;
import modelo.Modelo_Socio;
import modelo.Socio;
import vista.Vista_Rol;

public class Control_Rol {

    private Modelo_Rol modelo;
    private Vista_Rol vista;
    private Modelo_Socio mr;

    String nombreRol;

    public Control_Rol(Modelo_Rol modelo, Vista_Rol vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Crud Roles");
        vista.setVisible(true);
        vista.getBtn_modificar().setEnabled(false);
        vista.getBtn_eliminar().setEnabled(false);
        cargarLista();

    }

    public void iniciaControl() {

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vista.getTxt_nombreRol()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    char c = e.getKeyChar();
                    if (Character.isDigit(c) == false) {
                    } else {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo letras en este campo", "ERROR", 0);
                    }
                }
                if (e.getSource() == vista.getTxt_cod_rol()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    if (((caracter < '0')
                            || (caracter > '9'))
                            && (caracter != '\b')) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo numeros en este campo", "ERROR", 0);// ignorar el evento de teclado
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                cargarLista();
            }
        };

  

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activarBotones();
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
        vista.getBtn_eliminar().addActionListener(l -> eliminarRol());
        vista.getBtn_modificar().addActionListener(l -> modificarRol());
        vista.getTabla_roles().addMouseListener(ml);
        vista.getTxt_buscar().addKeyListener(kl);
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vista.getTxt_cod_rol().addKeyListener(kl);
        vista.getTxt_nombreRol().addKeyListener(kl);

    }

    public void activarBotones() {
        vista.getBtn_modificar().setEnabled(true);
        vista.getBtn_eliminar().setEnabled(true);
    }

    public void cargarNombreSocio() {
        List<Socio> ls = new ArrayList<>();
        ls = mr.socios();
    }

    public void grabarUsuario() {

        if (vista.getTxt_nombreRol().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el Nombre del Rol", "", 0);
        } else {

            nombreRol = vista.getTxt_nombreRol().getText();
            modelo.setTipo_rol(nombreRol);
            int rl = modelo.CodigoRol();
            if (rl == 0) {
                if (modelo.grabarRol()) {
                    JOptionPane.showMessageDialog(null, "Rol guardado correctamente");
                    cargarLista();
                } else {
                    JOptionPane.showMessageDialog(null, "Error no se podido registrar este rol", "", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este rol ya existe", "", 0);
            }

        }

    }

    public void cargarLista() {
        String aguja = vista.getTxt_buscar().getText();
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

        int op = JOptionPane.showOptionDialog(null, "Esta seguro de Modificar este Rol", "",
                JOptionPane.YES_NO_CANCEL_OPTION, 2, null, new Object[]{"SI", "NO",}, null);

        if (op == 0) {
            nombreRol = vista.getTxt_nombreRol().getText();
            int codigo = Integer.parseInt(vista.getTxt_cod_rol().getText());
            modelo.setTipo_rol(nombreRol);
            modelo.setCodigo_rol(codigo);
            if (modelo.modificarRol()) {
                cargarLista();
                vista.getBtn_registrar().setEnabled(true);
                JOptionPane.showMessageDialog(null, "Modicficado Correctamente");
            }

        }

    }

    public void CargarDatos() {
        int fila = vista.getTabla_roles().getSelectedRow();
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
            JOptionPane.showMessageDialog(null, "Este Rol esta en uso","",0);
        }
    }

}
