package modelo;

public class Transaccion {
    private String nombre;
    private int numero_cuenta;
    private String apellido;
    private String telefono;
    private String direccion;
    private int codigo;
    private int cod_transaccion;
    private String tipo_transaccion;
    private int codigo_socio;
    private String fecha_trans;
    private double monto;
    private double saldo;

    public Transaccion(String nombre, int numero_cuenta, String apellido, String telefono, String direccion, int codigo, int cod_transaccion, String tipo_transaccion, int codigo_socio, String fecha_trans, double monto, double saldo) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigo = codigo;
        this.cod_transaccion = cod_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.codigo_socio = codigo_socio;
        this.fecha_trans = fecha_trans;
        this.monto = monto;
        this.saldo = saldo;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    //METODO CONSTRUCTOR
    public void setCodigo(int codigo) {   
        this.codigo = codigo;
    }

    //METODO CONSTRUCTOR VACIO
    public Transaccion() {
    }
    
    //METODOS GETTERS Y SETTERS
    
    public int getCod_transaccion() {
        return cod_transaccion;
    }

    public void setCod_transaccion(int cod_transaccion) {
        this.cod_transaccion = cod_transaccion;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public int getCodigo_socio() {
        return codigo_socio;
    }

    public void setCodigo_socio(int codigo_socio) {
        this.codigo_socio = codigo_socio;
    }

    public String getFecha_trans() {
        return fecha_trans;
    }

    public void setFecha_trans(String fecha_trans) {
        this.fecha_trans = fecha_trans;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
