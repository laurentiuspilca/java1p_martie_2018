/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JButton b;
    private int nr;
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        b = new JButton("0");
        add(b);
        b.addActionListener(ev -> increment());
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void increment() {
        nr++;
        b.setText(nr + "");
    }
}
