package controlador;

import modelo.Rol;
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
    int fila = -1;
    int n = 0;
    int codigo_usuario, cod_socio, cod_rol;
    String usuario, clave;
    Modelo_Rol r = new Modelo_Rol();
    Modelo_Socio ms = new Modelo_Socio();

    public Control_user(Modelo_Usuario modelo, Vista_Usuario vista) {
        this.modelo = modelo;
        this.vu = vista;
        vista.setVisible(true);
        DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());
        vu.getCombo_box().addItem("<Seleccionar>");
        vu.getCombo_box().setModel(combo);
        desactivarBotones();
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

        KeyListener nombreSocio = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                nombreAgregar();

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
        vu.getTabla_usuario().addMouseListener(ml);
        vu.getBtn_aceptar().addActionListener(l -> DefinirMetodo(n));
        vu.getBtn_agregar().addActionListener(l -> cargarDialogo(1));
        vu.getBtn_modificar().addActionListener(l -> cargarDialogo(2));
        vu.getTxt_buscar().addKeyListener(kl);
        vu.getTxt_cedula().addKeyListener(nombreSocio);
        vu.getBtn_eliminar().addActionListener(l -> eliminarUsuario());
        vu.getTabla_usuario().addMouseListener(ml);
        vu.getBtn_cancelar().addActionListener(l -> vu.getDialogo_usuario().dispose());
    }

    public void activarBotones() {
        vu.getBtn_agregar().setEnabled(true);
        vu.getBtn_modificar().setEnabled(true);
        vu.getBtn_eliminar().setEnabled(true);
    }

    public void desactivarBotones() {
        vu.getBtn_modificar().setEnabled(false);
        vu.getBtn_eliminar().setEnabled(false);
    }

    public void grabarUsuario() {

        if ("".equals(vu.getTxt_cedula().getText())) {
            JOptionPane.showMessageDialog(null, "Llenar el campo de la cedula", "", 0);
        } else if ("".equals(vu.getTxt_usuario().getText())) {
            JOptionPane.showMessageDialog(null, "Llenar el campo del usuario", "", 0);
        } else if (vu.getCombo_box().getSelectedItem().toString().equals("<Selecciona el Rol>")) {
            JOptionPane.showMessageDialog(null, "Selecciona el Rol", "", 0);
            
        } 
        else if ("".equals(vu.getTxt_contraseniaNueva().getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña", "", 0);
        } else if (vu.getTxt_contraseniaNueva().getText().equals(vu.getTxt_confirmeClave().getText())) 
        {
            CargarDatos();
            int cod_rol = modelo.validarRol();
            int cod_soc = modelo.codigoSocio();
            int usuario = modelo.validarUsuario();
            if (cod_rol != 0) {
                JOptionPane.showMessageDialog(null, "Este rol ya esta en uso", "", 0);
            } else if (cod_soc != 0) {
                JOptionPane.showMessageDialog(null, "Este Socio ya tiene un usuario", "", 0);
            } else if (usuario != 0) {
                JOptionPane.showMessageDialog(null, "Este usuario ya esta siendo utlizado", "", 0);
            } else {
                if (modelo.AgregarUsuario()) {
                    cargarLista("");
                    JOptionPane.showMessageDialog(null, "Usuario Registrado con Éxito", "", 1);
                    vu.getDialogo_usuario().dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error", "", 0);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "", 0);
        }

    }

    public void DefinirMetodo(int n) {

        if (n == 1) {
            fila = vu.getTabla_usuario().getSelectedRow();
            grabarUsuario();
        } else if (n == 2) {

            fila = vu.getTabla_usuario().getSelectedRow();
            modificarUsuario();

        }
    }

    public void limpiarCampos() {
        vu.getTxt_cedula().setText("");
        vu.getTxt_nombre().setText("");
        vu.getTxt_apellido().setText("");
        DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());
        vu.getCombo_box().addItem("<Seleccionar>");
        vu.getCombo_box().setModel(combo);
        vu.getTxt_usuario().setText("");

    }

    public void cargarDialogo(int origen) {

        vu.getDialogo_usuario().setSize(500, 500);
        vu.getDialogo_usuario().setLocationRelativeTo(vu);
        fila = vu.getTabla_usuario().getSelectedRow();
        if (origen == 1) {
            limpiarCampos();
            vu.getTxt_cedula().setEditable(true);
            vu.getLbl_contrasenia_nueva().setText("Contraseña");
            vu.getDialogo_usuario().setTitle("Crear Usuario");
            n = 1;
            vu.getDialogo_usuario().setVisible(true);
        } else {
            if (fila == -1) {
                JOptionPane.showMessageDialog(vu, "SELECCIONE UN DATO DE LA TABLA", "", 2);
            } else {
                vu.getTxt_cedula().setEditable(false);
                TablaDatos();
                vu.getDialogo_usuario().setTitle("Editar Usuario");
                n = 2;
                vu.getDialogo_usuario().setVisible(true);
            }
        }
    }

    public void modificarUsuario() {

        if (vu.getTxt_contraseniaNueva().getText().equals("") || vu.getTxt_confirmeClave().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña", "", 0);
        } else {
            if (vu.getTxt_contraseniaNueva().getText().equals(vu.getTxt_confirmeClave().getText())) {
                int op = JOptionPane.showOptionDialog(null, "Esta seguro de Modificar este Usuario", "",
                        JOptionPane.YES_NO_CANCEL_OPTION, 2, null, new Object[]{"SI", "NO",}, null);
                if (op == 0) {
                    CargarDatos();
                    int usuario = modelo.validarUsuario();
                    System.out.println(vu.getTxt_usuario().getText().length()+" 444");
                    if (vu.getTxt_usuario().getText().length()>1 || usuario == 0) {
                        if (modelo.modificarUsuario()) {
                            JOptionPane.showMessageDialog(null, "Usuario Modificado con Éxito", "", 1);
                            cargarLista("");
                            desactivarBotones();
                            vu.getTxt_contraseniaNueva().setText("");
                            vu.getTxt_confirmeClave().setText("");
                            vu.getDialogo_usuario().dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error", "", 0);
                            desactivarBotones();
                        }

                    }else{
                        JOptionPane.showMessageDialog(null, "Este usuario no esta disponible, INGRESE UN NUEVO", "", 0);
                        vu.getTxt_usuario().setText("");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "", 1);
            }
        }

    }

    public void eliminarUsuario() {
        fila = vu.getTabla_usuario().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vu, "SELECCIONE UN DATO DE LA TABLA", "", 2);
        } else {
            modelo.setCodigo_usuario(Integer.parseInt(String.valueOf(vu.getTabla_usuario().getValueAt(fila, 0))));
            if (modelo.EliminarUsuario()) {
                cargarLista("");
                desactivarBotones();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con Exito", "", 1);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar", "", 0);
            }
        }
    }

    public void cargarLista(String aguja) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vu.getTabla_usuario().getModel();
        tblModel.setNumRows(0);
        List<Usuario> lista = modelo.listarUsuario(aguja);
        lista.stream().forEach(r -> {
            String[] rol1 = {String.valueOf(r.getCodigo_usuario()), r.getCedula(), r.getRol(),
                r.getNombre(), r.getUsuario()};
            tblModel.addRow(rol1);
        });
    }

    public void CargarDatos() {
         
        cod_socio = codigoSocio();
        cod_rol = codigoRol();
        usuario = vu.getTxt_usuario().getText();
        clave = vu.getTxt_contraseniaNueva().getText();
        modelo.setCodig_rol(cod_rol);
        modelo.setCodigo_socio(cod_socio);
        modelo.setUsuario(usuario);
        modelo.setContrasenia(clave);

    }

    public int codigoSocio() {
        Modelo_Socio ms = new Modelo_Socio();
        return cod_socio = ms.codigoSocio(vu.getTxt_cedula().getText());
    }

    public int codigoRol() {

        List<Rol> lis = new ArrayList<>();
        String rol = vu.getCombo_box().getSelectedItem().toString();
        lis = r.listaRol(rol);
        for (Rol li : lis) {
            if (li.getTipo_rol().equals(rol)) {
                cod_rol = li.getCodigo_rol();
                break;
            }
        }
        return cod_rol;
    }

    public void TablaDatos() {
        fila = vu.getTabla_usuario().getSelectedRow();
        String codigo = String.valueOf(vu.getTabla_usuario().getValueAt(fila, 0));
        modelo.setCodigo_usuario(Integer.parseInt(codigo));
        vu.getTxt_usuario().setText(String.valueOf(vu.getTabla_usuario().getValueAt(fila, 4)));
        vu.getTxt_cedula().setText(String.valueOf(vu.getTabla_usuario().getValueAt(fila, 1)));
        nommbresSocios();
    }

    public void nommbresSocios() {
        String[] socio = ms.nombres(vu.getTxt_cedula().getText());
        if (socio.length != 0) {
            vu.getTxt_nombre().setText(socio[0]);
            vu.getTxt_apellido().setText(socio[1]);
            vu.getCombo_box().removeAllItems();
            vu.getCombo_box().addItem(socio[2]);
            vu.getCombo_box().setEditable(false);
        }
        vu.getLbl_contrasenia_nueva().setText("Nueva Contraseña");
    }

    public void nombreAgregar() {

        String[] socio = ms.nombres2(vu.getTxt_cedula().getText());
        if (socio.length != 0) {
            vu.getTxt_nombre().setText(socio[0]);
            vu.getTxt_apellido().setText(socio[1]);
        }

    }

}
