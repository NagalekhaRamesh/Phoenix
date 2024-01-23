/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vishnupaduchuri
 */
public enum HeartRate {
    NORMAL("60 and 100 Beats", "Normal"),
    IDEAL("60-80", "Ideal");
    
    private final String name;
    private final String description;

    HeartRate(String name, String description) {
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
