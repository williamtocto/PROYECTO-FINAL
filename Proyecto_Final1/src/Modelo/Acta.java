
package Modelo;


public class Acta {
    private  int num_acta,cod_reunion;
    private String estado_acta,orden_dia,desarrollo,fecha;
    public Acta (){
        
    }
    public Acta(int num_acta, int cod_reunion, String estado_acta, String orden_dia, String desarrollo, String fecha) {
        this.num_acta = num_acta;
        this.cod_reunion = cod_reunion;
        this.estado_acta = estado_acta;
        this.orden_dia = orden_dia;
        this.desarrollo = desarrollo;
        this.fecha = fecha;
    }

    public int getNum_acta() {
        return num_acta;
    }

    public void setNum_acta(int num_acta) {
        this.num_acta = num_acta;
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

    public String getOrden_dia() {
        return orden_dia;
    }

    public void setOrden_dia(String orden_dia) {
        this.orden_dia = orden_dia;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
