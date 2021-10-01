
package modelo;


public class Privilegios {
    
    private int cod_relacion;
    private int cod_rol;
    private int cod_opcion;
    private String estado_rol;

    public Privilegios(int cod_relacion, int cod_rol, int cod_opcion, String estado_rol) {
        this.cod_relacion = cod_relacion;
        this.cod_rol = cod_rol;
        this.cod_opcion = cod_opcion;
        this.estado_rol = estado_rol;
    }

    public int getCod_relacion() {
        return cod_relacion;
    }

    public void setCod_relacion(int cod_relacion) {
        this.cod_relacion = cod_relacion;
    }

    public int getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(int cod_rol) {
        this.cod_rol = cod_rol;
    }

    public int getCod_opcion() {
        return cod_opcion;
    }

    public void setCod_opcion(int cod_opcion) {
        this.cod_opcion = cod_opcion;
    }

    public String getEstado_rol() {
        return estado_rol;
    }

    public void setEstado_rol(String estado_rol) {
        this.estado_rol = estado_rol;
    }
  
}
