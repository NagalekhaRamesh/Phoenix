/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ShelterEnterprise.WorkArea.ShelterNurse;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.ShelterEnterprise;
import business.Organization.Organization;
import business.Organization.ShelterNurseStationOrganization;
import business.Patient.NurseVisit;
import business.Patient.PatientProfile;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import business.userAccounts.UserAccount;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.BloodPressure;
import utils.HeartRate;
import utils.OxygenSaturation;
import utils.Respiration;
import utils.Temperature;

/**
 *
 * @author vishnupaduchuri
 */
public class ManageAndViewPatients extends javax.swing.JPanel {

    Business business;
    ShelterEnterprise enterprise;
    ShelterNurseStationOrganization organization;
    ShelterNurseProfile currentAuthenticatedUser;
    UserAccount currentUser;
    UserAccount selectedPatient;
    /**
     * Creates new form ManageAndViewPatients
     * @param enterprise
     * @param organization
     * @param currentAuthenticatedUser
     * @param currentUser
     */
    public ManageAndViewPatients(Business business, ShelterEnterprise enterprise, ShelterNurseStationOrganization organization, ShelterNurseProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        this.selectedPatient = null;
        populatePatientsTable();
        populateDropDowns();
    }
    
    public void populateDropDowns() {
        DefaultComboBoxModel<BloodPressure> bloodpressure = new DefaultComboBoxModel<>(BloodPressure.values());
        dropDownBloodPressure.setModel(bloodpressure);
        
        DefaultComboBoxModel<OxygenSaturation> oxygenSaturation = new DefaultComboBoxModel<>(OxygenSaturation.values());
        comboBoxSpo2.setModel(oxygenSaturation);
        
        DefaultComboBoxModel<Temperature> temperature = new DefaultComboBoxModel<>(Temperature.values());
        comboBoxTemperature.setModel(temperature);
        
        DefaultComboBoxModel<HeartRate> heartRate = new DefaultComboBoxModel<>(HeartRate.values());
        comboHeartRate.setModel(heartRate);
        
        DefaultComboBoxModel<Respiration> respiration = new DefaultComboBoxModel<>(Respiration.values());
        dropDownRespiratory.setModel(respiration);
    }

    public void populatePatientsTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        
        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();
        
