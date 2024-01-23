/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.shelter;

import business.Patient.PatientProfile;

/**
 *
 * @author nagal
 */
public class PatientTrainer {
    
    PatientProfile patient;
    TrainingModule trainingModule;
    Grade grade;
    EnrollmentStatus status;

    public PatientTrainer(PatientProfile patient, TrainingModule trainingModule) {
        this.patient = patient;
        this.trainingModule = trainingModule;
        this.grade = null;
        this.status = EnrollmentStatus.IN_PROGRESS;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
        this.patient = patient;
    }

    public TrainingModule getTrainingModule() {
        return trainingModule;
    }

    public void setTrainingModule(TrainingModule trainingModule) {
        this.trainingModule = trainingModule;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.patient.getPatientId();
    } 
    
}
