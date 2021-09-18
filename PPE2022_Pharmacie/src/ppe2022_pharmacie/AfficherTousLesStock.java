package ppe2022_pharmacie;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class AfficherTousLesStock extends javax.swing.JFrame {

    ArrayList<Stock> unStock = new ArrayList<Stock>();
    Scanner sc = new Scanner(System.in);

    public AfficherTousLesStock() {
        initComponents();
        PasserelleAuth.Connection();
        unStock = PasserelleAuth.donnerTousLesStocks();

        DefaultListModel listModel = new DefaultListModel();
        for (Stock pdt : PasserelleAuth.donnerTousLesStocks()) {
            listModel.addElement(pdt);
        }
        lstAfficherTous.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblTitre1 = new javax.swing.JLabel();
        lblAfficherTous1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnActualiser1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAfficherTous1 = new javax.swing.JList<>();
        btnActualiser2 = new javax.swing.JButton();
        btnActualiser3 = new javax.swing.JButton();
        lblTitre = new javax.swing.JLabel();
        lblAfficherTous = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAfficherTous = new javax.swing.JList<>();
        btnSeuil = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 51, 51));
        lblTitre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre1.setText("Gestion Stock");

        lblAfficherTous1.setText("Afficher tous les produits");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Fermer");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnActualiser1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnActualiser1.setForeground(new java.awt.Color(255, 51, 51));
        btnActualiser1.setText("Actualiser");
        btnActualiser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualiser1MouseClicked(evt);
            }
        });
        btnActualiser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiser1ActionPerformed(evt);
            }
        });

        lstAfficherTous1.setToolTipText("");
        lstAfficherTous1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAfficherTous1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstAfficherTous1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblAfficherTous1))
                            .addComponent(lblTitre1))
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(btnActualiser1)
                        .addGap(168, 168, 168)
                        .addComponent(jButton2)
                        .addContainerGap())))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAfficherTous1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualiser1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnActualiser2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnActualiser2.setForeground(new java.awt.Color(255, 51, 51));
        btnActualiser2.setText("Actualiser");
        btnActualiser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualiser2MouseClicked(evt);
            }
        });
        btnActualiser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiser2ActionPerformed(evt);
            }
        });

        btnActualiser3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnActualiser3.setForeground(new java.awt.Color(255, 51, 51));
        btnActualiser3.setText("Actualiser");
        btnActualiser3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualiser3MouseClicked(evt);
            }
        });
        btnActualiser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiser3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(255, 51, 51));
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Gestion Stock");

        lblAfficherTous.setText("Afficher tous les produits");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Fermer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnActualiser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnActualiser.setForeground(new java.awt.Color(255, 51, 51));
        btnActualiser.setText("Actualiser");
        btnActualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualiserMouseClicked(evt);
            }
        });
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        lstAfficherTous.setToolTipText("");
        lstAfficherTous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAfficherTousMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstAfficherTous);

        btnSeuil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSeuil.setForeground(new java.awt.Color(255, 51, 51));
        btnSeuil.setText("Seuil");
        btnSeuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeuilMouseClicked(evt);
            }
        });
        btnSeuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeuilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblAfficherTous))
                            .addComponent(lblTitre))
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualiser)
                        .addGap(27, 27, 27)
                        .addComponent(btnSeuil)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAfficherTous)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualiser)
                    .addComponent(jButton1)
                    .addComponent(btnSeuil))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnActualiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseClicked
        unStock = PasserelleAuth.donnerTousLesStocks();

        DefaultListModel listModel = new DefaultListModel();
        for (Stock pdt : PasserelleAuth.donnerTousLesStocks()) {
            listModel.addElement(pdt);
        }
        lstAfficherTous.setModel(listModel);
    }//GEN-LAST:event_btnActualiserMouseClicked

    private void lstAfficherTousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAfficherTousMouseClicked
        int choix=lstAfficherTous.getSelectedIndex();
        Object val= lstAfficherTous.getModel().getElementAt(choix);
        Stock unPdt=(Stock) val;
    }//GEN-LAST:event_lstAfficherTousMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualiser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser1MouseClicked

    private void btnActualiser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser1ActionPerformed

    private void lstAfficherTous1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAfficherTous1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lstAfficherTous1MouseClicked

    private void btnActualiser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser2MouseClicked

    private void btnActualiser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser2ActionPerformed

    private void btnActualiser3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiser3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser3MouseClicked

    private void btnActualiser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiser3ActionPerformed

    private void btnSeuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeuilMouseClicked
        unStock = PasserelleAuth.donnerStockSeuil();

        DefaultListModel listModel = new DefaultListModel();
        for (Stock pdt : PasserelleAuth.donnerStockSeuil()) {
            listModel.addElement(pdt);
        }
        lstAfficherTous.setModel(listModel);
    }//GEN-LAST:event_btnSeuilMouseClicked

    private void btnSeuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeuilActionPerformed

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
            java.util.logging.Logger.getLogger(AfficherTousLesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherTousLesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherTousLesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherTousLesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherTousLesStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnActualiser1;
    private javax.swing.JButton btnActualiser2;
    private javax.swing.JButton btnActualiser3;
    private javax.swing.JButton btnSeuil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAfficherTous;
    private javax.swing.JLabel lblAfficherTous1;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JList<String> lstAfficherTous;
    private javax.swing.JList<String> lstAfficherTous1;
    // End of variables declaration//GEN-END:variables
}
