/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ClinicEnterprise.ClinicDoctor;

import utils.DoctorSpecalization;
import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;

/**
 *
 * @author nagal
 */
public class ClinicDoctorProfile extends Profile{
    
    DoctorSpecalization specalization = null;

    public ClinicDoctorProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.CLINIC_DOCTOR;
    }

    public DoctorSpecalization getSpecalization() {
        return specalization;
    }

    public void setSpecalization(DoctorSpecalization specalization) {
        this.specalization = specalization;
    }
 
}
