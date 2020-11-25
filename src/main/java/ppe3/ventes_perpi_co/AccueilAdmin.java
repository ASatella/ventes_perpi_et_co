/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe3.ventes_perpi_co;

/**
 *
 * @author A.A
 */
public class AccueilAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public AccueilAdmin() {
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

        gestionPAD1 = new ppe3.ventes_perpi_co.GestionPAD();
        jTabbedPaneAccueilAgent = new javax.swing.JTabbedPane();
        jPanelAccueil = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelEtat = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jPanelGestionClient = new javax.swing.JPanel();
        gestionClient1 = new ppe3.ventes_perpi_co.GestionClient();
        jPanelGestionPAD = new javax.swing.JPanel();
        gestionPAD2 = new ppe3.ventes_perpi_co.GestionPAD();
        jPanelVentePAD = new javax.swing.JPanel();
        jLabelid = new javax.swing.JLabel();
        ventePAD2 = new ppe3.ventes_perpi_co.VentePAD();
        jPanelActions = new javax.swing.JPanel();
        actions1 = new ppe3.ventes_perpi_co.Actions();
        jPanelStatistiques = new javax.swing.JPanel();
        statistiques2 = new ppe3.ventes_perpi_co.Statistiques();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpi&Co - connecté(e) en tant qu'administrateur");

        jTabbedPaneAccueilAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneAccueilAgentMouseClicked(evt);
            }
        });

        jLabelTitre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Perpi&Co - Accueil");
        jLabelTitre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelEtat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEtat.setText("Connecté en tant qu'administrateur");

        jButtonDeconnexion.setText("Se déconnecter");
        jButtonDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccueilLayout = new javax.swing.GroupLayout(jPanelAccueil);
        jPanelAccueil.setLayout(jPanelAccueilLayout);
        jPanelAccueilLayout.setHorizontalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                .addGroup(jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAccueilLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAccueilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAccueilLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonDeconnexion)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanelAccueilLayout.setVerticalGroup(
            jPanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEtat)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeconnexion)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPaneAccueilAgent.addTab("Accueil", jPanelAccueil);

        javax.swing.GroupLayout jPanelGestionClientLayout = new javax.swing.GroupLayout(jPanelGestionClient);
        jPanelGestionClient.setLayout(jPanelGestionClientLayout);
        jPanelGestionClientLayout.setHorizontalGroup(
            jPanelGestionClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionClient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanelGestionClientLayout.setVerticalGroup(
            jPanelGestionClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionClient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        jTabbedPaneAccueilAgent.addTab("Gestion des clients", jPanelGestionClient);

        javax.swing.GroupLayout jPanelGestionPADLayout = new javax.swing.GroupLayout(jPanelGestionPAD);
        jPanelGestionPAD.setLayout(jPanelGestionPADLayout);
        jPanelGestionPADLayout.setHorizontalGroup(
            jPanelGestionPADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionPAD2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanelGestionPADLayout.setVerticalGroup(
            jPanelGestionPADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionPAD2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        jTabbedPaneAccueilAgent.addTab("Gestion PAD", jPanelGestionPAD);

        jLabelid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelVentePADLayout = new javax.swing.GroupLayout(jPanelVentePAD);
        jPanelVentePAD.setLayout(jPanelVentePADLayout);
        jPanelVentePADLayout.setHorizontalGroup(
            jPanelVentePADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentePADLayout.createSequentialGroup()
                .addGap(670, 670, 670)
                .addComponent(jLabelid))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentePADLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventePAD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelVentePADLayout.setVerticalGroup(
            jPanelVentePADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentePADLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventePAD2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );

        jTabbedPaneAccueilAgent.addTab("Ventes PAD", jPanelVentePAD);

        javax.swing.GroupLayout jPanelActionsLayout = new javax.swing.GroupLayout(jPanelActions);
        jPanelActions.setLayout(jPanelActionsLayout);
        jPanelActionsLayout.setHorizontalGroup(
            jPanelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actions1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanelActionsLayout.setVerticalGroup(
            jPanelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneAccueilAgent.addTab("Actions", jPanelActions);

        javax.swing.GroupLayout jPanelStatistiquesLayout = new javax.swing.GroupLayout(jPanelStatistiques);
        jPanelStatistiques.setLayout(jPanelStatistiquesLayout);
        jPanelStatistiquesLayout.setHorizontalGroup(
            jPanelStatistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statistiques2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanelStatistiquesLayout.setVerticalGroup(
            jPanelStatistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatistiquesLayout.createSequentialGroup()
                .addComponent(statistiques2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
        );

        jTabbedPaneAccueilAgent.addTab("Statistiques", jPanelStatistiques);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAccueilAgent)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneAccueilAgent)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeconnexionActionPerformed
        //Ferme la fenête du logiciel et reviens à la fenêtre d'autentification quand le bouton de deconnexion est appuyé
        this.dispose();
        Authentification fenetreAuthentification = new Authentification();
        fenetreAuthentification.setVisible(true);
    }//GEN-LAST:event_jButtonDeconnexionActionPerformed

    private void jTabbedPaneAccueilAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneAccueilAgentMouseClicked
        // Utilisation des méthodes pour remplir les listes en fonctions des données se trouvant dans la base de données
        gestionPAD2.remplirListeProduit();
        gestionClient1.remplirListeClient();
        ventePAD2.remplirListeVente();
        actions1.remplirListeAgent();
        statistiques2.actualiserMontant();
    }//GEN-LAST:event_jTabbedPaneAccueilAgentMouseClicked

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
            java.util.logging.Logger.getLogger(AccueilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccueilAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ppe3.ventes_perpi_co.Actions actions1;
    private ppe3.ventes_perpi_co.GestionClient gestionClient1;
    private ppe3.ventes_perpi_co.GestionPAD gestionPAD1;
    private ppe3.ventes_perpi_co.GestionPAD gestionPAD2;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JPanel jPanelAccueil;
    private javax.swing.JPanel jPanelActions;
    private javax.swing.JPanel jPanelGestionClient;
    private javax.swing.JPanel jPanelGestionPAD;
    private javax.swing.JPanel jPanelStatistiques;
    private javax.swing.JPanel jPanelVentePAD;
    private javax.swing.JTabbedPane jTabbedPaneAccueilAgent;
    private ppe3.ventes_perpi_co.Statistiques statistiques2;
    private ppe3.ventes_perpi_co.VentePAD ventePAD2;
    // End of variables declaration//GEN-END:variables
}
