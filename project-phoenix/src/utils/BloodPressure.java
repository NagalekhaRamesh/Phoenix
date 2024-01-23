/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vishnupaduchuri
 */
public enum BloodPressure {
    NORMAL("<120", "Normal"),
    ELEVATED("120-129", "Elevated"),
    HYPERTENSION_1("130-139", "Hypertension 1"),
    HYPERTENSION_2("140-179", "Hypertension 2"),
    HYPERTENSION_3("180 >", "Hypertension 3");
    
    private final String name;
    private final String description;

    BloodPressure(String name, String description) {
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
