/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ShelterEnterprise.ShelterUpSkillDept;

import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;
import business.shelter.TrainingModuleDirectory;

/**
 *
 * @author nagal
 */
public class ShelterTrainerProfile extends Profile {
    
    TrainingModuleDirectory shelterTrainingModule;

    public ShelterTrainerProfile(Person p) {
        super(p);
        
        //Initialize
        shelterTrainingModule = new TrainingModuleDirectory();
    }

    @Override
    public UserRole getRole() {
        return UserRole.SHELTER_TRAINER;
    }

    public TrainingModuleDirectory getShelterTrainingModule() {
        return shelterTrainingModule;
    }
    
}
