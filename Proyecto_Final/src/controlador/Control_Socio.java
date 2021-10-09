/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionPG;
import modelo.Modelo_Socio;
import modelo.Socio;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.Vista_Socio;

/**
 *
 * @author TUF Gaming
 */
public class Control_Socio {

    private Modelo_Socio modelo;
    private Vista_Socio vista;
    int fila,n;

    public Control_Socio(Modelo_Socio modelo, Vista_Socio vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
        cargarDatos();
    }

    public Control_Socio() {

    }

    public void IniciarContro() {
        KeyListener buscador = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                cargarDatosbusqueda(vista.getTxtBuscar().getText());
            }
        };

        vista.getBtnRegistrar().addActionListener(l -> crearSocio());
        vista.getTxtBuscar().addKeyListener(buscador);
        vista.getBtnRegistrar().addActionListener(l-> mostrarDialogo(1));
        vista.getBtnModificar().addActionListener(l-> mostrarDialogo(2));
        vista.getBtnInactivar().addActionListener(l->inactivarSocio());
        vista.getBtnAceptar().addActionListener(l ->  {

            try {
                DefinirMetodo(n);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Socio.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        vista.getBtnCancelar().addActionListener(l->cancelar());
        vista.getBtnLimpiar().addActionListener(l->limpiar());
        vista.getBtnImprimir().addActionListener(l->imprimirReporte());
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

        if (socio.CrearSocio()) {
            JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE");
            
        } else {
            JOptionPane.showMessageDialog(vista,"ERROR" );
        }
    }

    private void cargarDatos() {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtDatosSocio().getModel();
        dtm.setNumRows(0);
        List<Socio> lista = modelo.socios();
        lista.stream().forEach(s -> {
            String[] socio = {Integer.toString(s.getCodigo_socio()), s.getCedula_socio(),
                s.getNombre_socio(), s.getApellido_socio(), s.getCorreo_socio(), s.getDireccion_socio(),
                s.getTelefono_socio(), s.getFecha_nac_socio(), s.getFecha_ingreso()};
            dtm.addRow(socio);
        });

    }

    private void cargarDatosbusqueda(String aguja) {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtDatosSocio().getModel();
        dtm.setNumRows(0);
        List<Socio> lista = modelo.socios(aguja);
        lista.stream().forEach(s -> {
            String[] socio = {Integer.toString(s.getCodigo_socio()), s.getCedula_socio(),
                s.getNombre_socio(), s.getApellido_socio(), s.getCorreo_socio(), s.getDireccion_socio(),
                s.getTelefono_socio(),s.getFecha_nac_socio(), s.getFecha_ingreso()
            };
            dtm.addRow(socio);
        });

    }

    
     private void editarSocio() {

        String cod_socio = vista.getTxtCodigo().getText();
        String ced_socio = vista.getTxtCedula().getText();
        String num_cuenta = vista.getTxtNumCuenta().getText();
        String nombre = vista.getTxtNombre().getText();
        String apellido = vista.getTxtApellido().getText();
        String correo = vista.getTxtEmail().getText();
        String dir = vista.getTxtDireccion().getText();
        String telf = vista.getTxtTelefono().getText();

        Date fecha ;
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
        socio.setDireccion_socio(dir);
        socio.setTelefono_socio(telf);
        socio.setFecha_nac_socio(formato);
        socio.setFecha_ingreso(formato2);

        if (socio.editar_socio(cod_socio)) {
            JOptionPane.showMessageDialog(vista, "SE HA MODIFICADO CORRECTAMENTE");
            
        } else {
            JOptionPane.showMessageDialog(vista,"ERROR" );
        }
    }

  

    private String calcularEdad(Date fecha_nac) {
        String convertirFecha = fecha_nac.toString();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(convertirFecha, formatoFecha);
        LocalDate fechaActual = LocalDate.now();

        Period fecha = Period.between(fechaNacimiento, fechaActual);
        return String.valueOf(fecha.getYears());
    }
    
    java.util.Date fomato_fecha_nac(String fecha) throws ParseException {
        try {
            DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sourceFormat.parse(fecha);
            return date;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error de formato en la fecha", "Error Parseo", 0);
        }
        return null;
    }
     java.util.Date fomato_fecha_ingreso(String fecha) throws ParseException {
        try {
            DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sourceFormat.parse(fecha);
            return date;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error de formato en la fecha", "Error Parseo", 0);
        }
        return null;
    }
    
     //Método para imprimir reportes con JasperStudio

    private void imprimirReporte(){   
        ConexionPG con= new ConexionPG();
        try {
            JasperReport jr=(JasperReport) JRLoader.loadObject(getClass().getResource("/vista/reportes/Reporte_Socios.jasper"));
            //Aquí se lee el parámetro segun el que ingresemos para poder imprimirlo en el Jasper
            Map<String,Object> parametro= new HashMap<String,Object>();
            String miaguja=vista.getTxtBuscar().getText();
            parametro.put("aguja", "%"+miaguja+"%");
//            parametro.put("titulo", "REPORTE DE PERSONAL REGISTRADO");
            
            JasperPrint jp =JasperFillManager.fillReport(jr, parametro,con.getCon());
            JasperViewer jv=new JasperViewer(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_Socio.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    //Método para limpiar campos
    
    private void limpiar() {
       vista.getTxtCodigo().setText("");
       vista.getTxtCedula().setText("");
       vista.getTxtNombre().setText("");
       vista.getTxtApellido().setText("");
       vista.getTxtDireccion().setText("");
       vista.getTxtTelefono().setText("");
       vista.getTxtEmail().setText("");
       vista.getJdFechaNac().setDate(null);
       vista.getJdFechaIng().setDate(null);
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
    
     public void DefinirMetodo(int n) throws SQLException  {

        if (n == 1) {
            fila = vista.getJtDatosSocio().getSelectedRow();
            crearSocio();
        } else if (n == 2) {
            fila = vista.getJtDatosSocio().getSelectedRow();
            editarSocio();
        }
    }
    
    private void mostrarDialogo(int origen) {
        vista.getJDialogo().setSize(745, 520);
        vista.getJDialogo().setLocationRelativeTo(vista);
        fila = vista.getJtDatosSocio().getSelectedRow();
        if (origen == 1) {
            n = 1;
            vista.getJDialogo().setTitle("Crear Socio");
        } else {
            n = 2;
            cargarDatos();

            vista.getJDialogo().setTitle("Editar Socio");
        }
        vista.getJDialogo().setVisible(true);

    }
     public void cancelar() {
        vista.getJDialogo().dispose();

    }
    public void inactivarSocio(){
         Modelo_Socio modelo=new Modelo_Socio();
           int op = JOptionPane.showOptionDialog(null,
                    "¿Está seguro que desea inactivar al socio seleccionado?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
            if (op == 0) {
                try {
                    String codigo=vista.getTxtCodigo().getText() ;
                    modelo.inactivar_socio(codigo);
                    cargarDatos();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL INACTIVAR", "TEOLAMDY", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACCION CANCELADA", "TEOLAMDY", 1);
            }
 
    }
//    
}
