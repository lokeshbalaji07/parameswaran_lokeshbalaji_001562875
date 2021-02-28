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
public class Agecalculation {
    private int Respiratoryratelow;
    private int Respiratoryratehigh;
    private int Heartratelow;
    private int Heartratehigh;
    private int Bloodpressurelow;
    private int Bloodpressurehigh;
    private float weightklow;
    private float weightkhigh;
    private float weightplow;
    private float weightphigh;

    public int getRespiratoryratelow() {
        return Respiratoryratelow;
    }

    public int getRespiratoryratehigh() {
        return Respiratoryratehigh;
    }

    public int getHeartratelow() {
        return Heartratelow;
    }

    public int getHeartratehigh() {
        return Heartratehigh;
    }

    public int getBloodpressurelow() {
        return Bloodpressurelow;
    }

    public int getBloodpressurehigh() {
        return Bloodpressurehigh;
    }

    public float getWeightklow() {
        return weightklow;
    }

    public float getWeightkhigh() {
        return weightkhigh;
    }

    public float getWeightplow() {
        return weightplow;
    }

    public float getWeightphigh() {
        return weightphigh;
    }

       

    public void setNewborn(){
        Respiratoryratelow=30;
        Respiratoryratehigh=50;
        Heartratelow=120;
        Heartratehigh=160;
        Bloodpressurelow=50;
        Bloodpressurehigh=70;
        weightklow=2;
        weightkhigh=3; 
        weightplow=4.5f;
        weightphigh=7;
    }
    public void setInfant(){
        Respiratoryratelow=20;
        Respiratoryratehigh=30;
        Heartratelow=80;
        Heartratehigh=140;
        Bloodpressurelow=70;
        Bloodpressurehigh=100;
        weightklow=4;
        weightkhigh=10; 
        weightplow=9f;
        weightphigh=22;
    }
    public void setToddler(){
        Respiratoryratelow=20;
        Respiratoryratehigh=30;
        Heartratelow=80;
        Heartratehigh=130;
        Bloodpressurelow=80;
        Bloodpressurehigh=110;
        weightklow=10;
        weightkhigh=14; 
        weightplow=22f;
        weightphigh=31;
    }
    public void setPreschooler(){
        Respiratoryratelow=20;
        Respiratoryratehigh=30;
        Heartratelow=80;
        Heartratehigh=120;
        Bloodpressurelow=80;
        Bloodpressurehigh=110;
        weightklow=14;
        weightkhigh=18; 
        weightplow=31f;
        weightphigh=40;
    }
    public void setSchoolage(){
        Respiratoryratelow=20;
        Respiratoryratehigh=30;
        Heartratelow=70;
        Heartratehigh=110;
        Bloodpressurelow=80;
        Bloodpressurehigh=120;
        weightklow=20;
        weightkhigh=42; 
        weightplow=41f;
        weightphigh=92;
    }
    public void setAdult(){
        Respiratoryratelow=12;
        Respiratoryratehigh=20;
        Heartratelow=55;
        Heartratehigh=105;
        Bloodpressurelow=110;
        Bloodpressurehigh=120;
        weightklow=50;
        //weightkhigh=10; 
        weightplow=110f;
        //weightphigh=22;
    }
}
