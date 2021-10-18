package controlador;

import vista.Vista_Login;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Modelo_Login;
import modelo.Modelo_privilegios;
import modelo.Privilegios;
import vista.Vista_Principal;

public class Control_Login {

    private Modelo_Login modelo;
    private Vista_Login vista;

    Modelo_privilegios ml = new Modelo_privilegios();

    int codigo;

    public Control_Login(Modelo_Login modelo, Vista_Login vista) throws SQLException {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Inicio");
        vista.setVisible(true);
    }

    public void validarUsuario() throws SQLException {

        String usuario = vista.getTxtUsuari().getText();
        String clave = vista.getTxt_Password().getText();
        modelo.setUsuario(usuario);
        modelo.setContrasenia(clave);
        codigo = modelo.ValidarUsuario();
        if (codigo != 0) {
            inicioVentanaPrincipal();
            this.vista.dispose();
        }
    }

    public void IniciaControl() {
        vista.getbtnIngresar().addActionListener(l -> {
            try {
                validarUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        vista.getTxtUsuari().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuariKeyPressed(evt);
            }
        });

        vista.getTxt_Password().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ingresar(evt);
            }
        });

    }

    private void TxtUsuariKeyPressed(java.awt.event.KeyEvent evt) {
        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            vista.getTxt_Password().requestFocus();
        }
    }

    private void ingresar(java.awt.event.KeyEvent evt) {
        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            try {
                validarUsuario();
            } catch (SQLException ex) {
                Logger.getLogger(Control_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void inicioVentanaPrincipal() throws SQLException {

        int id_opcion = 0;
        boolean estado = false;
        ml.setCod_rol(codigo);
        List<Privilegios> lista = ml.CargarLista();
        Vista_Principal vp = new Vista_Principal();
        for (int i = 0; i < lista.size(); i++) {
            id_opcion = lista.get(i).getCod_opcion();
            estado = Boolean.valueOf(lista.get(i).getEstado_rol());
            System.out.println(id_opcion + "   " + estado);

            switch (id_opcion) {
                case 1 -> {
                    if (estado == true) {
                        vp.getMenu_socio().setEnabled(true);
                        vp.getBtn_asistencia().setEnabled(true);
                    } else {
                        vp.getMenu_socio().setEnabled(false);
                        vp.getBtn_asistencia().setEnabled(false);
                    }

                }
                case 2 -> {
                    if (estado == true) {
                        vp.getMenu_transaccion().setEnabled(true);
                        vp.getBtn_transacciones().setEnabled(true);
                    } else {
                        vp.getMenu_transaccion().setEnabled(false);
                        vp.getBtn_transacciones().setEnabled(false);
                    }
                }
                case 3 -> {
                    if (estado == true) {
                        vp.getMenu_reunion().setEnabled(true);
                        vp.getBtn_registrarReunion().setEnabled(true);
                        vp.getBtn_asistencia().setEnabled(true);
                        vp.getBtn_actas().setEnabled(true);
                    } else {
                        vp.getMenu_reunion().setEnabled(false);
                        vp.getBtn_registrarReunion().setEnabled(false);
                        vp.getBtn_asistencia().setEnabled(false);
                        vp.getBtn_actas().setEnabled(false);
                    }
                }
                case 4 -> {

                    if (estado == true) {
                        vp.getMenu_Multas().setEnabled(true);
                        vp.getBtn_multas().setEnabled(true);
                    } else {
                        vp.getMenu_Multas().setEnabled(false);
                        vp.getBtn_multas().setEnabled(false);
                    }
                }
                case 5 -> {
                    if (estado == true) {
                        vp.getMenu_usuario().setEnabled(true);
                    } else {
                        vp.getMenu_usuario().setEnabled(false);
                    }
                }
                case 6 -> {
                    if (estado == true) {
                        vp.getMenuPrincipal_rol().setEnabled(true);
                    } else {
                        vp.getMenuPrincipal_rol().setEnabled(false);
                    }
                }
                default -> {
                }
            }
        }
        Control_VistaPrincipal cp = new Control_VistaPrincipal(vp);
        cp.incioControl();
    }

}
