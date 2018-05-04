/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author student
 */
public class UserDao {
    
    private Connection con;
    
    public UserDao(Connection con) {
        this.con = con;
    }
    
    public User findUserByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        User user = null;
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setParola(rs.getString("parola"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return user;
    }
    
    public void adaugaUser(User user) {
        String sql = "INSERT INTO users VALUES (NULL, ?,?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getParola());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
