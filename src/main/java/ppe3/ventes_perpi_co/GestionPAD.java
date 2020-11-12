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
public class GestionPAD extends javax.swing.JPanel {

    /**
     * Creates new form Afficher_pad Rempli la liste dès l'initialisation de la
     * JPanel
     */
    public GestionPAD() {
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

        jDialogAjoutProduit = new javax.swing.JDialog();
        jLabelAjoutProduit = new javax.swing.JLabel();
        jLabelNomProduit = new javax.swing.JLabel();
        jTextFieldNomProduit = new javax.swing.JTextField();
        jLabelCategorie = new javax.swing.JLabel();
        jButtonFermerAjoutProduit = new javax.swing.JButton();
        jButtonAjoutUnProduit = new javax.swing.JButton();
        jComboBoxChoixCategorie = new javax.swing.JComboBox<>();
        jLabelErreurAjoutProduit = new javax.swing.JLabel();
        jComboBoxPopulariteProduit = new javax.swing.JComboBox<>();
        jLabelPopulariteProduit = new javax.swing.JLabel();
        jLabelStockProduit = new javax.swing.JLabel();
        jTextFieldStockProduit = new javax.swing.JTextField();
        jTextFieldTarifProduit = new javax.swing.JTextField();
        jLabelTarifProduit = new javax.swing.JLabel();
        jDialogModifProduit = new javax.swing.JDialog();
        jLabelModifProduit = new javax.swing.JLabel();
        jLabelMNomProduit = new javax.swing.JLabel();
        jTextFieldMNomProduit = new javax.swing.JTextField();
        jLabelMCategorie = new javax.swing.JLabel();
        jButtonFermerModifProduit = new javax.swing.JButton();
        jButtonModifProduit = new javax.swing.JButton();
        jComboBoxMChoixCategorie = new javax.swing.JComboBox<>();
        jLabelErreurModifProduit = new javax.swing.JLabel();
        jLabelTarifMProduit = new javax.swing.JLabel();
        jLabelStockMProduit = new javax.swing.JLabel();
        jLabelPopulariteMProduit = new javax.swing.JLabel();
        jTextFieldMTarifProduit = new javax.swing.JTextField();
        jTextFieldMStockProduit = new javax.swing.JTextField();
        jComboBoxMPopulariteProduit = new javax.swing.JComboBox<>();
        jButtonAjoutProduit = new javax.swing.JButton();
        jButtonModifierProduit = new javax.swing.JButton();
        jButtonAfficherListeProduit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListListeProduit = new javax.swing.JList<>();

        jDialogAjoutProduit.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAjoutProduit.setTitle("Ajout d'un produit");
        jDialogAjoutProduit.setAlwaysOnTop(true);
        jDialogAjoutProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialogAjoutProduit.setResizable(false);

        jLabelAjoutProduit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAjoutProduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAjoutProduit.setText("Ajouter un produit");
        jLabelAjoutProduit.setName(""); // NOI18N

        jLabelNomProduit.setText("Nom du produit :");

        jTextFieldNomProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomProduitActionPerformed(evt);
            }
        });

        jLabelCategorie.setText("Catégorie du produit :");

        jButtonFermerAjoutProduit.setText("Fermer");
        jButtonFermerAjoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerAjoutProduitActionPerformed(evt);
            }
        });

        jButtonAjoutUnProduit.setText("Ajouter");
        jButtonAjoutUnProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutUnProduitActionPerformed(evt);
            }
        });

        jComboBoxChoixCategorie.setModel(new DefaultComboBoxModel());
        jComboBoxChoixCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChoixCategorieActionPerformed(evt);
            }
        });

        jLabelErreurAjoutProduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jComboBoxPopulariteProduit.setModel(new DefaultComboBoxModel());

        jLabelPopulariteProduit.setText("Popularité du produit :");

        jLabelStockProduit.setText("Stock du produit :");

        jLabelTarifProduit.setText("Tarif du produit :");

        javax.swing.GroupLayout jDialogAjoutProduitLayout = new javax.swing.GroupLayout(jDialogAjoutProduit.getContentPane());
        jDialogAjoutProduit.getContentPane().setLayout(jDialogAjoutProduitLayout);
        jDialogAjoutProduitLayout.setHorizontalGroup(
            jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutProduitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutProduitLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabelAjoutProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutProduitLayout.createSequentialGroup()
                        .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelStockProduit)
                            .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelCategorie)
                                .addComponent(jLabelPopulariteProduit, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabelTarifProduit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPopulariteProduit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxChoixCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldStockProduit)
                            .addComponent(jTextFieldTarifProduit))
                        .addContainerGap())))
            .addComponent(jLabelErreurAjoutProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialogAjoutProduitLayout.createSequentialGroup()
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutProduitLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFermerAjoutProduit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAjoutUnProduit))
                    .addGroup(jDialogAjoutProduitLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelNomProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomProduit)))
                .addContainerGap())
        );
        jDialogAjoutProduitLayout.setVerticalGroup(
            jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjoutProduitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAjoutProduit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTarifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTarifProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStockProduit)
                    .addComponent(jTextFieldStockProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPopulariteProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPopulariteProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChoixCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategorie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErreurAjoutProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogAjoutProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFermerAjoutProduit)
                    .addComponent(jButtonAjoutUnProduit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogModifProduit.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogModifProduit.setTitle("Ajout d'un produit");
        jDialogModifProduit.setAlwaysOnTop(true);
        jDialogModifProduit.setResizable(false);

        jLabelModifProduit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelModifProduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModifProduit.setText("Modifier un produit");
        jLabelModifProduit.setName(""); // NOI18N

        jLabelMNomProduit.setText("Nom du produit :");

        jTextFieldMNomProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMNomProduitActionPerformed(evt);
            }
        });

        jLabelMCategorie.setText("Catégorie du produit :");

        jButtonFermerModifProduit.setText("Fermer");
        jButtonFermerModifProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerModifProduitActionPerformed(evt);
            }
        });

        jButtonModifProduit.setText("Modifier");
        jButtonModifProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifProduitActionPerformed(evt);
            }
        });

        jComboBoxMChoixCategorie.setModel(new DefaultComboBoxModel());
        jComboBoxMChoixCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMChoixCategorieActionPerformed(evt);
            }
        });

        jLabelErreurModifProduit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelTarifMProduit.setText("Tarif du produit :");

        jLabelStockMProduit.setText("Stock du produit :");

        jLabelPopulariteMProduit.setText("Popularité du produit :");

        jComboBoxMPopulariteProduit.setModel(new DefaultComboBoxModel());

        javax.swing.GroupLayout jDialogModifProduitLayout = new javax.swing.GroupLayout(jDialogModifProduit.getContentPane());
        jDialogModifProduit.getContentPane().setLayout(jDialogModifProduitLayout);
        jDialogModifProduitLayout.setHorizontalGroup(
            jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelMNomProduit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabelErreurModifProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifProduitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifProduitLayout.createSequentialGroup()
                        .addComponent(jButtonFermerModifProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModifProduit)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifProduitLayout.createSequentialGroup()
                        .addComponent(jLabelModifProduit)
                        .addGap(45, 45, 45))))
            .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTarifMProduit)
                            .addComponent(jLabelStockMProduit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMStockProduit)
                            .addComponent(jTextFieldMTarifProduit)))
                    .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                                .addComponent(jLabelPopulariteMProduit)
                                .addGap(9, 9, 9)
                                .addComponent(jComboBoxMPopulariteProduit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelMCategorie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMChoixCategorie, 0, 96, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDialogModifProduitLayout.setVerticalGroup(
            jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogModifProduitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelModifProduit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMNomProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMTarifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTarifMProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMStockProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStockMProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMPopulariteProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPopulariteMProduit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMChoixCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMCategorie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErreurModifProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifProduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFermerModifProduit)
                    .addComponent(jButtonModifProduit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAjoutProduit.setText("Ajouter un produit");
        jButtonAjoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutProduitActionPerformed(evt);
            }
        });

        jButtonModifierProduit.setText("Modifier un produit");
        jButtonModifierProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierProduitActionPerformed(evt);
            }
        });

        jButtonAfficherListeProduit.setText("Recharger les produits");
        jButtonAfficherListeProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAfficherListeProduitActionPerformed(evt);
            }
        });

        jListListeProduit.setModel(new DefaultListModel()
        );
        jListListeProduit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jListListeProduitComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(jListListeProduit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAjoutProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAfficherListeProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModifierProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAjoutProduit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModifierProduit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAfficherListeProduit)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutProduitActionPerformed
        // Affiche la JDialog pour ajouter un produit et rempli les combobox
        try {
            jDialogAjoutProduit.setVisible(true);
            jDialogAjoutProduit.setSize(340, 320);
            jDialogAjoutProduit.setResizable(false);
            jDialogAjoutProduit.setLocationRelativeTo(this);
            DefaultComboBoxModel laComboBoxCategorie = (DefaultComboBoxModel) jComboBoxChoixCategorie.getModel();
            laComboBoxCategorie.removeAllElements();
            ResultSet lesCategories = DAO.getInstance().requeteSelection("SELECT * FROM categorie");
            while (lesCategories.next()) {
                laComboBoxCategorie.addElement(lesCategories.getString(2));
            }
            DefaultComboBoxModel laComboBoxPopularite = (DefaultComboBoxModel) jComboBoxPopulariteProduit.getModel();
            laComboBoxPopularite.removeAllElements();
            laComboBoxPopularite.addElement("*");
            laComboBoxPopularite.addElement("**");
            laComboBoxPopularite.addElement("***");
            laComboBoxPopularite.addElement("****");
            laComboBoxPopularite.addElement("*****");
        } catch (SQLException ex) {
            Logger.getLogger(GestionPAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAjoutProduitActionPerformed

    private void jButtonModifierProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierProduitActionPerformed
        // Vérifie si une ligne de la liste des produits est sélectionée pour pouvoir la modifier
        if (!jListListeProduit.isSelectionEmpty()) {
            try {
                jDialogModifProduit.setVisible(true);
                jDialogModifProduit.setSize(270, 298);
                jDialogModifProduit.setResizable(false);
                jDialogModifProduit.setLocationRelativeTo(this);
                DefaultComboBoxModel laComboBoxPopularite = (DefaultComboBoxModel) jComboBoxMPopulariteProduit.getModel();
                laComboBoxPopularite.removeAllElements();
                laComboBoxPopularite.addElement("*");
                laComboBoxPopularite.addElement("**");
                laComboBoxPopularite.addElement("***");
                laComboBoxPopularite.addElement("****");
                laComboBoxPopularite.addElement("*****");
                DefaultComboBoxModel laComboBoxCategorie = (DefaultComboBoxModel) jComboBoxMChoixCategorie.getModel();
                laComboBoxCategorie.removeAllElements();
                Integer infoProduit = jListListeProduit.getSelectedIndex();
                ResultSet lesCategories = DAO.getInstance().requeteSelection("SELECT * FROM categorie");
                ResultSet lesInfoProduit = DAO.getInstance().requeteSelection("SELECT * FROM categorie, produit WHERE produit.id_categorie = categorie.id_categorie");
                while (lesCategories.next()) {
                    laComboBoxCategorie.addElement(lesCategories.getString(2));
                }
                lesInfoProduit.absolute(infoProduit+1);
                jTextFieldMNomProduit.setText(lesInfoProduit.getString(4));
                jTextFieldMTarifProduit.setText(lesInfoProduit.getString(5));
                jTextFieldMStockProduit.setText(lesInfoProduit.getString(6));
                laComboBoxPopularite.setSelectedItem(lesInfoProduit.getString(7));
                laComboBoxCategorie.setSelectedItem(lesInfoProduit.getString(2));
            } catch (SQLException ex) {
                Logger.getLogger(GestionPAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez séléctionner un produit à modifier");
        }
    }//GEN-LAST:event_jButtonModifierProduitActionPerformed

    private void jButtonAfficherListeProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAfficherListeProduitActionPerformed
        // Bouton pour actualiser la liste des produits
        try {
            DefaultListModel leModelProduit = (DefaultListModel) jListListeProduit.getModel();
            leModelProduit.clear();
            ResultSet lesProduits = DAO.getInstance().requeteSelection("SELECT libelle_produit, tarif_produit, stock_produit, popularite_produit, libelle_categorie FROM produit, categorie WHERE produit.id_categorie = categorie.id_categorie");
            while (lesProduits.next()) {
                leModelProduit.addElement(lesProduits.getString(1) + "  " + lesProduits.getString(2) + "  " + lesProduits.getString(3) + "  " + lesProduits.getString(4) + "  " + lesProduits.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionPAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAfficherListeProduitActionPerformed

    private void jListListeProduitComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListListeProduitComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jListListeProduitComponentShown

    private void jTextFieldNomProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomProduitActionPerformed

    }//GEN-LAST:event_jTextFieldNomProduitActionPerformed

    private void jButtonFermerAjoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerAjoutProduitActionPerformed
        jDialogAjoutProduit.dispose();
    }//GEN-LAST:event_jButtonFermerAjoutProduitActionPerformed

    private void jButtonAjoutUnProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutUnProduitActionPerformed
        // Vérifie si les champs du nom du produit, du tarif du produit et du stock du produit sont remplis
        if ("".equals(jTextFieldNomProduit.getText()) || "".equals(jTextFieldTarifProduit.getText()) || "".equals(jTextFieldStockProduit.getText())) {
            jLabelErreurAjoutProduit.setText("Veuillez remplir le nom du produit, le tarif unitaire et le stock");
        } else {
            try {
                DefaultComboBoxModel laComboBoxCategorie = (DefaultComboBoxModel) jComboBoxChoixCategorie.getModel();
                DefaultComboBoxModel laComboBoxPopularite = (DefaultComboBoxModel) jComboBoxPopulariteProduit.getModel();
                Integer nombreAjoutProduit = DAO.getInstance().requeteAction("INSERT INTO produit VALUES(null, '" + jTextFieldNomProduit.getText() + "', " + jTextFieldTarifProduit.getText() + ", " + jTextFieldStockProduit.getText() + ", '" + laComboBoxPopularite.getSelectedItem() + "', " + (laComboBoxCategorie.getIndexOf(laComboBoxCategorie.getSelectedItem()) + 1) + ")");
                if (nombreAjoutProduit > 0) {
                    JOptionPane.showMessageDialog(jLabelNomProduit, "Produit ajouté avec succès");
                    System.out.println("Produit ajouté avec succès");
                    DefaultListModel leModel = (DefaultListModel) jListListeProduit.getModel();
                    //Vide la liste et la rempli des nouvelles informations se trouvant dans la table 'produit'
                    leModel.clear();
                    ResultSet lesProduits = DAO.getInstance().requeteSelection("SELECT libelle_produit, tarif_produit, stock_produit, popularite_produit, libelle_categorie FROM produit, categorie WHERE produit.id_categorie = categorie.id_categorie");
                    while (lesProduits.next()) {
                        leModel.addElement(lesProduits.getString(1) + "  " + lesProduits.getString(2) + "  " + lesProduits.getString(3) + "  " + lesProduits.getString(4) + "  " + lesProduits.getString(5));

                    }
                    jDialogAjoutProduit.dispose();
                }
            } catch (Exception ex) {
                Logger.getLogger(GestionPAD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Erreur lors de l'ajout du produit");
            }
        }
    }//GEN-LAST:event_jButtonAjoutUnProduitActionPerformed

    private void jComboBoxChoixCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChoixCategorieActionPerformed
    }//GEN-LAST:event_jComboBoxChoixCategorieActionPerformed

    private void jTextFieldMNomProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMNomProduitActionPerformed
    }//GEN-LAST:event_jTextFieldMNomProduitActionPerformed

    private void jButtonFermerModifProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerModifProduitActionPerformed
        jDialogModifProduit.dispose();
    }//GEN-LAST:event_jButtonFermerModifProduitActionPerformed

    private void jButtonModifProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifProduitActionPerformed
        // Requête SQL pour mettre à jour les valeurs se trouvant dans la table en fonction de la ligne sélectionnée et des valeurs rentrés dans les champs et des valeurs sélectionnés dans les combobox
        try {
            DefaultComboBoxModel laComboBoxCategorie = (DefaultComboBoxModel) jComboBoxMChoixCategorie.getModel();
            DefaultComboBoxModel laComboBoxPopularite = (DefaultComboBoxModel) jComboBoxMPopulariteProduit.getModel();
            Integer nombreModifProduit = DAO.getInstance().requeteAction("UPDATE produit SET libelle_produit = '" + jTextFieldMNomProduit.getText() + "', tarif_produit = " + jTextFieldMTarifProduit.getText() + ", stock_produit = " + jTextFieldMStockProduit.getText() + ", popularite_produit = '" + laComboBoxPopularite.getSelectedItem() + "', id_categorie = " + (laComboBoxCategorie.getIndexOf(laComboBoxCategorie.getSelectedItem()) + 1) + " WHERE id_produit = " + (jListListeProduit.getSelectedIndex() + 1) + "");
            if (nombreModifProduit > 0) {
                jDialogModifProduit.dispose();
                JOptionPane.showMessageDialog(jLabelMNomProduit, "Produit modifié avec succès");
                System.out.println("Produit modifié avec succès");
                DefaultListModel leModel = (DefaultListModel) jListListeProduit.getModel();
                // Vide la liste et la rempli des nouvelles informations se trouvant dans la table 'produit'
                leModel.clear();
                ResultSet lesProduits = DAO.getInstance().requeteSelection("SELECT libelle_produit, tarif_produit, stock_produit, popularite_produit, libelle_categorie FROM produit, categorie WHERE produit.id_categorie = categorie.id_categorie");
                while (lesProduits.next()) {
                    leModel.addElement(lesProduits.getString(1) + "  " + lesProduits.getString(2) + "  " + lesProduits.getString(3) + "  " + lesProduits.getString(4) + "  " + lesProduits.getString(5));
                }
                jDialogModifProduit.dispose();
            }
        } catch (Exception ex) {
            Logger.getLogger(GestionPAD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la modification du produit");
        }
    }//GEN-LAST:event_jButtonModifProduitActionPerformed

    private void jComboBoxMChoixCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMChoixCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMChoixCategorieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAfficherListeProduit;
    private javax.swing.JButton jButtonAjoutProduit;
    private javax.swing.JButton jButtonAjoutUnProduit;
    private javax.swing.JButton jButtonFermerAjoutProduit;
    private javax.swing.JButton jButtonFermerModifProduit;
    private javax.swing.JButton jButtonModifProduit;
    private javax.swing.JButton jButtonModifierProduit;
    private javax.swing.JComboBox<String> jComboBoxChoixCategorie;
    private javax.swing.JComboBox<String> jComboBoxMChoixCategorie;
    private javax.swing.JComboBox<String> jComboBoxMPopulariteProduit;
    private javax.swing.JComboBox<String> jComboBoxPopulariteProduit;
    private javax.swing.JDialog jDialogAjoutProduit;
    private javax.swing.JDialog jDialogModifProduit;
    private javax.swing.JLabel jLabelAjoutProduit;
    private javax.swing.JLabel jLabelCategorie;
    private javax.swing.JLabel jLabelErreurAjoutProduit;
    private javax.swing.JLabel jLabelErreurModifProduit;
    private javax.swing.JLabel jLabelMCategorie;
    private javax.swing.JLabel jLabelMNomProduit;
    private javax.swing.JLabel jLabelModifProduit;
    private javax.swing.JLabel jLabelNomProduit;
    private javax.swing.JLabel jLabelPopulariteMProduit;
    private javax.swing.JLabel jLabelPopulariteProduit;
    private javax.swing.JLabel jLabelStockMProduit;
    private javax.swing.JLabel jLabelStockProduit;
    private javax.swing.JLabel jLabelTarifMProduit;
    private javax.swing.JLabel jLabelTarifProduit;
    private javax.swing.JList<String> jListListeProduit;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldMNomProduit;
    private javax.swing.JTextField jTextFieldMStockProduit;
    private javax.swing.JTextField jTextFieldMTarifProduit;
    private javax.swing.JTextField jTextFieldNomProduit;
    private javax.swing.JTextField jTextFieldStockProduit;
    private javax.swing.JTextField jTextFieldTarifProduit;
    // End of variables declaration//GEN-END:variables
}
