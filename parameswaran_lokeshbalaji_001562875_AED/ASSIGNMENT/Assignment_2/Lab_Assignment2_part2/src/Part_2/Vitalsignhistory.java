/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_2;

import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class Vitalsignhistory {
    
    private ArrayList<Vitalsigns> history;

    public Vitalsignhistory(ArrayList<Vitalsigns> history) {
        this.history = history;
    }

    public ArrayList<Vitalsigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Vitalsigns> history) {
        this.history = history;
    }
    
    public Vitalsigns addnewvitals(){
        
        Vitalsigns newvitals = new Vitalsigns();
        history.add(newvitals);
        return newvitals;
        
    }
    
}
