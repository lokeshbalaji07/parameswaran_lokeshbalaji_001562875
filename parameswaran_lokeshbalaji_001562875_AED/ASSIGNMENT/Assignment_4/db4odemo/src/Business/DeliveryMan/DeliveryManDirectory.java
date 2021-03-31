/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import java.util.ArrayList;

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

        public Organization searchOrganization(String organizationName){
        for (Organization organization: delorganizationList) {
            if (organization.getName().equals(organizationName)) {
                return organization;
            }
        }
        return null;
    }
}

