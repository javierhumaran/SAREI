/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarAgenda;

import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author JHumaran
 */
public class ConsultarCita extends javax.swing.JFrame {
    PanelTransparente panelTransparente = new PanelTransparente();
    int checkBoxResidente1 = 0;
    int checkBoxResidente2 = 0;
    ImageIcon checkBox = new ImageIcon("C:\\Users\\JHumaran\\Documents\\GitHub\\SAREI\\SAREI.Presentacion\\src\\administrarAgenda\\img/checkedBox.png"); 
    ImageIcon uncheckedBox = new ImageIcon("C:\\Users\\JHumaran\\Documents\\GitHub\\SAREI\\SAREI.Presentacion\\src\\administrarAgenda\\img/uncheckedBox.png");
    

    /**
     * Creates new form ConsultarCita
     */
    public ConsultarCita() {
        panelTransparente.setVisible(true);
        panelTransparente.setEnabled(false);
        initComponents();
    }

    public void validaLabelDia() {
        if (diaLabel.getText().equalsIgnoreCase("SABADO")) {
            diaLabel.setText("DOMINGO");
        } else if (diaLabel.getText().equalsIgnoreCase("DOMINGO")) {
            diaLabel.setText("SABADO");
        }
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
        headerPanel = new javax.swing.JPanel();
        diaLabel = new javax.swing.JLabel();
        botonDia = new javax.swing.JLabel();
        labelHabitacion = new javax.swing.JLabel();
        labelNumeroHabitacion = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        botonScrollDown = new javax.swing.JLabel();
        botonScrollUp = new javax.swing.JLabel();
        botonCheckBoxResidente1 = new javax.swing.JLabel();
        botonCheckBoxResidente2 = new javax.swing.JLabel();
        labelResidente1 = new javax.swing.JLabel();
        labelResidente2 = new javax.swing.JLabel();
        labelLineaHorizontal = new javax.swing.JLabel();
        botonListo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JLabel();
        labelLineaVerticalChica = new javax.swing.JLabel();
        labelLineaVerticalChica1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(153, 153, 153));

