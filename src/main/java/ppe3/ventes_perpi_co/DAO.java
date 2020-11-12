/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe3.ventes_perpi_co;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a.athmane
 */
public class DAO {

    /*
    private static String nomServeur = "10.0.10.141";
    private static String port = "3306";
    private static String nomBdd = "ventes";
    private static String nomUtilisateur = "root";
    private static String motDePasse = "root";
     */

    private static String nomServeur = "127.0.0.1";
    private static String port = "3306";
    private static String nomBdd = "ventes";
    private static String nomUtilisateur = "roota";
    private static String motDePasse = "roota";

    private static String chaineConnexion;

    private Connection connexion;

    private static DAO monDao = null;

    private DAO() {
        try {
            DAO.chaineConnexion = "jdbc:mysql://" + DAO.nomServeur + ":" + DAO.port + "/" + DAO.nomBdd;

            this.connexion = (Connection) DriverManager.getConnection(DAO.chaineConnexion, DAO.nomUtilisateur, DAO.motDePasse);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 
     * @return 
     */
    public static DAO getInstance() {
        if (DAO.monDao == null) {
            DAO.monDao = new DAO();
        } else {
            if (!DAO.monDao.connexionActive()) {
                DAO.monDao = new DAO();
            }
        }
        return DAO.monDao;
    }

    /**
     * 
     * @return 
     */
    public Boolean connexionActive() {
        Boolean connexionActive = true;
        try {
            if (this.connexion.isClosed()) {
                connexionActive = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connexionActive;
    }

    /**
     * Requête SQL de sélection
     * @param sql Requête SQL (SElECT)
     * @return 
     */
    public ResultSet requeteSelection(String sql) {

        try {
            Statement requete = new DAO().connexion.createStatement();
            return requete.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    /**
     * Requête SQL d'action
     * @param sql Requête SQL (INSERT, etc...)
     * @return 
     */
    public Integer requeteAction(String sql) {

        try {
            Statement requete = new DAO().connexion.createStatement();
            return requete.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
}
