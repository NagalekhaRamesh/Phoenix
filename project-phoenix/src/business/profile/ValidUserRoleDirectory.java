/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.profile;

import java.util.ArrayList;

/**
 *
 * @author ketan
 */
public class ValidUserRoleDirectory {
    private ArrayList<UserRole> validRolesList;

    public ValidUserRoleDirectory() {
        validRolesList = new ArrayList<UserRole>();
    }
    
    public void addUserRole(UserRole role){
        boolean exists = false;
        for(UserRole validRole: this.validRolesList){
            if(validRole == role){
                //role already exists as valid role
                exists = true;
                break;
            }
        }
        if(exists == false){
            //new valid role must be added
            this.validRolesList.add(role);
        }
    }

    public ArrayList<UserRole> getValidRolesList() {
        return validRolesList;
    }
    
    public boolean isUserRoleExists(UserRole role){
        boolean exists = false;
        for(UserRole validRole: this.validRolesList){
            if(validRole == role){
                //role already exists as valid role
                exists = true;
                break;
            }
        }
        return exists;
    }
}
