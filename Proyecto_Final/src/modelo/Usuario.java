package modelo;

public class Usuario {

    private String cedula;
    private String rol;
    private String usuario;
    private String contrasenia;
    private int codigo_usuario;
    private int codigo_socio;
    private int codig_rol;
    private String nombre;


    
    public Usuario() {
    }

    public Usuario(String cedula, String rol, String usuario, String contrasenia, int codigo_usuario, int codigo_socio, int codig_rol, String nombre) {
        this.cedula = cedula;
        this.rol = rol;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.codigo_usuario = codigo_usuario;
        this.codigo_socio = codigo_socio;
        this.codig_rol = codig_rol;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usario) {
        this.codigo_usuario = codigo_usario;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
