/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_2;

/**
 *
 * @author Lokesh Balaji
 */
public class Vitalsigns {
    
    private int Respiratoryrate;
    private int Heartrate;
    private int Bloodpressure;
    private float weightk;
    private float weightp;

    public Vitalsigns(int Respiratoryrate, int Heartrate, int Bloodpressure, float weightk, float weightp) {
        this.Respiratoryrate = Respiratoryrate;
        this.Heartrate = Heartrate;
        this.Bloodpressure = Bloodpressure;
        this.weightk = weightk;
        this.weightp = weightp;
    }

    Vitalsigns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRespiratoryrate() {
        return Respiratoryrate;
    }

    public void setRespiratoryrate(int Respiratoryrate) {
        this.Respiratoryrate = Respiratoryrate;
    }

    public int getHeartrate() {
        return Heartrate;
    }

    public void setHeartrate(int Heartrate) {
        this.Heartrate = Heartrate;
    }

    public int getBloodpressure() {
        return Bloodpressure;
    }

    public void setBloodpressure(int Bloodpressure) {
        this.Bloodpressure = Bloodpressure;
    }

    public float getWeightk() {
        return weightk;
    }

    public void setWeightk(float weightk) {
        this.weightk = weightk;
    }

    public float getWeightp() {
        return weightp;
    }

    public void setWeightp(float weightp) {
        this.weightp = weightp;
    }
    
}

