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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarFactory cf = CarFactory.createCarFactory(CarFactory.Type.AUDI);
        
        Roata r = cf.createRoata();
        Caroserie c = cf.createCaroserie();
        
        System.out.println(r.getTip());
        System.out.println(c.getTip());
    }
    
}
