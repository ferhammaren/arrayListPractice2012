/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1algoritmos;

import javax.swing.JOptionPane;
import Controller.UserInteraction;

/**
 *
 * @author lfmeza
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
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

        btnRandom = new javax.swing.JButton();
        btnDraw = new javax.swing.JButton();
        btnVertex = new javax.swing.JButton();
        sldVertex = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        lblVertexValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Array List Practice");
        setLocation(new java.awt.Point(200, 200));

        btnRandom.setText("Random Figure");
        btnRandom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRandomMouseClicked(evt);
            }
        });

        btnDraw.setEnabled(false);
        btnDraw.setLabel("Draw Figures");
        btnDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDrawMouseClicked(evt);
            }
        });

        btnVertex.setText("Specify Figure");
        btnVertex.setEnabled(false);
        btnVertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVertexMouseClicked(evt);
            }
        });

        sldVertex.setMaximum(20);
        sldVertex.setMinimum(10);
        sldVertex.setPaintLabels(true);
        sldVertex.setPaintTicks(true);
        sldVertex.setSnapToTicks(true);
        sldVertex.setValue(10);
        sldVertex.setName("jSlPoints"); // NOI18N
        sldVertex.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sldVertexPropertyChange(evt);
            }
        });

        jLabel1.setText("Vertices:");

        lblVertexValue.setText("10");
        lblVertexValue.setName("lblVertex"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVertexValue)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sldVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRandom))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRandom)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblVertexValue))
                        .addGap(3, 3, 3)
                        .addComponent(btnVertex))
                    .addComponent(sldVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDraw)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        sldVertex.getAccessibleContext().setAccessibleName("jSPoints");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldVertexPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sldVertexPropertyChange
        // TODO add your handling code here:
        btnVertex.setEnabled(true);
        this.lblVertexValue.setText(String.valueOf(this.sldVertex.getValue()));
    }//GEN-LAST:event_sldVertexPropertyChange

    private void btnRandomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRandomMouseClicked
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "A 10 to 20 vertices figure has been generated", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
        ui.option1();
        btnVertex.setEnabled(true);
    }//GEN-LAST:event_btnRandomMouseClicked

    private void btnVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVertexMouseClicked
        // TODO add your handling code here:
        ui.figure2(this.sldVertex.getValue());
        btnDraw.setEnabled(true);
    }//GEN-LAST:event_btnVertexMouseClicked

    private void btnDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrawMouseClicked
        ui.drawFigures();
    }//GEN-LAST:event_btnDrawMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new UserInterface().setVisible(true);
               ui=new UserInteraction();
               
            }
        });
    }
public static UserInteraction ui;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDraw;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnVertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblVertexValue;
    private javax.swing.JSlider sldVertex;
    // End of variables declaration//GEN-END:variables
}