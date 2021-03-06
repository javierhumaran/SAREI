/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarAgenda;

import java.awt.Cursor;

/**
 *
 * @author JHumaran
 */
public class ConfirmacionImpresion extends javax.swing.JFrame {
    ImprimirCitas imprimirCitas = new ImprimirCitas();

    /**
     * Creates new form ConfirmacionImpresion
     */
    public ConfirmacionImpresion() {
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

        contentPanel = new javax.swing.JPanel();
        labelDia = new javax.swing.JLabel();
        botonListo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JLabel();
        labelLineaVerticalChica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelDia.setBackground(new java.awt.Color(153, 153, 153));
        labelDia.setFont(new java.awt.Font("Roboto Cn", 0, 20)); // NOI18N
        labelDia.setForeground(new java.awt.Color(255, 255, 255));
        labelDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDia.setText("¿Están correctos los datos de impresión?");
        labelDia.setOpaque(true);

        botonListo.setBackground(new java.awt.Color(255, 255, 255));
        botonListo.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonListo.setForeground(new java.awt.Color(0, 0, 0));
        botonListo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonAceptar.png"))); // NOI18N
        botonListo.setText("Aceptar");
        botonListo.setOpaque(true);
        botonListo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonListoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonListoMouseExited(evt);
            }
        });
        botonListo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonListoMouseMoved(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonCancelar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setOpaque(true);
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
        });
        botonCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCancelarMouseMoved(evt);
            }
        });

        labelLineaVerticalChica.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelLineaVerticalChica.setForeground(new java.awt.Color(0, 0, 0));
        labelLineaVerticalChica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLineaVerticalChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(botonListo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonListo)
                        .addComponent(botonCancelar))
                    .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(505, 83));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseClicked
        imprimirCitas.dispose();
        dispose();
    }//GEN-LAST:event_botonListoMouseClicked

    private void botonListoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonListoMouseExited

    private void botonListoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonListoMouseMoved

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseMoved

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
            java.util.logging.Logger.getLogger(ConfirmacionImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionImpresion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCancelar;
    private javax.swing.JLabel botonListo;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelLineaVerticalChica;
    // End of variables declaration//GEN-END:variables
}
