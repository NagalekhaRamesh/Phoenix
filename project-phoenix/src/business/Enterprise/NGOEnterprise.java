/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.Organization;
import business.profile.UserRole;

/**
 *
 * @author nagal
 */
public class NGOEnterprise extends Enterprise {
    
    public NGOEnterprise() {
        super(Enterprise.Type.NGO.getValue());
    }

    @Override
    public Organization getOrganizationGivenRole(UserRole role) {
        for(Organization organization : this.getOrganizationCatalog().getOrganizationList()){
            if(role == UserRole.NGO_SUPERVISOR && organization.getName() == Organization.Type.NGO_ADMINISTRATION.getValue()){
                return organization;
            }
            else if(role == UserRole.NGO_VOLUNTEER && organization.getName() == Organization.Type.NGO_VOLUNTEER_DEPT.getValue()){
                return organization;
            }
        }
        return null; //return null if not found       
    }
    
}
