package Grafico;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        JlabelNombre = new javax.swing.JLabel();
        JlabelIdentificacion = new javax.swing.JLabel();
        JlabelValorInicial = new javax.swing.JLabel();
        JtextNombre = new javax.swing.JTextField();
        JtextIdentificacion = new javax.swing.JTextField();
        JtextValorInicial = new javax.swing.JTextField();
        JbuttonCrear = new javax.swing.JButton();
        JbuttonSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear cuenta de ahorros"); // NOI18N

        JlabelNombre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JlabelNombre.setText("Nombre");

        JlabelIdentificacion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JlabelIdentificacion.setText("# Identificacion");

        JlabelValorInicial.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JlabelValorInicial.setText("Valor inicial");

        JtextNombre.setToolTipText("Nombre completo "); // NOI18N
        JtextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextNombreActionPerformed(evt);
            }
        });

        JtextIdentificacion.setToolTipText("Numero de identificaion\n"); // NOI18N
        JtextIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextIdentificacionActionPerformed(evt);
            }
        });

        JtextValorInicial.setToolTipText("Monto con el cual crea la cuenta de ahorro\n"); // NOI18N
        JtextValorInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextValorInicialActionPerformed(evt);
            }
        });

        JbuttonCrear.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JbuttonCrear.setText("Crear");
        JbuttonCrear.setToolTipText("Se creara la cuenta de ahorro con los datos anteriores\n"); // NOI18N
        JbuttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonCrearActionPerformed(evt);
            }
        });

        JbuttonSalir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        JbuttonSalir.setText("Salir");
        JbuttonSalir.setToolTipText("Cierra la ventana\n");
        JbuttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JlabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(JbuttonCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JtextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(JtextIdentificacion)
                                    .addComponent(JtextValorInicial)))
                            .addComponent(JlabelIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbuttonSalir))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbuttonCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlabelIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JtextIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JlabelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JtextValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(JbuttonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextValorInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextValorInicialActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JtextValorInicialActionPerformed

    private void JtextIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextIdentificacionActionPerformed

    private void JbuttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonCrearActionPerformed
        JOptionPane.showMessageDialog(this, "Se a creado la cuenta de ahorros con el numero: 11223667 , a la fecha: Sun Mar 27 19:15:22 COT 2022");
        new Ventana2().setVisible(true);
        
        
    }//GEN-LAST:event_JbuttonCrearActionPerformed

    private void JtextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextNombreActionPerformed

    private void JbuttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JbuttonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbuttonCrear;
    private javax.swing.JButton JbuttonSalir;
    private javax.swing.JLabel JlabelIdentificacion;
    private javax.swing.JLabel JlabelNombre;
    private javax.swing.JLabel JlabelValorInicial;
    private javax.swing.JTextField JtextIdentificacion;
    private javax.swing.JTextField JtextNombre;
    private javax.swing.JTextField JtextValorInicial;
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}