        for(UserAccount user: users) {
             PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            if(patient.getIsCurrentlyAssignedToNurse() != null && patient.getIsCurrentlyAssignedToNurse().getPerson().getPersonId() == currentAuthenticatedUser.getPerson().getPersonId()) {
                Object[] row = new Object[4];
                row[0] = user;
                row[1] = patient.getPerson().getFirstName();
                row[2] = patient.getPerson().getPhoneNum();
                row[3] = patient.getBloodGroup();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTraining = new javax.swing.JButton();
        btnDoctorCheckup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        dropDownBloodPressure = new javax.swing.JComboBox<>();
        comboBoxSpo2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboBoxTemperature = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboHeartRate = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        dropDownRespiratory = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(184, 228, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Manage and View Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 6, -1, -1));

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient User Name", "Patient Name", "Mobile Number", "Blood Group"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 888, 116));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 163, -1, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Patient's Vitals");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 209, -1, -1));

        jLabel3.setText("Patient's Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 248, -1, -1));

        txtPatientName.setEditable(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 245, 150, -1));

        jLabel4.setText("Blood Pressure:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 289, -1, -1));

        btnTraining.setText("Move to Upskilling");
        btnTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainingActionPerformed(evt);
            }
        });
        add(btnTraining, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 503, -1, 39));

        btnDoctorCheckup.setText("Request Doctor's Check-up");
        btnDoctorCheckup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorCheckupActionPerformed(evt);
            }
        });
        add(btnDoctorCheckup, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 503, -1, 39));

        jLabel5.setText("SpO2 Level in %:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, -1, -1));

        jLabel6.setText("Height (Ft):");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 286, 150, -1));

        jLabel7.setText("Weight (Lb):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 286, 150, -1));

        add(dropDownBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 286, 150, -1));

        add(comboBoxSpo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 330, 150, -1));

        jLabel8.setText("Temperature:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 333, -1, -1));

        add(comboBoxTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 330, 150, -1));

        jLabel9.setText("Heart Rate:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 333, -1, -1));

        add(comboHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 330, 150, -1));

        jLabel10.setText("Respiratory:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 374, -1, -1));

        add(dropDownRespiratory, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 371, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        this.selectedPatient = null;
        
        if(selectedRow < 0 ) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        UserAccount selectedPatientUser = (UserAccount) model.getValueAt(selectedRow, 0);
        
        PatientProfile patient = (PatientProfile) selectedPatientUser.getAssociatedProfile();
        this.selectedPatient = selectedPatientUser;
        txtPatientName.setText(patient.getPerson().getFirstName());
    }//GEN-LAST:event_btnViewActionPerformed

    public void clearContent() {
        txtPatientName.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
    }
    
    private void btnTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainingActionPerformed
        // TODO add your handling code here:        
        if(this.selectedPatient == null) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        String patientName = txtPatientName.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        
        if(patientName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        if(height.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill Height!");
            return;
        }
        
        if(weight.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill Weight!");
            return;
        }
        

        BloodPressure bloodPressure = (BloodPressure) dropDownBloodPressure.getSelectedItem();
        OxygenSaturation oxygen = (OxygenSaturation) comboBoxSpo2.getSelectedItem();
        Temperature temperature = (Temperature) comboBoxTemperature.getSelectedItem();
        HeartRate heartRate = (HeartRate) comboHeartRate.getSelectedItem();
        Respiration respiration = (Respiration) dropDownRespiratory.getSelectedItem();
        
        PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
        
        patient.setIsTrainingReady(true);
        NurseVisit nurseVisit = patient.getNurseVisits().createNurseVisit(currentAuthenticatedUser);
        nurseVisit.addVital(bloodPressure.getName(), heartRate.getName(), respiration.getName(), temperature.getName(), height, weight, oxygen.getName());
        patient.setIsCurrentlyAssignedToNurse(null);
        
        JOptionPane.showMessageDialog(this, "Patients profile has been forwarded to the Upskilling Department");
        clearContent();
        populatePatientsTable();
    }//GEN-LAST:event_btnTrainingActionPerformed

    private void btnDoctorCheckupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorCheckupActionPerformed
        // TODO add your handling code here:
        if(this.selectedPatient == null) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        String patientName = txtPatientName.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        
        if(patientName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        if(height.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill Height!");
            return;
        }
        
        if(weight.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill Weight!");
            return;
        }

        BloodPressure bloodPressure = (BloodPressure) dropDownBloodPressure.getSelectedItem();
        OxygenSaturation oxygen = (OxygenSaturation) comboBoxSpo2.getSelectedItem();
        Temperature temperature = (Temperature) comboBoxTemperature.getSelectedItem();
        HeartRate heartRate = (HeartRate) comboHeartRate.getSelectedItem();
        Respiration respiration = (Respiration) dropDownRespiratory.getSelectedItem();
        
        PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
        
        patient.setIsTrainingReady(false);
        NurseVisit nurseVisit = patient.getNurseVisits().createNurseVisit(currentAuthenticatedUser);
        nurseVisit.addVital(bloodPressure.getName(), heartRate.getName(), respiration.getName(), temperature.getName(), height, weight, oxygen.getName());
        
        patient.setIsCurrentlyAssignedToNurse(null);
        patient.setNeedsDoctorAttention(true);
        
        JOptionPane.showMessageDialog(this, "Patients profile has been forwarded to the Clinic");
        clearContent();
        populatePatientsTable();
    }//GEN-LAST:event_btnDoctorCheckupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctorCheckup;
    private javax.swing.JButton btnTraining;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<OxygenSaturation> comboBoxSpo2;
    private javax.swing.JComboBox<Temperature> comboBoxTemperature;
    private javax.swing.JComboBox<HeartRate> comboHeartRate;
    private javax.swing.JComboBox<BloodPressure> dropDownBloodPressure;
    private javax.swing.JComboBox<Respiration> dropDownRespiratory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
