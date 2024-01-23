/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.ShelterNurseStationOrganization;
import business.Patient.NurseVisitDirectory;
import business.profile.UserRole;
import business.shelter.NurseStation;
import business.shelter.TrainingModuleDirectory;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class ShelterEnterprise extends Enterprise {
    
    NurseVisitDirectory masterNurseVisitDirectory;
    TrainingModuleDirectory masterTrainingModuleDirectory;
        
    public ShelterEnterprise() {
        super(Enterprise.Type.SHELTER.getValue());
        
        //Initialize
        masterNurseVisitDirectory = new NurseVisitDirectory();
        masterTrainingModuleDirectory = new TrainingModuleDirectory();
    }
    
    @Override
    public Organization getOrganizationGivenRole(UserRole role) {
        for(Organization organization : this.getOrganizationCatalog().getOrganizationList()){
            if(role == UserRole.SHELTER_SUPERVISOR && organization.getName() == Organization.Type.SHELTER_ADMINISTRATION.getValue()){
                return organization;
            }
            else if(role == UserRole.SHELTER_NURSE && organization.getName() == Organization.Type.SHELTER_NURSE_STATION.getValue()){
                return organization;
            }
            else if(role == UserRole.SHELTER_TRAINER && organization.getName() == Organization.Type.SHELTER_UP_SKILL_DEPT.getValue()){
                return organization;
            }
        }
        return null; //return null if not found       
    }

    public NurseVisitDirectory getMasterNurseVisitDirectory() {
        return masterNurseVisitDirectory;
    }

    public TrainingModuleDirectory getMasterTrainingModuleDirectory() {
        return masterTrainingModuleDirectory;
    }

}
