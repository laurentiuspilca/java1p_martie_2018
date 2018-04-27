/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JPanel p1,p2;
    private JButton b1,b2,b3;
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p2 = new JPanel();
        
        b1 = new JButton("Red");
        b2 = new JButton("Green");
        b3 = new JButton("Blue");
        
        add(p1);
        add(p2, BorderLayout.SOUTH);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        b1.addActionListener(ev -> p1.setBackground(Color.RED));
        b2.addActionListener(ev -> p1.setBackground(Color.GREEN));
        b3.addActionListener(ev -> p1.setBackground(Color.BLUE));
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
