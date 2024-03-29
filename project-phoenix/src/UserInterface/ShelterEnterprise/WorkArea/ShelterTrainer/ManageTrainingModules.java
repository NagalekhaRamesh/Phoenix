/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ShelterEnterprise.WorkArea.ShelterTrainer;

import business.Business;
import business.Enterprise.ShelterEnterprise;
import business.Organization.ShelterUpSkillOrganization;
import business.Patient.PatientProfile;
import business.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import business.shelter.EnrollmentStatus;
import business.shelter.Grade;
import business.shelter.PatientTrainer;
import business.shelter.TrainingModule;
import business.userAccounts.UserAccount;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nagal
 */
public class ManageTrainingModules extends javax.swing.JPanel {

    /**
     * Creates new form ManageTrainingModules
     */
    TrainingModule selectedTrainingModule;
    PatientTrainer selectedPatientTrainer;
    
    Business business;
    ShelterEnterprise enterprise;
    ShelterUpSkillOrganization organization;
    ShelterTrainerProfile currentAuthenticatedUser;
    UserAccount currentUser;
    
    public ManageTrainingModules(Business business, ShelterEnterprise enterprise, ShelterUpSkillOrganization organization, ShelterTrainerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        
        this.selectedPatientTrainer = null;
        this.selectedTrainingModule = null;
        
        populateTrainingModules();
        populateCmbGrade();
        
    }
    
    public void populateCmbGrade(){
        DefaultComboBoxModel<Grade> grades = new DefaultComboBoxModel<>(Grade.values());
        cmbGrade.setModel(grades);
    }
    
    public void populateTrainingModules(){
        DefaultTableModel model = (DefaultTableModel) tblTrainingModules.getModel();
        model.setRowCount(0);
        
        for(TrainingModule tm : this.currentAuthenticatedUser.getShelterTrainingModule().getTrainingModuleList()){
            Object[] row = new Object[4];
            row[0] = tm;
            row[1] = tm.getOpportunity().getJobTitle();
            row[2] = tm.getOpportunity().getRequiredSkill().getSkillName();
            row[3] = tm.getEnrolledPatientList().getPatientTrainerList().size();
            model.addRow(row);
        }
    }
    
    public void populateEnrolledPatients(){
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        PatientProfile patientProfile = null;
        for(PatientTrainer patientTrainer : selectedTrainingModule.getEnrolledPatientList().getPatientTrainerList()){
            patientProfile = (PatientProfile) patientTrainer.getPatient();
            Object[] row = new Object[4];
            row[0] = patientTrainer;
            row[1] = patientProfile.getPerson().getFirstName();
            row[2] = patientProfile.getPerson().getEmail();
            row[3] = patientTrainer.getGrade() == null ? '-' : patientTrainer.getGrade();
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrainingModules = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtJobDescription = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnViewPatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbGrade = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Manage Training Modules:");

        tblTrainingModules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Training Module ID", "Job Title", "Skill", "Enrolled Patients"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTrainingModules);

        jLabel1.setText("Training Modules:");

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel5.setText("Job Description:");

        txtJobDescription.setColumns(20);
        txtJobDescription.setLineWrap(true);
        txtJobDescription.setRows(5);
        jScrollPane2.setViewportView(txtJobDescription);

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Email", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPatients);

        jLabel2.setText("Enrolled patients:");

        btnViewPatient.setText("VIEW");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        jLabel3.setText("Grade:");

        cmbGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradeActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewPatient)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnView)
                    .addComponent(lblTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewPatient)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTrainingModules.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first to view the Training Module details", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            TrainingModule tm = (TrainingModule) tblTrainingModules.getValueAt(selectedRow, 0);
            this.selectedTrainingModule = tm;
            txtJobDescription.setText(selectedTrainingModule.getOpportunity().getJobDesc());
        }
        populateEnrolledPatients();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Patient to grade from the Training Program!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            PatientTrainer patientTrainer = (PatientTrainer) tblPatients.getValueAt(selectedRow, 0);
            this.selectedPatientTrainer = patientTrainer;
        }
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(selectedPatientTrainer != null && selectedTrainingModule != null){
            Grade selectedGrade = (Grade) cmbGrade.getSelectedItem();
            
            //update grade and status in patientTrrainer object
            selectedPatientTrainer.setGrade(selectedGrade);
            selectedPatientTrainer.setStatus(EnrollmentStatus.COMPLETED);
            
            //refresh screen
            this.selectedPatientTrainer = null;
            
            populateEnrolledPatients();

        }
        else{
            JOptionPane.showMessageDialog(this, "Please select the training module or the enrolled patient you wish to grade", "Warning", JOptionPane.WARNING_MESSAGE);
            return;  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JComboBox<Grade> cmbGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTable tblTrainingModules;
    private javax.swing.JTextArea txtJobDescription;
    // End of variables declaration//GEN-END:variables
}
