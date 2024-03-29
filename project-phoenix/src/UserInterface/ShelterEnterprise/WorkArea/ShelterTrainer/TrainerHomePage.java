/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ShelterEnterprise.WorkArea.ShelterTrainer;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.ShelterEnterprise;
import business.Organization.Organization;
import business.Organization.ShelterUpSkillOrganization;
import business.Patient.PatientProfile;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import business.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import business.userAccounts.UserAccount;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishnupaduchuri
 */
public class TrainerHomePage extends javax.swing.JPanel {

    Business business;
    ShelterEnterprise enterprise;
    ShelterUpSkillOrganization organization;
    ShelterTrainerProfile currentAuthenticatedUser;
    UserAccount currentUser;
    UserAccount selectedPatient;
    /**
     * Creates new form TrainerHomePage
     */
    public TrainerHomePage(Business business, ShelterEnterprise enterprise, ShelterUpSkillOrganization organization, ShelterTrainerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        this.selectedPatient = null;
        populateDate();
        populatePatientTable();
    }
    
    public void populateDate() {
        pageLabel.setText("Welcome Trainer, " + currentAuthenticatedUser.getPerson().getFirstName() + " !! Let's make a difference today!!");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        currentDate.setText("Date: " + dateFormat.format(now));
    }
    
    public void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();
        
        for(UserAccount user: users) {
             PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            if(patient.getIsCurrentlyAssignedToNurse() == null && patient.getIsCurrentlyAssignedToDoctor() == null && patient.isIsTrainingReady()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = patient.getPerson().getEmail();
                row[2] = patient.getPerson().getPhoneNum();
                model.addRow(row);
            }
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

        pageLabel = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();

        setBackground(new java.awt.Color(253, 247, 212));

        pageLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        pageLabel.setText("Welcome Trainer");

        currentDate.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        currentDate.setText("Date:");

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Email", "Mobile Number"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(pageLabel)
                .addGap(184, 184, 184)
                .addComponent(currentDate)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentDate)
                    .addComponent(pageLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
