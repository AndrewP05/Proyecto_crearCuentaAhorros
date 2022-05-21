package Grafico;

import Operaciones.GestionDatos;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Datos.Cliente;
import Datos.Cuenta;
import java.util.Map;
import utilidades.Persistencia;

public class Ventana extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    public Ventana() {
        initComponents();
        this.cargaTabla();
        
    }
    
    
    private Cliente elCliente;
    
    public Cliente obCliente()
    {
        return this.elCliente;
    }
    public void modiCuenta(Cliente elCLiente)
    {
        this.elCliente = elCLiente;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbuttonSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(JtextIdentificacion)
                            .addComponent(JtextValorInicial)))
                    .addComponent(JlabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbuttonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JlabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JlabelIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtextIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JlabelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtextValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbuttonSalir)
                            .addComponent(JbuttonCrear))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
      
           
        crearCuenta();  
        new Ventana2().setVisible(true);
        
        
        
    }//GEN-LAST:event_JbuttonCrearActionPerformed

    private void JtextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextNombreActionPerformed

    private void JbuttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JbuttonSalirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    public String obtenerFechaCreacion()
    {
        String timeStamp = new SimpleDateFormat("yyyy / MM / dd - HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
    
    private void crearCuenta()
    {
        String nombre = JtextNombre.getText();
        String identificacion = JtextIdentificacion.getText();
        float saldoInicial = JtextValorInicial.getAlignmentY();
        
        
        GestionDatos f = new GestionDatos();
        Cuenta c = f.crearCuenta(nombre, identificacion,saldoInicial);

        
        if (c != null)
        {
            
            JOptionPane.showMessageDialog(this, "Creacion de la Cuenta ->"+c);
            cargaTabla();
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, " no creo la cuenta");
        }

       
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
    private void cargaTabla()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE CLIENTE");
        modelo.addColumn("IDENTIFICACION");
        modelo.addColumn("FECHA CREACION");
        modelo.addColumn("N° CUENTA");
        
        
        GestionDatos gestor = new GestionDatos();
        Map<String, Cuenta> lista = gestor.obtenerLista();
        for(Map.Entry<String, Cuenta> dato : lista.entrySet())
        {
            Cuenta rc = dato.getValue();
            Object[] datos = 
            {
                rc.obElCliente().obNombre(),
                rc.obElCliente().obIdentificacion(),
                obtenerFechaCreacion(),
                rc.getNumCuenta(),
                
             
            };
            modelo.addRow(datos);
        }
        
        this.jTable1.setModel(modelo);
    }
            
}
