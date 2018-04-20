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
public class MySingleton1 {
    private static MySingleton1 instance;
    
    private MySingleton1() {}
    
    public static MySingleton1 getInstance() {
        if (instance == null) {
            createInstanceSynchronized();
        }
        return instance;
    }

    private static void createInstanceSynchronized() {
        synchronized (MySingleton1.class) {
            createInstance();
        }
    }

    private static void createInstance() {
        if (instance == null) {
            instance = new MySingleton1();
        }
    }
}
