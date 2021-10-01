package controlador;

import Modelo.Rol;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Modelo_Rol;
import modelo.Modelo_privilegios;
import vista.Vista_Privilegios;

public class Control_Privilegios {

    private Modelo_privilegios mp;
    private Vista_Privilegios vp;

    public Control_Privilegios(Modelo_privilegios mp, Vista_Privilegios vp) {
        this.mp = mp;
        this.vp = vp;
        vp.setTitle("Privilegios");
        vp.setVisible(true);
        Modelo_Rol r = new Modelo_Rol();
        DefaultComboBoxModel combo = new DefaultComboBoxModel(r.mostrarRoles());
        vp.getCombo_box().addItem("<Seleccionar>");
        vp.getCombo_box().setModel(combo);

    }

    public void iniciarControl() {

        vp.getBtn_Agregar().addActionListener(l -> agregarPrivilegios());
        vp.getB_MODIFICAR().addActionListener(l -> modificarPrivilegio());
        vp.getBtn_eliminar().addActionListener(l -> eliminarPrivilegio());

    }

    public void agregarPrivilegios() {
        int c = 0;
        if (vp.getRad_socio().isSelected()) {
            mp.setCod_opcion(1);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(1);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (vp.getRad_trans().isSelected()) {
            mp.setCod_opcion(2);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(2);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (vp.getRad_reunion().isSelected()) {
            mp.setCod_opcion(3);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(3);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (vp.getRad_multa().isSelected()) {
            mp.setCod_opcion(4);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(4);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (vp.getRad_usuario().isSelected()) {
            mp.setCod_opcion(5);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(5);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (vp.getRad_rol().isSelected()) {
            mp.setCod_opcion(6);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
            c = c + 1;
        } else {
            mp.setCod_opcion(6);
            mp.setEstado_rol("FALSE");
            mp.grabarPrivilegios();
            c = c + 1;
        }
        if (c == 6) {
            JOptionPane.showMessageDialog(vp, "Guardado correctamente");
        }

    }

    public void modificarPrivilegio() {

        if (vp.getRad_socio().isSelected()) {
            mp.setCod_opcion(1);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(1);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
        if (vp.getRad_trans().isSelected()) {
            mp.setCod_opcion(2);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(2);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
        if (vp.getRad_reunion().isSelected()) {
            mp.setCod_opcion(3);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(3);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
        if (vp.getRad_multa().isSelected()) {
            mp.setCod_opcion(4);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(4);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
        if (vp.getRad_usuario().isSelected()) {
            mp.setCod_opcion(5);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(5);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
        if (vp.getRad_rol().isSelected()) {
            mp.setCod_opcion(6);
            mp.setEstado_rol("TRUE");
            mp.grabarPrivilegios();
        } else {
            mp.setCod_opcion(6);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }

    }

    public void eliminarPrivilegio() {
        mp.setCod_relacion(Integer.parseInt(vp.getTxtCodigo().getText()));
        if (mp.EliminarPrivilegios()) {
            JOptionPane.showMessageDialog(vp, "Eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(vp, "Error");
        }

    }

    private void initComboMouseListener() {
        vp.getCombo_box().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(" ################ mouseClicked");
                // selectedItem = comboBox.getSelectedItem();
                //  resetFilterComponent();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println(" ################ mouseEntered");
                //   selectedItem = comboBox.getSelectedItem();
                // resetFilterComponent();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

}
