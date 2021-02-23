/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Lokesh Balaji
 */
public class Patient {
    
    private String name;
    private int age;
    

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
       
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public Patient(String name) {
        this.name = name;
    }

   
    
    public static boolean isPatientNormal(int age, String type, int Respiratoryrate,int Heartrate, int Bloodpressure, float weightk, float weightp ){
        
        
         if(type.equalsIgnoreCase("Newborn") && age ==0)
        {
            if((Respiratoryrate>=30)&&(Respiratoryrate<=50)&&(Heartrate>=120)&&(Heartrate<=150)&&(Bloodpressure>=50)
                    &&(Bloodpressure<=70)&&(weightk>=2&&weightk<=3)&&(weightp>=4.5)&&(weightp<=7))       
            {
             return true;   
            }
            
        }
         else if(type.equals("Infant") && age ==0 )
        {
            if((Respiratoryrate>=20)&&(Respiratoryrate<=30)&&(Heartrate>=80)&&(Heartrate<=140)&&(Bloodpressure>=70)
                    &&(Bloodpressure<=100)&&(weightk>=4&&weightk<=10)&&(weightp>=9)&&(weightp<=22))    
            {
             return true;   
            }
            
        }
         else if(type.equals("Adult"))
        {
        if((age >= 1 && age <=3))
        {
            
            if((Respiratoryrate>=20)&&(Respiratoryrate<=30)&&(Heartrate>=80)&&(Heartrate<=130)&&(Bloodpressure>=80)
                    &&(Bloodpressure<=110)&&(weightk>=10&&weightk<=14)&&(weightp>=22)&&(weightp<=31))   
            {
                   
             return true;   
            }
            
        }
        if((age >= 3 && age <=5))
        {
            if((Respiratoryrate>=20)&&(Respiratoryrate<=30)&&(Heartrate>=80)&&(Heartrate<=120)&&(Bloodpressure>=80)
                    &&(Bloodpressure<=110)&&(weightk>=14&&weightk<=18)&&(weightp>=31)&&(weightp<=40))   
            {
             return true;   
            }
            
          
        }
          if((age >= 6 && age <=12))
        {
            if((Respiratoryrate>=20)&&(Respiratoryrate<=30)&&(Heartrate>=70)&&(Heartrate<=110)&&(Bloodpressure>=80)
                    &&(Bloodpressure<=120)&&(weightk>=20&&weightk<=42)&&(weightp>=41)&&(weightp<=92))   
            {
             return true;   
            }
           
        }
            if(age>13)
        {
            if((Respiratoryrate>=12)&&(Respiratoryrate<=20)&&(Heartrate>=55)&&(Heartrate<=105)&&(Bloodpressure>=110)
                    &&(Bloodpressure<=120)&&(weightk>50)&&(weightp>110)) 
            {
             return true;
            }
          
        }
        }
       
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String name,type = null;
        int age=0,Respiratoryrate,Heartrate,Bloodpressure;
        float weightk,weightp;
        //Patient patientn = new Patient();
        //vitalsigns vitalsign = new vitalsigns(25,4,56,77,90);
        System.out.println("Enter the age in Years,months,days");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Years:");
        int years = sc.nextInt();
        System.out.print("Months:");
        int months = sc.nextInt();
        System.out.print("Days:");
        int days = sc.nextInt();
        

        if((years==0)&&(months==0)&&(days==0))
        {
            System.out.println("Enter the values");
            System.exit(0);
        }
                else if((years == 0)&&(months == 0)&&(days<=31)&&(days>0))
        {
            System.out.println("Newborn");
            type = "Newborn";
            
        }                
             else if((years>100)&&(months<=12)&&(days<=31))
        {
            System.out.println("Enter value less than 100");
            
        }
        else if((years >= 0)&&(months >= 0)&&(days>31))
        
                {
                    System.out.println("Enter value greater than 0 or less than 31");
                    return;
                   
                }
        
        else if((years == 0)&&(months >=0)&&(months<=12)&&(days<=31))
        //if((years == 0)&&(months >=0)&&(months<=12)&&(days<=31))
        {
            System.out.println("Infant");
            type = "Infant";
            
        }
        else if((years >= 0)&&(months>12)&&(days<=31))
        
        {
            System.out.println("Enter value greater than 0 or less than 12");
            return;
        }
        else if((years >= 0)&&(years <=100)&&(months <=12)&&(days<=31))
        //if((years >= 0)&&(years <=100)&&(months <=12)&&(days<=31))
        {
            System.out.println("Adult");
            type = "Adult";
            age=years;
        }
        
        //else if ()
        
        
       
       
        //System.out.println(mode);
        if(type.equals("Newborn") || type.equals("Infant") || type.equals("Adult"))
                
        {
        //#####
        System.out.println("Enter Respiratory rate");
        Respiratoryrate = sc.nextInt();
        
        vitalsigns obj = new vitalsigns();
        obj.setRespiratoryrate(Respiratoryrate);
        
        //int Respiratoryrt = obj.getRespiratoryrate();
        Respiratoryrate = obj.getRespiratoryrate();;
        System.out.println("Enter Heart rate");
        Heartrate=sc.nextInt();
        obj.setHeartrate(Heartrate);
        Heartrate = obj.getHeartrate();
        System.out.println("Enter Bloodpressure rate");
        Bloodpressure = sc.nextInt();
        obj.setBloodpressure(Bloodpressure);
        Bloodpressure= obj.getBloodpressure();
        System.out.println("Enter Weight in Kilos");
        weightk = sc.nextFloat();
        obj.setWeightk(weightk);
        weightk = obj.getWeightk();
        System.out.println("Enter Weight in Pounds");
        weightp = sc.nextFloat();
        obj.setWeightp(weightp);
        weightp = obj.getWeightp();
        
            //System.out.println("Enter the mode 1,2,3,4,5,6");
        
        System.out.println(isPatientNormal(age,type,Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp));
        }

}
}
