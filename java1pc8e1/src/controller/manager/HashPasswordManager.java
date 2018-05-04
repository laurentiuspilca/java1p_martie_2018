/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manager;

import java.security.MessageDigest;

/**
 *
 * @author student
 */
public class HashPasswordManager {
    private HashPasswordManager() {}
    
    private static final class SingletonHolder {
        private static final HashPasswordManager INSTANCE = new HashPasswordManager();
    }
    
    public static HashPasswordManager getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public String hashPassword(String password) {
        try {
            StringBuilder sb = new StringBuilder();
            
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte [] digested = md.digest(password.getBytes());
            
            for (int i=0;i<digested.length;i++) {
                sb.append(Integer.toHexString(0XFF & digested[i]));
            }
            
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
