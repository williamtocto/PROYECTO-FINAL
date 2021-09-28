package controlador;
import modelo.Modelo_Usuario;
import modelo.Usuario;

import vista.Vista_Usuario;

public class Control_user {
    
   

    private Modelo_Usuario modelo;
    private Vista_Usuario vu;
    private Usuario user;
   
    int codigo_socio,codigo_rol,usuario;
    String nuevo_usuario, password;
    
    Modelo_Usuario login = new Modelo_Usuario();

    public Control_user(Modelo_Usuario modelo, Vista_Usuario vista) {
        this.modelo = modelo;
        this.vu = vista;
        vista.setTitle("LOGIN");
        vista.setVisible(true);

    }

    public void iniciaControl() {
        vu.getBtn_agregar().addActionListener(l-> grabarUsuario());
        
    
    }

    public void grabarUsuario() {
        //codigo_rol=
        

    }
    
    
    public void DatosVariables() {
        
    
    }

}