package Modelo;

public class Usuario {

    private int codigo_usario;
    private int codigo_socio;
    private int codig_rol;
    private String usuario;
    private String contrasenia;

    public Usuario(int codigo_usario, int codigo_socio, int codig_rol, String usuario, String contraseña) {
        this.codigo_usario = codigo_usario;
        this.codigo_socio = codigo_socio;
        this.codig_rol = codig_rol;
        this.usuario = usuario;
        this.contrasenia = contraseña;
    }

    public Usuario() {
         //To change body of generated methods, choose Tools | Templates.
    }

   

    public int getCodigo_usuario() {
        return codigo_usario;
    }

    public void setCodigo_usuario(int codigo_usario) {
        this.codigo_usario = codigo_usario;
    }

    public int getCodigo_socio() {
        return codigo_socio;
    }

    public void setCodigo_socio(int codigo_socio) {
        this.codigo_socio = codigo_socio;
    }

    public int getCodig_rol() {
        return codig_rol;
    }

    public void setCodig_rol(int codig_rol) {
        this.codig_rol = codig_rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contraseña) {
        this.contrasenia = contraseña;
    }
}
