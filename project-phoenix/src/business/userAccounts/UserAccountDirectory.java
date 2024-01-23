/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.userAccounts;

import business.profile.Profile;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }
    
    public UserAccount createUserAccount(Profile p, String un, String pwd, boolean userStatus) {
        UserAccount ua = new UserAccount(p, un, pwd, userStatus);
        userAccountList.add(ua);
        return ua;
    }
    
    public UserAccount findUserAccount(String personId) {
        for (UserAccount ua: userAccountList){
            if(ua.isMatch(personId)){
                return ua;
            }
        }
        return null; //not found after going through whole list
    }
    
    public UserAccount findUserAccountByUserName(String userName){
        for (UserAccount ua: userAccountList){
            if(ua.isUserNameMatch(userName)){
                return ua;
            }
        }
        return null; //not found after going through whole list
    }
    
    public UserAccount AuthenticateUser(String un, String pwd){
        //accepts pwd as plain String password; isValidUser takes care of whether plain text user input matches the stored passwordHash
        for (UserAccount ua: userAccountList){
            if(ua.isValidUser(un, pwd)){
                return ua;
            }
        }
        return null; //not found after going through whole list
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
}
