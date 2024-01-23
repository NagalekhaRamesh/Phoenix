/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vishnupaduchuri
 */
public enum DoctorSpecalization { 
    CARDIOLOGIST("CARDIOLOGIST"),
    DERMATOLOGIST("DERMATOLOGIST"),
    ENDOCRINOLOGIST("ENDOCRINOLOGIST"),
    GASTROENTEROLOGIST("GASTROENTEROLOGIST"),
    NEUROLOGIST("NEUROLOGIST"),
    ONCOLOGIST("ONCOLOGIST"),
    ORTHOPEDICIAN("ORTHOPEDICIAN"),
    PEDIATRICIAN("PEDIATRICIAN"),
    PSYCHIATRIST("PSYCHIATRIST"),
    UROLOGIST("UROLOGIST");
    
    private final String name;

    DoctorSpecalization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
