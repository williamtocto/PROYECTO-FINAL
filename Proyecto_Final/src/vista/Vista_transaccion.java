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
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CONSULTAR TRANSACCIONES");

        Lbldesde.setText("FECHA DESDE:");

        Lblhasta.setText("FECHA HASTA:");

        Lblcedula.setText("CEDULA:");

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        jTablaconsultart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "FECHA", "TIPO TRANSACCION", "MONTO", "SALDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablaconsultart);

        btn_buscarConsulta.setText("CONSULTAR");

        btn_imprimirConsulta.setText("IMPRIMIR");

        btn_limpiarConsulta.setText("LIMPIAR");

        Lblnombre.setText("NOMBRE:");

        txt_nombre.setEditable(false);

        Lblapellido.setText("APELLIDO:");

        txt_apellido.setEditable(false);

        Lbldinerocaja.setText("DINERO TOTAL EN CAJA:");

        jTextField4.setEditable(false);

        jcombox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE PARA ORDENAR", "ORDENAR POR APELLIDO ASCENDENTE", "ORDENAR POR APELLIDO DESCENDENTE", "ORDENAR POR FECHA ASCENDENTE", "ORDENAR POR FECHA DESCENDENTE" }));

        javax.swing.GroupLayout dgTransaccionesLayout = new javax.swing.GroupLayout(dgTransacciones.getContentPane());
        dgTransacciones.getContentPane().setLayout(dgTransaccionesLayout);
        dgTransaccionesLayout.setHorizontalGroup(
            dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lblhasta)
                                    .addComponent(Lbldesde)
                                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(Lblcedula)))
                                .addGap(30, 30, 30)
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDatedesde, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jDatehasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cedula))
                                .addGap(29, 29, 29)
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lblnombre)
                                            .addComponent(Lblapellido))
                                        .addGap(18, 18, 18)
                                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(Lbldinerocaja))
                                            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                        .addComponent(btn_buscarConsulta)
                                        .addGap(47, 47, 47)
                                        .addComponent(btn_imprimirConsulta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_limpiarConsulta)))
                                .addGap(52, 52, 52)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dgTransaccionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dgTransaccionesLayout.setVerticalGroup(
            dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Lblhasta))
                    .addGroup(dgTransaccionesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_imprimirConsulta, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_buscarConsulta)
                                    .addComponent(btn_limpiarConsulta)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dgTransaccionesLayout.createSequentialGroup()
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbldesde)
                                    .addComponent(jDatedesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))
                        .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lblnombre)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDatehasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lblcedula)))
                            .addGroup(dgTransaccionesLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Lbldinerocaja)
                                .addGap(18, 18, 18)
                                .addGroup(dgTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lblapellido)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

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
        getContentPane().add(TxtCedula_soc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, -1));

        LblCedula_so.setForeground(new java.awt.Color(255, 255, 255));
        LblCedula_so.setText("Cédula del Socio:");
        getContentPane().add(LblCedula_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        LblCantidad_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad_cuenta.setText("Cantidad en la cuenta:");
        getContentPane().add(LblCantidad_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        LblNombre.setForeground(new java.awt.Color(255, 255, 255));
        LblNombre.setText("Nombre:");
        getContentPane().add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        LblApellido.setForeground(new java.awt.Color(255, 255, 255));
        LblApellido.setText("Apellido:");
        getContentPane().add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        LblCodigo_socio.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo_socio.setText("Código Socio:");
        getContentPane().add(LblCodigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        LblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        LblTelefono.setText("Télefono:");
        getContentPane().add(LblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        LblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        LblDireccion.setText("Dirección:");
        getContentPane().add(LblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, 19));

        LblNume_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        LblNume_cuenta.setText("Número de Cuenta:");
        getContentPane().add(LblNume_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, -1, -1));
        getContentPane().add(TxtValor_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        TxtCodigo_socio.setEditable(false);
        getContentPane().add(TxtCodigo_socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 140, -1));

        TxtNombre.setEditable(false);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 140, -1));

        TxtApellido.setEditable(false);
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 140, -1));

        TxtTelefono.setEditable(false);
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 140, -1));

        TxtDireccion.setEditable(false);
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 140, -1));

        TxtNumero_cu.setEditable(false);
        getContentPane().add(TxtNumero_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 140, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Trámite:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        LblIngrese_monto.setForeground(new java.awt.Color(255, 255, 255));
        LblIngrese_monto.setText("Monto:");
        getContentPane().add(LblIngrese_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        LblTipo_transa.setForeground(new java.awt.Color(255, 255, 255));
        LblTipo_transa.setText("Tipo de Transacción:");
        getContentPane().add(LblTipo_transa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));
        getContentPane().add(TxtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, -1));

        Grupo_tipo.add(rbRetiro);
        rbRetiro.setText("Retiro");
        getContentPane().add(rbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        Grupo_tipo.add(rbDeposito);
        rbDeposito.setText("Depósito");
        getContentPane().add(rbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jTabla_tran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jTabla_tran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "              Fecha", "         Tipo Transacción", "                    Monto", "                    Saldo"
            }
        ));
        jTabla_tran.setGridColor(new java.awt.Color(255, 153, 51));
        jTabla_tran.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTabla_tran.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(jTabla_tran);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 761, 290));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Historial de Transacciones.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/guardar.png"))); // NOI18N
        BtnAceptar.setText("Registrar");
        BtnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, 40));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_iconos/consultar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/vista_imagenes/fondo_azul_oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 520));

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
    private javax.swing.JButton btn_buscarConsulta;
    private javax.swing.JButton btn_imprimirConsulta;
    private javax.swing.JButton btn_limpiarConsulta;
    private javax.swing.JDialog dgTransacciones;
    private com.toedter.calendar.JDateChooser jDatedesde;
    private com.toedter.calendar.JDateChooser jDatehasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
