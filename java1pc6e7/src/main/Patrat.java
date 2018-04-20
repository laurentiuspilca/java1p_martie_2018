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
public class Patrat implements Operatie {
    
    private Operatie child;
    
    public Patrat() {}
    
    public Patrat(Operatie child) {
        this.child = child;
    }

    @Override
    public int calculeaza(int x) {
        if (child != null) {
            x = child.calculeaza(x);
        }
        return x*x;
    }
    
}
