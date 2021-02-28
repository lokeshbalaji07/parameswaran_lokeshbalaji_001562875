/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import static java.util.Objects.hash;
import java.util.Scanner;

/**
 *
 * @author Lokesh Balaji
 */
public class Personclass {
    
    HashMap<String, ArrayList<City>> cityhash = new HashMap();
    static String name;
    static float age;
   House house = new House();

    public House getHouse() {
        return house;

}

    public void setHouse(House house) {
       this.house = house;  }
    HashMap<String, ArrayList<City>> hashcity = new HashMap<>();

    
   
        //HashMap<String,Patient> hash = new HashMap<String,Patient>();
    
    //static Patient patientn = new Patient();
     //HashMap<String,Patient> hash = new HashMap<String,Patient>();
    //static Patient patientn = new Patient();
    //static Encounterhistory enchist = new Encounterhistory();
    //static    Encounter encounter=enchist.addenc();
    //static Vitalsign vitalsign;
   
    

    public Encounterhistory getEncounterhist(){
            return null;
    }
    
    
    public void setEncounterhist(Encounterhistory encounterHistory){
            
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static float getAge() {
        return age;
    }

    public static void setAge(float age) {
        Personclass.age = age;
    }

  

    public Personclass() {
        this.name = name;
        this.age = age;
    }
    
   
    
    public static void main(String args[])
    {
        new Personclass().display();
          
    }
  
    public  void Createmenu(){
        Scanner sc = new Scanner(System.in);
        int Respiratoryrate=0,Heartrate=0,Bloodpressure=0;
        float        weightk=0,weightp=0;
        String Doctorname=null;
        String Reasonofvisit=null;
        Date date;
        Patient patientn = new Patient();
        Encounterhistory enchist = new Encounterhistory();
        Encounter encounter=new Encounter();
        Vitalsign vitalsign = new Vitalsign();
        
        Community commun = new Community();
         City city = new City();
       
        //HashMap<String,Patient> hash = new HashMap<String,Patient>();
       // Patient patientn = new Patient();
        System.out.println("Enter your Name:"); 
        patientn.setName(name);
        //name=patientn.getName();
        
        name=sc.nextLine();
        if(!Patientdirectory.getHashp().containsKey(name))
        {
             patientn.setName(name);
             Patientdirectory.getHashp().put(name,patientn);
             System.out.println("New User");
        //patientn.setAge(age);
        //age=patientn.getAge();
        System.out.println("Enter your Age in:");
        System.out.println("Years:");
        float year = sc.nextInt();
        System.out.println("Months:");
        float months= sc.nextInt();
        System.out.println("Days");
        float days = sc.nextInt();
        if((year==0)&&(months==0)&&(days==0)){
            System.out.println("Enter the values");
            System.exit(0);
            
        }
        else if((year==0)&&(months>12)&&(days>31))
        {
            System.out.println("Enter values within range");
            System.exit(0);
        }
        else if((year>100)&&(months<=12)&&(days<=31))
        {
            System.out.println("Enter value less than 100");
        }
        else if((year >= 0)&&(months >= 0)&&(days>31))
        
                {
                    System.out.println("Enter value greater than 0 or less than 31");
                    return;
                   
                }
        else if((year >= 0)&&(months>12)&&(days<=31))
        
        {
            System.out.println("Enter value greater than 0 or less than 12");
            return;
        }
        float age= year+(months/12)+(days/365);
        patientn.setAge(age);
        age=patientn.getAge();
        String ag = Agecalculation(age);
         patientn.setAgeGrup(ag);
                     System.out.println(patientn.getAgeGrup());

         System.out.println("Enter Community");
        String comm = sc.next();
         System.out.println("Enter House Number:");
        int hsenum = sc.nextInt();
        System.out.println("Enter City");
        String cityname = sc.next();
        //House house = new House()
          city.setCityName(cityname);
        commun.setCommunityName(comm);
        city.setCommunity(commun);
      
          if(!cityhash.containsKey(city)){
                ArrayList<City> list = new ArrayList<>();
                list.add(city);
                cityhash.put(cityname, list);

            }else{
                ArrayList<City> list = cityhash.get(city);
                boolean result = true;
                for(City c : list)
                {
                    List<Community> list1 = c.getCommunity();
                    
                    for(Community c1 : list1)
                    {
                        if(c1.getCommunityName().equals(comm))
                        {
                            result=false;
                           
                            break;
                            
                            
                        }
                    }
                    if(result)
                    {
                        c.setCommunity(commun);
                        cityhash.put(cityname, list);
                    }
                    
                }
                    
                
            }
        House hse= new House();
        hse.setHouseNo(hsenum);
        commun.setHouseList(hse);
        hse.setPerson(patientn);
      //  patientn.setHouse(hse);
        //hse.setPerson(patientn);
        
      
          
          
        System.out.println("Enter Doctor Name");
        Doctorname = sc.next();
        encounter.setDoctorname(Doctorname);
        System.out.println("Reason of visit");
        Reasonofvisit = sc.next();
        encounter.setReasonofvisit(Reasonofvisit);
        date=new Date();
        encounter.setCreatedtime(date);
        ArrayList<Encounter> a1 = new ArrayList<>();
        a1.add(encounter);
        enchist.setEnchistory(a1);
        patientn.setEncounterhist(enchist);
        
        
        
        
       
        
        //Vitalsign vitalsign = new Vitalsign (Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp);
        System.out.println("Enter Vital Details");
        System.out.println("Enter Respiratory rate");
        Respiratoryrate=sc.nextInt();
        vitalsign.setRespiratoryrate(Respiratoryrate);
        Respiratoryrate = vitalsign.getRespiratoryrate();
        System.out.println("Enter Heart rate");
        Heartrate=sc.nextInt();
        vitalsign.setHeartrate(Heartrate);
        Heartrate = vitalsign.getHeartrate();
        System.out.println("Enter Bloodpressure rate");
        Bloodpressure = sc.nextInt();
        vitalsign.setBloodpressure(Bloodpressure);
        Bloodpressure= vitalsign.getBloodpressure();
        System.out.println("Enter Weight in Kilos");
        weightk = sc.nextFloat();
        vitalsign.setWeightk(weightk);
        weightk = vitalsign.getWeightk();
        System.out.println("Enter Weight in Pounds");
        weightp = sc.nextFloat();
        vitalsign.setWeightp(weightp);
        weightp = vitalsign.getWeightp();
        date=new Date();
        
        encounter.setVitalsign(vitalsign);
        display();
        }
        else if(Patientdirectory.getHashp().containsKey(name)){
            System.out.println("User already exist");
            display();
        }
        
    }
    public void viewencounter()
    {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        if(Patientdirectory.getHashp().containsKey(name)){
            Patient patientn = Patientdirectory.getHashp().get(name);
            System.out.println("HH "+ patientn.getAgeGrup());
            System.out.println("======================================================================================================"
                    + "===============================================================================");
            System.out.print("S.No"+"  |  ");
            System.out.print("Name"+"  |  ");
            System.out.print("Age"+"  |  ");
            System.out.print("Respiratoryrate"+"  |  ");
            System.out.println("Heartrate"+"  |  "+"Bloodpressure"+"  |  "+"Weight(k)"+"  |  "+"Weight(p)"+"  |  "+"DoctorName"+"  |  "+"Reasonofvisit"+"  |                "+"CreatedTime");
            System.out.println("======================================================================================================"
                    +"===============================================================================");
            for(int i=0;i<patientn.getEncounterhist().getEnchistory().size();i++)
            {
                //System.out.println("Created Time:"+patientn.getEncounterhist().getEnchistory().get(i).getCreatedtime());
                System.out.print(i+1);
                System.out.print("       "+name+"    ");
                System.out.print((int)age+"            ");
                System.out.print(+patientn.getEncounterhist().getEnchistory().get(i).getVitalsign().getRespiratoryrate()+"                ");
                System.out.print(+patientn.getEncounterhist().getEnchistory().get(i).getVitalsign().getHeartrate()+"             ");
                System.out.print(+patientn.getEncounterhist().getEnchistory().get(i).getVitalsign().getBloodpressure()+"              ");
                System.out.print(+patientn.getEncounterhist().getEnchistory().get(i).getVitalsign().getWeightk()+"          ");
                System.out.print(+patientn.getEncounterhist().getEnchistory().get(i).getVitalsign().getWeightp()+"           ");
                System.out.print(""+patientn.getEncounterhist().getEnchistory().get(i).getDoctorname()+"           ");
                System.out.print(""+patientn.getEncounterhist().getEnchistory().get(i).getReasonofvisit()+"         ");
                System.out.println("Created Time:"+patientn.getEncounterhist().getEnchistory().get(i).getCreatedtime());
            
            }
            System.out.println("====================================================================================================="
                    +"================================================================================");
            display();
        
    }else if(!Patientdirectory.getHashp().containsKey(name)){
            System.out.println("User does not exist");
            Createmenu();
    }
    }
    public void vitalenter(){
          Scanner sc = new Scanner(System.in);
        int Respiratoryrate=0,Heartrate=0,Bloodpressure=0;
        float        weightk=0,weightp=0;
        String Doctorname=null;
        String Reasonofvisit=null;
        Date date;
        //Patient patientn = new Patient();
        Encounterhistory enchist = new Encounterhistory();
        Encounter encounter=new Encounter();
        Vitalsign vitalsign = new Vitalsign();
        House hse= new House();
        Community commun = new Community();
        City city = new City();
       
        System.out.println("Enter your Name:"); 
        //patientn.setName(name);
        //name=patientn.getName();
        
        name=sc.nextLine();
        if(Patientdirectory.getHashp().containsKey(name))
        {
            Patient patientn = Patientdirectory.getHashp().get(name);
            patientn.setName(name);
             Patientdirectory.getHashp().put(name,patientn);
        System.out.println("Existing User");
        
        System.out.println("Enter your Age:");
        age=sc.nextInt();
        patientn.setAge(age);
        age=patientn.getAge();
        System.out.println("Enter Doctor Name");
        Doctorname = sc.next();
        encounter.setDoctorname(Doctorname);
        System.out.println("Reason of visit");
        Reasonofvisit = sc.next();
        encounter.setReasonofvisit(Reasonofvisit);
        date=new Date();
        encounter.setCreatedtime(date);
        ArrayList<Encounter> a1 = patientn.encounterhist.getEnchistory();
        a1.add(encounter);
        enchist.setEnchistory(a1);
        patientn.setEncounterhist(enchist);
        
        
        
        
       
        
        //Vitalsign vitalsign = new Vitalsign (Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp);
        System.out.println("Enter Vital Details");
        System.out.println("Enter Respiratory rate");
        Respiratoryrate=sc.nextInt();
        vitalsign.setRespiratoryrate(Respiratoryrate);
        Respiratoryrate = vitalsign.getRespiratoryrate();
        System.out.println("Enter Heart rate");
        Heartrate=sc.nextInt();
        vitalsign.setHeartrate(Heartrate);
        Heartrate = vitalsign.getHeartrate();
        System.out.println("Enter Bloodpressure rate");
        Bloodpressure = sc.nextInt();
        vitalsign.setBloodpressure(Bloodpressure);
        Bloodpressure= vitalsign.getBloodpressure();
        System.out.println("Enter Weight in Kilos");
        weightk = sc.nextFloat();
        vitalsign.setWeightk(weightk);
        weightk = vitalsign.getWeightk();
        System.out.println("Enter Weight in Pounds");
        weightp = sc.nextFloat();
        vitalsign.setWeightp(weightp);
        weightp = vitalsign.getWeightp();
        date=new Date();
        
        encounter.setVitalsign(vitalsign);
        display();
        }
        else if(!Patientdirectory.getHashp().containsKey(name)){
            System.out.println("User does not exist");
            Createmenu();
        }
    }
        public  void display()
    {
        int option=0;
        System.out.println("Choose an Option");
        System.out.println("1.Create Vital Details");
        System.out.println("2.Enter Encounter");
        System.out.println("3.Display Encounter");
        System.out.println("4 Check Vitals");
        System.out.println("5.Community Analysis");
        System.out.println("6.Exit");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
    

        //System.out.println("Choose an Option");
        //System.out.println("1.Create Vital Details");
        //System.out.println("2.View Vital Details");
        //System.out.println("3.Display Vital Details");
        
        if(option==1)
        {
           Createmenu();
        }
        else if(option==2)
        {
            vitalenter();
        }
        else if(option==3){
            viewencounter();
        }
        else if(option==4)
        {
            checkvitals();
        }
        else if(option==5){
            findAbnormal();
        }
        else if(option==6)
        {
            System.exit(0);
        }
        else{
            System.out.println("Enter Values within range");
        }
    }
        
        //vitalsign = new Vitalsign (Respiratoryrate,Heartrate,Bloodpressure,weightk,weightp);
            //Date Createdtime = null;
                
        //encounter.setCreatedtime(new Date());
        //encounter.setDoctorname("Lokesh");
        //encounter.setVitalsign(vitalsign);
        //encounter.setReasonofvisit("Fever");
        //encounter =new Encounter(Doctorname,date,Reasonofvisit,vitalsign);

    private String Agecalculation(float age) {
        System.out.println("Age "+ age);
        float agecal = (float)(30.0/365.0);
        if(agecal>age && age >0){
            //agecalculation.setNewborn();
            return "NEWBORN";
        }
        else if(age>agecal && age<=1.0){
            return "INFANT";
        }
        else if(age>1.0 && age<=3.0){
            return "TODDLER";
        }
        else if(age>3.0 && age<=6.0)
        {
            return "PRESCHOOLER";
        }
        else if(age>6.0 && age<=12.0)
        {
            return "SCHOOLAGE";
        }
        else if(age>13.0)
        {
            return "ADULT";
        }
        else{
            System.out.println("Enter Values within Range");
        }
        
        return "";
    }
    
    public boolean checkvitals(){
            Agecalculation agecalculation = new Agecalculation();

        System.out.println("Enert the name ");
        Scanner sc= new Scanner(System.in);
        String name1 = sc.nextLine();
        Patient p = Patientdirectory.hashp.get(name1);
        System.out.println(p.getAgeGrup());
        int len = p.getEncounterhist().getEnchistory().size()-1;
        if(p.getAgeGrup().equals("NEWBORN")){
            agecalculation.setNewborn();

            if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                System.out.println("Normal");
            }
            else {
                System.out.println("Abnormal");
                return false;
        }
        }
            else if (p.getAgeGrup().equals("INFANT")){
            agecalculation.setInfant();
            
            if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                System.out.println("Normal");
                return true;
            }
            else{
                System.out.println("Abnormal");
                return false;
            }
            }
            else if(p.getAgeGrup().equals("TODDLER")){
                agecalculation.setToddler();
                if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                    System.out.println("Normal");
                return true;
            }
                else{
                    System.out.println("Abnormal");
                 return false;   
                }
            }
            else if(p.getAgeGrup().equals("PRESCHOOLER")){
                agecalculation.setPreschooler();
            if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                System.out.println("Normal");
                return true;
            }
            else{
                System.out.println("Abnormal");
                return false;
            }
            }
            else if(p.getAgeGrup().equals("SCHOOLAGE")){
                if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                    System.out.println("Normal");
                return true;
            }
                else{
                    System.out.println("Abnormal");
                    return false;
                }
            }
            else if(p.getAgeGrup().equals("ADULT")){
                if(p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() >= agecalculation.getRespiratoryratelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getRespiratoryrate() <= agecalculation.getRespiratoryratehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() >= agecalculation.getHeartratelow() &&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getHeartrate() <= agecalculation.getHeartratehigh()
                    && p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() >= agecalculation.getBloodpressurelow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getBloodpressure() <= agecalculation.getBloodpressurehigh()
                    &&p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() >= agecalculation.getWeightklow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightk() <= agecalculation.getWeightkhigh()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() >= agecalculation.getWeightplow()&&
                    p.getEncounterhist().getEnchistory().get(len).getVitalsign().getWeightp() <= agecalculation.getWeightphigh()){
                    System.out.println("Normal");
                return true;
            }
                else{
                    System.out.println("Abnormal");
                }
            }
           return false; 
        }
  
    public void findAbnormal(){
        Scanner input = new Scanner(System.in);
        //System.out.println("=================================");
        System.out.println("Enter City Name");
        //System.out.println("=================================");
        String city = input.nextLine();
        ArrayList<City> c = cityhash.get(city);
        System.out.println("CC "+c.size());
        
        int count=0;
        int count1 =0;
        for(int i=0;i<c.size();i++){
           //System.out.println("* "+c.get(i));
           City cc = c.get(i);
           //System.out.println(cc.getCommunity().get(0).getHouseList().get(0).getP().getName());
           //ArrayList<String> names = new ArrayList<>();
           List<Community> comm = cc.getCommunity();
           System.out.println("Community Size "+ comm.size());
           for(Community community : comm)
           {
               List<House> list = community.getHouseList();
               System.out.println("House size "+ list.size());
               for(House h : list)
               {
                   count++;
                   List<Encounter> list1 = h.getPerson().getEncounterhist().getEnchistory();
                   
                   for(int k =0 ; k < list1.size(); k++){
                       if(!isBPVitalSignNormal1(Patientdirectory.getHashp().get(h.getPerson().getName()),list1.get(k).getVitalsign().getBloodpressure())){
                           count1++;
                       }
                        //isThisVitalSignNormal1(h.getPerson())
                   }
               }
           }
           
           }
        System.out.println(count);
        System.out.println(count1);
                
           }
    
    public  boolean isBPVitalSignNormal1( Patient p, int bp) {
        
            p.getAgeGrup();
            Agecalculation age = new Agecalculation();
            if(p.getAgeGrup()=="NEWBORN"){
                age.setNewborn();
            }else if(p.getAgeGrup()=="INFANT"){
                age.setInfant();
            }
            else if(p.getAgeGrup()=="TODDLER"){
                age.setToddler();
            }
            else if(p.getAgeGrup()=="PRESCHOOLER"){
                age.setPreschooler();
            }
            else if(p.getAgeGrup()=="SCHOOLAGE"){
                age.setSchoolage();
            }
            else if(p.getAgeGrup()=="ADULT"){
                age.setAdult();
            }
                
            
            
        //    int bp = p.getEncounterhist().getEnchistory()
            if ( bp >= age.getBloodpressurelow()&& bp < age.getBloodpressurehigh()) {
                System.out.println("Your Blood Pressure is normal.");
                return true;
            } else {
                System.out.println("Your Blood Pressure is not normal.");
                return false;
            }
            
        //    int bp = p.getEncounterhist().getEnchistory()
            
        
    }
    }
    
        

        
        //float agecal = (float)(30.0/365.0);
//        if(agecal>age && age >0){
//            agecalculation.setNewborn();
//            
//        }
//        else if(age>agecal && age<=1.0){
//            agecalculation.setInfant();
//        }
//        else if(age>1.0 && age<=3.0){
//            agecalculation.setToddler();
//        }
//        else if(age>3.0 && age<=6.0)
//        {
//            agecalculation.setPreschooler();
//        }
//        else if(age>6.0 && age<=12.0)
//        {
//            agecalculation.setSchoolage();
//        }
//        else if(age>13.0)
//        {
//            agecalculation.setAdult();
//        }
//        else{
//            System.out.println("Enter Values within Range");
//        }
//        if((p.getEncounterhist().getEnchistory().get(0).getVitalsign().getBloodpressure()>= 30)&&(Respiratoryrate<=50))

    
        
        
        
      
  
        
        
    
    
    
    