        diaLabel.setBackground(new java.awt.Color(153, 153, 153));
        diaLabel.setFont(new java.awt.Font("Roboto Cn", 0, 24)); // NOI18N
        diaLabel.setForeground(new java.awt.Color(255, 255, 255));
        diaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diaLabel.setText("SABADO");
        diaLabel.setOpaque(true);
        diaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diaLabelMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaLabelMouseClicked(evt);
            }
        });
        diaLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                diaLabelMouseMoved(evt);
            }
        });

        botonDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/flechaBlanca.png"))); // NOI18N
        botonDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDiaMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDiaMouseClicked(evt);
            }
        });
        botonDia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonDiaMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(diaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(diaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(botonDia)
                .addContainerGap())
        );

        labelHabitacion.setFont(new java.awt.Font("Roboto Cn", 0, 32)); // NOI18N
        labelHabitacion.setForeground(new java.awt.Color(166, 166, 166));
        labelHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabitacion.setText("Habitacion");

        labelNumeroHabitacion.setFont(new java.awt.Font("Roboto Cn", 0, 88)); // NOI18N
        labelNumeroHabitacion.setForeground(new java.awt.Color(153, 204, 0));
        labelNumeroHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroHabitacion.setText("1220");

        labelHora.setFont(new java.awt.Font("Roboto Cn", 0, 32)); // NOI18N
        labelHora.setForeground(new java.awt.Color(166, 166, 166));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText("10:00");

        botonScrollDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/scrollerDown.png"))); // NOI18N
        botonScrollDown.setToolTipText("");
        botonScrollDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonScrollDownMouseExited(evt);
            }
        });
        botonScrollDown.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonScrollDownMouseMoved(evt);
            }
        });

        botonScrollUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/scrollerUp.png"))); // NOI18N
        botonScrollUp.setToolTipText("");
        botonScrollUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonScrollUpMouseExited(evt);
            }
        });
        botonScrollUp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonScrollUpMouseMoved(evt);
            }
        });

        botonCheckBoxResidente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/uncheckedBox.png"))); // NOI18N
        botonCheckBoxResidente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente1MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente1MouseClicked(evt);
            }
        });
        botonCheckBoxResidente1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente1MouseMoved(evt);
            }
        });

        botonCheckBoxResidente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/uncheckedBox.png"))); // NOI18N
        botonCheckBoxResidente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente2MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente2MouseClicked(evt);
            }
        });
        botonCheckBoxResidente2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCheckBoxResidente2MouseMoved(evt);
            }
        });

        labelResidente1.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente1.setForeground(new java.awt.Color(51, 51, 51));
        labelResidente1.setText("Zamora Salcedo, Carlos Eduardo");

        labelResidente2.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelResidente2.setForeground(new java.awt.Color(51, 51, 51));
        labelResidente2.setText("Castillo Borquez, Luis Alfonso");

        labelLineaHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaHorizontal.png"))); // NOI18N

        botonListo.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonListo.setForeground(new java.awt.Color(51, 51, 51));
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

        botonEliminar.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/botonEliminar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        botonEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonEliminarMouseMoved(evt);
            }
        });

        labelLineaVerticalChica.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelLineaVerticalChica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLineaVerticalChica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N

        labelLineaVerticalChica1.setFont(new java.awt.Font("Roboto Cn", 0, 18)); // NOI18N
        labelLineaVerticalChica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLineaVerticalChica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrarAgenda/img/lineaVertical.png"))); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonScrollUp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonScrollDown))))))
                .addGap(83, 83, 83))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCheckBoxResidente1)
                    .addComponent(botonCheckBoxResidente2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelResidente2)
                    .addComponent(labelResidente1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelLineaHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(botonListo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLineaVerticalChica1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHabitacion)
                .addGap(2, 2, 2)
                .addComponent(labelNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHora)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonScrollUp, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonScrollDown, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCheckBoxResidente1)
                    .addComponent(labelResidente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCheckBoxResidente2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelResidente2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLineaHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonListo)
                            .addComponent(botonCancelar)
                            .addComponent(botonEliminar))
                        .addComponent(labelLineaVerticalChica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLineaVerticalChica1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        setSize(new java.awt.Dimension(376, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDiaMouseClicked
        validaLabelDia();
    }//GEN-LAST:event_botonDiaMouseClicked

    private void botonDiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDiaMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonDiaMouseExited

    private void botonDiaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDiaMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonDiaMouseMoved

    private void botonCheckBoxResidente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonCheckBoxResidente1MouseExited

    private void botonCheckBoxResidente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente1MouseClicked
        if (checkBoxResidente1 == 0) {
            checkBoxResidente1 = 1;
            botonCheckBoxResidente1.setIcon(checkBox);
        } else if (checkBoxResidente1 == 1) {
            checkBoxResidente1 = 0;
            botonCheckBoxResidente1.setIcon(uncheckedBox);
        }
    }//GEN-LAST:event_botonCheckBoxResidente1MouseClicked

    private void botonCheckBoxResidente1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente1MouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonCheckBoxResidente1MouseMoved

    private void botonCheckBoxResidente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente2MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonCheckBoxResidente2MouseExited

    private void botonCheckBoxResidente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente2MouseClicked
        if (checkBoxResidente2 == 0) {
            checkBoxResidente2 = 1;
            botonCheckBoxResidente2.setIcon(checkBox);
        } else if (checkBoxResidente2 == 1) {
            checkBoxResidente2 = 0;
            botonCheckBoxResidente2.setIcon(uncheckedBox);
        }
    }//GEN-LAST:event_botonCheckBoxResidente2MouseClicked

    private void botonCheckBoxResidente2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheckBoxResidente2MouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonCheckBoxResidente2MouseMoved

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

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        panelTransparente.dispose();
        dispose();
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonEliminarMouseMoved

    private void diaLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaLabelMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_diaLabelMouseMoved

    private void diaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaLabelMouseClicked
        validaLabelDia();
    }//GEN-LAST:event_diaLabelMouseClicked

    private void diaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaLabelMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_diaLabelMouseExited

    private void botonScrollDownMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollDownMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonScrollDownMouseMoved

    private void botonScrollDownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollDownMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonScrollDownMouseExited

    private void botonScrollUpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollUpMouseMoved
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botonScrollUpMouseMoved

    private void botonScrollUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonScrollUpMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_botonScrollUpMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCancelar;
    private javax.swing.JLabel botonCheckBoxResidente1;
    private javax.swing.JLabel botonCheckBoxResidente2;
    private javax.swing.JLabel botonDia;
    private javax.swing.JLabel botonEliminar;
    private javax.swing.JLabel botonListo;
    private javax.swing.JLabel botonScrollDown;
    private javax.swing.JLabel botonScrollUp;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel diaLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel labelHabitacion;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLineaHorizontal;
    private javax.swing.JLabel labelLineaVerticalChica;
    private javax.swing.JLabel labelLineaVerticalChica1;
    private javax.swing.JLabel labelNumeroHabitacion;
    private javax.swing.JLabel labelResidente1;
    private javax.swing.JLabel labelResidente2;
    // End of variables declaration//GEN-END:variables
}