/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Locale;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyObject o1 = new MyObject.Builder()
                    .setQ(true)
                    .setY("HELLO")
                    .build();
        
        Locale loc = new Locale.Builder()
                    .setRegion("CA")
                    .setLanguage("en")
                    .build();
    }
    
}
