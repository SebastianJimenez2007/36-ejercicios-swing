/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg19;

/**
 *
 * @author Sebastian JB
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelEtiqueta1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelEtiqueta2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        panelEtiqueta3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelEtiqueta4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBotonera = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelVerificacion = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ejercicio");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Sebastian Jimenez");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelDatos.setLayout(new java.awt.GridLayout(2, 2));

        jLabel4.setText("Dato 1;");

        javax.swing.GroupLayout panelEtiqueta1Layout = new javax.swing.GroupLayout(panelEtiqueta1);
        panelEtiqueta1.setLayout(panelEtiqueta1Layout);
        panelEtiqueta1Layout.setHorizontalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelEtiqueta1Layout.setVerticalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta1);

        javax.swing.GroupLayout panelEtiqueta2Layout = new javax.swing.GroupLayout(panelEtiqueta2);
        panelEtiqueta2.setLayout(panelEtiqueta2Layout);
        panelEtiqueta2Layout.setHorizontalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelEtiqueta2Layout.setVerticalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta2);

        jLabel5.setText("Dato: 2");

        javax.swing.GroupLayout panelEtiqueta3Layout = new javax.swing.GroupLayout(panelEtiqueta3);
        panelEtiqueta3.setLayout(panelEtiqueta3Layout);
        panelEtiqueta3Layout.setHorizontalGroup(
            panelEtiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelEtiqueta3Layout.setVerticalGroup(
            panelEtiqueta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        panelDatos.add(panelEtiqueta3);

        javax.swing.GroupLayout panelEtiqueta4Layout = new javax.swing.GroupLayout(panelEtiqueta4);
        panelEtiqueta4.setLayout(panelEtiqueta4Layout);
        panelEtiqueta4Layout.setHorizontalGroup(
            panelEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelEtiqueta4Layout.setVerticalGroup(
            panelEtiqueta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta4);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("jLabel3");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("jLabel3");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("jLabel3");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(44, 44, 44))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(panelEstado, java.awt.BorderLayout.SOUTH);

        panelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jButton2.setText("jButton1");
        panelBotonera.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton3.setText("jButton1");
        panelBotonera.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton4.setText("jButton1");
        panelBotonera.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getContentPane().add(panelBotonera, java.awt.BorderLayout.LINE_END);

        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jCheckBox2.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jCheckBox3.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jCheckBox4.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        getContentPane().add(panelVerificacion, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEtiqueta1;
    private javax.swing.JPanel panelEtiqueta2;
    private javax.swing.JPanel panelEtiqueta3;
    private javax.swing.JPanel panelEtiqueta4;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVerificacion;
    // End of variables declaration//GEN-END:variables
}
