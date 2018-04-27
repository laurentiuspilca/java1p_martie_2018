/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/java1pc7";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO persoane VALUES (NULL, 'Pop', 'Gigel')";
            
            int r = stmt.executeUpdate(sql);
            
            if (r > 0) {
                System.out.println("Au fost adaugate " + r + " randuri");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
