/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.NGOEnterprise.WorkArea.NGOAdmin;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.NGOEnterprise;
import business.NGOEnterprise.NGOAdministration.NGOSupervisorProfile;
import business.Organization.NGOAdministrationOrganization;
import business.Organization.Organization;
import business.Patient.Issue;
import business.Patient.PatientProfile;
import business.profile.UserRole;
import business.userAccounts.UserAccount;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import utils.Neighbourhood;

/**
 *
 * @author vishnupaduchuri
 */
public class ViewAnalyticsJPanel extends javax.swing.JPanel {

    Business business;
    NGOEnterprise enterprise;
    NGOAdministrationOrganization organization;
    NGOSupervisorProfile currentAuthenticatedUser;
    UserAccount currentUser;
    /**
     * Creates new form ViewAnalyticsJPanel
     */
    public ViewAnalyticsJPanel(Business business, NGOEnterprise enterprise, NGOAdministrationOrganization organization, NGOSupervisorProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        DisplayDateAndTime();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        popuplateNeighbourhoodTable();
        popularEthnictyTable();
        populateGenderTable();
        populatePrimaryIssueTable();
        populateSecondaryIssueTable();
        populateLabelMetrics();
    }
    
    public void populateLabelMetrics() {
        
        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();
        noOfPatients.setText(Integer.toString(users.size()));
        
        ArrayList<UserAccount> ngoVolunteers = enterprise.getOrganizationGivenRole(UserRole.NGO_VOLUNTEER).getOrganizationUserDirectory().getUserAccountList();
        noOfVolunteersLabel.setText(Integer.toString(ngoVolunteers.size()));
    }
    
    public void DisplayDateAndTime() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateAndTime.setText("Date: " + dateFormat.format(now));
    }

    public void popuplateNeighbourhoodTable() {
        DefaultTableModel model = (DefaultTableModel) neightbourhoodsAttentionTable.getModel();
        model.setRowCount(0);

        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();

        HashMap<String, Integer> neighborhoodCountMap = new HashMap<>();

        for(UserAccount user: users) {
            PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            String patiensNeighbourhood = patient.getNeighbourhood().getName();
            neighborhoodCountMap.put(patiensNeighbourhood, neighborhoodCountMap.getOrDefault(patiensNeighbourhood, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(neighborhoodCountMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
                String neighborhood = entry.getKey();
                int count = entry.getValue();

                Object[] row = new Object[2];
                row[0] = neighborhood;
                row[1] = count;
                model.addRow(row);
        }
    }

    public void popularEthnictyTable() {
        DefaultTableModel model = (DefaultTableModel) ethnicityTable.getModel();
        model.setRowCount(0);

        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();

        HashMap<String, Integer> ethnicityMap = new HashMap<>();

        for(UserAccount user: users) {
            PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            String patientsEthnicty = patient.getPerson().getEthnicity().getLabel();
            ethnicityMap.put(patientsEthnicty, ethnicityMap.getOrDefault(patientsEthnicty, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(ethnicityMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
                String ethnicity = entry.getKey();
                int count = entry.getValue();

                Object[] row = new Object[2];
                row[0] = ethnicity;
                row[1] = count;
                model.addRow(row);
        }
    }

    public void populateGenderTable() {
        DefaultTableModel model = (DefaultTableModel) genderCompTable.getModel();
        model.setRowCount(0);

        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();

        HashMap<String, Integer> genderMap = new HashMap<>();

        for(UserAccount user: users) {
            PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            String patientsGender = patient.getPerson().getGender().getValue();
            genderMap.put(patientsGender, genderMap.getOrDefault(patientsGender, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(genderMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
                String gender = entry.getKey();
                int count = entry.getValue();

                Object[] row = new Object[2];
                row[0] = gender;
                row[1] = count;
                model.addRow(row);
        }
    }

    public void populatePrimaryIssueTable() {
        DefaultTableModel model = (DefaultTableModel) primaryIssueTable.getModel();
        model.setRowCount(0);

        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();

        HashMap<String, Integer> issueMap = new HashMap<>();

        for(UserAccount user: users) {
            PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            String patientPrimaryIssue = patient.getPrimaryIssue().getIssueName();
            issueMap.put(patientPrimaryIssue, issueMap.getOrDefault(patientPrimaryIssue, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(issueMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
                String issue = entry.getKey();
                int count = entry.getValue();

                Object[] row = new Object[2];
                row[0] = issue;
                row[1] = count;
                model.addRow(row);
        }
    }

    public void populateSecondaryIssueTable() {
        DefaultTableModel model = (DefaultTableModel) SecondaryIssueTable.getModel();
        model.setRowCount(0);

        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();

        HashMap<String, Integer> issueMap = new HashMap<>();

        for(UserAccount user: users) {
            PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            String patientSecondaryIssue = patient.getSecondaryIssue().getIssueName();
            issueMap.put(patientSecondaryIssue, issueMap.getOrDefault(patientSecondaryIssue, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(issueMap.entrySet());
        sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
                String issue = entry.getKey();
                int count = entry.getValue();

                Object[] row = new Object[2];
                row[0] = issue;
                row[1] = count;
                model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateAndTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        primaryIssueTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        neightbourhoodsAttentionTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ethnicityTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        genderCompTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        SecondaryIssueTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        noOfVolunteersLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        noOfPatients = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 219, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to NGO Analytics Hub ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 6, -1, -1));

        dateAndTime.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        dateAndTime.setText("Date:");
        add(dateAndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 11, -1, -1));

        primaryIssueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Issue", "Total No of Patients Helped"
            }
        ));
        jScrollPane1.setViewportView(primaryIssueTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 213, 411, 108));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel4.setText("Primary Issues Amongst Patients");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, -1, -1));

        neightbourhoodsAttentionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Neighbourhood", "Total No of Patients"
            }
        ));
        jScrollPane2.setViewportView(neightbourhoodsAttentionTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 213, 411, 108));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel5.setText("Neighbourhoods that need attention:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 177, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel6.setText("Patient's comparisions based on Ethnicity:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 339, -1, -1));

        ethnicityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ethnicity", "Total No of Patients"
            }
        ));
        jScrollPane3.setViewportView(ethnicityTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 375, 411, 108));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel7.setText("Patient's comparisions based on Gender:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 339, -1, -1));

        genderCompTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Gender", "Total No of Patients"
            }
        ));
        jScrollPane4.setViewportView(genderCompTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 375, 411, 108));

        SecondaryIssueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Issue", "Total No of Patients Helped"
            }
        ));
        jScrollPane5.setViewportView(SecondaryIssueTable);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 537, 411, 108));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel8.setText("Secondary Issues Amongst Patients");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 501, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("No of Volunteers:");

        noOfVolunteersLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(noOfVolunteersLabel))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(noOfVolunteersLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("No of Patients Helped:");

        noOfPatients.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(noOfPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(noOfPatients)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 65, -1, 94));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SecondaryIssueTable;
    private javax.swing.JLabel dateAndTime;
    private javax.swing.JTable ethnicityTable;
    private javax.swing.JTable genderCompTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable neightbourhoodsAttentionTable;
    private javax.swing.JLabel noOfPatients;
    private javax.swing.JLabel noOfVolunteersLabel;
    private javax.swing.JTable primaryIssueTable;
    // End of variables declaration//GEN-END:variables
}
