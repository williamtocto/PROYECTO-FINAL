/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_Socio;
import modelo.Socio;
import vista.Vista_Socio;

/**
 *
 * @author TUF Gaming
 */
public class Control_Socio {

    private Modelo_Socio modelo;
    private Vista_Socio vista;

    public Control_Socio(Modelo_Socio modelo, Vista_Socio vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
    }

    public Control_Socio() {

    }

    public void IniciarContro() {

        vista.getBtnRegistrar().addActionListener(l -> crearSocio());
    }

    private void crearSocio() {

        String cod_socio = vista.getTxtCodigo().getText();
        String ced_socio = vista.getTxtCedula().getText();
        String num_cuenta = vista.getTxtNumCuenta().getText();
        String nombre = vista.getTxtNombre().getText();
        String apellido = vista.getTxtApellido().getText();
        String correo = vista.getTxtEmail().getText();
        String dir = vista.getTxtDireccion().getText();
        String telf = vista.getTxtTelefono().getText();

        Date fecha = null;
        String formato = null;
        String formato2 = null;
        // Tranformar la fecha a String
        if (vista.getJdFechaNac().getDate() != null) {
            fecha = vista.getJdFechaNac().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(fecha);
        } else {
            fecha = vista.getJdFechaIng().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato2 = sdf.format(fecha);
        }

        Modelo_Socio socio = new Modelo_Socio();

        socio.setCodigo_socio(Integer.valueOf(cod_socio));
        socio.setCedula_socio(ced_socio);
        socio.setNumero_cuenta(Integer.valueOf(num_cuenta));
        socio.setNombre_socio(nombre);
        socio.setApellido_socio(apellido);
        socio.setCorreo_socio(correo);
        socio.setDireccion_socio(cod_socio);
        socio.setTelefono_socio(telf);
        socio.setFecha_nac_socio(formato);
        socio.setFecha_ingreso(formato2);

//        if (socio.CrearSocio()) {
//            JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE ");
//            
//        } else {
//            JOptionPane.showMessageDialog(vista,"ERROR" );
//        }
    }
 private void cargarDatosbusqueda(String aguja) {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtDatosSocio().getModel();
        dtm.setNumRows(0);
        List<Socio> lista = modelo.socios(aguja);
        lista.stream().forEach(s -> {
            String[] socio = {Integer.toString(s.getCodigo_socio()), s.getCedula_socio(), 
                s.getNombre_socio(), s.getApellido_socio(),s.getCorreo_socio(),s.getDireccion_socio(),
                s.getTelefono_socio(),s.getFecha_nac_socio(), s.getFecha_ingreso()
            };
            dtm.addRow(socio);
        });

    }
    private String calcularEdad(Date fecha_nac) {
        String convertirFecha = fecha_nac.toString();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(convertirFecha, formatoFecha);
        LocalDate fechaActual = LocalDate.now();

        Period fecha = Period.between(fechaNacimiento, fechaActual);
        return String.valueOf(fecha.getYears());
    }

//    public int ValidarFechaNac() throws ParseException {
//           Date fechaDispositivo = new Date();
//        int f = 0;
//        Date fecha = null;
//        String fechaNac = null;
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String fechaActual = sdf.format(fechaDispositivo);
//        // Tranformar la fecha a String
//        if (vista.getJdFechaNac().getDate() != null) {
//            fecha = vista.getJdFechaNac().getDate();
//            fechaNac = sdf.format(fecha);
//            // PARSE PARA COMPARAR LAS FECHAS
//            fechaDispositivo = sdf.parse(fechaActual);
//            fecha = sdf.parse(fechaNac);
//            f = fechaDispositivo.compareTo(fecha);
//        }
//        return f;
//    }
    
//    
}
