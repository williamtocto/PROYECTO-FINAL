package modelo;

public class Rol {

    private int codigo_rol;
    private String tipo_rol;

    //metodo constructor
    public Rol(int codigo_rol, String tipo_rol) {
        this.codigo_rol = codigo_rol;
        this.tipo_rol = tipo_rol;
    }

    public Rol() {
    }

    //getters
    public int getCodigo_rol() {
        return codigo_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }
    //setters

    public void setCodigo_rol(int codigo_rol) {
        this.codigo_rol = codigo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String toString() {
        return this.tipo_rol;
    }

   

}
