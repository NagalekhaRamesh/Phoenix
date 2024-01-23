/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author nagal
 */
public class ConfigureAnEcosystem {
    
    public static Business initializeEcosystem(){
        Business business = new Business("Project Pheonix");
        
        //On boot up:
        //create all enterprises and organisations under them
        //create one Admin from each enterprise
        
        return business;
    }
}
