package modelo;

/**
 *
 * @author Mateo
 */
public class Transaccion {
    private int cod_transaccion;
    private String tipo_transaccion;
    private int codigo_socio;
    private String fecha_trans;
    private double monto;
    private double saldo;
    
    
    //METODO CONSTRUCTOR
    public Transaccion(int cod_transaccion, String tipo_transaccion, int codigo_socio, String fecha_trans, double monto, double saldo) {
        this.cod_transaccion = cod_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.codigo_socio = codigo_socio;
        this.fecha_trans = fecha_trans;
        this.monto = monto;
        this.saldo = saldo;
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
