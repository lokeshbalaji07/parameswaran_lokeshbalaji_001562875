/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

import java.util.HashMap;

/**
 *
 * @author Lokesh Balaji
 */
public class Patientdirectory {
    static HashMap<String,Patient> hashp = new HashMap<String,Patient>();

    public static HashMap<String, Patient> getHashp() {
        return hashp;
    }

    public static void setHashp(HashMap<String, Patient> hashp) {
        Patientdirectory.hashp = hashp;
    }
}
