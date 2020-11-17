/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe3.ventes_perpi_co;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author A.A
 */
public class Actions extends javax.swing.JPanel {

    /**
     * Creates new form Actions
     */
    public Actions() {
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

        jTabbedPaneActions = new javax.swing.JTabbedPane();
        jPanelGenererJeuEssai = new javax.swing.JPanel();
        jLabelJeuProduit = new javax.swing.JLabel();
        jTextFieldNombreProduit = new javax.swing.JTextField();
        jButtonGenererJeuProduit = new javax.swing.JButton();
        jLabelJeuCategorie = new javax.swing.JLabel();
        jTextFieldNombreCategorie = new javax.swing.JTextField();
        jButtonGenererJeuCategorie = new javax.swing.JButton();
        jLabelErreurGenerationProduit = new javax.swing.JLabel();
        jLabelErreurGenerationCategorie = new javax.swing.JLabel();
        jPanelGestionAgent = new javax.swing.JPanel();
        jScrollPaneTableauAgent = new javax.swing.JScrollPane();
        jListListeAgent = new javax.swing.JList<>();
        jButtonRechargerTableauAgent = new javax.swing.JButton();

        jTabbedPaneActions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneActionsMouseClicked(evt);
            }
        });

        jLabelJeuProduit.setText("Nombre à générer");

        jButtonGenererJeuProduit.setText("Générer un jeu d'essai pour les produits");
        jButtonGenererJeuProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenererJeuProduitActionPerformed(evt);
            }
        });

        jLabelJeuCategorie.setText("Nombre à générer");

        jButtonGenererJeuCategorie.setText("Générer un jeu d'essai pour les catégories");
        jButtonGenererJeuCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenererJeuCategorieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGenererJeuEssaiLayout = new javax.swing.GroupLayout(jPanelGenererJeuEssai);
        jPanelGenererJeuEssai.setLayout(jPanelGenererJeuEssaiLayout);
        jPanelGenererJeuEssaiLayout.setHorizontalGroup(
            jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGenererJeuEssaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelGenererJeuEssaiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelJeuProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombreProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelErreurGenerationProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonGenererJeuProduit)
                    .addComponent(jButtonGenererJeuCategorie)
                    .addGroup(jPanelGenererJeuEssaiLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelJeuCategorie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombreCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErreurGenerationCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelGenererJeuEssaiLayout.setVerticalGroup(
            jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGenererJeuEssaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErreurGenerationProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombreProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelJeuProduit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGenererJeuProduit)
                .addGap(8, 8, 8)
                .addGroup(jPanelGenererJeuEssaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJeuCategorie)
                    .addComponent(jLabelErreurGenerationCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenererJeuCategorie)
                .addGap(172, 172, 172))
        );

        jTabbedPaneActions.addTab("Génération d'un jeu d'essai", jPanelGenererJeuEssai);

        jListListeAgent.setModel(new DefaultListModel()
        );
        jScrollPaneTableauAgent.setViewportView(jListListeAgent);

        jButtonRechargerTableauAgent.setText("Recharger la liste des agents");
        jButtonRechargerTableauAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechargerTableauAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGestionAgentLayout = new javax.swing.GroupLayout(jPanelGestionAgent);
        jPanelGestionAgent.setLayout(jPanelGestionAgentLayout);
        jPanelGestionAgentLayout.setHorizontalGroup(
            jPanelGestionAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestionAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTableauAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(jPanelGestionAgentLayout.createSequentialGroup()
                        .addComponent(jButtonRechargerTableauAgent)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelGestionAgentLayout.setVerticalGroup(
            jPanelGestionAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionAgentLayout.createSequentialGroup()
                .addComponent(jScrollPaneTableauAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRechargerTableauAgent))
        );

        jTabbedPaneActions.addTab("Gestion des agents", jPanelGestionAgent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneActions)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneActions)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenererJeuProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenererJeuProduitActionPerformed
        // Vérifie si le champ est rempli
        if ("".equals(jTextFieldNombreProduit.getText())) {
            jLabelErreurGenerationProduit.setText("Veuillez remplir le champ pour pouvoir générer un jeu d'essai pour les produits");
        } else {
            try {
            } catch (Exception e) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, e);
                jLabelErreurGenerationProduit.setText("Erreur lors de la génération d'un jeu d'essai pour les produits");
            }
        }
        DAO.getInstance().requeteAction("DELETE FROM produit");
        // Insertion de(s) nouveau(x) tuples générés dans la table 'produit'
        int i = 0;
        while (i < Integer.valueOf(jTextFieldNombreProduit.getText())) {
            DAO.getInstance().requeteAction("INSERT INTO produit VALUES (null, 'produit " + i + "',10 , 10, '****', 1)");
            i++;
        }
        jLabelErreurGenerationProduit.setText(i + " produit(s) ajouté(s)");
    }//GEN-LAST:event_jButtonGenererJeuProduitActionPerformed

    private void jButtonGenererJeuCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenererJeuCategorieActionPerformed
        // Vérifie si le champ est rempli
        if ("".equals(jTextFieldNombreCategorie.getText())) {
            jLabelErreurGenerationCategorie.setText("Veuillez remplir le champ pour pouvoir générer un jeu d'essai pour les catégories");
        } else {
            try {
                DAO.getInstance().requeteAction("DELETE FROM categorie");
                // Insertion de(s) nouveau(x) tuples générés dans la table 'categorie'
                int i = 0;
                while (i < Integer.valueOf(jTextFieldNombreCategorie.getText())) {
                    DAO.getInstance().requeteAction("INSERT INTO categorie VALUES (null, 'categorie " + i + "')");
                    i++;
                }
                jLabelErreurGenerationCategorie.setText(i + " catégorie(s) ajoutée(s)");
            } catch (Exception e) {
                Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, e);
                jLabelErreurGenerationCategorie.setText("Erreur lors de la génération d'un jeu d'essai pour les catégories");
            }
        }
    }//GEN-LAST:event_jButtonGenererJeuCategorieActionPerformed

    private void jButtonRechargerTableauAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechargerTableauAgentActionPerformed
        // Bouton pour actualiser la liste des agents
        try {
            DefaultListModel leModelAgent = (DefaultListModel) jListListeAgent.getModel();
            leModelAgent.clear();
            ResultSet lesAgents = DAO.getInstance().requeteSelection("SELECT nomuser, mdp, nom, prenom, email, telephone, libelle_profil FROM personnel, profil WHERE personnel.id_profil = profil.id_profil");
            while (lesAgents.next()) {
                leModelAgent.addElement(lesAgents.getString(1) + "  " + lesAgents.getString(2) + "  " + lesAgents.getString(3) + "  " + lesAgents.getString(4) + "  " + lesAgents.getString(5) + "  " + lesAgents.getString(6) + "  " + lesAgents.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRechargerTableauAgentActionPerformed

    private void jTabbedPaneActionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneActionsMouseClicked

    }//GEN-LAST:event_jTabbedPaneActionsMouseClicked

    /**
     * Méthode servant à initialiser la liste pour la remplir en fonction des
     * données présente sur la BDD
     */
    public void remplirListeAgent() {
        try {
            DefaultListModel leModelAgent = (DefaultListModel) jListListeAgent.getModel();
            leModelAgent.clear();
            ResultSet lesAgents = DAO.getInstance().requeteSelection("SELECT nomuser, mdp, nom, prenom, email, telephone, libelle_profil FROM personnel, profil WHERE personnel.id_profil = profil.id_profil");
            while (lesAgents.next()) {
                leModelAgent.addElement(lesAgents.getString(1) + "  " + lesAgents.getString(2) + "  " + lesAgents.getString(3) + "  " + lesAgents.getString(4) + "  " + lesAgents.getString(5) + "  " + lesAgents.getString(6) + "  " + lesAgents.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenererJeuCategorie;
    private javax.swing.JButton jButtonGenererJeuProduit;
    private javax.swing.JButton jButtonRechargerTableauAgent;
    private javax.swing.JLabel jLabelErreurGenerationCategorie;
    private javax.swing.JLabel jLabelErreurGenerationProduit;
    private javax.swing.JLabel jLabelJeuCategorie;
    private javax.swing.JLabel jLabelJeuProduit;
    private javax.swing.JList<String> jListListeAgent;
    private javax.swing.JPanel jPanelGenererJeuEssai;
    private javax.swing.JPanel jPanelGestionAgent;
    private javax.swing.JScrollPane jScrollPaneTableauAgent;
    private javax.swing.JTabbedPane jTabbedPaneActions;
    private javax.swing.JTextField jTextFieldNombreCategorie;
    private javax.swing.JTextField jTextFieldNombreProduit;
    // End of variables declaration//GEN-END:variables
}
