/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

import java.util.Date;

/**
 *
 * @author Lokesh Balaji
 */
public class Encounter {
    
   private String Doctorname;
   private Date Createdtime;
   private String Reasonofvisit;
   Vitalsign vitalsign; 

    public Encounter(String Doctorname, Date Createdtime, String Reasonofvisit, Vitalsign vitalsign) {
        this.Doctorname = Doctorname;
        this.Createdtime = Createdtime;
        this.Reasonofvisit = Reasonofvisit;
        this.vitalsign = vitalsign;
    }

    public Encounter(){
    
}

    

    public Vitalsign getVitalsign() {
        return vitalsign;
    }

    public void setVitalsign(Vitalsign vitalsign) {
        this.vitalsign = vitalsign;
    }
//Vitalsign vs = new Vitalsign(Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp);
    public String getDoctorname() {
        return Doctorname;
    }

    public void setDoctorname(String Doctorname) {
        this.Doctorname = Doctorname;
    }

    public Date getCreatedtime() {
        return Createdtime;
    }

    public void setCreatedtime(Date Createdtime) {
        this.Createdtime = Createdtime;
    }

    public String getReasonofvisit() {
        return Reasonofvisit;
    }

    public void setReasonofvisit(String Reasonofvisit) {
        this.Reasonofvisit = Reasonofvisit;
    }
   
    
}
