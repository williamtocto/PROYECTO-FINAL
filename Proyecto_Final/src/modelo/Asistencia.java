

package modelo;


public class Asistencia {
   
    private int cod_asistencia;
    private int cod_socio;
    private int cod_reunion;
    private int estado;
    private String nombre;
    private String apellido;
    private String cedula;

    public Asistencia() {
    }

    
    
    public Asistencia(int cod_asistencia, int cod_socio, int cod_reunion, int estado, String nombre, String apellido, String cedula) {
        this.cod_asistencia = cod_asistencia;
        this.cod_socio = cod_socio;
        this.cod_reunion = cod_reunion;
        this.estado = estado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public int getCod_asistencia() {
        return cod_asistencia;
    }

    public void setCod_asistencia(int cod_asistencia) {
        this.cod_asistencia = cod_asistencia;
    }

    public int getCod_socio() {
        return cod_socio;
    }

    public void setCod_socio(int cod_socio) {
        this.cod_socio = cod_socio;
    }

    public int getCod_reunion() {
        return cod_reunion;
    }

    public void setCod_reunion(int cod_reunion) {
        this.cod_reunion = cod_reunion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    

  
}
