package Modelo;


public class Reunion {
    private int codigo_reunion;
    private String fecha_reunion;
    private String duracion_reunion;
    private String topico_reunion;
    
    //METODO CONSTRUCTOR
    public Reunion(int codigo_reunion, String fecha_reunion, String duracion_reunion, String topico_reunion) {
        this.codigo_reunion = codigo_reunion;
        this.fecha_reunion = fecha_reunion;
        this.duracion_reunion = duracion_reunion;
        this.topico_reunion = topico_reunion;
    }

    public Reunion() {
    }
    
    
    
    public int getCodigo_reunion() {
        return codigo_reunion;
    }

    public void setCodigo_reunion(int codigo_reunion) {
        this.codigo_reunion = codigo_reunion;
    }

    public String getFecha_reunion() {
        return fecha_reunion;
    }

    public void setFecha_reunion(String fecha_reunion) {
        this.fecha_reunion = fecha_reunion;
    }

    public String getDuracion_reunion() {
        return duracion_reunion;
    }

    public void setDuracion_reunion(String duracion_reunion) {
        this.duracion_reunion = duracion_reunion;
    }

    public String getTopico_reunion() {
        return topico_reunion;
    }

    public void setTopico_reunion(String topico_reunion) {
        this.topico_reunion = topico_reunion;
    }
    
    
}
