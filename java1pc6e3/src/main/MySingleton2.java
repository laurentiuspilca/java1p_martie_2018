/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class MySingleton2 {
    private MySingleton2() {}
    
    private static final class SingletonHolder {
        private static final MySingleton2 instance = new MySingleton2();
    }
    
    public static MySingleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
