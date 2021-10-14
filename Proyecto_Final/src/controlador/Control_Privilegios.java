package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Modelo_Rol;
import modelo.Modelo_privilegios;
import modelo.Privilegios;
import vista.Vista_Privilegios;
public class Control_Privilegios {

    private Modelo_privilegios mp;
    private Vista_Privilegios vp;
    Modelo_Rol r = new Modelo_Rol();

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
        vp.getCombo_box().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {

                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    String rol;
                    rol = vp.getCombo_box().getSelectedItem().toString();
                    System.out.println(rol);
                    r.setTipo_rol(rol);
                    mp.setCod_rol(r.CodigoRol());
                }

            }
        });
        vp.getBtn_Agregar().addActionListener(l -> {
            try {
                agregarPrivilegios();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Privilegios.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vp.getB_MODIFICAR().addActionListener(l -> modificarPrivilegio());
        vp.getBtn_eliminar().addActionListener(l -> {
            try {
                eliminarPrivilegio();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Privilegios.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void agregarPrivilegios() throws SQLException {
        List<Privilegios> lp = new ArrayList<>();
        lp = mp.CargarLista();
        if (lp.isEmpty()) {
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
            //MULTAS
            /*
            if (vp.getRad_multa().isSelected()) {
                mp.setCod_opcion(4);
                mp.setEstado_rol("TRUE");
                mp.grabarPrivilegios();
                c = c + 1;          
            }  

            else {
                mp.setCod_opcion(4);
                mp.setEstado_rol("FALSE");
                mp.grabarPrivilegios();
                c = c + 1;
            }
            */
            
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
                if (mp.grabarPrivilegios()) {
                    JOptionPane.showMessageDialog(null, "Guardado Correctamente", "", 1);
                }
                mp.grabarPrivilegios();
                c = c + 1;
            } else {
                mp.setCod_opcion(6);
                mp.setEstado_rol("FALSE");
                if (mp.grabarPrivilegios()) {
                    JOptionPane.showMessageDialog(null, "Guardado Correctamente", "", 1);
                }
                c = c + 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este Rol ya esta registro", "", 0);
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
        /*
        if (vp.getRad_multa().isSelected()) {
            mp.setCod_opcion(4);
            mp.setEstado_rol("TRUE");
            mp.modificarPrivilegios();
        } else {
            mp.setCod_opcion(4);
            mp.setEstado_rol("FALSE");
            mp.modificarPrivilegios();
        }
*/
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
            if (mp.modificarPrivilegios()) {
                JOptionPane.showMessageDialog(null, "Modificado Correctamente", "", 1);
            }
        } else {
            mp.setCod_opcion(6);
            mp.setEstado_rol("FALSE");
            if (mp.modificarPrivilegios()) {
                JOptionPane.showMessageDialog(null, "Modificado Correctamente", "", 1);
            }
        }
    }

    public void limpiar() {
        
    }

    public void eliminarPrivilegio() throws SQLException {

        List<Privilegios> lp = new ArrayList<>();
        lp = mp.CargarLista();
        if (lp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar este rol");
        } else {
            int op = JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR "
                    + "LOS PRIVILEGIOS DE ESTE ROL", "CONFIRME", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                if (mp.EliminarPrivilegios()) {
                    JOptionPane.showMessageDialog(vp, "Eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(vp, "Error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA");
            }
        }
    }

    
}
