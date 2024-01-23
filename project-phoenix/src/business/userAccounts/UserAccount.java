/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.userAccounts;

import business.person.Person;
import business.profile.Profile;
import business.profile.UserRole;
import java.util.ArrayList;
import java.util.List;
import utils.BusinessUtils;

/**
 *
 * @author nagal
 */
public class UserAccount {
    Profile profile;
    String username;
    String passwordHash;
    private List<String> passwordList;
    boolean isUserEnabled;

    public UserAccount(Profile profile, String username, String password, boolean userStatus) {
        this.profile = profile;
        this.username = username;
        this.isUserEnabled = userStatus;
        this.passwordList = new ArrayList<String>();

        setPasswordHash(password);
    }
    
    public String getPersonId() {
        Person userPerson =  profile.getPerson();
        
        if(userPerson == null) {
            return null;
        }
        
        return profile.getPerson().getPersonId();
    }
    
    public void setUserName(String username) {
        this.username = username;
    }

    public boolean getIsUserEnabled() {
        return this.isUserEnabled;
    }

    public void setIsUserEnabled(boolean status) {
        this.isUserEnabled = status;
    }

    public String getUsername() {
        return username;
    }

    public void setPasswordList(String password) {
        String encrypedPassword = BusinessUtils.encryptPassword(password);
        this.passwordList.add(encrypedPassword);
    }

    public List<String> getPasswordList() {
        return passwordList;
    }

    public String getCurrentPassword() {
       if(!this.passwordList.isEmpty()) {
           String currentPassword = this.passwordList.get(this.passwordList.size() - 1);
           return currentPassword;
       }
       return null;
    }
    
    public boolean isMatch(String id) {
        String personId = getPersonId();
        
        if(personId == null) {
           return false;
        }
        
        if(getPersonId().equals(id)){
            return true;
        }
        return false;
    }
    
    public boolean isUserNameMatch(String name) {
        if(username.equals(name)) {
            return true;
        }
        return false;
    }

    public boolean isValidUser(String un, String pwd) {
        String latestPassword = getCurrentPassword();
        if(username.equals(un) && BusinessUtils.verifyPassword(latestPassword, pwd)) {
            return true;
        }
        return false;
    }
    
    public UserRole getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedProfile() {
        return profile;
    }

    public boolean setPasswordHash(String newPassword) {
        //true - set the password successfully
        //false - count not set the password successfully
        String newPasswordHash = BusinessUtils.encryptPassword(newPassword);

        if(this.passwordList.size() == 0){
            //new user setting password for the first time
            this.passwordHash = newPasswordHash;
            passwordList.add(newPasswordHash);
        } else {
            for(String password : passwordList){
                if(password.equals(newPasswordHash)){
                    return false;
                }
            }
            //add new passwordHash to password list
            passwordList.add(newPasswordHash);
                    
            //set new password
            this.passwordHash = newPasswordHash;
        }
        System.out.println("The Updated Password is:" + newPassword + " and the encrypted password is: " + newPasswordHash);
        return true;
    }    
    
    @Override
    public String toString() {
        return this.username;
    }
}
