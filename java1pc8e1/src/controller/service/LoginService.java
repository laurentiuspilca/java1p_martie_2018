/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.service;

import controller.dao.UserDao;
import controller.manager.ConnectionManager;
import controller.manager.HashPasswordManager;
import java.sql.Connection;
import model.User;

/**
 *
 * @author student
 */
public class LoginService {
    private LoginService() {}
    
    private static final class SingletonHolder {
        private static final LoginService INSTANCE = new LoginService();
    }
    
    public static LoginService getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public boolean register(User user) {
        Connection con = ConnectionManager.getInstance().getConnection();
        UserDao userDao = new UserDao(con);
        
        User userExistent = userDao.findUserByUsername(user.getUsername());
        
        if (userExistent == null) {
            userDao.adaugaUser(user);
            return true;
        }
        
        return false;
    }
    
    public boolean login(User user) {
        Connection con = ConnectionManager.getInstance().getConnection();
        UserDao userDao = new UserDao(con);
        
        User userExistent = userDao.findUserByUsername(user.getUsername());
        String hash = HashPasswordManager.getInstance().hashPassword(user.getParola());
        
        if (userExistent != null) {
            if (userExistent.getParola().equals(hash)) {
                return true;
            }
        }
        
        return false;
    }
}
