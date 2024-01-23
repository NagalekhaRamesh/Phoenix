/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package business.person;

/**
 *
 * @author nagal
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other"),
    PREFER_NOT_TO_SAY("Prefer not to say");
    
    private final String value;
    
    Gender(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
