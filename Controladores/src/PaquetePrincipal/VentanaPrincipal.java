/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaquetePrincipal;

import PaquetePrincipal.BotonContador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian JB
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;
    JTextField txtNumeroInicio;  // Cuadro de texto para el número
    JButton btnIniciar;  

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setTitle("Ejercicio de Herencia"); 
        this.setSize(250, 300); 

        // Construimos y situamos los botones contadores. 
        btnBotonA = new BotonContador(); 
        btnBotonA.setText("Boton A"); 
        btnBotonA.setBounds(10, 10, 100, 30); 
        this.getContentPane().add(btnBotonA); 

        btnBotonB = new BotonContador(); 
        btnBotonB.setText("Boton B"); 
        btnBotonB.setBounds(130, 10, 100, 30); 
        this.getContentPane().add(btnBotonB);
        
         btnBotonC = new BotonContador(); 
        btnBotonC.setText("Boton C"); 
        btnBotonC.setBounds(10, 40, 100, 30); 
        this.getContentPane().add(btnBotonC);
        
         txtNumeroInicio = new JTextField();
            txtNumeroInicio.setBounds(70, 150, 100, 25);  // Posición y tamaño
            this.add(txtNumeroInicio);

            // Crear y configurar el botón "Iniciar"
            btnIniciar = new JButton("Iniciar");
            btnIniciar.setBounds(180, 150, 80, 25);
            this.add(btnIniciar);
            
             btnIniciar.addActionListener(e -> {
        try {
            int valor = Integer.parseInt(txtNumeroInicio.getText());
            btnBotonA.setPulsaciones(valor);
            btnBotonB.setPulsaciones(valor);
            btnBotonC.setPulsaciones(valor);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido");
        }
    });

        btnBotonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonA(evt);
            }
        });

        btnBotonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonB(evt);
            }
        });
        
        btnBotonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBotonC.aumenta(2); // Aumenta en 2 las pulsaciones del Botón C
            }
        });
    }
    
    

    public void PulsacionBotonA(ActionEvent evt) {
        btnBotonA.incrementa();
    }

    public void PulsacionBotonB(ActionEvent evt) {
        btnBotonB.incrementa();
    }
    
    public void PulsacionBotonC(ActionEvent evt) {
        btnBotonC.incrementa();
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerPulsaciones.setText("VerPulsaciones");
        btnVerPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("reinicioar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnVerPulsaciones)
                .addGap(74, 74, 74)
                .addComponent(btnReiniciar)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPulsaciones)
                    .addComponent(btnReiniciar))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsacionesActionPerformed
    String info;

    info = "El botón A se ha pulsado " + btnBotonA.getPulsaciones() + "\n";
    info = info + "El botón B se ha pulsado " + btnBotonB.getPulsaciones() + "\n";
    info = info + "El botón B se ha pulsado " + btnBotonC.getPulsaciones() + "\n";
    JOptionPane.showMessageDialog(null, info);
    
    }//GEN-LAST:event_btnVerPulsacionesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       btnBotonA.reiniciar();
       btnBotonB.reiniciar();
btnBotonC.reiniciar();// TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones;
    // End of variables declaration//GEN-END:variables
}
