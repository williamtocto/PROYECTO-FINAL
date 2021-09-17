

package modelo;


public class Asistencia {
   
    private int cod_asistencia;
    private int cod_socio;
    private int cod_reunion;
    private String estado;

    public Asistencia(int cod_asistencia, int cod_socio, int cod_reunion, String estado) {
        this.cod_asistencia = cod_asistencia;
        this.cod_socio = cod_socio;
        this.cod_reunion = cod_reunion;
        this.estado = estado;
    }

    public Asistencia() {
       
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
