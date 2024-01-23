/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.person.Person;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class PatientDirectory {
    ArrayList<PatientProfile> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<PatientProfile>();
    }
    
    public PatientProfile createPatient(Person p) {
        PatientProfile patient = new PatientProfile(p);
        patientList.add(patient);
        return patient;
    }
    
    public void addPatient(PatientProfile patient){
        this.patientList.add(patient);
    }

    public ArrayList<PatientProfile> getPatientList() {
        return patientList;
    }
    
    public PatientProfile searchPatientByLastName(String lastName){
        for(PatientProfile patient: patientList){
            if(lastName.equalsIgnoreCase(patient.getPatientLastName())){
                return patient;
            }
        }
        return null; //not found after going through whole list
    }
    
}
