/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class Encounterhistory {
 
    private ArrayList<Encounter> enchistory;

    public ArrayList<Encounter> getEnchistory() {
        return enchistory;
    }

    public void setEnchistory(ArrayList<Encounter> enchistory) {
        this.enchistory = enchistory;
    }

    public Encounterhistory() {
        this.enchistory = enchistory;
    }

    
     public Encounter addenc(){
        
        Encounter enc = new Encounter();
        enchistory.add(enc);
        return enc;
        
    }
}
