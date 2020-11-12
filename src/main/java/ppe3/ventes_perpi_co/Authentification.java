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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitre = new javax.swing.JLabel();
        jLabelUtilisateur = new javax.swing.JLabel();
        jTextFieldUtilisateur = new javax.swing.JTextField();
        jLabelMDP = new javax.swing.JLabel();
        jPasswordFieldMDP = new javax.swing.JPasswordField();
        jButtonConnexion = new javax.swing.JButton();
        jLabelEtat = new javax.swing.JLabel();
        jButtonQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpi&Co");
        setResizable(false);

        jLabelTitre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Perpi&Co - Authentification");
        jLabelTitre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelUtilisateur.setText("Nom d'utilisateur");

        jLabelMDP.setText("Mot de passe");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEtat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUtilisateur)
                                .addComponent(jLabelMDP))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUtilisateur)
                                .addComponent(jPasswordFieldMDP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jButtonConnexion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtilisateur)
                    .addComponent(jTextFieldUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMDP)
                    .addComponent(jPasswordFieldMDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEtat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        String nomuser = jTextFieldUtilisateur.getText();
        String mdp = jPasswordFieldMDP.getText();

        try {
            DAO monDAO = DAO.getInstance();
            // Vérifie si la connexion au SGBD est effectuée et vérifie si les champs du nom d'utilisateur et du mdp sont remplis
            if (monDAO != null) {
                if (!("".equals(nomuser) && "".equals(mdp))) {
                    ResultSet connexionPersonnel = monDAO.requeteSelection("SELECT nomuser, mdp FROM personnel WHERE nomuser='" + nomuser + "' AND mdp='" + mdp + "'");
                    // Parcours la table et si les informations rentrées dans les champs sont trouvées dans la BDD récupère l'id du profil du personnel voulant se connecter
                    if (connexionPersonnel.next()) {
                        ResultSet requeteProfil = monDAO.requeteSelection("SELECT id_profil FROM personnel WHERE nomuser='" + nomuser + "' AND mdp='" + mdp + "'");
                        requeteProfil.next();
                        String profilPersonnel = requeteProfil.getString(1);
                        /* Vérifie en fonction de l'id du profil si c'est un agent ou un admin qui essaye de se connecter
                        Utilise une méthode 'setIdPersonnel' pour pouvoir stocker l'id du personnel voulant se connecter */
                        if ("1".equals(profilPersonnel)) {
                            AccueilAgent accueilAgent = new AccueilAgent();
                            accueilAgent.setVisible(true);
                            ResultSet requeteIdPersonnel = monDAO.requeteSelection("SELECT id_personnel FROM personnel WHERE nomuser='" + nomuser + "' AND mdp='" + mdp + "'");
                            requeteIdPersonnel.next();
                            accueilAgent.setIdPersonnel(requeteIdPersonnel.getString(1));
                            Authentification.this.dispose();
                        } else {
                            AccueilAdmin accueilAdmin = new AccueilAdmin();
                            accueilAdmin.setVisible(true);
                            ResultSet requeteIdPersonnel = monDAO.requeteSelection("SELECT id_personnel FROM personnel WHERE nomuser='" + nomuser + "' AND mdp='" + mdp + "'");
                            requeteIdPersonnel.next();
                            accueilAdmin.setIdPersonnel(requeteIdPersonnel.getString(1));
                            Authentification.this.dispose();
                        }
                    } else {
                        jLabelEtat.setText("Veuillez vérifier les informations saisies");
                    }
                } else {
                    jLabelEtat.setText("Veuillez remplir les champs");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonQuitterActionPerformed

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
    private javax.swing.JLabel jLabelMDP;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelUtilisateur;
    private javax.swing.JPasswordField jPasswordFieldMDP;
    private javax.swing.JTextField jTextFieldUtilisateur;
    // End of variables declaration//GEN-END:variables
}