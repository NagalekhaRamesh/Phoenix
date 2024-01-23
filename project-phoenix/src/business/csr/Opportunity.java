/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.csr;

import business.CSREnterprise.CSREmployer.CSREmployerProfile;
import business.shelter.EmployableSkills;

/**
 *
 * @author nagal
 */
public class Opportunity {
    private static int opportunityCount = 0;
    private String opportunityId;
    
    CSREmployerProfile employerProfile;
    String jobTitle;
    EmployableSkills requiredSkill;
    String jobDesc;
    int availablePositions;

    public Opportunity(CSREmployerProfile employerProfile, String jobTitle, EmployableSkills requiredSkill, String jobDesc, int availablePositions) {
        this.employerProfile = employerProfile;
        this.jobTitle = jobTitle;
        this.requiredSkill = requiredSkill;
        this.jobDesc = jobDesc;
        this.availablePositions = availablePositions;
        
        generateOpportunityId();
    }
    
    private void generateOpportunityId() {
        opportunityCount++;
        String opportunityCountStr = String.format("%03d", opportunityCount);
        this.opportunityId = "OPPORTUNITY_" + opportunityCountStr;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public EmployableSkills getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(EmployableSkills requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public int getAvailablePositions() {
        return availablePositions;
    }

    public void setAvailablePositions(int availablePositions) {
        this.availablePositions = availablePositions;
    }

    public CSREmployerProfile getEmployerProfile() {
        return employerProfile;
    }

    public void setEmployerProfile(CSREmployerProfile employerProfile) {
        this.employerProfile = employerProfile;
    }

    public static int getOpportunityCount() {
        return opportunityCount;
    }

    public String getOpportunityId() {
        return opportunityId;
    }

    @Override
    public String toString() {
        return this.opportunityId;
    }
    
}
