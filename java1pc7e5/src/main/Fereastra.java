/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JButton b1,b2,b3,b4,b5;
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        b1 = new JButton("BUTON 1");
        b2 = new JButton("BUTON 2");
        b3 = new JButton("BUTON 3");
        b4 = new JButton("BUTON 4");
        b5 = new JButton("BUTON 5");
        
        add(b1, BorderLayout.NORTH); 
        add(b2, BorderLayout.SOUTH); 
        add(b3, BorderLayout.EAST); 
        add(b4, BorderLayout.WEST); 
        add(b5);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
