/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Developpeur;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;

/**
 *
 * @author a
 */
public class DeveloppeurService implements IDao<Developpeur>{

    @Override
    public boolean create(Developpeur o) {
        boolean r = false;
        try {
            String req = "INSERT INTO `developpeur` (`id`, `nom`, `salaire`) VALUES (NULL, ?, ?);";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            st.setString(1, o.getNom());
            st.setDouble(2, o.getSalaire());
            int n = st.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public boolean update(Developpeur o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Developpeur o) {
        boolean r = false;
        try {
            String req = "DELETE FROM `developpeur` where id  = ?";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            st.setInt(1, o.getId());
            int n = st.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public Developpeur getById(int id) {
        try {
            String req = "select * from developpeur where id = ?";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Developpeur(rs.getInt("id"), rs.getString("nom"), rs.getDouble("salaire"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Developpeur> getAll() {
         List<Developpeur> developpeurs = new ArrayList<>();
        try {
            String req = "select * from developpeur";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                developpeurs.add(new Developpeur(rs.getInt("id"), rs.getString("nom"), rs.getDouble("salaire")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return developpeurs;
    }
    
}

