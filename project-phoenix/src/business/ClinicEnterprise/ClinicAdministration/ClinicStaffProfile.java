/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ClinicEnterprise.ClinicAdministration;

import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;

/**
 *
 * @author nagal
 */
public class ClinicStaffProfile extends Profile {

    public ClinicStaffProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.CLINIC_STAFF;
    }
    
}
