package modelo;

public class Acta {

    private int num_acta;
    private String fecha;
    private int cod_reunion;
    private String estado_acta;
    byte[] archivo_acta;

    public Acta() {
    }

    public Acta(int num_acta, String fecha, int cod_reunion, String estado_acta, byte[] archivo_acta) {
        this.num_acta = num_acta;
        this.fecha = fecha;
        this.cod_reunion = cod_reunion;
        this.estado_acta = estado_acta;
        this.archivo_acta = archivo_acta;
    }

    public int getNum_acta() {
        return num_acta;
    }

    public void setNum_acta(int num_acta) {
        this.num_acta = num_acta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCod_reunion() {
        return cod_reunion;
    }

    public void setCod_reunion(int cod_reunion) {
        this.cod_reunion = cod_reunion;
    }

    public String getEstado_acta() {
        return estado_acta;
    }

    public void setEstado_acta(String estado_acta) {
        this.estado_acta = estado_acta;
    }

    public byte[] getArchivo_acta() {
        return archivo_acta;
    }

    public void setArchivo_acta(byte[] archivo_acta) {
        this.archivo_acta = archivo_acta;
    }   
}
