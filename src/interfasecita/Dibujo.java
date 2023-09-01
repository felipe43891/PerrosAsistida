package interfasecita;

import javax.swing.JOptionPane;



/**
 *
 * @author Julian Jimenez
 */
public class Dibujo extends javax.swing.JFrame {

    public Dibujo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PerroG = new javax.swing.JLabel();
        RG = new javax.swing.JTextField();
        PerroM = new javax.swing.JLabel();
        RP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TT = new javax.swing.JTextField();
        PerroP = new javax.swing.JLabel();
        RM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Horas = new javax.swing.JLabel();
        RH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        PerroG.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PerroG.setText("Cuantos Perros Grandes");

        RG.setBackground(new java.awt.Color(255, 255, 51));
        RG.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGActionPerformed(evt);
            }
        });

        PerroM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PerroM.setText("Cuantos Perros Medianos");

        RP.setBackground(new java.awt.Color(255, 255, 0));
        RP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Calcular Total :");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TT.setBackground(new java.awt.Color(0, 255, 255));
        TT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTActionPerformed(evt);
            }
        });

        PerroP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PerroP.setText("Cuantos Perros Pequeños");

        RM.setBackground(new java.awt.Color(255, 255, 0));
        RM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Paseador de Perros");
        jScrollPane1.setViewportView(jTextArea1);

        Horas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Horas.setText("Cuantas Horas Desea");

        RH.setBackground(new java.awt.Color(255, 255, 51));
        RH.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(PerroG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PerroM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(PerroP, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerroG, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerroM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerroP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGActionPerformed
        
    }//GEN-LAST:event_RGActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int perrosGrandes = Integer.parseInt(RG.getText());
        int perrosMedianos = Integer.parseInt(RM.getText());
        int perrosPequenos = Integer.parseInt(RP.getText());
        int Horas = Integer.parseInt(RH.getText());
        
        int costoTotal = calcularCostoTotal(perrosGrandes, perrosMedianos, perrosPequenos, Horas);
        TT.setText(Integer.toString(costoTotal));
        
        JOptionPane.showMessageDialog(this, "El costo Total es: " + costoTotal);
      
    }//GEN-LAST:event_jButton1ActionPerformed
    private int calcularCostoTotal(int perrosGrandes, int perrosMedianos, int perrosPequenos, int horas) {
        int costoPerroGrande = 10000;
        int costoPerroMediano = 5000;
        int costoPerroPequeno = 3000;

        int costoTotal = (perrosGrandes * costoPerroGrande) + (perrosMedianos * costoPerroMediano) + (perrosPequenos * costoPerroPequeno);

        int totalPerros = perrosGrandes + perrosMedianos + perrosPequenos;

        if (totalPerros > 1) {
            double descuento = costoTotal * 0.1;
            costoTotal -= descuento;
        }

        costoTotal *= horas; 

        return costoTotal;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dibujo().setVisible(true);
            }
        });
    }
    
    
    
    private void RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPActionPerformed
        
    }//GEN-LAST:event_RPActionPerformed

    private void TTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTActionPerformed
    
        
    }//GEN-LAST:event_TTActionPerformed

    private void RMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RMActionPerformed
        
    }//GEN-LAST:event_RMActionPerformed

    private void RHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RHActionPerformed
        
    }//GEN-LAST:event_RHActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Horas;
    private javax.swing.JLabel PerroG;
    private javax.swing.JLabel PerroM;
    private javax.swing.JLabel PerroP;
    private javax.swing.JTextField RG;
    private javax.swing.JTextField RH;
    private javax.swing.JTextField RM;
    private javax.swing.JTextField RP;
    private javax.swing.JTextField TT;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
