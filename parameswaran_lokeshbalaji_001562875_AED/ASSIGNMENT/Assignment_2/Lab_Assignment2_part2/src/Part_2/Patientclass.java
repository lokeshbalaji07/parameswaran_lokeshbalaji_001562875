/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Lokesh Balaji
 */
public class Patientclass {
    
    private static ArrayList<Vitalsigns> list = new ArrayList();
     static int Respiratoryrate,Heartrate,Bloodpressure;
     static float weightk,weightp;
     static String type=null;
            
    
    public static void main (String args[])
    {
        display();
    }
        //Vitalsigns vitalsign = new Vitalsigns();
    public static void createmenu(){
        //ArrayList<Vitalsigns> list = new ArrayList();
        String name=null;
        Date date;
        int Respiratoryrate,Heartrate,Bloodpressure,age=0;
        float weightk,weightp;
        //Patient patientn = new Patient("name",25);
        //Vitalsigns vitalsign = new Vitalsigns(Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name=sc.nextLine();
        System.out.println("Enter the age in Years,months,days");
        //Scanner sc = new Scanner(System.in);
        //ystem.out.println("Enter a name: ");
        //me=sc.nextLine();
        System.out.print("Years:");
        int years = sc.nextInt();
        System.out.print("Months:");
        int months = sc.nextInt();
        System.out.print("Days:");
        int days = sc.nextInt();
        
        
        //String type=null;
        if((years==0)&&(months==0)&&(days==0)){
            System.out.println("Enter the values");
            System.exit(0);
            
        }
        else if((years==0)&&(months>12)&&(days>31))
        {
            System.out.println("Enter values within range");
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
        else if((years >= 1)&&(years <=3)&&(months <=12)&&(days<=31))
        //if((years >= 0)&&(years <=100)&&(months <=12)&&(days<=31))
        {
            System.out.println("Toddler");
            type = "Toddler";
            //age=years;
        }
        else if((years>3)&&(years<=5)&&(months<=12)&&(days<=31))
        {
            System.out.println("Preschooler");
            type = "Preschooler";
        }
        else if((years>=6)&&(years<=12)&&(months<=12)&&(days<=31))
        {
            System.out.println("School Age");
            type = "School Age";
        }
        else if((years>13)&&(months<=12)&&(days<=31))
        {
            System.out.println("Adult");
            type = "Adult";
        }

        else{
            System.out.println("Enter proper values");
        }
       
        System.out.println("Enter Respiratory rate");
        Respiratoryrate = sc.nextInt();
        System.out.println("Enter Heart rate");
        Heartrate=sc.nextInt();
        System.out.println("Enter Bloodpressure rate");
        Bloodpressure = sc.nextInt();
        System.out.println("Enter Weight in Kilos");
        weightk = sc.nextFloat();
        System.out.println("Enter Weight in Pounds");
        weightp = sc.nextFloat();
        date= new Date();
        
        Vitalsigns vitalsign = new Vitalsigns(Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp,date);
        list.add(vitalsign);
        //list.get(0).getHeartrate();
        //System.out.println(list.get(0).getHeartrate());
        display();
    }
        
        //System.out.println("List Len "+ list.size());
    public static void display()
    {
        int option=0;
        System.out.println("Choose an Option");
        System.out.println("1.Create Vital Details");
        System.out.println("2.View Vital Details");
        System.out.println("3.Display Vital Details");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        //System.out.println("Choose an Option");
        //System.out.println("1.Create Vital Details");
        //System.out.println("2.View Vital Details");
        //System.out.println("3.Display Vital Details");
        
        if(option==1)
        {
            createmenu();
        }
        else if(option==2)
        {
            viewmenu();
           
        }
        else if (option==3)
        {
            checkmenu();
        }
        else if(option==4)
                {
                    exitmenu();
                }
        else{
            System.out.println("Enter Values within range");
        }
        
    }
    public static void exitmenu()
    {
        System.exit(0);
    }
    public static void viewmenu()
    {
        System.out.println("===========================================================================================================");
        System.out.print("S.No"+" | ");
        System.out.print("Respiratoryrate"+" | ");
        System.out.println("Heartrate"+" | "+"Bloodpressure"+" | "+"weight(k)"+" | "+"weight(p)"+" |          "+"CreatedTime");
        System.out.println("===========================================================================================================");
        for(int i=0;i<list.size();i++)
            
        {
        
        System.out.print(i+1);
        //System.out.println("   ");
        System.out.print("             "+list.get(i).getRespiratoryrate()+"              ");
        System.out.print(list.get(i).getHeartrate()+"            ");
        System.out.print(list.get(i).getBloodpressure()+"             ");
        System.out.print(list.get(i).getWeightk()+"         ");
        System.out.print(list.get(i).getWeightp()+"       ");
        System.out.println(list.get(i).getCreatedtime());
        }
        System.out.println("===========================================================================================================");
        display();
    }
    public static void checkmenu()
    {
        String Vitalcheck=null;
        int modsize=list.size()-1;
        int Respiratoryrate= list.get(modsize).getRespiratoryrate();
        int Heartrate= list.get(modsize).getHeartrate();
        int Bloodpressure= list.get(modsize).getBloodpressure();
        float weightk= list.get(modsize).getWeightk();
        float weightp= list.get(modsize).getWeightp();
        System.out.println("Enter the Vital to be checked");
        Scanner sc=new Scanner(System.in);
        Vitalcheck=sc.nextLine();
        
       if(type.equals("Newborn") && Vitalcheck.equalsIgnoreCase("Respiratory rate"))
       {
           if((Respiratoryrate>=30)&&(Respiratoryrate<=50)) {
           System.out.println("Vitals are normal");
        }  
        else
        {
            System.out.println("Vitals are Abnormal");
        }
       }
       else if(type.equals("Newborn") && Vitalcheck.equalsIgnoreCase("Heart rate"))
       {
       if((Heartrate>=120)&&(Heartrate<=150))
       {
            System.out.println("Vitals are normal");
       }
       else
       {
           System.out.println("Vitals are Abnormal");
       }
       }
       else if(type.equals("Newborn") && Vitalcheck.equalsIgnoreCase("Blood pressure"))
       {
       if((Bloodpressure>=50) &&(Bloodpressure<=70))
       {
           System.out.println("Vitals are normal");
       }
       else{
           System.out.println("Vitals are Abnormal");
       }
       }
       else if(type.equals("Newborn") && Vitalcheck.equalsIgnoreCase("weight in kilos"))
       {
       if((weightk>=2&&weightk<=3))
       {
            System.out.println("Vitals are normal");
       }
       else
       {
           System.out.println("Vitals are Abnormal");
       }
       }
       else if(type.equals("Newborn") && Vitalcheck.equalsIgnoreCase("weight in pounds"))
       {
       if((weightp>=4.5)&&(weightp<=7))
       {
           System.out.println("Vitals are normal");       }
        else
       {
           System.out.println("Vitals are Abnormal");
       }
       }
       else if(type.equals("Infant") && Vitalcheck.equalsIgnoreCase("Respiratory rate"))
       {
           if((Respiratoryrate>=20)&&(Respiratoryrate<=30)) {
           System.out.println("Vitals are normal");
           }
           else
           {
               System.out.println("Vitals are Abnormal");
           }  
       }
       else if(type.equals("Infant") && Vitalcheck.equalsIgnoreCase("Heart rate")){
           if((Heartrate>=80)&&(Heartrate<=140)){
          System.out.println("Vitals are normal");
       }
           else{
               System.out.println("Vitals are Abnormal");
           }
       }
       else if(type.equals("Infant") && Vitalcheck.equalsIgnoreCase("Blood Pressure"))
       {
           if((Bloodpressure>=70)&&Bloodpressure<=100)
           {
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Infant") && Vitalcheck.equalsIgnoreCase("weight in kilos")){
           if((weightk>=4)&&(weightk<=10)){
                System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal"); 
           }
       }
       else if(type.equals("Infant") && Vitalcheck.equalsIgnoreCase("weight in pounds")){
           if((weightp>=9)&&(weightp<=22)){
               System.out.println("Vitals are normal");
           } 
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Toddler") && Vitalcheck.equalsIgnoreCase("Respiratory rate")){
           if((Respiratoryrate>=20)&&(Respiratoryrate<=30)){
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
           
       }
       else if(type.equals("Toddler") && Vitalcheck.equalsIgnoreCase("Heart rate")){
           if((Heartrate>=80)&&(Heartrate<=130)){
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
           
       }
       else if(type.equals("Toddler") && Vitalcheck.equalsIgnoreCase("Blood Pressure")){
           if((Bloodpressure>=80)&&(Bloodpressure<=110)){
               System.out.println("Vitals are normal");
           }
           else{
                System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Toddler") && Vitalcheck.equalsIgnoreCase("Weight in kilos")){
           if((weightk>=10)&&(weightk<=14)){
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Toddler") && Vitalcheck.equalsIgnoreCase("Weight in pounds")){
           if((weightp>=22)&&(weightp<=31)){
            System.out.println("Vitals are normal");
           }
           else{
                System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Preschooler") && Vitalcheck.equalsIgnoreCase("Respiratory rate"))
       {
           if((Respiratoryrate>=20)&&(Respiratoryrate<=30)){
               System.out.println("Vitals are normal");
           }
           else
           {
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Preschooler") && Vitalcheck.equalsIgnoreCase("Heart rate")){
           if((Heartrate>=80)&&(Heartrate<=120)){
                System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Preschooler") && Vitalcheck.equalsIgnoreCase("Blood pressure")){
           if((Bloodpressure>=80)&&(Bloodpressure<=110)){
                System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Preschooler") && Vitalcheck.equalsIgnoreCase("Weight in kilos")){
           if((weightk>=14)&&(weightk<=18)){
               System.out.println("Vitals are normal");
           }
           else{
             System.out.println("Vitals are abnormal");  
           }
       }
       else if(type.equals("Preschooler") && Vitalcheck.equalsIgnoreCase("Weight in pounds")){
           if((weightp>=31)&&(weightp<=40)){
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
           
       }
       else if(type.equals("School Age") && Vitalcheck.equalsIgnoreCase("Respiratory rate")){
           if((Respiratoryrate>=20)&&(Respiratoryrate<=30)){
              System.out.println("Vitals are normal");  
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("School Age") && Vitalcheck.equalsIgnoreCase("Heart rate")){
           if((Heartrate>=70)&&(Heartrate<=110)){
               System.out.println("Vitals are normal");
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("School Age") && Vitalcheck.equalsIgnoreCase("Blood Pressure")){
           if((Bloodpressure>=80)&&(Bloodpressure<=120)){
               System.out.println("Vitals are normal");
           }
           else
           {
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("School Age") && Vitalcheck.equalsIgnoreCase("Weight in kilos")){
           if((weightk>=20)&&(weightk<=42)){
               System.out.println("Vitals are normal");
           }
           else
           {
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("School Age") && Vitalcheck.equalsIgnoreCase("Weight in pounds")){
           if((weightp>=41)&&(weightp<=92)){
              System.out.println("Vitals are normal"); 
           }
           else{
               System.out.println("Vitals are abnormal");
           }
       }
       else if(type.equals("Adult") && Vitalcheck.equalsIgnoreCase("Respiratory rate")){
           if((Respiratoryrate>=12)&&(Respiratoryrate<=20))
           {
             System.out.println("Vitals are normal");   
           }
           else{
              System.out.println("Vitals are abnormal");   
           }
       }
       else if(type.equals("Adult") && Vitalcheck.equalsIgnoreCase("Heart rate")){
           if((Heartrate>=55)&&(Heartrate<=105)){
           System.out.println("Vitals are normal");      
           }
           else{
               System.out.println("Vitals are abnormal");  
           }
       }
       else if(type.equals("Adult") && Vitalcheck.equalsIgnoreCase("Blood pressure")){
           if((Bloodpressure>=110)&&(Bloodpressure<=120)){
             System.out.println("Vitals are normal");      
           }
           else{
                System.out.println("Vitals are abnormal");   
           }
       }
       else if(type.equals("Adult") && Vitalcheck.equalsIgnoreCase("weight in kilos")){
           if((weightk>50)){
              System.out.println("Vitals are normal");  
           }
           else{
               System.out.println("Vitals are abnormal"); 
           }
       }
       else if(type.equals("Adult") && Vitalcheck.equalsIgnoreCase("weight in pounds")){
           if((weightp>110)){
               System.out.println("Vitals are normal");  
           }
           else{
               System.out.println("Vitals are abnormal");  
           }
       }
       else
       {
           System.out.println("Enter Vitals within range");
       }
       display();
    }
        }
    

    

