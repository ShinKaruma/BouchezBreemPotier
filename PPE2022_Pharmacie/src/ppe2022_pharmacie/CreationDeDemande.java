/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe2022_pharmacie;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sio2021
 */
public class CreationDeDemande extends javax.swing.JFrame {

    /**
     * Creates new form CreationDeDemande
     */
    public CreationDeDemande() {
        initComponents();
        ArrayList<Stock> ArrayMedic = Passerelle.donnerTousLesStocks();
        for (Stock c: ArrayMedic) {
            cbxMedicament.addItem(c.getLibelle());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnV = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TFQ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAnnuler = new javax.swing.JButton();
        cbxService = new javax.swing.JComboBox<>();
        cbxMedicament = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Création d'une Demande");

        TFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrer l'id de la Demande:");

        btnV.setText("Valider");
        btnV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVMouseClicked(evt);
            }
        });
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        jLabel3.setText("Entrer l'id du Service:");

        jLabel4.setText("Entrer l'id du Médicament:");

        jLabel5.setText("Entrer la Quantitée:");

        btnAnnuler.setText("Annuler");
        btnAnnuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnnulerMouseClicked(evt);
            }
        });
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        cbxService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxServiceActionPerformed(evt);
            }
        });

        cbxMedicament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicamentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFD)
                            .addComponent(TFQ, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(cbxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnnuler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnV)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnV)
                    .addComponent(btnAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        // TODO add your handling code here:
        String SidDem = TFD.getText();
        String SidServ = TFS.getText();
        Object medSelec= cbxMedicament.getSelectedItem();
        String Sqtte = TFQ.getText();

        int idDem = Integer.parseInt(SidDem);
        int idServ = Integer.parseInt(SidServ);
        int idMed = Integer.parseInt(SidMed);

        int qtte = Integer.parseInt(Sqtte);
        Demande uneDemande = new Demande(idDem, idServ, idMed, qtte);
        Passerelle.CreaDemande(uneDemande);
        JOptionPane.showMessageDialog(null, "Demande créée");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnAnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerMouseClicked
        dispose();
    }//GEN-LAST:event_btnAnnulerMouseClicked

    private void cbxServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxServiceActionPerformed

    }//GEN-LAST:event_cbxServiceActionPerformed

    private void cbxMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMedicamentActionPerformed

    private void btnVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVMouseClicked
        String Tous = "Tous";
        if (cbxMedicament.getSelectedItem() == Tous) {
            DefaultListModel listModel = new DefaultListModel();
            for (Stock pdt : Passerelle.donnerTousLesStocks()) {
                listModel.addElement(pdt);
            }
        }
    }//GEN-LAST:event_btnVMouseClicked

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
            java.util.logging.Logger.getLogger(CreationDeDemande.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreationDeDemande.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreationDeDemande.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreationDeDemande.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreationDeDemande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFD;
    private javax.swing.JTextField TFQ;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnV;
    private javax.swing.JComboBox<String> cbxMedicament;
    private javax.swing.JComboBox<String> cbxService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
