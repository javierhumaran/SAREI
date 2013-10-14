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
public class ConfirmarCita extends javax.swing.JFrame {
    PanelTransparente panelTransparente = new PanelTransparente();

    /**
     * Creates new form ConfirmarCita
     */
    public ConfirmarCita() {
        panelTransparente.setVisible(true);
        panelTransparente.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        labelDia = new javax.swing.JLabel();
        labelResidente1 = new javax.swing.JLabel();
        labelResidente2 = new javax.swing.JLabel();
        labelResidente3 = new javax.swing.JLabel();
        labelResidente4 = new javax.swing.JLabel();
        labelResidente5 = new javax.swing.JLabel();
        labelResidente6 = new javax.swing.JLabel();
        labelResidente7 = new javax.swing.JLabel();
        labelLineaHorizontal = new javax.swing.JLabel();
        botonListo = new javax.swing.JLabel();
        labelLineaVerticalChica = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelDia.setBackground(new java.awt.Color(153, 153, 153));
        labelDia.setFont(new java.awt.Font("Roboto Cn", 0, 20)); // NOI18N
        labelDia.setForeground(new java.awt.Color(255, 255, 255));
        labelDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDia.setText("Confirmar Cita");
        labelDia.setOpaque(true);

        labelResidente1.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente1.setForeground(new java.awt.Color(166, 166, 166));
        labelResidente1.setText("Residente:");

        labelResidente2.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente2.setForeground(new java.awt.Color(51, 51, 51));
        labelResidente2.setText("Martinez Ayala, Victor Manuel");

        labelResidente3.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente3.setForeground(new java.awt.Color(51, 51, 51));
        labelResidente3.setText("Sabado");

        labelResidente4.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente4.setForeground(new java.awt.Color(166, 166, 166));
        labelResidente4.setText("Dia:");

        labelResidente5.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente5.setForeground(new java.awt.Color(51, 51, 51));
        labelResidente5.setText("10:00");

        labelResidente6.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente6.setForeground(new java.awt.Color(166, 166, 166));
        labelResidente6.setText("Hora:");

        labelResidente7.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente7.setForeground(new java.awt.Color(255, 0, 0));
        labelResidente7.setText("¿Es correcta esta información?");

        labelLineaHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaHorizontal.png"))); // NOI18N

        botonListo.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonListo.setForeground(new java.awt.Color(0, 0, 0));
        botonListo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonAceptar.png"))); // NOI18N
        botonListo.setText("Listo");
        botonListo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonListoMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonListoMouseClicked(evt);
            }
        });
        botonListo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonListoMouseMoved(evt);
            }
        });

        labelLineaVerticalChica.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelLineaVerticalChica.setForeground(new java.awt.Color(0, 0, 0));
        labelLineaVerticalChica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLineaVerticalChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N

        botonCancelar.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonCancelar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCancelarMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });
        botonCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCancelarMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelLineaHorizontal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelResidente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResidente2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(labelResidente4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResidente3)
                        .addGap(31, 31, 31)
                        .addComponent(labelResidente6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResidente5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(labelResidente7)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonListo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResidente1)
                    .addComponent(labelResidente2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResidente4)
                    .addComponent(labelResidente3)
                    .addComponent(labelResidente6)
                    .addComponent(labelResidente5))
                .addGap(18, 18, 18)
                .addComponent(labelResidente7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLineaHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonListo)
                    .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(421, 205));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonListoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonListoMouseExited

    private void botonListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseClicked
        panelTransparente.dispose();
        dispose();
    }//GEN-LAST:event_botonListoMouseClicked

    private void botonListoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonListoMouseMoved

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        panelTransparente.dispose();
        dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCancelar;
    private javax.swing.JLabel botonListo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelLineaHorizontal;
    private javax.swing.JLabel labelLineaVerticalChica;
    private javax.swing.JLabel labelResidente1;
    private javax.swing.JLabel labelResidente2;
    private javax.swing.JLabel labelResidente3;
    private javax.swing.JLabel labelResidente4;
    private javax.swing.JLabel labelResidente5;
    private javax.swing.JLabel labelResidente6;
    private javax.swing.JLabel labelResidente7;
    // End of variables declaration//GEN-END:variables
}
