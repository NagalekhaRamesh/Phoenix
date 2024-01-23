/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Patient;

import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;

/**
 *
 * @author nagal
 */
public class Vital {
    
    String bloodPressure;
    String heartRate;
    String respiratoryRate;
    String temperature;
    String height;
    String weight;
    String oxygenSaturation; 

    public Vital(String bloodPressure, String heartRate, String respiratoryRate, String temperature, String height, String weight, String oxygenSaturation) {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.temperature = temperature;
        this.height = height;
        this.weight = weight;
        this.oxygenSaturation = oxygenSaturation;
    }
    
    
    
    //add validators for each vital type

    public String getBloodPressure() {
        return bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getRespiratoryRate() {
        return respiratoryRate;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getOxygenSaturation() {
        return oxygenSaturation;
    }
    
    
}
