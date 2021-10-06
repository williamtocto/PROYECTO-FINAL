package controlador;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JInternalFrame;
import modelo.Modelo_Acta;
import modelo.Modelo_Reunion;
import modelo.Modelo_Rol;
import modelo.Modelo_Socio;
import modelo.Modelo_Usuario;
import modelo.Modelo_privilegios;
import modelo.Modelo_transaccion;
import vista.Vista_Acta;
import vista.Vista_Principal;
import vista.Vista_Privilegios;
import vista.Vista_Reunion;
import vista.Vista_Rol;
import vista.Vista_Socio;
import vista.Vista_Usuario;
import vista.Vista_transaccion;

public class Control_VistaPrincipal {

    private Vista_Principal vista;

    public Control_VistaPrincipal(Vista_Principal vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setExtendedState(MAXIMIZED_BOTH);

    }

    public void incioControl() {

        // LOS DIFERENTES BOTONES DE LA VENTANA PRINCIPAL 
        vista.getMenu_MantenimientoUser().addActionListener(l -> Usuario());
        vista.getMenuRol().addActionListener(l -> IniciarVentanaRol());
        vista.getSubmenu_socio().addActionListener(l -> IniciarVentanaSocio());
        vista.getMenu_privilegios().addActionListener(l -> IniciarVentanaPrivilegios());
        vista.getSubmenuTransaccion().addActionListener(l -> InicarVentanaTransaccion());
        vista.getSubmenu_reunion().addActionListener(l -> IniciarVentanaReunion());
        vista.getMenuActas().addActionListener(l -> iniciarVentanaActa());
    }

    public void Usuario() {
        System.out.println("hola");
        Modelo_Usuario mu = new Modelo_Usuario();
        Vista_Usuario vu = new Vista_Usuario();
        vista.getDesk_Principal().add(vu);
        Control_user c = new Control_user(mu, vu);
        c.iniciaControl();
    }

    public void iniciarVentanaActa() {
        Modelo_Acta mr = new Modelo_Acta();
        Vista_Acta va = new Vista_Acta();
        Centrar(va);
        Control_Acta ca = new Control_Acta(mr, va);
        ca.inciarControl();
    }

    public void IniciarVentanaRol() {
        Modelo_Rol mr = new Modelo_Rol();
        Vista_Rol vr = new Vista_Rol();
        Centrar(vr);
        Control_Rol cr = new Control_Rol(mr, vr);
        cr.iniciaControl();
    }

    public void Centrar(JInternalFrame frame) {
        int x = (vista.getDesk_Principal().getWidth() / 2 - frame.getWidth() / 2);
        int y = (vista.getDesk_Principal().getHeight() / 2 - frame.getHeight() / 2);
        if (frame.isShowing()) {
            frame.setLocation(x, y);
        } else {
            vista.getDesk_Principal().add(frame);
            frame.setLocation(x, y);
        }

    }

    public void IniciarVentanaSocio() {
        Modelo_Socio modelo_socio = new Modelo_Socio();
        Vista_Socio vista_socio = new Vista_Socio();
        Centrar(vista_socio);
        Control_Socio cs = new Control_Socio(modelo_socio, vista_socio);
        cs.IniciarContro();
    }

    public void InicarVentanaTransaccion() {
        Modelo_transaccion mt = new Modelo_transaccion();
        Vista_transaccion vt = new Vista_transaccion();
        Centrar(vt);
        Control_transaccion ct = new Control_transaccion(mt, vt);
        ct.inicarControl();
    }

    public void IniciarVentanaReunion() {
        Modelo_Reunion mr = new Modelo_Reunion();
        Vista_Reunion vr = new Vista_Reunion();
        Centrar(vr);
        Control_Reunion cr = new Control_Reunion(mr, vr);
        cr.iniciaControl();
    }

    public void IniciarVentanaPrivilegios() {
        Modelo_privilegios modelo_privilegios = new Modelo_privilegios();
        Vista_Privilegios vista_privilegios = new Vista_Privilegios();
        vista.getDesk_Principal().add(vista_privilegios);
        Control_Privilegios cp = new Control_Privilegios(modelo_privilegios, vista_privilegios);
        cp.iniciarControl();
    }
}
