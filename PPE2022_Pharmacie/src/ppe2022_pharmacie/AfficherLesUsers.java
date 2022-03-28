/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ppe2022_pharmacie;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author sio2021
 */
public class AfficherLesUsers extends javax.swing.JFrame {

    private static final UtilisateurDAO passerelleUser = new UtilisateurDAO();
    /**
     * Creates new form AfficherLesUsers
     */
    public AfficherLesUsers() {
        
        this.setResizable(false);
        initComponents();
        passerelleUser.Connection();

        DefaultListModel listModel = new DefaultListModel();
        for (Utilisateur u : passerelleUser.findAll()) {
            listModel.addElement(u);
        }
        lstUser.setModel(listModel);
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
        lstUser = new javax.swing.JList<>();
        btnModifUser = new javax.swing.JButton();
        btnSupprUser = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        btnAjouter = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstUser.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstUser);

        btnModifUser.setText("Modifier");
        btnModifUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifUserMouseClicked(evt);
            }
        });

        btnSupprUser.setText("Supprimer");
        btnSupprUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupprUserMouseClicked(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.setPreferredSize(new java.awt.Dimension(85, 22));
        btnQuitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitterMouseClicked(evt);
            }
        });

        btnAjouter.setText("Ajouter");
        btnAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjouterMouseClicked(evt);
            }
        });

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

        btnDeconnexion.setText("Déconnexion");
        btnDeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeconnexionMouseClicked(evt);
            }
        });
        btnDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModifUser, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSupprUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualiser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModifUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSupprUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitterMouseClicked
        dispose();
    }//GEN-LAST:event_btnQuitterMouseClicked

    private void btnSupprUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprUserMouseClicked
        Integer choix = lstUser.getSelectedIndex();
        if (choix != null) {
            Object val = lstUser.getModel().getElementAt(choix);
            Utilisateur unUser = (Utilisateur) val;

            passerelleUser.delete(unUser);

            DefaultListModel listModel = new DefaultListModel();
            for (Utilisateur u : passerelleUser.findAll()) {
                listModel.addElement(u);
            }
            lstUser.setModel(listModel);
        } else {
            lblOutput.setText("aucun utilisateur n'a été choisi");
        }


    }//GEN-LAST:event_btnSupprUserMouseClicked

    private void btnAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseClicked
        new AjouterUtilisateur().setVisible(true);
    }//GEN-LAST:event_btnAjouterMouseClicked

    private void btnModifUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifUserMouseClicked
        Integer choix = lstUser.getSelectedIndex();
        if (choix != null) {
            Object val = lstUser.getModel().getElementAt(choix);
            Utilisateur unUser = (Utilisateur) val;

            new AjouterUtilisateur(unUser,this).setVisible(true);

            DefaultListModel listModel = new DefaultListModel();
            for (Utilisateur u : passerelleUser.findAll()) {
                listModel.addElement(u);
            }
        DefaultListModel listeModel = new DefaultListModel();
        for (Utilisateur u : passerelleUser.findAll()) {
            listeModel.addElement(u);
        }
            lstUser.setModel(listeModel);
        } else {
            lblOutput.setText("aucun utilisateur n'a été choisi");
        }
    }//GEN-LAST:event_btnModifUserMouseClicked

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnActualiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseClicked
        DefaultListModel listModel = new DefaultListModel();
        for (Utilisateur u : passerelleUser.findAll()) {
            listModel.addElement(u);
        }
        lstUser.setModel(listModel);
    }//GEN-LAST:event_btnActualiserMouseClicked

    private void btnDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeconnexionActionPerformed

    private void btnDeconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeconnexionMouseClicked
        new Authentification().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(AfficherLesUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherLesUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherLesUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherLesUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherLesUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnModifUser;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSupprUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JList<String> lstUser;
    // End of variables declaration//GEN-END:variables
}
