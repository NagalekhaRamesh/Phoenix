/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vishnupaduchuri
 */
public enum OxygenSaturation {
    NORMAL("95-100%", "Normal"),
    MILD("91-94%", "Mild Hypoxemia"),
    MODERATE("86-90%", "Moderate"),
    SEVERE("<85%", "Severe");
    
    private final String name;
    private final String description;

    OxygenSaturation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
