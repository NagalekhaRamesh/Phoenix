/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vishnupaduchuri
 */
public enum Temperature {
    NORMAL("36.5 C to 37.3 C", "Normal"),
    MILD("37.4 C - 38.3 C", "Mild Fever"),
    FEVER("> 38.4 C", "High Fever");
    
    private final String name;
    private final String description;

    Temperature(String name, String description) {
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
