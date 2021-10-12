/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe2022_pharmacie;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author sio2021
 */
public class AfficherDemandes extends javax.swing.JFrame {

    ArrayList<Demande> uneDemande = new ArrayList<Demande>();
    private Utilisateur unUser;

    public AfficherDemandes(boolean pharmacien, Utilisateur unUser) {
        this.unUser = unUser;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Passerelle.Connection();
        initComponents();

        if (!pharmacien) {
            btnValider.setVisible(false);
            DefaultListModel listModel = new DefaultListModel();
            for (Demande dmd : Passerelle.AfficherDemandeParService(unUser.getService().getIdService())) {
                listModel.addElement(dmd);
            }
        } else {
            btnCreerDemande.setVisible(false);
            btnDeconnexion.setVisible(false);
            DefaultListModel listModel = new DefaultListModel();
            for (Demande dmd : Passerelle.AfficherDemande()) {
                listModel.addElement(dmd);
            }
        }

        DefaultListModel listModel = new DefaultListModel();
        for (Demande dmd : Passerelle.AfficherDemande()) {
            listModel.addElement(dmd);
        }
        ListD.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListD = new javax.swing.JList<>();
        btnValider = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnCreerDemande = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListD);

        btnValider.setText("Valider");
        btnValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValiderMouseClicked(evt);
            }
        });

        btnFermer.setText("Fermer");
        btnFermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFermerMouseClicked(evt);
            }
        });

        btnCreerDemande.setText("Ajouter");
        btnCreerDemande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreerDemandeMouseClicked(evt);
            }
        });
        btnCreerDemande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerDemandeActionPerformed(evt);
            }
        });

        btnDeconnexion.setText("Deconnexion");
        btnDeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeconnexionMouseClicked(evt);
            }
        });

        jLabel1.setText("LISTE DES DEMANDES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFermer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeconnexion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValider)
                    .addComponent(btnCreerDemande))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnCreerDemande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeconnexion)
                    .addComponent(btnFermer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseClicked
        dispose();
    }//GEN-LAST:event_btnFermerMouseClicked

    private void ListDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListDMouseClicked


    }//GEN-LAST:event_ListDMouseClicked

    private void btnValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseClicked

        int choix = ListD.getSelectedIndex();
        Object val = ListD.getModel().getElementAt(choix);
        Demande uneDmd = (Demande) val;
        int qtteM = Passerelle.avoirQtte(uneDmd.getMedicament().getId());
        Passerelle.validerQtte(uneDmd.getQtte(), qtteM, uneDmd.getMedicament().getId());
        Passerelle.SupprDemande(uneDmd.getIdD());
        //Actualisation
        DefaultListModel listModel = new DefaultListModel();
        for (Demande dmd : Passerelle.AfficherDemande()) {
            listModel.addElement(dmd);
        }
        ListD.setModel(listModel);
    }//GEN-LAST:event_btnValiderMouseClicked

    private void btnCreerDemandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerDemandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreerDemandeActionPerformed

    private void btnCreerDemandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreerDemandeMouseClicked
        new CreationDeDemande(unUser).setVisible(true);
    }//GEN-LAST:event_btnCreerDemandeMouseClicked

    private void btnDeconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionMouseClicked
        new Authentification().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeconnexionMouseClicked

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
            java.util.logging.Logger.getLogger(AfficherDemandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherDemandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherDemandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherDemandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AfficherDemandes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListD;
    private javax.swing.JButton btnCreerDemande;
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
