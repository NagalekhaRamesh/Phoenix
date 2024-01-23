/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.userAccounts.UserAccountDirectory;

/**
 *
 * @author nagal
 */
public abstract class Organization {
    private static int organizationCount = 0;
    private String organizationId;
    
    private String name;
    private UserAccountDirectory organizationUserDirectory;
    
    public enum Type{
        NGO_ADMINISTRATION("NGO Administration Organization"),
        NGO_VOLUNTEER_DEPT("NGO Volunteer Organization"),
        SHELTER_ADMINISTRATION("Shelter Administration Organization"),
        SHELTER_NURSE_STATION("Nurse Station Organization"),
        SHELTER_UP_SKILL_DEPT("Shelter Up Skill Organization"),
        CLINIC_ADMINISTRATION("Clinic Administration Organization"),
        CLINIC_DOCTOR_DEPT("Clinic Doctor Organization"),
        CSR_ADMINISTRATION("CSR Administration Organization"),
        CSR_EMPLOYER_DEPT("CSR Employer Organization");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        generateOrganizationId();
        
        //Initialize
        this.organizationUserDirectory = new UserAccountDirectory();
    }
    
    private void generateOrganizationId() {
        organizationCount++;
        String organizationCountStr = String.format("%03d", organizationCount);
        this.organizationId = "ORGANIZATION_" + organizationCountStr;
    }

    public static int getOrganizationCount() {
        return organizationCount;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getName() {
        return name;
    }

    public UserAccountDirectory getOrganizationUserDirectory() {
        return organizationUserDirectory;
    }
    
}
