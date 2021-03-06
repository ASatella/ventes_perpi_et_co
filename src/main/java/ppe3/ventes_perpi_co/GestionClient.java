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
import javax.swing.JOptionPane;

/**
 *
 * @author A.A
 */
public class GestionClient extends javax.swing.JPanel {

    /**
     * Creates new form Gestion_client Rempli la liste dès l'initialisation de
     * la JPanel
     */
    public GestionClient() {
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

        jDialogAjoutClient = new javax.swing.JDialog();
        jTextFieldNomClient = new javax.swing.JTextField();
        jTextFieldPrenomClient = new javax.swing.JTextField();
        jTextFieldCourrielClient = new javax.swing.JTextField();
        jTextFieldTelClient = new javax.swing.JTextField();
        jLabelAjoutClient = new javax.swing.JLabel();
        jLabelNomClient = new javax.swing.JLabel();
        jLabelPrenomClient = new javax.swing.JLabel();
        jLabelCourrielClient = new javax.swing.JLabel();
        jLabelTelClient = new javax.swing.JLabel();
        jButtonAjoutUnClient = new javax.swing.JButton();
        jButtonFermerAjoutClient = new javax.swing.JButton();
        jLabelErreurAjoutClient = new javax.swing.JLabel();
        jDialogModifClient = new javax.swing.JDialog();
        jTextFieldMNomClient = new javax.swing.JTextField();
        jTextFieldMPrenomClient = new javax.swing.JTextField();
        jTextFieldMCourrielClient = new javax.swing.JTextField();
        jTextFieldMTelClient = new javax.swing.JTextField();
        jLabelMAjoutClient = new javax.swing.JLabel();
        jLabelMNomClient = new javax.swing.JLabel();
        jLabelMPrenomClient = new javax.swing.JLabel();
        jLabelMCourrielClient = new javax.swing.JLabel();
        jLabelMTelClient = new javax.swing.JLabel();
        jButtonModifClient = new javax.swing.JButton();
        jButtonFermerModifClient = new javax.swing.JButton();
        jLabelErreurModifClient = new javax.swing.JLabel();
        jButtonAjoutClient = new javax.swing.JButton();
        jButtonModifierClient = new javax.swing.JButton();
        jScrollPaneListeClient = new javax.swing.JScrollPane();
        jListListeClient = new javax.swing.JList<>();

        jDialogAjoutClient.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAjoutClient.setTitle("Ajout d'un client");
        jDialogAjoutClient.setAlwaysOnTop(true);
        jDialogAjoutClient.setResizable(false);

        jTextFieldNomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomClientActionPerformed(evt);
            }
        });

        jLabelAjoutClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAjoutClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAjoutClient.setText("Ajouter un client");
        jLabelAjoutClient.setName(""); // NOI18N

        jLabelNomClient.setText("Nom du client :");

        jLabelPrenomClient.setText("Prénom du client :");

        jLabelCourrielClient.setText("Courriel du client :");

        jLabelTelClient.setText("Num. Tel. du Client :");

        jButtonAjoutUnClient.setText("Ajouter");
        jButtonAjoutUnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutUnClientActionPerformed(evt);
            }
        });

        jButtonFermerAjoutClient.setText("Fermer");
        jButtonFermerAjoutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerAjoutClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogAjoutClientLayout = new javax.swing.GroupLayout(jDialogAjoutClient.getContentPane());
        jDialogAjoutClient.getContentPane().setLayout(jDialogAjoutClientLayout);
        jDialogAjoutClientLayout.setHorizontalGroup(
            jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAjoutClient)
                .addGap(67, 67, 67))
            .addGroup(jDialogAjoutClientLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogAjoutClientLayout.createSequentialGroup()
                        .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomClient)
                            .addComponent(jLabelPrenomClient)
                            .addComponent(jLabelCourrielClient)
                            .addComponent(jLabelTelClient))
                        .addGap(11, 11, 11)
                        .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTelClient, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCourrielClient, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutClientLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFermerAjoutClient)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAjoutUnClient)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogAjoutClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelErreurAjoutClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogAjoutClientLayout.setVerticalGroup(
            jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjoutClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAjoutClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrenomClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourrielClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCourrielClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErreurAjoutClient, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jDialogAjoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFermerAjoutClient)
                    .addComponent(jButtonAjoutUnClient))
                .addGap(20, 20, 20))
        );

        jDialogModifClient.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogModifClient.setTitle("Ajout d'un client");
        jDialogModifClient.setAlwaysOnTop(true);

        jTextFieldMNomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMNomClientActionPerformed(evt);
            }
        });

        jLabelMAjoutClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMAjoutClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMAjoutClient.setText("Modifier un client");
        jLabelMAjoutClient.setName(""); // NOI18N

        jLabelMNomClient.setText("Nom du client :");

        jLabelMPrenomClient.setText("Prénom du client :");

        jLabelMCourrielClient.setText("Courriel du client :");

        jLabelMTelClient.setText("Num. Tel. du Client :");

        jButtonModifClient.setText("Modifier");
        jButtonModifClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifClientActionPerformed(evt);
            }
        });

        jButtonFermerModifClient.setText("Fermer");
        jButtonFermerModifClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerModifClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogModifClientLayout = new javax.swing.GroupLayout(jDialogModifClient.getContentPane());
        jDialogModifClient.getContentPane().setLayout(jDialogModifClientLayout);
        jDialogModifClientLayout.setHorizontalGroup(
            jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifClientLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogModifClientLayout.createSequentialGroup()
                        .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMNomClient)
                            .addComponent(jLabelMPrenomClient)
                            .addComponent(jLabelMCourrielClient)
                            .addComponent(jLabelMTelClient))
                        .addGap(11, 11, 11)
                        .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMTelClient)
                            .addComponent(jTextFieldMCourrielClient)
                            .addComponent(jTextFieldMNomClient, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMPrenomClient, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifClientLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFermerModifClient)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModifClient)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifClientLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifClientLayout.createSequentialGroup()
                        .addComponent(jLabelMAjoutClient)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogModifClientLayout.createSequentialGroup()
                        .addComponent(jLabelErreurModifClient, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jDialogModifClientLayout.setVerticalGroup(
            jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogModifClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMAjoutClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMNomClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMPrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMPrenomClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMCourrielClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMCourrielClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMTelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMTelClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabelErreurModifClient, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogModifClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFermerModifClient)
                    .addComponent(jButtonModifClient))
                .addGap(20, 20, 20))
        );

        jButtonAjoutClient.setText("Ajouter un client");
        jButtonAjoutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutClientActionPerformed(evt);
            }
        });

        jButtonModifierClient.setText("Modifier un client");
        jButtonModifierClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierClientActionPerformed(evt);
            }
        });

        jListListeClient.setModel(new DefaultListModel()
        );
        jListListeClient.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jListListeClientComponentShown(evt);
            }
        });
        jScrollPaneListeClient.setViewportView(jListListeClient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAjoutClient, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifierClient, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPaneListeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAjoutClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModifierClient)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneListeClient, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjoutClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutClientActionPerformed
        // Affiche la JDialog pour ajouter un client
        jDialogAjoutClient.setVisible(true);
        jDialogAjoutClient.setSize(280, 268);
        jDialogAjoutClient.setResizable(false);
        jDialogAjoutClient.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButtonAjoutClientActionPerformed

    private void jButtonModifierClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierClientActionPerformed
        // Vérifie si une ligne de la liste des clients est sélectionnée pour pour pouvoir la modifier
        if (!jListListeClient.isSelectionEmpty()) {
            try {
                jDialogModifClient.setVisible(true);
                jDialogModifClient.setSize(268, 275);
                jDialogModifClient.setResizable(false);
                jDialogModifClient.setLocationRelativeTo(this);
                Integer infoClient = jListListeClient.getSelectedIndex();
                ResultSet lesClients = DAO.getInstance().requeteSelection("SELECT * FROM client");
                lesClients.absolute(infoClient + 1);
                jTextFieldMNomClient.setText(lesClients.getString(2));
                jTextFieldMPrenomClient.setText(lesClients.getString(3));
                jTextFieldMCourrielClient.setText(lesClients.getString(4));
                jTextFieldMTelClient.setText(lesClients.getString(5));
            } catch (SQLException ex) {
                Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client à modifier", "Avertissement", 3);
        }
    }//GEN-LAST:event_jButtonModifierClientActionPerformed

    private void jListListeClientComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jListListeClientComponentShown

    }//GEN-LAST:event_jListListeClientComponentShown

    private void jTextFieldNomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomClientActionPerformed

    }//GEN-LAST:event_jTextFieldNomClientActionPerformed

    private void jButtonAjoutUnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutUnClientActionPerformed
        // Vérifie si le champ du nom et du prenom sont remplis
        if ("".equals(jTextFieldNomClient.getText()) && "".equals(jTextFieldPrenomClient.getText())) {
            jLabelErreurAjoutClient.setText("Veuillez remplir au moins le nom et le prénom");
        } else {
            try {
                // Requête SQL pour insérer les valeurs des rentrés dans les champs dans la table 'client'
                Integer nombreAjoutClient = DAO.getInstance().requeteAction("INSERT INTO client VALUES(null, '" + jTextFieldNomClient.getText() + "', '" + jTextFieldPrenomClient.getText() + "', '" + jTextFieldCourrielClient.getText() + "', '" + jTextFieldTelClient.getText() + "')");
                if (nombreAjoutClient > 0) {
                    jDialogAjoutClient.dispose();
                    JOptionPane.showMessageDialog(jLabelNomClient, "Client ajouté avec succès");
                    System.out.println("Client ajouté avec succès");
                    DefaultListModel leModel = (DefaultListModel) jListListeClient.getModel();
                    // Vide la liste et la remplie avec les nouvelles informations se trouvant dans la table 'client' et ferme la fenêtre d'ajout de client
                    leModel.clear();
                    ResultSet lesClients = DAO.getInstance().requeteSelection("SELECT * FROM client");
                    while (lesClients.next()) {
                        leModel.addElement(lesClients.getString(2) + " " + lesClients.getString(3) + " " + lesClients.getString(4) + " " + lesClients.getString(5));
                    }
                    jDialogAjoutClient.dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonAjoutUnClientActionPerformed

    private void jButtonFermerAjoutClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerAjoutClientActionPerformed
        jDialogAjoutClient.dispose();
    }//GEN-LAST:event_jButtonFermerAjoutClientActionPerformed

    private void jTextFieldMNomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMNomClientActionPerformed
    }//GEN-LAST:event_jTextFieldMNomClientActionPerformed

    private void jButtonModifClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifClientActionPerformed
        try {
            // Requête SQL pour mettre à jour les valeurs se trouvant dans la table en fonction de la ligne sélectionnée et des valeurs rentrés dans les champs
            Integer nombreModifClient = DAO.getInstance().requeteAction("UPDATE client SET nom = '" + jTextFieldMNomClient.getText() + "', prenom = '" + jTextFieldMPrenomClient.getText() + "', email = '" + jTextFieldMCourrielClient.getText() + "', telephone = '" + jTextFieldMTelClient.getText() + "' WHERE id_client = " + (jListListeClient.getSelectedIndex() + 1) + "");
            if (nombreModifClient > 0) {
                jDialogModifClient.dispose();
                JOptionPane.showMessageDialog(jLabelNomClient, "Client modifié avec succès");
                System.out.println("Client modifié avec succès");
                DefaultListModel leModel = (DefaultListModel) jListListeClient.getModel();
                // Vide la liste et la remplie avec les nouvelles informations se trouvant dans la table 'client' et ferme la fenêtre de modification de client
                leModel.clear();
                ResultSet lesClients = DAO.getInstance().requeteSelection("SELECT * FROM client");
                while (lesClients.next()) {
                    leModel.addElement(lesClients.getString(2) + "  " + lesClients.getString(3) + "  " + lesClients.getString(4) + "  " + lesClients.getString(5));
                }
                jDialogModifClient.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModifClientActionPerformed

    private void jButtonFermerModifClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerModifClientActionPerformed
        jDialogModifClient.dispose();
    }//GEN-LAST:event_jButtonFermerModifClientActionPerformed

    public void remplirListeClient() {
        try {
            DefaultListModel leModelClient = (DefaultListModel) jListListeClient.getModel();
            leModelClient.clear();
            ResultSet lesClients = DAO.getInstance().requeteSelection("SELECT * FROM client");
            while (lesClients.next()) {
                leModelClient.addElement(lesClients.getString(2) + "  " + lesClients.getString(3) + "  " + lesClients.getString(4) + "  " + lesClients.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjoutClient;
    private javax.swing.JButton jButtonAjoutUnClient;
    private javax.swing.JButton jButtonFermerAjoutClient;
    private javax.swing.JButton jButtonFermerModifClient;
    private javax.swing.JButton jButtonModifClient;
    private javax.swing.JButton jButtonModifierClient;
    private javax.swing.JDialog jDialogAjoutClient;
    private javax.swing.JDialog jDialogModifClient;
    private javax.swing.JLabel jLabelAjoutClient;
    private javax.swing.JLabel jLabelCourrielClient;
    private javax.swing.JLabel jLabelErreurAjoutClient;
    private javax.swing.JLabel jLabelErreurModifClient;
    private javax.swing.JLabel jLabelMAjoutClient;
    private javax.swing.JLabel jLabelMCourrielClient;
    private javax.swing.JLabel jLabelMNomClient;
    private javax.swing.JLabel jLabelMPrenomClient;
    private javax.swing.JLabel jLabelMTelClient;
    private javax.swing.JLabel jLabelNomClient;
    private javax.swing.JLabel jLabelPrenomClient;
    private javax.swing.JLabel jLabelTelClient;
    private javax.swing.JList<String> jListListeClient;
    private javax.swing.JScrollPane jScrollPaneListeClient;
    private javax.swing.JTextField jTextFieldCourrielClient;
    private javax.swing.JTextField jTextFieldMCourrielClient;
    private javax.swing.JTextField jTextFieldMNomClient;
    private javax.swing.JTextField jTextFieldMPrenomClient;
    private javax.swing.JTextField jTextFieldMTelClient;
    private javax.swing.JTextField jTextFieldNomClient;
    private javax.swing.JTextField jTextFieldPrenomClient;
    private javax.swing.JTextField jTextFieldTelClient;
    // End of variables declaration//GEN-END:variables
}
