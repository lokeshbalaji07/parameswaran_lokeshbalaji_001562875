/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Patient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lokesh Balaji
 */
public class PatientTest {
    Patient p = new Patient();
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {  
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

@Test
public void Test(){
    
    assertTrue(p.isPatientNormal(0,"Newborn",34,150,54,2.5f,4.6f));
    assertTrue(p.isPatientNormal(0,"Infant",25,85,75,5.0f,11.0f));
    assertTrue(p.isPatientNormal(2,"Adult",25,90,100,11.0f,23f));
    assertTrue(p.isPatientNormal(4,"Adult",25,100,95,15.0f,33.0f));
    assertTrue(p.isPatientNormal(8,"Adult",22,90,110,25.0f,45.0f));
    assertTrue(p.isPatientNormal(15,"Adult",15,60,112,60.0f,120.0f));
       
}

public void NegativeTestScenarios(){
    
    assertFalse(p.isPatientNormal(0,"Newborn",34,90,45,2.5f,4.6f));
    assertFalse(p.isPatientNormal(0,"Infant",15,70,45,2.0f,5.6f));
    assertFalse(p.isPatientNormal(0,"Adult",15,70,45,2.0f,5.6f));
    assertFalse(p.isPatientNormal(4,"Adult",5,7,4,1.0f,4.6f));
    assertFalse(p.isPatientNormal(8,"Adult",10,20,40,3.0f,2.6f));
    assertFalse(p.isPatientNormal(20,"Adult",20,50,60,0.1f,0.5f));
    
}

}