package modelo;

public class Socio {

    private int codigo_socio;
    private String cedula_socio;
    private String nombre_socio;
    private String apellido_socio;
    private String correo_socio;
    private String fecha_nac_socio;
    private String telefono_socio;
    private String direccion_socio;
    private String fecha_ingreso;
    private int numero_cuenta;

    //METODO CONSTRUCTOR
    public Socio(int codigo_socio, String cedula_socio, String nombre_socio, String apellido_socio, String correo_socio, String fecha_nac_socio, String telefono_socio, String direccion_socio, String fecha_ingreso, int numero_cuenta) {
        this.codigo_socio = codigo_socio;
        this.cedula_socio = cedula_socio;
        this.nombre_socio = nombre_socio;
        this.apellido_socio = apellido_socio;
        this.correo_socio = correo_socio;
        this.fecha_nac_socio = fecha_nac_socio;
        this.telefono_socio = telefono_socio;
        this.direccion_socio = direccion_socio;
        this.fecha_ingreso = fecha_ingreso;
        this.numero_cuenta = numero_cuenta;
    }

    public Socio() {
    }

    public int getCodigo_socio() {
        return codigo_socio;
    }

    public void setCodigo_socio(int codigo_socio) {
        this.codigo_socio = codigo_socio;
    }

    public String getCedula_socio() {
        return cedula_socio;
    }

    public void setCedula_socio(String cedula_socio) {
        this.cedula_socio = cedula_socio;
    }

    public String getNombre_socio() {
        return nombre_socio;
    }

    public void setNombre_socio(String nombre_socio) {
        this.nombre_socio = nombre_socio;
    }

    public String getApellido_socio() {
        return apellido_socio;
    }

    public void setApellido_socio(String apellido_socio) {
        this.apellido_socio = apellido_socio;
    }

    public String getCorreo_socio() {
        return correo_socio;
    }

    public void setCorreo_socio(String correo_socio) {
        this.correo_socio = correo_socio;
    }

    public String getFecha_nac_socio() {
        return fecha_nac_socio;
    }

    public void setFecha_nac_socio(String fecha_nac_socio) {
        this.fecha_nac_socio = fecha_nac_socio;
    }

    public String getTelefono_socio() {
        return telefono_socio;
    }

    public void setTelefono_socio(String telefono_socio) {
        this.telefono_socio = telefono_socio;
    }

    public String getDireccion_socio() {
        return direccion_socio;
    }

    public void setDireccion_socio(String direccion_socio) {
        this.direccion_socio = direccion_socio;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

}
