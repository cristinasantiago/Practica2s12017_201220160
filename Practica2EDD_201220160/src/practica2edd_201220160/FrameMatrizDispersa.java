/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2edd_201220160;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.RequestBody;

/**
 *
 * @author Cristina
 */
public class FrameMatrizDispersa extends javax.swing.JFrame {

    conexion con =new conexion();
    /**
     * Creates new form FrameMatrizDispersa
     */
    public FrameMatrizDispersa() {
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

        jLabel1 = new javax.swing.JLabel();
        txtAgregarDispersa = new javax.swing.JTextField();
        btBuscarDispersa = new javax.swing.JButton();
        txtEliminarDispersa = new javax.swing.JTextField();
        btEliminarDispersa = new javax.swing.JButton();
        txtBuscarLdispersa = new javax.swing.JTextField();
        btBuscarLdispersa = new javax.swing.JButton();
        txtBuscarDdispersa = new javax.swing.JTextField();
        btBuscarDdispersa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel1.setText("Matriz Dispersa");

        btBuscarDispersa.setText("Agregar");
        btBuscarDispersa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDispersaActionPerformed(evt);
            }
        });

        btEliminarDispersa.setText("Eliminar");
        btEliminarDispersa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarDispersaActionPerformed(evt);
            }
        });

        btBuscarLdispersa.setText("Buscar Letra");
        btBuscarLdispersa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLdispersaActionPerformed(evt);
            }
        });

        btBuscarDdispersa.setText("Buscar Dominio");
        btBuscarDdispersa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarDdispersaActionPerformed(evt);
            }
        });

        jButton1.setText("Graficar Matriz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEliminarDispersa, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgregarDispersa, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarLdispersa, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarDdispersa, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBuscarDdispersa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBuscarLdispersa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEliminarDispersa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBuscarDispersa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregarDispersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarDispersa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEliminarDispersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminarDispersa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarLdispersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarLdispersa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarDdispersa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarDdispersa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarDispersaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDispersaActionPerformed
        
              
     String  dato = txtAgregarDispersa.getText().trim();
     
     
     RequestBody formBody = new FormEncodingBuilder().add("dato", dato).build();
        String r = con.getString("AgregarCorreo", formBody); 
        System.out.println(r);
     
       txtAgregarDispersa.setText("");
             
              
      

    }//GEN-LAST:event_btBuscarDispersaActionPerformed

    private void btBuscarLdispersaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLdispersaActionPerformed
                String  dato = txtBuscarLdispersa.getText().trim();
     
     
     RequestBody formBody = new FormEncodingBuilder().add("dato", dato).build();
        String r = con.getString("GraficaPorletras", formBody); 
        System.out.println(r);
     
       txtBuscarLdispersa.setText("");
    }//GEN-LAST:event_btBuscarLdispersaActionPerformed

    private void btBuscarDdispersaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarDdispersaActionPerformed
                 String  dato = txtBuscarDdispersa.getText().trim();
     
     
     RequestBody formBody = new FormEncodingBuilder().add("dato", dato).build();
        String r = con.getString("GraficaDominio", formBody); 
        System.out.println(r);
     
       txtBuscarDdispersa.setText("");
    }//GEN-LAST:event_btBuscarDdispersaActionPerformed

    private void btEliminarDispersaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarDispersaActionPerformed
             
             String  dato = txtEliminarDispersa.getText().trim();
     
     
     RequestBody formBody = new FormEncodingBuilder().add("dato", dato).build();
        String r = con.getString("EliminarL", formBody); 
        System.out.println(r);
     
       txtEliminarDispersa.setText("");
    }//GEN-LAST:event_btEliminarDispersaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMatrizDispersa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMatrizDispersa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMatrizDispersa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMatrizDispersa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMatrizDispersa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarDdispersa;
    private javax.swing.JButton btBuscarDispersa;
    private javax.swing.JButton btBuscarLdispersa;
    private javax.swing.JButton btEliminarDispersa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAgregarDispersa;
    private javax.swing.JTextField txtBuscarDdispersa;
    private javax.swing.JTextField txtBuscarLdispersa;
    private javax.swing.JTextField txtEliminarDispersa;
    // End of variables declaration//GEN-END:variables
}
