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
public class OperatieFactory {
    
    public static Operatie getOperatie(Tip t) {
        switch (t) {
            case ADUNARE: return new Adunare();
            case PRODUS: return new Produs();
            default:
                throw new RuntimeException("Not a known type");
        }
    }
    
    public static enum Tip {
        ADUNARE, PRODUS
    }
}
