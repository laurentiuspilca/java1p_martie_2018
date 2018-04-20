/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MySubject {
    
    private List<MyListener> listeners = new ArrayList<>();
    
    public void metodaCareModificaStareaSubiectlui() {
        // evenimentul propriu-zis
        listeners.forEach(MyListener::eventHappened);
    }
    
    public void addMyListener(MyListener listener) {
        listeners.add(listener);
    }
    
    public void removeMyListener(MyListener listener) {
        listeners.remove(listener);
    }
    
    
}
