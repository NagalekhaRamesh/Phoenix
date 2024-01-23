/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import business.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import business.csr.Opportunity;

/**
 *
 * @author nagal
 */
public class TrainingModule {
    
    private static int trainingModuleCount = 0;
    private String trainingModuleId;
    
    ShelterTrainerProfile trainingInstructor;
    Opportunity opportunity;
    PatientTrainerDirectory enrolledPatientList;

    public TrainingModule(ShelterTrainerProfile trainingInstructor, Opportunity opportunity) {
        this.trainingInstructor = trainingInstructor;
        this.opportunity = opportunity;
        
        //Initialize
        this.enrolledPatientList = new PatientTrainerDirectory();
        
        generateTrainingModuleId();
    }
    
    private void generateTrainingModuleId() {
        trainingModuleCount++;
        String trainingModuleCountStr = String.format("%03d", trainingModuleCount);
        this.trainingModuleId = "TRAINING_MODULE_" + trainingModuleCountStr;
    }

    public ShelterTrainerProfile getTrainingInstructor() {
        return trainingInstructor;
    }

    public void setTrainingInstructor(ShelterTrainerProfile trainingInstructor) {
        this.trainingInstructor = trainingInstructor;
    }

    public Opportunity getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(Opportunity opportunity) {
        this.opportunity = opportunity;
    }

    public PatientTrainerDirectory getEnrolledPatientList() {
        return enrolledPatientList;
    }

    public String getTrainingModuleId() {
        return trainingModuleId;
    }
    
    

    @Override
    public String toString() {
        return this.trainingModuleId;
    }
    
    

}
