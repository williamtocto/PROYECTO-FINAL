package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista_transaccion extends javax.swing.JInternalFrame {

    public JButton getBtnBuscar() {
        return BtnBuscar;
    }

    public JTable getjTabla_tran() {
        return jTabla_tran;
    }

    public void setjTabla_tran(JTable jTabla_tran) {
        this.jTabla_tran = jTabla_tran;
    }

    public void setBtnBuscar(JButton BtnBuscar) {
        this.BtnBuscar = BtnBuscar;
    }

    public JButton getBtnAceptar() {
        return BtnAceptar;
    }

    public void setBtnAceptar(JButton BtnAceptar) {
        this.BtnAceptar = BtnAceptar;
    }

    public ButtonGroup getGrupo_tipo() {
        return Grupo_tipo;
    }

    public void setGrupo_tipo(ButtonGroup Grupo_tipo) {
        this.Grupo_tipo = Grupo_tipo;
    }

    public void setLblTipo_transa(JLabel LblTipo_transa) {
        this.LblTipo_transa = LblTipo_transa;
    }

    public JTextField getTxtApellido() {
        return TxtApellido;
    }

    public void setTxtApellido(JTextField TxtApellido) {
        this.TxtApellido = TxtApellido;
    }

    public JTextField getTxtCedula_soc() {
        return TxtCedula_soc;
    }

    public void setTxtCedula_soc(JTextField TxtCedula_soc) {
        this.TxtCedula_soc = TxtCedula_soc;
    }

    public JTextField getTxtCodigo_socio() {
        return TxtCodigo_socio;
    }

    public void setTxtCodigo_socio(JTextField TxtCodigo_socio) {
        this.TxtCodigo_socio = TxtCodigo_socio;
    }

    public JTextField getTxtDeposito() {
        return TxtDeposito;
    }

    public void setTxtDeposito(JTextField TxtDeposito) {
        this.TxtDeposito = TxtDeposito;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtNumero_cu() {
        return TxtNumero_cu;
    }

    public void setTxtNumero_cu(JTextField TxtNumero_cu) {
        this.TxtNumero_cu = TxtNumero_cu;
    }

    public JTextField getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(JTextField TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public JTextField getTxtValor_cuenta() {
        return TxtValor_cuenta;
    }

    public void setTxtValor_cuenta(JTextField TxtValor_cuenta) {
        this.TxtValor_cuenta = TxtValor_cuenta;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JRadioButton getRbDeposito() {
        return rbDeposito;
    }

    public void setRbDeposito(JRadioButton rbDeposito) {
        this.rbDeposito = rbDeposito;
    }

    public JRadioButton getRbRetiro() {
        return rbRetiro;
    }


    public JButton getBtn_buscarConsulta() {
        return btn_buscarConsulta;
    }

    public void setBtn_buscarConsulta(JButton btn_buscarConsulta) {
        this.btn_buscarConsulta = btn_buscarConsulta;
    }

    public JButton getBtn_imprimirConsulta() {
        return btn_imprimirConsulta;
    }

    public void setBtn_imprimirConsulta(JButton btn_imprimirConsulta) {
        this.btn_imprimirConsulta = btn_imprimirConsulta;
    }

    public JButton getBtn_limpiarConsulta() {
        return btn_limpiarConsulta;
    }

    public void setBtn_limpiarConsulta(JButton btn_limpiarConsulta) {
        this.btn_limpiarConsulta = btn_limpiarConsulta;
    }

    public JDialog getDgTransacciones() {
        return dgTransacciones;
    }

    public void setDgTransacciones(JDialog dgTransacciones) {
        this.dgTransacciones = dgTransacciones;
    }

    public JDateChooser getjDatedesde() {
        return jDatedesde;
    }

    public void setjDatedesde(JDateChooser jDatedesde) {
        this.jDatedesde = jDatedesde;
    }

    public JDateChooser getjDatehasta() {
        return jDatehasta;
    }

    public void setjDatehasta(JDateChooser jDatehasta) {
        this.jDatehasta = jDatehasta;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTable getjTablaconsultart() {
        return jTablaconsultart;
    }

    public void setjTablaconsultart(JTable jTablaconsultart) {
        this.jTablaconsultart = jTablaconsultart;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JComboBox<String> getJcombox() {
        return jcombox;
    }

    public void setJcombox(JComboBox<String> jcombox) {
        this.jcombox = jcombox;
    }

    public JTextField getTxt_apellido() {
        return txt_apellido;
    }

    public void setTxt_apellido(JTextField txt_apellido) {
        this.txt_apellido = txt_apellido;
    }

    public JTextField getTxt_cedula() {
        return txt_cedula;
    }

    public void setTxt_cedula(JTextField txt_cedula) {
        this.txt_cedula = txt_cedula;
    }

    public JDateChooser getDateFin() {
        return dateFin;
    }

    public void setDateFin(JDateChooser dateFin) {
        this.dateFin = dateFin;
    }

    public JDateChooser getDateInicio() {
        return dateInicio;
    }

    public void setDateInicio(JDateChooser dateInicio) {
        this.dateInicio = dateInicio;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtn_aceptar() {
        return btn_aceptar;
    }

    public void setBtn_aceptar(JButton btn_aceptar) {
        this.btn_aceptar = btn_aceptar;
    }

    public JButton getBtn_imprimir() {
        return btn_imprimir;
    }

    public void setBtn_imprimir(JButton btn_imprimir) {
        this.btn_imprimir = btn_imprimir;
    }

    public JTextField getTxt_nombre() {
        return txt_nombre;
    }

    public void setTxt_nombre(JTextField txt_nombre) {
        this.txt_nombre = txt_nombre;
    }

    public void setRbRetiro(JRadioButton rbRetiro) {
        this.rbRetiro = rbRetiro;
    }

    public Vista_transaccion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_tipo = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        dgTransacciones = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        Lbldesde = new javax.swing.JLabel();
        Lblhasta = new javax.swing.JLabel();
        jDatedesde = new com.toedter.calendar.JDateChooser();
        jDatehasta = new com.toedter.calendar.JDateChooser();
        Lblcedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaconsultart = new javax.swing.JTable();
        btn_buscarConsulta = new javax.swing.JButton();
        btn_imprimirConsulta = new javax.swing.JButton();
        btn_limpiarConsulta = new javax.swing.JButton();
        Lblnombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        Lblapellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        Lbldinerocaja = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jcombox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        dateInicio = new com.toedter.calendar.JDateChooser();
        dateFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtCedula_soc = new javax.swing.JTextField();
        LblCedula_so = new javax.swing.JLabel();
        LblCantidad_cuenta = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        LblCodigo_socio = new javax.swing.JLabel();
        LblTelefono = new javax.swing.JLabel();
        LblDireccion = new javax.swing.JLabel();
        LblNume_cuenta = new javax.swing.JLabel();
        TxtValor_cuenta = new javax.swing.JTextField();
        TxtCodigo_socio = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtNumero_cu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LblIngrese_monto = new javax.swing.JLabel();
        LblTipo_transa = new javax.swing.JLabel();
        TxtDeposito = new javax.swing.JTextField();
        rbRetiro = new javax.swing.JRadioButton();
        rbDeposito = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla_tran = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        BtnAceptar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        dgTransacciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultar Transacciones.");
        dgTransacciones.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 226, 22));

        Lbldesde.setForeground(new java.awt.Color(255, 255, 255));
        Lbldesde.setText("Fecha desde:");
        dgTransacciones.getContentPane().add(Lbldesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        Lblhasta.setForeground(new java.awt.Color(255, 255, 255));
        Lblhasta.setText("Fecha hasta:");
        dgTransacciones.getContentPane().add(Lblhasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));
        dgTransacciones.getContentPane().add(jDatedesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 45, 185, -1));
        dgTransacciones.getContentPane().add(jDatehasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 82, 185, -1));

        Lblcedula.setForeground(new java.awt.Color(255, 255, 255));
        Lblcedula.setText("Cédula:");
        dgTransacciones.getContentPane().add(Lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 123, -1, -1));

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        dgTransacciones.getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 120, 185, -1));

        jTablaconsultart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jTablaconsultart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "                Nombre", "                 Apellido", "                 Fecha", "        Tipo Transaccion", "                Monto", "                 Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaconsultart.setGridColor(new java.awt.Color(255, 153, 51));
        jTablaconsultart.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTablaconsultart.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane3.setViewportView(jTablaconsultart);

        dgTransacciones.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 710, 146));

        btn_buscarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        btn_buscarConsulta.setText("Consultar");
        btn_buscarConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_buscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarConsultaActionPerformed(evt);
            }
        });
        dgTransacciones.getContentPane().add(btn_buscarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, -1));

        btn_imprimirConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprimirConsulta.setText("Imprimir");
        btn_imprimirConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        dgTransacciones.getContentPane().add(btn_imprimirConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 90, -1));

        btn_limpiarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/limpiar.png"))); // NOI18N
        btn_limpiarConsulta.setText("Limipar");
        btn_limpiarConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        dgTransacciones.getContentPane().add(btn_limpiarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 50, 90, -1));

        Lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        Lblnombre.setText("Nombre:");
        dgTransacciones.getContentPane().add(Lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 94, -1, 20));

        txt_nombre.setEditable(false);
        dgTransacciones.getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 100, 110, -1));

        Lblapellido.setForeground(new java.awt.Color(255, 255, 255));
        Lblapellido.setText("Apellido:");
        dgTransacciones.getContentPane().add(Lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txt_apellido.setEditable(false);
        dgTransacciones.getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 129, 110, -1));

        Lbldinerocaja.setForeground(new java.awt.Color(255, 255, 255));
        Lbldinerocaja.setText("Dinero total en caja:");
        dgTransacciones.getContentPane().add(Lbldinerocaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(153, 204, 255));
        dgTransacciones.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 125, 90, 29));

        jcombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Ordenar por Apellido Ascendente ", "Ordenar por Apellido Descendente", "Ordenar por Fecha Ascendente  ", "Ordenar por Fecha Descendente ", " " }));
        dgTransacciones.getContentPane().add(jcombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 167, 211, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        dgTransacciones.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        jDialog1.setTitle("Reportes");
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialog1.getContentPane().add(dateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, -1));
        jDialog1.getContentPane().add(dateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione las fechas para el Reporte");
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fin");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicio");
        jDialog1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 20));

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 20));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jDialog1.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transacciones");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transacciones.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        TxtCedula_soc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedula_socActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCedula_soc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 20));

        LblCedula_so.setForeground(new java.awt.Color(255, 255, 255));
        LblCedula_so.setText("Cédula Socio:");
        getContentPane().add(LblCedula_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        LblCantidad_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad_cuenta.setText("Cantidad en cuenta:");
        getContentPane().add(LblCantidad_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        LblNombre.setForeground(new java.awt.Color(255, 255, 255));
        LblNombre.setText("Nombre:");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        LblApellido.setForeground(new java.awt.Color(255, 255, 255));
        LblApellido.setText("Apellido:");
        getContentPane().add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        LblCodigo_socio.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo_socio.setText("Código Socio:");
        getContentPane().add(LblCodigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        LblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LblTelefono.setText("Télefono:");
        getContentPane().add(LblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        LblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LblDireccion.setText("Dirección:");
        getContentPane().add(LblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 19));

        LblNume_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        LblNume_cuenta.setText("Nro. Cuenta:");
        getContentPane().add(LblNume_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        TxtValor_cuenta.setEditable(false);
        getContentPane().add(TxtValor_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, -1));

        TxtCodigo_socio.setEditable(false);
        getContentPane().add(TxtCodigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 140, -1));

        TxtNombre.setEditable(false);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, -1));

        TxtApellido.setEditable(false);
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, -1));

        TxtTelefono.setEditable(false);
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 140, -1));

        TxtDireccion.setEditable(false);
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 140, -1));

        TxtNumero_cu.setEditable(false);
        getContentPane().add(TxtNumero_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 140, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Trámite:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        LblIngrese_monto.setForeground(new java.awt.Color(255, 255, 255));
        LblIngrese_monto.setText("Monto:");
        getContentPane().add(LblIngrese_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        LblTipo_transa.setForeground(new java.awt.Color(255, 255, 255));
        LblTipo_transa.setText("Tipo de Transacción:");
        getContentPane().add(LblTipo_transa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));
        getContentPane().add(TxtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, -1));

        Grupo_tipo.add(rbRetiro);
        rbRetiro.setText("Retiro");
        getContentPane().add(rbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        Grupo_tipo.add(rbDeposito);
        rbDeposito.setText("Depósito");
        getContentPane().add(rbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jTabla_tran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jTabla_tran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "                   Fecha", "         Tipo Transacción", "                    Monto", "                    Saldo"
            }
        ));
        jTabla_tran.setGridColor(new java.awt.Color(255, 153, 51));
        jTabla_tran.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTabla_tran.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(jTabla_tran);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 680, 180));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Historial de Transacciones.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/guardar.png"))); // NOI18N
        BtnAceptar.setText("Registrar");
        BtnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, 30));

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/imprime.png"))); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionActionPerformed

    private void TxtCedula_socActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedula_socActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedula_socActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void btn_buscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarConsultaActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.ButtonGroup Grupo_tipo;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCantidad_cuenta;
    private javax.swing.JLabel LblCedula_so;
    private javax.swing.JLabel LblCodigo_socio;
    private javax.swing.JLabel LblDireccion;
    private javax.swing.JLabel LblIngrese_monto;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNume_cuenta;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JLabel LblTipo_transa;
    private javax.swing.JLabel Lblapellido;
    private javax.swing.JLabel Lblcedula;
    private javax.swing.JLabel Lbldesde;
    private javax.swing.JLabel Lbldinerocaja;
    private javax.swing.JLabel Lblhasta;
    private javax.swing.JLabel Lblnombre;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula_soc;
    private javax.swing.JTextField TxtCodigo_socio;
    private javax.swing.JTextField TxtDeposito;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumero_cu;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtValor_cuenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_buscarConsulta;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_imprimirConsulta;
    private javax.swing.JButton btn_limpiarConsulta;
    private com.toedter.calendar.JDateChooser dateFin;
    private com.toedter.calendar.JDateChooser dateInicio;
    private javax.swing.JDialog dgTransacciones;
    private com.toedter.calendar.JDateChooser jDatedesde;
    private com.toedter.calendar.JDateChooser jDatehasta;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabla_tran;
    private javax.swing.JTable jTablaconsultart;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> jcombox;
    private javax.swing.JRadioButton rbDeposito;
    private javax.swing.JRadioButton rbRetiro;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
