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
public class AccueilAgent extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public AccueilAgent() {
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

        gestionClient2 = new ppe3.ventes_perpi_co.GestionClient();
        jTabbedPaneAccueilAgent = new javax.swing.JTabbedPane();
        jPanelAccueil = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelEtat = new javax.swing.JLabel();
        jButtonDeconnexion = new javax.swing.JButton();
        jPanelGestionClient = new javax.swing.JPanel();
        gestionClient1 = new ppe3.ventes_perpi_co.GestionClient();
        jPanelGestionPAD = new javax.swing.JPanel();
        gestionPAD1 = new ppe3.ventes_perpi_co.GestionPAD();
        jPanelVentePAD = new javax.swing.JPanel();
        jLabelid = new javax.swing.JLabel();
        ventePAD2 = new ppe3.ventes_perpi_co.VentePAD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpi&Co - Connecté(e) en tant qu'agent");
        setResizable(false);

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
        jLabelEtat.setText("Connecté en tant qu'agent");

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
                .addContainerGap(432, Short.MAX_VALUE))
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
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPaneAccueilAgent.addTab("Accueil", jPanelAccueil);

        javax.swing.GroupLayout jPanelGestionClientLayout = new javax.swing.GroupLayout(jPanelGestionClient);
        jPanelGestionClient.setLayout(jPanelGestionClientLayout);
        jPanelGestionClientLayout.setHorizontalGroup(
            jPanelGestionClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionClientLayout.createSequentialGroup()
                .addComponent(gestionClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelGestionClientLayout.setVerticalGroup(
            jPanelGestionClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionClient1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jTabbedPaneAccueilAgent.addTab("Gestion des clients", jPanelGestionClient);

        javax.swing.GroupLayout jPanelGestionPADLayout = new javax.swing.GroupLayout(jPanelGestionPAD);
        jPanelGestionPAD.setLayout(jPanelGestionPADLayout);
        jPanelGestionPADLayout.setHorizontalGroup(
            jPanelGestionPADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionPAD1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        jPanelGestionPADLayout.setVerticalGroup(
            jPanelGestionPADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionPAD1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jTabbedPaneAccueilAgent.addTab("Gestion PAD", jPanelGestionPAD);

        jLabelid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelVentePADLayout = new javax.swing.GroupLayout(jPanelVentePAD);
        jPanelVentePAD.setLayout(jPanelVentePADLayout);
        jPanelVentePADLayout.setHorizontalGroup(
            jPanelVentePADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentePADLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelid)
                .addGap(5, 5, 5)
                .addComponent(ventePAD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelVentePADLayout.setVerticalGroup(
            jPanelVentePADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentePADLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabelid))
            .addGroup(jPanelVentePADLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ventePAD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneAccueilAgent.addTab("Ventes PAD", jPanelVentePAD);

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
        gestionPAD1.remplirListeProduit();
        gestionClient1.remplirListeClient();
        ventePAD2.remplirListeVente();
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
            java.util.logging.Logger.getLogger(AccueilAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccueilAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ppe3.ventes_perpi_co.GestionClient gestionClient1;
    private ppe3.ventes_perpi_co.GestionClient gestionClient2;
    private ppe3.ventes_perpi_co.GestionPAD gestionPAD1;
    private javax.swing.JButton jButtonDeconnexion;
    private javax.swing.JLabel jLabelEtat;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JPanel jPanelAccueil;
    private javax.swing.JPanel jPanelGestionClient;
    private javax.swing.JPanel jPanelGestionPAD;
    private javax.swing.JPanel jPanelVentePAD;
    private javax.swing.JTabbedPane jTabbedPaneAccueilAgent;
    private ppe3.ventes_perpi_co.VentePAD ventePAD2;
    // End of variables declaration//GEN-END:variables
}
