/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ConnectionManager {
    
    private Connection con;
    
    private ConnectionManager() {
        try {
            String url = "jdbc:mysql://localhost/java1pcurs8";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionManager INSTANCE = new ConnectionManager();
    }
    
    public static ConnectionManager getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public Connection getConnection() {
        return con;
    }
}
