package Modelo;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public int getEdad(String fechas) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fechas, formato);
        LocalDate actual = LocalDate.now();
        Period periodo = Period.between(fechaNac, actual);
        int edad = periodo.getYears();
        return edad;
    }
    //OBTENER FECHA

    public String getFecha(JDateChooser date) {

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        if (date.getDate() != null) {
            return formato.format(date.getDate());

        } else {

            return null;
        }

    }
    //VALIDAR CEDULA ECUATORIANA

    public boolean ValidaCed(String cedula) {

        boolean respuesta = false;
        boolean bandera = false;
        boolean regresar = false;

        regresar = false;
        bandera = false;
        respuesta = Cedula(cedula);

        if (respuesta == true) {

        } else if (respuesta == false) {

            regresar = true;
        }
        return regresar;
    }

    public boolean Cedula(String cedula) {

        int c, suma = 0, acumulador, resta = 0;

        for (int i = 0; i < cedula.length() - 1; i++) {
            c = Integer.parseInt(cedula.charAt(i) + "");
            if (i % 2 == 0) {
                c = c * 2;
                if (c > 9) {
                    c = c - 9;
                }
            }
            suma = suma + c;
        }

        if (suma % 10 != 0) {
            acumulador = ((suma / 10) + 1) * 10;
            resta = acumulador - suma;
        }
        int ultimo = Integer.parseInt(cedula.charAt(9) + "");

        if (ultimo == resta) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ValidaCorreo(String email) {
        Pattern pat = null;
        Matcher mat = null;
        // Patrón para validar el email
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        mat = pat.matcher(email);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }
}
