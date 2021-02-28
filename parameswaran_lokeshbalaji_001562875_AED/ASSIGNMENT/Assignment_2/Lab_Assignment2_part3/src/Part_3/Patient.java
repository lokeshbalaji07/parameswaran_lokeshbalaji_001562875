/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

/**
 *
 * @author Lokesh Balaji
 */
public class Patient extends Personclass {

    Encounterhistory encounterhist;
    String ageGrup;

    public String getAgeGrup() {
        return ageGrup;
    }

    public void setAgeGrup(String ageGrup) {
        this.ageGrup = ageGrup;
    }
    
    @Override
    public Encounterhistory getEncounterhist() {
        return encounterhist;
    }

    @Override
    public void setEncounterhist(Encounterhistory encounterhist) {
        this.encounterhist = encounterhist;
    }
//     Patient() {
//        super();
//    }
    
    
}
