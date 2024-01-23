/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Patient.PatientDirectory;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseDirectory;
import business.shelter.NurseStation;

/**
 *
 * @author nagal
 */
public class ShelterNurseStationOrganization extends Organization {
    
    ShelterNurseDirectory nurseList;
    PatientDirectory assignedPatientList;
    
    public ShelterNurseStationOrganization() {
        super(Organization.Type.SHELTER_NURSE_STATION.getValue());
    }

    public ShelterNurseDirectory getNurseList() {
        return nurseList;
    }

    public PatientDirectory getAssignedPatientList() {
        return assignedPatientList;
    }
    
}
