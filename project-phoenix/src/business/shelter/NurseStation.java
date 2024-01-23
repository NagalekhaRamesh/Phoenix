/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package business.shelter;

/**
 *
 * @author nagal
 */
public enum NurseStation {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");
    
    private final String name;

    private NurseStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
