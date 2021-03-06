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
public class AgregarCita extends javax.swing.JFrame {
    PanelTransparente panelTransparente = new PanelTransparente();
    
    /**
     * Creates new form AgregarCita
     */
    public AgregarCita() {
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

        contentPanel = new javax.swing.JPanel();
        panelCita = new javax.swing.JPanel();
        labelDia = new javax.swing.JLabel();
        labelBusqueda = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JLabel();
        campoTextoBusqueda = new javax.swing.JTextField();
        labelHora = new javax.swing.JLabel();
        labelNumeroHabitacion = new javax.swing.JLabel();
        labelHabitacion = new javax.swing.JLabel();
        botonScrollDown = new javax.swing.JLabel();
        botonScrollUp = new javax.swing.JLabel();
        labelLineaVerticalChica = new javax.swing.JLabel();
        botonListo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JLabel();
        labelLineaHorizontal = new javax.swing.JLabel();
        labelLineaVerticalGrande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1364, 702));

        panelCita.setBackground(new java.awt.Color(255, 255, 255));
        panelCita.setLayout(null);

        labelDia.setBackground(new java.awt.Color(153, 153, 153));
        labelDia.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        labelDia.setForeground(new java.awt.Color(255, 255, 255));
        labelDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDia.setText("SABADO");
        labelDia.setOpaque(true);
        panelCita.add(labelDia);
        labelDia.setBounds(0, 0, 300, 50);

        labelBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        labelBusqueda.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        labelBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 166, 166)));
        panelCita.add(labelBusqueda);
        labelBusqueda.setBounds(300, 0, 300, 50);

        botonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonBuscar.png"))); // NOI18N
        panelCita.add(botonBuscar);
        botonBuscar.setBounds(560, 0, 40, 50);

        campoTextoBusqueda.setFont(new java.awt.Font("Roboto Cn", 0, 20)); // NOI18N
        campoTextoBusqueda.setForeground(new java.awt.Color(204, 204, 204));
        campoTextoBusqueda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoTextoBusqueda.setText("Busqueda por nombre");
        campoTextoBusqueda.setBorder(null);
        panelCita.add(campoTextoBusqueda);
        campoTextoBusqueda.setBounds(320, 0, 240, 50);

        labelHora.setFont(new java.awt.Font("Roboto Cn", 0, 32)); // NOI18N
        labelHora.setForeground(new java.awt.Color(166, 166, 166));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("10:00");
        panelCita.add(labelHora);
        labelHora.setBounds(95, 200, 100, 42);

        labelNumeroHabitacion.setFont(new java.awt.Font("Roboto Cn", 0, 88)); // NOI18N
        labelNumeroHabitacion.setForeground(new java.awt.Color(153, 204, 0));
        labelNumeroHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroHabitacion.setText("1220");
        panelCita.add(labelNumeroHabitacion);
        labelNumeroHabitacion.setBounds(50, 100, 210, 100);

        labelHabitacion.setFont(new java.awt.Font("Roboto Cn", 0, 32)); // NOI18N
        labelHabitacion.setForeground(new java.awt.Color(166, 166, 166));
        labelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabitacion.setText("Habitacion");
        panelCita.add(labelHabitacion);
        labelHabitacion.setBounds(70, 60, 170, 42);

        botonScrollDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/scrollerDown.png"))); // NOI18N
        botonScrollDown.setToolTipText("");
        botonScrollDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonScrollDownMouseClicked(evt);
            }
        });
        botonScrollDown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonScrollDownKeyPressed(evt);
            }
        });
        panelCita.add(botonScrollDown);
        botonScrollDown.setBounds(200, 222, 8, 20);

        botonScrollUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/scrollerUp.png"))); // NOI18N
        botonScrollUp.setToolTipText("");
        botonScrollUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonScrollUpMouseClicked(evt);
            }
        });
        botonScrollUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonScrollUpKeyPressed(evt);
            }
        });
        panelCita.add(botonScrollUp);
        botonScrollUp.setBounds(200, 208, 10, 10);

        labelLineaVerticalChica.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelLineaVerticalChica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLineaVerticalChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N
        panelCita.add(labelLineaVerticalChica);
        labelLineaVerticalChica.setBounds(150, 260, 20, 30);

        botonListo.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonListo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonAceptar.png"))); // NOI18N
        botonListo.setText("Listo");
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
        panelCita.add(botonListo);
        botonListo.setBounds(10, 260, 140, 32);

        botonCancelar.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonCancelar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
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
        panelCita.add(botonCancelar);
        botonCancelar.setBounds(170, 260, 130, 32);

        labelLineaHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaHorizontal.png"))); // NOI18N
        panelCita.add(labelLineaHorizontal);
        labelLineaHorizontal.setBounds(0, 250, 300, 10);

        labelLineaVerticalGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N
        panelCita.add(labelLineaVerticalGrande);
        labelLineaVerticalGrande.setBounds(300, 50, 10, 250);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelCita, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelCita, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-598)/2, (screenSize.height-297)/2, 598, 297);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        panelTransparente.dispose();
        dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseClicked
        panelTransparente.dispose();
        dispose();
    }//GEN-LAST:event_botonListoMouseClicked

    private void botonListoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonListoMouseMoved

    private void botonListoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListoMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonListoMouseExited

    private void botonCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseMoved

    private void botonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonCancelarMouseExited

    private void botonScrollUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonScrollUpKeyPressed

        
        
    }//GEN-LAST:event_botonScrollUpKeyPressed

    private void botonScrollDownKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonScrollDownKeyPressed
       

        
    }//GEN-LAST:event_botonScrollDownKeyPressed

    private void botonScrollDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollDownMouseClicked
       
        System.out.println("Holis abajo");
        
    }//GEN-LAST:event_botonScrollDownMouseClicked

    private void botonScrollUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollUpMouseClicked
        
        System.out.println("holis arriba");
        
    }//GEN-LAST:event_botonScrollUpMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCita().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonBuscar;
    private javax.swing.JLabel botonCancelar;
    private javax.swing.JLabel botonListo;
    private javax.swing.JLabel botonScrollDown;
    private javax.swing.JLabel botonScrollUp;
    private javax.swing.JTextField campoTextoBusqueda;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLineaHorizontal;
    private javax.swing.JLabel labelLineaVerticalChica;
    private javax.swing.JLabel labelLineaVerticalGrande;
    private javax.swing.JLabel labelNumeroHabitacion;
    private javax.swing.JPanel panelCita;
    // End of variables declaration//GEN-END:variables
}
