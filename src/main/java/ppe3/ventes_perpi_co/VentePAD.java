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
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author A.A
 */
public class VentePAD extends javax.swing.JPanel {

    /**
     * Creates new form VentePAD
     */
    public VentePAD() {
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

        jScrollPaneClientsVentes = new javax.swing.JScrollPane();
        jListListeVente = new javax.swing.JList<>();
        jComboBoxClientVentes = new javax.swing.JComboBox<>();
        jButtonVendre = new javax.swing.JButton();
        jLabelClientVentes = new javax.swing.JLabel();
        jComboBoxProduitVentes = new javax.swing.JComboBox<>();
        jLabelProduitVentes = new javax.swing.JLabel();
        jTextFieldQteVente = new javax.swing.JTextField();
        jLabelQteVente = new javax.swing.JLabel();
        jButtonActualiserVentes = new javax.swing.JButton();

        jListListeVente.setModel(new DefaultListModel());
        jScrollPaneClientsVentes.setViewportView(jListListeVente);

        jComboBoxClientVentes.setModel(new DefaultComboBoxModel());
        jComboBoxClientVentes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxClientVentesComponentShown(evt);
            }
        });
        jComboBoxClientVentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientVentesActionPerformed(evt);
            }
        });

        jButtonVendre.setText("Vendre");
        jButtonVendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendreActionPerformed(evt);
            }
        });

        jLabelClientVentes.setText("Client :");

        jComboBoxProduitVentes.setModel(new DefaultComboBoxModel());
        jComboBoxProduitVentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProduitVentesActionPerformed(evt);
            }
        });

        jLabelProduitVentes.setText("Produit :");

        jLabelQteVente.setText("Quantité :");

        jButtonActualiserVentes.setText("Actualiser les ventes effectuées");
        jButtonActualiserVentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualiserVentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelClientVentes)
                            .addComponent(jLabelProduitVentes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProduitVentes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxClientVentes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelQteVente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonActualiserVentes)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldQteVente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVendre)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneClientsVentes, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneClientsVentes, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxClientVentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelClientVentes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxProduitVentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProduitVentes))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQteVente)
                            .addComponent(jTextFieldQteVente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVendre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualiserVentes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClientVentesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxClientVentesComponentShown

    }//GEN-LAST:event_jComboBoxClientVentesComponentShown

    private void jComboBoxClientVentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientVentesActionPerformed

    }//GEN-LAST:event_jComboBoxClientVentesActionPerformed

    private void jButtonVendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendreActionPerformed
        // Vérification si le champs des quantité de produit à vendre est rempli
        if (!"".equals(jTextFieldQteVente.getText())) {
            try {
                DefaultComboBoxModel laComboBoxClientVente = (DefaultComboBoxModel) jComboBoxClientVentes.getModel();
                DefaultComboBoxModel laComboBoxProduitVente = (DefaultComboBoxModel) jComboBoxProduitVentes.getModel();
                DefaultListModel leModelVente = (DefaultListModel) jListListeVente.getModel();
                ResultSet reqStockProduit = DAO.getInstance().requeteSelection("SELECT stock_produit FROM produit WHERE id_produit = " + (laComboBoxProduitVente.getIndexOf(laComboBoxProduitVente.getSelectedItem()) + 1) + "");
                reqStockProduit.next();
                Integer stockProduit = Integer.parseInt(reqStockProduit.getString(1));
                // Vérifie si il y a toujours le produit que l'on veut vendre en sotck et que l'on en vend pas plus que ce que l'on a en stock
                if (stockProduit > 0 && Integer.parseInt(jTextFieldQteVente.getText()) <= stockProduit) {
                    DAO.getInstance().requeteAction("INSERT INTO facture VALUES('" + java.time.LocalDateTime.now() + "', '" + java.time.LocalDate.now() + "')");
                    ResultSet facture = DAO.getInstance().requeteSelection("SELECT id_facture FROM facture WHERE date_facture = '" + java.time.LocalDate.now() + "'");
                    // Insertion dans la table 'vente' du tuple correspondant à une vente d'un produit à un client et vérification pour savoir il y a bien un tuple qui s'est inséré
                    facture.next();
                    Integer nombreAjoutVentes = DAO.getInstance().requeteAction("INSERT INTO vente VALUES(null, '" + (laComboBoxClientVente.getIndexOf(laComboBoxClientVente.getSelectedItem()) + 1) + "', '" + Authentification.getIdPersonnel() + "', '" + facture.getString(1) + "')");
                    if ((nombreAjoutVentes) > 0) {
                        ResultSet idVente = DAO.getInstance().requeteSelection("SELECT id_vente FROM vente");
                        idVente.last();
                        Integer nombreQteVentes = DAO.getInstance().requeteAction("INSERT INTO contenir VALUES('" + idVente.getString(1) + "', '" + (laComboBoxProduitVente.getIndexOf(laComboBoxProduitVente.getSelectedItem()) + 1) + "', '" + jTextFieldQteVente.getText() + "')");
                        // Diminue le stock d'un produit en vente
                        Integer modifStockProduit = DAO.getInstance().requeteAction("UPDATE produit SET stock_produit = stock_produit - " + Integer.parseInt(jTextFieldQteVente.getText()) + " WHERE id_produit = " + (laComboBoxProduitVente.getIndexOf(laComboBoxProduitVente.getSelectedItem()) + 1) + "");
                        // Vérifie si il y a bien un tuple d'insérer dans la table 'contenir' et que le stock du produit à été décrémenter du nombre de produit que l'on a vendu
                        if (nombreQteVentes > 0 && modifStockProduit > 0) {
                            JOptionPane.showMessageDialog(this, "Vente ajoutée avec succès !");
                            System.out.println("Vente ajouté avec succès");
                            leModelVente.clear();
                            ResultSet lesVentesQteProduit = DAO.getInstance().requeteSelection("SELECT libelle_produit, contenir.qte FROM contenir INNER JOIN produit ON contenir.id_produit = produit.id_produit");
                            ResultSet lesVentesClients = DAO.getInstance().requeteSelection("SELECT client.nom, client.prenom, id_facture FROM vente INNER JOIN client ON vente.id_client = client.id_client");
                            while (lesVentesQteProduit.next() && lesVentesClients.next()) {
                                leModelVente.addElement(lesVentesQteProduit.getString(1) + " à été vendu " + lesVentesQteProduit.getString(2) + " fois à " + lesVentesClients.getString(1) + " " + lesVentesClients.getString(2) + " le " + lesVentesClients.getString(3));
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Le produit que vous essayez de vendre n'est plus en stock ou vous essayer d'en vendre plus qu'il y en a en stock", "Avertissement", 1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentePAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez remplir une quantité", "Avertissement", 3);
        }
    }//GEN-LAST:event_jButtonVendreActionPerformed

    private void jButtonActualiserVentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualiserVentesActionPerformed
        remplirListeVente();
    }//GEN-LAST:event_jButtonActualiserVentesActionPerformed

    private void jComboBoxProduitVentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProduitVentesActionPerformed

    }//GEN-LAST:event_jComboBoxProduitVentesActionPerformed

    /**
     * Méthode servant à initialiser la liste des ventes pour la remplir en
     * fonction des données présentes sur la BDD
     */
    public void remplirListeVente() {
        try {
            // Rempli la combobox des clients en fonction des informations se trouvant dans la table 'client'
            DefaultComboBoxModel laComboxBoxClientVente = (DefaultComboBoxModel) jComboBoxClientVentes.getModel();
            ResultSet lesClientsVentes = DAO.getInstance().requeteSelection("SELECT nom, prenom FROM client");
            laComboxBoxClientVente.removeAllElements();
            while (lesClientsVentes.next()) {
                laComboxBoxClientVente.addElement(lesClientsVentes.getString(1) + "  " + lesClientsVentes.getString(2));
            }
            // Rempli la combobox des produits en fonction des informations se trouvant dans la table 'produit'
            DefaultComboBoxModel laComboBoxProduitVente = (DefaultComboBoxModel) jComboBoxProduitVentes.getModel();
            ResultSet lesProduitsVentes = DAO.getInstance().requeteSelection("SELECT * FROM produit");
            laComboBoxProduitVente.removeAllElements();
            while (lesProduitsVentes.next()) {
                laComboBoxProduitVente.addElement(lesProduitsVentes.getString(2));
            }
            // Rempli la liste des ventes en fonction des informations se trouvant dans la table 'vente'
            DefaultListModel leModelVente = (DefaultListModel) jListListeVente.getModel();
            leModelVente.clear();
            ResultSet lesVentesQteProduit = DAO.getInstance().requeteSelection("SELECT libelle_produit, contenir.qte FROM contenir INNER JOIN produit ON contenir.id_produit = produit.id_produit");
            ResultSet lesVentesClients = DAO.getInstance().requeteSelection("SELECT client.nom, client.prenom, id_facture FROM vente INNER JOIN client ON vente.id_client = client.id_client");
            while (lesVentesQteProduit.next() && lesVentesClients.next()) {
                leModelVente.addElement(lesVentesQteProduit.getString(1) + " à été vendu " + lesVentesQteProduit.getString(2) + " fois à " + lesVentesClients.getString(1) + " " + lesVentesClients.getString(2) + " le " + lesVentesClients.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentePAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualiserVentes;
    private javax.swing.JButton jButtonVendre;
    private javax.swing.JComboBox<String> jComboBoxClientVentes;
    private javax.swing.JComboBox<String> jComboBoxProduitVentes;
    private javax.swing.JLabel jLabelClientVentes;
    private javax.swing.JLabel jLabelProduitVentes;
    private javax.swing.JLabel jLabelQteVente;
    private javax.swing.JList<String> jListListeVente;
    private javax.swing.JScrollPane jScrollPaneClientsVentes;
    private javax.swing.JTextField jTextFieldQteVente;
    // End of variables declaration//GEN-END:variables
}
