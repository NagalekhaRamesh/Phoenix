/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;

/**
 *
 * @author nagal
 */
public class DoctorVisit {
    private String prescription;
    private ClinicDoctorProfile doctorProfile;
    private boolean isCurrentlyAssignedtoDoctor;
    private String note;

    public DoctorVisit(ClinicDoctorProfile doctorProfile) {
        this.doctorProfile = doctorProfile;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public ClinicDoctorProfile getDoctorProfile() {
        return doctorProfile;
    }

    public void setDoctorProfile(ClinicDoctorProfile doctorProfile) {
        this.doctorProfile = doctorProfile;
    }

    public boolean isIsCurrentlyAssignedtoDoctor() {
        return isCurrentlyAssignedtoDoctor;
    }

    public void setIsCurrentlyAssignedtoDoctor(boolean isCurrentlyAssignedtoDoctor) {
        this.isCurrentlyAssignedtoDoctor = isCurrentlyAssignedtoDoctor;
    }

    public String getNote() {
        return note;
    }
   
    public void setNote(String note) {
        this.note = note;
    }
}
