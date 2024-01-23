/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;
import business.shelter.NurseStation;
import business.shelter.PatientTrainerDirectory;
import utils.Neighbourhood;

/**
 *
 * @author nagal
 */
public class PatientProfile extends Profile {
    
    private static int patientCount = 0;
    private String patientId;
    
    //NGO Volunteer collects
    NGOVolunteerProfile NGOVolunteer = null;
    BloodGroup bloodGroup;
    Neighbourhood neighbourhood = null;
    Issue primaryIssue = null;
    Issue secondaryIssue = null;
    
    //Shelter Nurse collects
    NurseVisitDirectory nurseVisits;
    ShelterNurseProfile isCurrentlyAssignedToNurse = null;
    
    boolean needsDoctorAttention = false;
    ClinicDoctorProfile isCurrentlyAssignedToDoctor = null;
    DoctorVisitDirectory doctorVisits;
    
    boolean isTrainingReady = false;
    boolean isEmployableReady = false;
    
    //Trainer enrolls patient in a trainingModule
    PatientTrainerDirectory enrolledTrainingModules;
    
    
    public PatientProfile(Person p) {
        super(p);
        generatePatientId();
        
        //Initialize
        this.nurseVisits = new NurseVisitDirectory();
        this.doctorVisits = new DoctorVisitDirectory();
        this.enrolledTrainingModules = new PatientTrainerDirectory();
        
    }
    
    private void generatePatientId() {
        patientCount++;
        String patientCountStr = String.format("%03d", patientCount);
        this.patientId = "PATIENT_" + patientCountStr;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    public String getPatientId() {
        return patientId;
    }

    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(Neighbourhood neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public Issue getPrimaryIssue() {
        return primaryIssue;
    }

    public void setPrimaryIssue(Issue primaryIssue) {
        this.primaryIssue = primaryIssue;
    }

    public Issue getSecondaryIssue() {
        return secondaryIssue;
    }

    public void setSecondaryIssue(Issue secondaryIssue) {
        this.secondaryIssue = secondaryIssue;
    }
    
    public String getPatientLastName(){
        return this.getPerson().getLastName();
    }

    public NGOVolunteerProfile getNGOVolunteer() {
        return NGOVolunteer;
    }

    public void setNGOVolunteer(NGOVolunteerProfile NGOVolunteer) {
        this.NGOVolunteer = NGOVolunteer;
    }

    public NurseVisitDirectory getNurseVisits() {
        return nurseVisits;
    }

    public void setNurseVisits(NurseVisitDirectory nurseVisits) {
        this.nurseVisits = nurseVisits;
    }

    public ShelterNurseProfile getIsCurrentlyAssignedToNurse() {
        return isCurrentlyAssignedToNurse;
    }

    public void setIsCurrentlyAssignedToNurse(ShelterNurseProfile isCurrentlyAssignedToNurse) {
        this.isCurrentlyAssignedToNurse = isCurrentlyAssignedToNurse;
    }

    public boolean isNeedsDoctorAttention() {
        return needsDoctorAttention;
    }

    public void setNeedsDoctorAttention(boolean needsDoctorAttention) {
        this.needsDoctorAttention = needsDoctorAttention;
    }

    public ClinicDoctorProfile getIsCurrentlyAssignedToDoctor() {
        return isCurrentlyAssignedToDoctor;
    }

    public void setIsCurrentlyAssignedToDoctor(ClinicDoctorProfile isCurrentlyAssignedToDoctor) {
        this.isCurrentlyAssignedToDoctor = isCurrentlyAssignedToDoctor;
    }

    public boolean isIsTrainingReady() {
        return isTrainingReady;
    }

    public void setIsTrainingReady(boolean isTrainingReady) {
        this.isTrainingReady = isTrainingReady;
    }

    public boolean isIsEmployableReady() {
        return isEmployableReady;
    }

    public void setIsEmployableReady(boolean isEmployableReady) {
        this.isEmployableReady = isEmployableReady;
    }

    public DoctorVisitDirectory getDoctorVisits() {
        return doctorVisits;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public PatientTrainerDirectory getEnrolledTrainingModules() {
        return enrolledTrainingModules;
    }

    @Override
    public String toString() {
        return this.patientId;
    }
    
    @Override
    public UserRole getRole() {
        return UserRole.PATIENT;
    }
    
}
