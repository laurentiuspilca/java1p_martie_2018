/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JButton b;
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Titlu Fereastra");
        setLayout(new FlowLayout());
        
        b = new JButton("HELLO");
        add(b);
        b.addActionListener(ev -> System.exit(0));
        
        setSize(500, 500);
        //setLocation(150, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
