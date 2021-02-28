/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lokesh Balaji
 */
public class City {
    private String cityname;
    private ArrayList<Community>community1;
    static Map<String, List<Community>> hash = new HashMap(); 
    //Community commuity= new Community();

    
    public City(){
        this.community1=new ArrayList<Community>(); 
    }

    public City(String cityname) {
        this.cityname = cityname;
    }

    public String getCityName() {
        return cityname;
    }

    public void setCityName(String cityname) {
        this.cityname = cityname;
    }

//    public ArrayList<Community> getCommunity() {
//        return community1;
//    }
//
//    public void setCommunity(Community community) {
//        community1.add(community);
//    }

        public List<Community> getCommunity()
    {
        return hash.getOrDefault(this.getCityName() , new ArrayList());
    }
    
    public void setCommunity(Community community)
    {
        List<Community> list = hash.getOrDefault(this.getCityName(), new ArrayList());
        list.add(community);
        hash.put(this.getCityName(), list);
    }

}
