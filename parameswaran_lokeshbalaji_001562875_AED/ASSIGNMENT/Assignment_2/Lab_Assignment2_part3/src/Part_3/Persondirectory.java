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
public class Persondirectory {
    static HashMap<String,Patient> hashpe = new HashMap<String,Patient>();

    public static HashMap<String, Patient> getHashpe() {
        return hashpe;
    }

    public static void setHashpe(HashMap<String, Patient> hashpe) {
        Persondirectory.hashpe = hashpe;
    }
    
}
