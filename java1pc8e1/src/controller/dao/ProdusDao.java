/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusDao {
    
    private Connection con;
    
    public ProdusDao(Connection con) {
        this.con = con;
    }
    
    public void adaugaProdus(Produs p) {
        String sql = "INSERT INTO produse VALUES (NULL, ?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, p.getNume());
            stmt.setDouble(2, p.getPret());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Produs> getAll() {
        List<Produs> list = new ArrayList<>();
        
        String sql = "SELECT * FROM produse";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produs p = new Produs();
                p.setId(rs.getInt("id"));
                p.setNume(rs.getString("nume"));
                p.setPret(rs.getDouble("pret"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void stergeProdus(int id) {
        String sql = "DELETE FROM produse WHERE id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
