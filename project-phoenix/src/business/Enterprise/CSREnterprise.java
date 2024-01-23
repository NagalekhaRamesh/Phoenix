/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.Organization;
import business.csr.OpportunityDirectory;
import business.profile.UserRole;

/**
 *
 * @author ketan
 */
public class CSREnterprise extends Enterprise{
    
    OpportunityDirectory masterOpportunityCatalog;
    
    public CSREnterprise() {
        super(Enterprise.Type.CSR.getValue());
        this.masterOpportunityCatalog = new OpportunityDirectory();
    }
    
    @Override
    public Organization getOrganizationGivenRole(UserRole role) {
        for(Organization organization : this.getOrganizationCatalog().getOrganizationList()){
            if(role == UserRole.CSR_ADMIN && organization.getName() == Organization.Type.CSR_ADMINISTRATION.getValue()){
                return organization;
            }
            else if(role == UserRole.CSR_EMPLOYER && organization.getName() == Organization.Type.CSR_EMPLOYER_DEPT.getValue()){
                return organization;
            }
        }
        return null; //return null if not found       
    }

    public OpportunityDirectory getMasterOpportunityCatalog() {
        return masterOpportunityCatalog;
    }
    
}
