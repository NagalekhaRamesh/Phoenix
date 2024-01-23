/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.csr;

import business.CSREnterprise.CSREmployer.CSREmployerProfile;
import business.shelter.EmployableSkills;
import java.util.ArrayList;

/**
 *
 * @author nagal
 */
public class OpportunityDirectory {
    ArrayList<Opportunity> opportunityList;

    public OpportunityDirectory() {
        opportunityList = new ArrayList<Opportunity>();
    }

    public ArrayList<Opportunity> getOpportunityList() {
        return opportunityList;
    }
    
    public Opportunity createNewOpportunity(CSREmployerProfile crsEmployerProfile, String jobTitle, EmployableSkills requiredSkill, String jobDesc, int availablePositions ){
        Opportunity o = new Opportunity(crsEmployerProfile, jobTitle, requiredSkill, jobDesc, availablePositions);
        opportunityList.add(o);
        return o;
    }
    
    
}
