/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Organization.Organization.Type;
import business.shelter.NurseStation;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class OrganizationCatalog {
    private ArrayList<Organization> organizationList;

    public OrganizationCatalog() {
        this.organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }   
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if(type.getValue().equals(type.NGO_ADMINISTRATION.getValue())){
            organization = new NGOAdministrationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.NGO_VOLUNTEER_DEPT.getValue())){
            organization = new NGOVolunteerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.SHELTER_ADMINISTRATION.getValue())){
            organization = new ShelterAdministrationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.SHELTER_NURSE_STATION.getValue())){
            organization = new ShelterNurseStationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.SHELTER_UP_SKILL_DEPT.getValue())){
            organization = new ShelterUpSkillOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.CLINIC_ADMINISTRATION.getValue())){
            organization = new ClinicAdministrationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.CLINIC_DOCTOR_DEPT.getValue())){
            organization = new ClinicDoctorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.CSR_ADMINISTRATION.getValue())){
            organization = new CSRAdministrationOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(type.CSR_EMPLOYER_DEPT.getValue())){
            organization = new CSREmployerOrganization();
            organizationList.add(organization);
        }
        
        return organization;
        
    }
}
