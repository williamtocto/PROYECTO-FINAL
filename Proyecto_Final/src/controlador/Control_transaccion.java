package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo_transaccion;
import vista.Vista_transaccion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ConexionPG;
import modelo.Transaccion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Control_transaccion {

    private Modelo_transaccion modelot;
    private Vista_transaccion vistat;

    Modelo_transaccion transac = new Modelo_transaccion();

    public Control_transaccion(Modelo_transaccion transac, Vista_transaccion vista) {
        this.modelot = transac;
        this.vistat = vista;
        vista.setTitle("Transacciones");
        vista.setVisible(true);
        cargarlista("");
        vistat.getBtnAceptar().setEnabled(false);
    }

    //Metodo para habilitar los botones cuando le de clic a un dato de la tabla
    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = vistat.getjTabla_tran().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vistat.getjTabla_tran().getRowHeight();
        if (row < vistat.getjTabla_tran().getRowCount() && row >= 0 && column < vistat.getjTabla_tran().getColumnCount() && column >= 0) {
            vistat.getBtnAceptar().setEnabled(true);
        } else {
            String name = "" + vistat.getjTabla_tran().getValueAt(row, 1);
        }

    }
    public void inicarControl() {
        KeyListener kl = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vistat.getTxtCedula_soc() || e.getSource() == vistat.getTxtValor_cuenta() || e.getSource() == vistat.getTxtDeposito()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    if (((caracter < '0')
                            || (caracter > '9'))
                            && (caracter != '\b')) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Ingrese por favor solo numeros en este campo", "ERROR", 0);// ignorar el evento de teclado
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        };
        vistat.getTxtCedula_soc().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        vistat.getBtnAceptar().addActionListener(l -> Registrar());
        vistat.getBtnBuscar().addActionListener(l -> busquedaSocio(vistat.getTxtCedula_soc().getText()));
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vistat.getTxtCedula_soc().addKeyListener(kl);
        vistat.getTxtValor_cuenta().addKeyListener(kl);
        vistat.getTxtDeposito().addKeyListener(kl);
        /*vistat.getjTabla_tran().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });*/
    }
    
    public void enter(java.awt.event.KeyEvent evt) {
        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            busquedaSocio(vistat.getTxtCedula_soc().getText());
        }

    }

    public void cargarlista(String aguja) {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vistat.getjTabla_tran().getModel();
        tblModel.setNumRows(0);
        List<Transaccion> lista = transac.listaTransaccion(aguja);
        lista.stream().forEach(r -> {
            String[] tra1 = {String.valueOf(r.getCod_transaccion()), String.valueOf(r.getCodigo_socio()),
                String.valueOf(r.getMonto()), String.valueOf(r.getSaldo()), r.getTipo_transaccion(), r.getFecha_trans()};
            tblModel.addRow(tra1);
        });
    }

    public void busquedaSocio(String cedula) {
        List<Transaccion> lista = new ArrayList<>();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vistat.getjTabla_tran().getModel();
        tblModel.setNumRows(0);
        lista = modelot.listaTransaccion(cedula);
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontro resultados", "", 1);
        } else {
            lista.stream().forEach(l -> {
                vistat.getTxtNombre().setText(l.getNombre());
                vistat.getTxtApellido().setText(l.getApellido());
                vistat.getTxtTelefono().setText(l.getTelefono());
                vistat.getTxtDireccion().setText(l.getDireccion());
                vistat.getTxtNumero_cu().setText(String.valueOf(l.getNumero_cuenta()));
                vistat.getTxtCodigo_socio().setText(String.valueOf(l.getCodigo_socio()));

                String[] transacion = {String.valueOf(l.getFecha_trans()), l.getTipo_transaccion(),
                    String.valueOf(l.getMonto()), String.valueOf(l.getSaldo())};
                tblModel.addRow(transacion);
            });
            cantidadCuenta();
        }
    }

    public double cantidadCuenta() {
        String codigo_socio = vistat.getTxtCodigo_socio().getText();
        modelot.setCodigo_socio(Integer.parseInt(codigo_socio));
        vistat.getTxtValor_cuenta().setText(String.valueOf(modelot.CatidadCuenta()));
        return modelot.CatidadCuenta();
    }

    public void Registrar() {
        String codigo_socio = vistat.getTxtCodigo_socio().getText();
        double valor_cuenta = cantidadCuenta();
        double monto = Double.valueOf(vistat.getTxtDeposito().getText());
        double saldo = 0;
        modelot.setMonto(monto);
        modelot.setFecha_trans(fecha());
        modelot.setCodigo_socio(Integer.parseInt(codigo_socio));

        if (vistat.getRbRetiro().isSelected()) {
            modelot.setTipo_transaccion("Retiro");
            if (valor_cuenta < monto) {
                JOptionPane.showMessageDialog(null, "NO cuenta con fondos suficientes", "", 0);
            } else {
                saldo = valor_cuenta - monto;
                modelot.setSaldo(saldo);
                if (modelot.AgregarTransaccion()) {
                    busquedaSocio(vistat.getTxtCedula_soc().getText());
                    JOptionPane.showMessageDialog(null, "Accion realizada con exito", "", 1);
                }
            }
            limpiar();
        }
        if (vistat.getRbDeposito().isSelected()) {
            modelot.setTipo_transaccion("Deposito");
            saldo = valor_cuenta + monto;
            modelot.setSaldo(saldo);
            if (modelot.AgregarTransaccion()) {
                JOptionPane.showMessageDialog(null, "Accion realizada con exito", "", 1);
                busquedaSocio(vistat.getTxtCedula_soc().getText());
            }
            limpiar();
        }
    }

    public void limpiar() {
        vistat.getTxtDeposito().setText("");
        vistat.getGrupo_tipo().clearSelection();
    }

    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fecha1 = sdf.format(fecha);
        return fecha1;
    }

    private void imprimirTansaccion() {
        ConexionPG con = new ConexionPG();
        try {
            JasperReport reporte = null;
            String path = "C:\\Users\\Mateo\\Documents\\NetBeansProjects\\PROYECTO-FINAL\\Proyecto_Final\\src\\vista\\reportes\\historial_transaccion.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map<String, Object> params = new HashMap<String, Object>();
            /*String miaguja=vista.getTxtBuscar().getText();
            params.put("aguja", "%"+miaguja+"%");//PARAMETROS PARA REPORTES
            params.put("titulo", "LISTADO DE PERSONAS INSCRITAS POR REVIZAR");
            params.put("footer", "Super Mercado Santa Cecilia, Ave Huaynacapac");*/
            //SUPER MERCADOS S.A. Ave. Americas

            JasperPrint jp = JasperFillManager.fillReport(reporte, params, con.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Control_transaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
