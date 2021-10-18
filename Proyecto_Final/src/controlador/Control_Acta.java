package controlador;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Acta;
import modelo.Modelo_Acta;
import modelo.Modelo_Reunion;
import modelo.imgTabla;
import vista.Vista_Acta;

public final class Control_Acta {
    
    int id = -1;
    int fila = -1, n;
    Modelo_Reunion mr = new Modelo_Reunion();
    private Modelo_Acta model;
    private final Vista_Acta vista;
    
    int codigo_reunion, num_acta;
    String ruta, fecha, estado_acta, archivoActa, nombre_pdf;
    
    public Control_Acta(Modelo_Acta model, Vista_Acta vista) {
        this.model = model;
        this.vista = vista;
        vista.setTitle("Actas");
        vista.setVisible(true);
        VisualizarTabla(vista.getTabla_acta(), "");
        desactivarBotones();
    }
    
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {
        int column = vista.getTabla_acta().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vista.getTabla_acta().getRowHeight();
        if (row < vista.getTabla_acta().getRowCount() && row >= 0 && column < vista.getTabla_acta().getColumnCount() && column >= 0) {
            fila = vista.getTabla_acta().getSelectedRow();
            String estado_acta = String.valueOf(vista.getTabla_acta().getValueAt(fila, 2));
            if (estado_acta.equals("Aprobada")) {
                desactivarBotones();
            } else {
                ActivarBotones();
            }
            id = (int) vista.getTabla_acta().getValueAt(row, 0);
            Object value = vista.getTabla_acta().getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    Modelo_Acta pd = new Modelo_Acta();
                    pd.ejecutar_archivoPDF(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (Exception ex) {
                    }
                }
            } else {
                String name = "" + vista.getTabla_acta().getValueAt(row, 1);
            }
        }
    }
    
    public void inciarControl() {
        
        vista.getTabla_acta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        
        vista.getBtn_seleccionar().addActionListener(l -> SeleccionarPdf());
        vista.getBtn_modificar().addActionListener(l -> {
            try {
                vista.getDateChooser_reunion().setEnabled(false);
                vista.getBtn_seleccionar().setText("Seleccionar Acta...");
                cargarDialogo(2);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Acta.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        vista.getBtn_nuevo().addActionListener(l -> {
            try {
                vista.getDateChooser_reunion().setEnabled(true);
                vista.getBtn_seleccionar().setText("Seleccionar Acta...");
                cargarDialogo(1);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Acta.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getBtn_eliminar().addActionListener(l -> Eliminar());
        vista.getBtn_aprobar().addActionListener(l -> AprobarActa());
        vista.getBtn_guardar().addActionListener(l -> {
            try {
                DefinirMetodo(n);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Acta.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        vista.getBtn_cancelar().addActionListener(l -> vista.getjDialog1().dispose());
        vista.getBtn_buscar().addActionListener(l -> BuscarPorFecha(vista.getTabla_acta(), vista.getDate_chooserBuscar().getDate()));
        vista.getBtn_refrescar().addActionListener(l -> VisualizarTabla(vista.getTabla_acta(), ""));
    }
    
    public void Mousetabla() {
        
        int column = vista.getTabla_acta().getColumnModel().getColumnIndexAtX(vista.getTabla_acta().getX());
        int row = vista.getTabla_acta().getY() / vista.getTabla_acta().getRowHeight();
        if (row < vista.getTabla_acta().getRowCount() && row >= 0 && column < vista.getTabla_acta().getColumnCount() && column >= 0) {
            id = (int) vista.getTabla_acta().getValueAt(row, 0);
            Object value = vista.getTabla_acta().getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                
                if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo");
                } else {
                    Modelo_Acta pd = new Modelo_Acta();
                    pd.ejecutar_archivoPDF(id);
                    try {
                        Desktop.getDesktop().open(new File("new.pdf"));
                    } catch (IOException ex) {
                    }
                }
            } else {
                String name = "" + vista.getTabla_acta().getValueAt(row, 1);
            }
        }
    }
    
    public void BuscarPorFecha(JTable tabla, Date date) {
        desactivarBotones();
        Date fecha = null;
        String aguja = null;
        if (vista.getDate_chooserBuscar().getDate() != null) {
            fecha = vista.getDate_chooserBuscar().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            aguja = sdf.format(fecha);
            tabla.setDefaultRenderer(Object.class, new imgTabla());
            DefaultTableModel dt = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            dt.addColumn("Numero");
            dt.addColumn("Fecha Reunion");
            dt.addColumn("Estado");
            dt.addColumn("Archivo Acta");
            ImageIcon icono = null;
            if (get_Image("/vista/vista_imagenes/32pdf.png") != null) {
                icono = new ImageIcon(get_Image("/vista/vista_imagenes/32pdf.png"));
            }
            model = new Modelo_Acta();
            Acta vo = new Acta();
            List<Acta> list = model.ListarActas(aguja);
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados", "", 2);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Object filas[] = new Object[4];
                    vo = list.get(i);
                    filas[0] = vo.getNum_acta();
                    filas[1] = vo.getFecha();
                    filas[2] = vo.getEstado_acta();
                    if (vo.getArchivo_acta() != null) {
                        filas[3] = new JButton(icono);
                    } else {
                        filas[3] = new JButton("Vacio");
                    }
                    dt.addRow(filas);
                }
                tabla.setModel(dt);
                tabla.setRowHeight(32);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Primero seleccione una fecha para buscar", "", 0);
        }
        
    }
    
    public void DefinirMetodo(int n) throws SQLException {
        if (n == 1) {
            fila = vista.getTabla_acta().getSelectedRow();
            grabarActa();
        } else if (n == 2) {
            fila = vista.getTabla_acta().getSelectedRow();
            ModificarActa();
        }
    }
    
    public void SeleccionarPdf() {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        jfc.setFileFilter(fi);
        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta = jfc.getSelectedFile().getAbsolutePath();
            vista.getBtn_seleccionar().setText("" + jfc.getSelectedFile().getName());
            ImageIcon icono = null;
            if (get_Image("/vista/vista_imagenes/pdf.png") != null) {
                icono = new ImageIcon(get_Image("/vista/vista_imagenes/pdf.png"));
            }
            vista.getLbñ_iconoPdf().setIcon(icono);
            vista.getBtn_guardar().setEnabled(true);
        }
    }
    
    public void cargarDatos() {
        Date date = null;
        String formato = null;
        if (vista.getDateChooser_reunion().getDate() != null) {
            date = vista.getDateChooser_reunion().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(date);
        }
        fecha = formato;
        codigo_reunion = mr.codigoReunion(fecha);
        estado_acta = "Sin Aprobar";
        fila = vista.getTabla_acta().getSelectedRow();
        System.out.println(vista.getTabla_acta().getRowCount());
        if (vista.getTabla_acta().getRowCount() > 0 && fila > 0) {
            num_acta = Integer.parseInt(String.valueOf(vista.getTabla_acta().getValueAt(fila, 0)));
        }
        
    }
    
    public void grabarActa() {
        Date date = null;
        String formato = null;
        List<Acta> list = null;
        if (vista.getDateChooser_reunion().getDate() != null) {
            date = vista.getDateChooser_reunion().getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            formato = sdf.format(date);
            list = model.ListarActa(formato);
            if (list.isEmpty()) {
                if (vista.getDateChooser_reunion().getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar la fecha de la Reunion", "", 0);
                } else {
                    cargarDatos();
                    model.setCod_reunion(codigo_reunion);
                    model.setEstado_acta(estado_acta);
                    File rutafile = new File(ruta);
                    if (model.Agregar(rutafile)) {
                        VisualizarTabla(vista.getTabla_acta(), "");
                        vista.getjDialog1().dispose();
                        JOptionPane.showMessageDialog(vista, "Acta Creada Satisfactoriamente", "", 1);
                        desactivarBotones();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Esta reunion ya tiene Acta", "", 2);
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione una fecha de la Reunion", "", 2);
        }
        
    }
    
    public void ActivarBotones() {
        vista.getBtn_modificar().setEnabled(true);
        vista.getBtn_aprobar().setEnabled(true);
        vista.getBtn_eliminar().setEnabled(true);
    }
    
    public void desactivarBotones() {
        vista.getBtn_modificar().setEnabled(false);
        vista.getBtn_aprobar().setEnabled(false);
        vista.getBtn_eliminar().setEnabled(false);
    }
    
    public void ModificarActa() {
        cargarDatos();
        model.setCod_reunion(codigo_reunion);
        model.setEstado_acta(estado_acta);
        model.setNum_acta(num_acta);
        File rutafile = new File(ruta);
        if (model.Modificar(rutafile)) {
            VisualizarTabla(vista.getTabla_acta(), "");
            vista.getjDialog1().dispose();
            JOptionPane.showMessageDialog(vista, "Acta modificada Satisfactoriamente", "", 1);
            
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
    }
    
    public void Eliminar() {
        int op = JOptionPane.showOptionDialog(null, "ESTA SEGuRO QUE DESEA ELIMINAR ESTA ACTA", "",
                JOptionPane.YES_NO_CANCEL_OPTION, 2, null, new Object[]{"SI", "NO",}, null);
        if (op == 0) {
            fila = vista.getTabla_acta().getSelectedRow();
            num_acta = Integer.parseInt(String.valueOf(vista.getTabla_acta().getValueAt(fila, 0)));
            model.setNum_acta(num_acta);
            if (model.Eliminar(num_acta)) {
                VisualizarTabla(vista.getTabla_acta(), "");
                JOptionPane.showMessageDialog(null, "Eliminada con Exito", "", 1);
            } else {
                desactivarBotones();
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar", "", 0);
            }
            
        }
        
    }
    
    private void cargarDialogo(int origen) throws SQLException {
        vista.getLbñ_iconoPdf().setIcon(null);
        vista.getDateChooser_reunion().setDate(null);
        vista.getLbl_nombreArchivo().setText(null);
        vista.getjDialog1().setSize(645, 280);
        vista.getjDialog1().setLocationRelativeTo(vista);
        fila = vista.getTabla_acta().getSelectedRow();
        if (origen == 1) {
            vista.getjDialog1().setTitle("Registrar Acta");
            n = 1;
            vista.getjDialog1().setVisible(true);
            vista.getBtn_guardar().setEnabled(false);
        } else {
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "SELECCIONE UN DATO DE LA TABLA", "", 2);
            } else {
                cargarDatosTable();
                vista.getjDialog1().setTitle("Editar Acta");
                n = 2;
                vista.getjDialog1().setVisible(true);
            }
        }
        
    }
    
    public void AprobarActa() {
        
        int op = JOptionPane.showOptionDialog(null, "ESTA SEGURO APROBAR ESTA ACTA", "",
                JOptionPane.YES_NO_CANCEL_OPTION, 2, null, new Object[]{"SI", "NO",}, null);
        if (op == 0) {
            fila = vista.getTabla_acta().getSelectedRow();
            num_acta = Integer.parseInt(String.valueOf(vista.getTabla_acta().getValueAt(fila, 0)));
            model.setNum_acta(num_acta);
            if (model.AprobarActa()) {
                desactivarBotones();
                VisualizarTabla(vista.getTabla_acta(), "");
                JOptionPane.showMessageDialog(null, "Aprobada con Exito", "", 1);
            }
        }
        
    }
    
    public void VisualizarTabla(JTable tabla, String aguja) {
        //System.out.println("para imprimir la tabla");
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Numero");
        dt.addColumn("Fecha Reunion");
        dt.addColumn("Estado");
        dt.addColumn("Archivo Acta");
        ImageIcon icono = null;
        if (get_Image("/vista/vista_imagenes/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/vista/vista_imagenes/32pdf.png"));
        }
        model = new Modelo_Acta();
        Acta vo = new Acta();
        List<Acta> list = model.ListarActas(aguja);
        for (int i = 0; i < list.size(); i++) {
            Object filas[] = new Object[4];
            vo = list.get(i);
            filas[0] = vo.getNum_acta();
            filas[1] = vo.getFecha();
            filas[2] = vo.getEstado_acta();
            if (vo.getArchivo_acta() != null) {
                filas[3] = new JButton(icono);
            } else {
                filas[3] = new JButton("Vacio");
            }
            dt.addRow(filas);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(32);
    }
    
    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
    
    public void cargarDatosTable() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fila = vista.getTabla_acta().getSelectedRow();
            Date fecha = null;
            String date = vista.getTabla_acta().getValueAt(fila, 1).toString().trim();
            fecha = (Date) sdf.parse(date);
            vista.getDateChooser_reunion().setDate(fecha);
            vista.getLbl_nombreArchivo().setText("Acta numero: " + vista.getTabla_acta().getValueAt(fila, 0)
                    + "\n       Fecha:" + vista.getTabla_acta().getValueAt(fila, 1).toString().trim());
            ImageIcon icono = null;
            if (get_Image("/vista/vista_imagenes/pdf.png") != null) {
                icono = new ImageIcon(get_Image("/vista/vista_imagenes/pdf.png"));
            }
            vista.getBtn_seleccionar().setText("Seleccionar nueva Acta");
            vista.getLbñ_iconoPdf().setIcon(icono);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
