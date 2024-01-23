/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import business.Patient.PatientProfile;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class PatientTrainerDirectory {
    ArrayList<PatientTrainer> patientTrainerList;

    public PatientTrainerDirectory() {
        patientTrainerList = new ArrayList<PatientTrainer>();
    }

    public ArrayList<PatientTrainer> getPatientTrainerList() {
        return patientTrainerList;
    }
    
    public PatientTrainer createPatientTrainer(PatientProfile patient, TrainingModule trainingModule){
        PatientTrainer patientTrainer = new PatientTrainer(patient, trainingModule);
        patientTrainerList.add(patientTrainer);
        return patientTrainer;
    }
    
    public void addPatientTrainer(PatientTrainer pt){
        patientTrainerList.add(pt);
    }
    
    public boolean isAlreadyEnrolled(String trainingModuleId){
        for(PatientTrainer pt : this.patientTrainerList){
            if(trainingModuleId.equals(pt.getTrainingModule().getTrainingModuleId())){
                return true;
            }
        }
        return false;
    }
    
}
