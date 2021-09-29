package controlador;

import Modelo.Rol;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo_Rol;
import modelo.Modelo_Socio;
import modelo.Modelo_Usuario;
import modelo.Usuario;

import vista.Vista_Usuario;

public class Control_user {

    private Modelo_Usuario modelo;
    private Vista_Usuario vu;
    private Usuario user;

    int codigo_usuario, cod_socio, cod_rol;
    String usuario, clave;

    Modelo_Usuario login = new Modelo_Usuario();
    Modelo_Rol r = new Modelo_Rol();

    public Control_user(Modelo_Usuario modelo, Vista_Usuario vista) {
        this.modelo = modelo;
        this.vu = vista;
        vista.setVisible(true);
        DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());
        vu.getCombo_box().setModel(combo);
        cargarLista("");

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
                cargarLista(vu.getTxt_buscar().getText());
            }
        };

        MouseListener ml = new MouseListener() {
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
        vu.getTxt_buscar().addKeyListener(kl);
        vu.getBtn_agregar().addActionListener(l -> grabarUsuario());
        vu.getBtn_eliminar().addActionListener(l -> eliminarUsuario());
        vu.getBtn_modificar().addActionListener(l -> modificarUsuario());
        vu.getTabla_usuario().addMouseListener(ml);
    }

    public void grabarUsuario() {
        CargarDatos();
        modelo.setCodigo_socio(cod_socio);
        modelo.setCodig_rol(cod_rol);
        modelo.setUsuario(usuario);
        modelo.setContrasenia(clave);
        if (modelo.AgregarUsuario()) {
            JOptionPane.showInputDialog(null, "Usuario Registrado con Éxito", "", 1);
        } else {
            JOptionPane.showInputDialog(null, "Error", "", 0);
        }

    }

    public void modificarUsuario() {
        CargarDatos();
        modelo.setCodigo_socio(cod_socio);
        modelo.setCodig_rol(cod_rol);
        modelo.setUsuario(usuario);
        modelo.setContrasenia(clave);
        if (modelo.modificarUsuario()) {
            JOptionPane.showInputDialog(null, "Usuario Modificado con Éxito", "", 1);
        } else {
            JOptionPane.showInputDialog(null, "Error", "", 0);
        }

    }

    public void eliminarUsuario() {
        int fila = vu.getTabla_usuario().getSelectedRow();
        String idRol = String.valueOf(vu.getTabla_usuario().getValueAt(fila, 0));
        if (modelo.EliminarUsuario()) {
            JOptionPane.showInputDialog(null, "Usuario Eliminado con Éxito", "", 1);
            //  cargarLista();
        } else {
            JOptionPane.showMessageDialog(null, "No se a podido eliminar");
        }
    }

    public void cargarLista(String aguja) {
        // String aguja = vu.getTxt_buscar().getText();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vu.getTabla_usuario().getModel();
        tblModel.setNumRows(0);
        List<Usuario> lista = modelo.listarUsuario(aguja);
        lista.stream().forEach(r -> {
            String[] rol1 = {String.valueOf(r.getCodigo_usuario()), String.valueOf(r.getCodigo_socio()),
                String.valueOf(r.getCodig_rol()), r.getUsuario()};
            tblModel.addRow(rol1);
        });
    }

    public void CargarDatos() {
        codigo_usuario = Integer.parseInt(vu.getTxt_usuario().getText());
        cod_socio = codigoSocio();
        cod_rol = codigoRol();
        usuario = vu.getTxt_usuario().getText();
        clave = vu.getTxt_contrasenia().getText();

    }

    public int codigoSocio() {
        Modelo_Socio ms = new Modelo_Socio();
        return cod_socio = ms.codigoSocio(vu.getTxt_cedula().getText());

    }

    public int codigoRol() {

        List<Rol> lis = new ArrayList<>();
        lis = r.listaRol((String) vu.getCombo_box().getSelectedItem());
        for (Rol li : lis) {
            if (li.getTipo_rol().equals((String) vu.getCombo_box().getSelectedItem())) {
                cod_rol = li.getCodigo_rol();
                break;
            }
        }
        return cod_rol;
    }

}
