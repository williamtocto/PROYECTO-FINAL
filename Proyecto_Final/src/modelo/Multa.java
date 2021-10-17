

package modelo;

public class Multa {
    String cedula;
    String nombre;
    String estado;
    String fecha_multa;
    String fecha_pago;
    private int codigo_multa;
    private int codigo_asistencia;
    private String estado_multa;
    

    public Multa(String cedula, String nombre, String estado, String fecha_multa, String fecha_pago, int codigo_multa, int codigo_asistencia, String estado_multa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_multa = fecha_multa;
        this.fecha_pago = fecha_pago;
        this.codigo_multa = codigo_multa;
        this.codigo_asistencia = codigo_asistencia;
        this.estado_multa = estado_multa;
    }

    public Multa() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_multa() {
        return fecha_multa;
    }

    public void setFecha_multa(String fecha_multa) {
        this.fecha_multa = fecha_multa;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
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
    
