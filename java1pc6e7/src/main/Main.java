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
        Operatie o1 = new Patrat(new Dublu());
        System.out.println(o1.calculeaza(10));
        
        Operatie o2 = new Dublu(new Patrat());
        System.out.println(o2.calculeaza(10));
        
        Operatie o3 = new Dublu(new Patrat(new Patrat()));
        System.out.println(o3.calculeaza(10));
        
        Operatie o4 = new Dublu(new Patrat(new Patrat(new Dublu())));
        System.out.println(o4.calculeaza(10));
    }
    
}
