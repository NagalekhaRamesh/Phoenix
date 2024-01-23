/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ShelterEnterprise.ShelterNurseStation;

import business.Patient.PatientDirectory;
import business.Patient.PatientProfile;
import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;
import business.shelter.NurseStation;

/**
 *
 * @author nagal
 */
public class ShelterNurseProfile extends Profile {
    
    NurseStation assignedNurseStation;
    PatientDirectory assignedPatientList;

    public ShelterNurseProfile(Person p) {
        super(p);
    }

    public NurseStation getAssignedNurseStation() {
        return assignedNurseStation;
    }

    public void setAssignedNurseStation(NurseStation assignedNurseStation) {
        this.assignedNurseStation = assignedNurseStation;
    }

    public PatientDirectory getAssignedPatientList() {
        return assignedPatientList;
    }

    public void setAssignedPatientList(PatientProfile assignedPatient) {
        this.assignedPatientList.addPatient(assignedPatient);
    }
    

    @Override
    public UserRole getRole() {
        return UserRole.SHELTER_NURSE;
    }
    
}
