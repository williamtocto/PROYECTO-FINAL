package Modelo;

public class Multa {

    private int codigo_multa;
    private int codigo_asistencia;
    private String estado_multa;

    public Multa(int codigo_multa, int codigo_asistencia, String estado_multa) {
        this.codigo_multa = codigo_multa;
        this.codigo_asistencia = codigo_asistencia;
        this.estado_multa = estado_multa;
    }

    public Multa() {

    }

    public int getCodigo_multa() {
        return codigo_multa;
    }

    public void setCodigo_multa(int codigo_multa) {
        this.codigo_multa = codigo_multa;
    }

    public int getCodigo_asistencia() {
        return codigo_asistencia;
    }

    public void setCodigo_asistencia(int codigo_asistencia) {
        this.codigo_asistencia = codigo_asistencia;
    }

    public String getEstado_multa() {
        return estado_multa;
    }

    public void setEstado_multa(String estado_multa) {
        this.estado_multa = estado_multa;
    }

}
