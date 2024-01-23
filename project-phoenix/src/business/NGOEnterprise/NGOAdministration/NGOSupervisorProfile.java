/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.NGOEnterprise.NGOAdministration;

import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;

/**
 *
 * @author nagal
 */
public class NGOSupervisorProfile extends Profile {

    public NGOSupervisorProfile(Person p) {
        super(p);
    }

    @Override
    public UserRole getRole() {
        return UserRole.NGO_SUPERVISOR;
    }
    
}
