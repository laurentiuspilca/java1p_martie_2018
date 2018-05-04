/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.service;

import controller.dao.ProdusDao;
import controller.manager.ConnectionManager;
import java.sql.Connection;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusService {
    private ProdusService() {}
    
    private static final class SingletonHolder {
        private static final ProdusService INSTANCE = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public void adaugaProdus(Produs p) {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        produsDao.adaugaProdus(p);
    }
    
    public List<Produs> getAllProducts() {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        return produsDao.getAll();
    }
    
    public void stergeProdus(Produs p) {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        produsDao.stergeProdus(p.getId());
    }
}
