/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;

/**
 *
 * @author nagal
 */
public class NurseVisit {
    ShelterNurseProfile nurseProfile;
    Vital vital;
    boolean assignedToNurseCurrently = false;

    public NurseVisit(ShelterNurseProfile nurseProfile) {
        this.nurseProfile = nurseProfile;
    }

    public boolean isAssignedToNurseCurrently() {
        return assignedToNurseCurrently;
    }

    public void setAssignedToNurseCurrently(boolean assignedToNurseCurrently) {
        this.assignedToNurseCurrently = assignedToNurseCurrently;
    }

    public void setNurseProfile(ShelterNurseProfile nurseProfile) {
        this.nurseProfile = nurseProfile;
    }

    public ShelterNurseProfile getNurseProfile() {
        return nurseProfile;
    }

    public void setVital(Vital vital) {
        this.vital = vital;
    }
    
    public void addVital(String bloodPressure, String heartRate, String respiratoryRate, String temperature, String height, String weight, String oxygenSaturation){
        Vital patientVital = new Vital(bloodPressure, heartRate, respiratoryRate, temperature, height, weight, oxygenSaturation);
        setVital(patientVital);
    }

    public Vital getVital() {
        return vital;
    }
    
}
