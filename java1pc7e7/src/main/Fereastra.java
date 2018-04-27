/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Fereastra extends JFrame {
    
    private JButton[] b = new JButton[12];
    
    public Fereastra() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3 ,4));
        
        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton(i + 1 + "");
            add(b[i]);
        }
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
