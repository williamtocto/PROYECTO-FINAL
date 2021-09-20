package vista;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Ventana_Principal extends javax.swing.JInternalFrame {

    public Ventana_Principal() {
        initComponents();
    }

    public Ventana_Principal(int rol) {
        initComponents();
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public void setjMenu2(JMenu jMenu2) {
        this.jMenu2 = jMenu2;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public void setjMenu4(JMenu jMenu4) {
        this.jMenu4 = jMenu4;
    }

    public JMenu getjMenu5() {
        return jMenu5;
    }

    public void setjMenu5(JMenu jMenu5) {
        this.jMenu5 = jMenu5;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("Socio");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("TRANSACCION");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("RE");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("jMenu5");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
