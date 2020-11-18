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

/**
 *
 * @author A.A
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    public Authentification() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    static Integer idPersonnel;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitre = new javax.swing.JLabel();
        jLabelUtilisateurPersonnel = new javax.swing.JLabel();
        jTextFieldUtilisateurPersonnel = new javax.swing.JTextField();
        jLabelMDPPersonnel = new javax.swing.JLabel();
        jPasswordFieldMDPPersonnel = new javax.swing.JPasswordField();
        jButtonConnexion = new javax.swing.JButton();
        jLabelEtat = new javax.swing.JLabel();
        jButtonQuitter = new javax.swing.JButton();
        jLabelNomBDD = new javax.swing.JLabel();
        jTextFieldNomServeur = new javax.swing.JTextField();
        jLabelUtilisateurSGBD = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jTextFieldUtilisateurSGBD = new javax.swing.JTextField();
        jTextFieldNomBDD = new javax.swing.JTextField();
        jLabelMdpSGBD = new javax.swing.JLabel();
        jPasswordFieldMdpSGBD = new javax.swing.JPasswordField();
        jLabelNomServeur = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpi&Co");
        setResizable(false);

        jLabelTitre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Perpi&Co - Authentification");
        jLabelTitre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelUtilisateurPersonnel.setText("Nom d'utilisateur personnel");

        jLabelMDPPersonnel.setText("Mot de passe personnel");

        jButtonConnexion.setText("Se connecter");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });

        jLabelEtat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEtat.setText("Non connecté");

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jLabelNomBDD.setText("Nom de la BDD");

        jLabelUtilisateurSGBD.setText("Nom d'utilisateur SGBD");

        jLabelMdpSGBD.setText("Mot de passe SGBD");

        jLabelNomServeur.setText("IP/Nom du serveur");

        jLabelPort.setText("Port");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldUtilisateurPersonnel)
                                        .addComponent(jPasswordFieldMDPPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUtilisateurSGBD)
                                            .addComponent(jLabelUtilisateurPersonnel)
                                            .addComponent(jLabelMDPPersonnel)
                                            .addComponent(jLabelMdpSGBD))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldUtilisateurSGBD, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPasswordFieldMdpSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNomBDD)
                                            .addComponent(jLabelPort)
                                            .addComponent(jLabelNomServeur))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNomServeur, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNomBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButtonConnexion)
                                    .addGap(69, 69, 69))
                                .addComponent(jLabelEtat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomServeur)
                    .addComponent(jTextFieldNomServeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPort)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomBDD)
                    .addComponent(jTextFieldNomBDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurSGBD)
                    .addComponent(jTextFieldUtilisateurSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMdpSGBD)
                    .addComponent(jPasswordFieldMdpSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateurPersonnel)
                    .addComponent(jTextFieldUtilisateurPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMDPPersonnel)
                    .addComponent(jPasswordFieldMDPPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConnexion)
                .addGap(11, 11, 11)
                .addComponent(jLabelEtat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonQuitter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        String nomuser = jTextFieldUtilisateurPersonnel.getText();
        String mdp = jPasswordFieldMDPPersonnel.getText();

        if (!("".equals(jTextFieldNomBDD.getText()) && "".equals(jTextFieldNomServeur.getText()) && "".equals(jTextFieldPort.getText()) && "".equals(jTextFieldUtilisateurSGBD.getText()) && "".equals(jPasswordFieldMdpSGBD.getText()))) {
            DAO.setNomServeur(jTextFieldNomServeur.getText());
            DAO.setPort(jTextFieldPort.getText());
            DAO.setNomBdd(jTextFieldNomBDD.getText());
            DAO.setNomUtilisateur(jTextFieldUtilisateurSGBD.getText());
            DAO.setMotDePasse(jPasswordFieldMdpSGBD.getText());
            try {
                DAO monDAO = DAO.getInstance();
                // Vérifie si la connexion au SGBD est effectuée et vérifie si les champs du nom d'utilisateur et du mdp sont remplis
                if (monDAO != null) {
                    if (!("".equals(nomuser) && "".equals(mdp))) {
                        ResultSet connexionPersonnel = monDAO.requeteSelection("SELECT id_personnel, nomuser, mdp, id_profil FROM personnel WHERE nomuser='" + nomuser + "' AND mdp='" + mdp + "'");
                        // Parcours la table et si les informations rentrées dans les champs sont trouvées dans la BDD récupère l'id du profil du personnel voulant se connecter
                        if (connexionPersonnel.next()) {
                            setIdPersonnel(connexionPersonnel.getInt(1));
                            String profilPersonnel = connexionPersonnel.getString(4);
                            /* Vérifie en fonction de l'id du profil si c'est un agent ou un admin qui essaye de se connecter
                            Utilise une méthode 'setIdPersonnel' pour pouvoir stocker l'id du personnel voulant se connecter */
                            if ("1".equals(profilPersonnel)) {
                                AccueilAgent accueilAgent = new AccueilAgent();
                                accueilAgent.setVisible(true);
                                accueilAgent.setLocationRelativeTo(this);
                                Authentification.this.dispose();
                            } else {
                                AccueilAdmin accueilAdmin = new AccueilAdmin();
                                accueilAdmin.setVisible(true);
                                accueilAdmin.setLocationRelativeTo(this);
                                Authentification.this.dispose();
                            }
                        } else {
                            jLabelEtat.setText("Veuillez vérifier les informations saisies");
                        }
                    } else {
                        jLabelEtat.setText("Veuillez remplir tout les champs");
                    }
                } else {
                    jLabelEtat.setText("Veuillez vérifier les informations saisies");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jLabelEtat.setText("Veuillez remplir tout les champs");
        }
    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    /**
     * Méthode permettant de définir l'id du personnel
     *
     * @param idPersonnel L'id du personnel sous forme d'entier
     */
    public static void setIdPersonnel(Integer idPersonnel) {
        Authentification.idPersonnel = idPersonnel;
    }

    /**
     * Méthode permettent de renvoyer l'id du personnel connecté
     *
     * @return L'Id du personnel connecté sous forme d'entier
     */
    public static Integer getIdPersonnel() {
        return Authentification.idPersonnel;
    }

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
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JLabel jLabelMDPPersonnel;
    private javax.swing.JLabel jLabelMdpSGBD;
    private javax.swing.JLabel jLabelNomBDD;
    private javax.swing.JLabel jLabelNomServeur;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelUtilisateurPersonnel;
    private javax.swing.JLabel jLabelUtilisateurSGBD;
    private javax.swing.JPasswordField jPasswordFieldMDPPersonnel;
    private javax.swing.JPasswordField jPasswordFieldMdpSGBD;
    private javax.swing.JTextField jTextFieldNomBDD;
    private javax.swing.JTextField jTextFieldNomServeur;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldUtilisateurPersonnel;
    private javax.swing.JTextField jTextFieldUtilisateurSGBD;
    // End of variables declaration//GEN-END:variables
}
