/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationCatalog;
import business.profile.UserRole;
import business.profile.ValidUserRoleDirectory;
import business.userAccounts.UserAccountDirectory;

/**
 *
 * @author nagal
 */
public abstract class Enterprise {
    
    private static int enterpriseCount = 0;
    private String enterpriseId;
    
    private String name;
    private OrganizationCatalog organizationCatalog;
    private ValidUserRoleDirectory validUserRoleList;
    
    public enum Type{
        NGO("NGO Enterprise"),
        SHELTER("Shelter Enterprise"),
        CLINIC("Clinic Enterprise"),
        CSR("Corporate Social Responsibility Enterprise");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Enterprise(String name) {
        this.name = name;
        generateEnterpriseId();
        
        //Initialize
        this.organizationCatalog = new OrganizationCatalog();
        this.validUserRoleList = new ValidUserRoleDirectory();
    }
    
    private void generateEnterpriseId() {
        enterpriseCount++;
        String enterpriseCountStr = String.format("%03d", enterpriseCount);
        this.enterpriseId = "ENTERPRISE_" + enterpriseCountStr;
    }
    
    public abstract Organization getOrganizationGivenRole(UserRole role);
    
    private void addUserRole(UserRole role){
        this.validUserRoleList.addUserRole(role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getEnterpriseCount() {
        return enterpriseCount;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }


    public OrganizationCatalog getOrganizationCatalog() {
        return organizationCatalog;
    }

    public ValidUserRoleDirectory getValidUserRoleList() {
        return validUserRoleList;
    }
    
    public boolean isSupportedUserRole(UserRole role) {
        return this.validUserRoleList.isUserRoleExists(role);
    }
    
}
