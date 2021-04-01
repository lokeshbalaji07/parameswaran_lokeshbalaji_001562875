/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    
    
      private ArrayList<Organization> delorganizationList;

    public DeliveryManDirectory() {
        delorganizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return delorganizationList;
    }
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.DeliveryMan.getValue())){
            organization = new DeliveryMan();
            delorganizationList.add(organization);
        }
        return organization;
    }
       public void deleteDeliveryMan(DeliveryMan deliveryMan){
        delorganizationList.remove(deliveryMan); 
    }

        public List<Organization> searchOrganization(String organizationName){
            List<Organization> list = new ArrayList();
        for (Organization organization: delorganizationList) {
            if (organization.getName().equals(organizationName)) {
                list.add(organization);
            }
        }
        return list;
    }
}

