/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.LabEnterprise.LabTechnician;

import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;

/**
 *
 * @author nagal
 */
public class LabTechnicianProfile extends Profile {

    public LabTechnicianProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.LAB_TECHNICIAN;
    }
    
}
