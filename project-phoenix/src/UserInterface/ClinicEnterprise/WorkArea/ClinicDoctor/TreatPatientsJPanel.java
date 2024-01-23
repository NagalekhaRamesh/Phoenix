/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ClinicEnterprise.WorkArea.ClinicDoctor;

import business.Business;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.ClinicEnterprise;
import business.Organization.ClinicDoctorOrganization;
import business.Patient.DoctorVisit;
import business.Patient.NurseVisit;
import business.Patient.PatientProfile;
import business.userAccounts.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishnupaduchuri
 */
public class TreatPatientsJPanel extends javax.swing.JPanel {

    Business business;
    ClinicEnterprise enterprise;
    ClinicDoctorOrganization organization;
    ClinicDoctorProfile currentAuthenticatedUser;
    UserAccount currentUser;
    UserAccount selectedPatient;
    /**
     * Creates new form TreatPatientsJPanel
     */
    public TreatPatientsJPanel(Business business, ClinicEnterprise enterprise, ClinicDoctorOrganization organization, ClinicDoctorProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        this.selectedPatient = null;
        populatePatientsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        btnDischarge = new javax.swing.JButton();
        btnReferToDoctor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtDoctorsNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lablePreviousVisits = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 182, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient User Name", "Patient Name", "Mobile Number", "Age", "Primary Issue", "Secondary Issue"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 888, 116));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 139, -1, -1));

        jLabel3.setText("Patient's Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, -1, -1));

        txtPatientName.setEditable(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 178, 150, -1));

        btnDischarge.setText("Discharge Patient");
        btnDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargeActionPerformed(evt);
            }
        });
        add(btnDischarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 579, -1, 40));

        btnReferToDoctor.setText("Refer to another Doctor");
        btnReferToDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferToDoctorActionPerformed(evt);
            }
        });
        add(btnReferToDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 579, -1, 40));

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Blood Pressure", "Heart Rate", "SpO2", "Respiratory Rate", "Temperature", "Height", "Weight"
            }
        ));
        jScrollPane2.setViewportView(tblVitals);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 232, 834, 107));

        jLabel1.setText("Prescription:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 486, -1, -1));

        txtPrescription.setColumns(20);
        txtPrescription.setRows(5);
        jScrollPane3.setViewportView(txtPrescription);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 486, 481, 29));

        jLabel2.setText("Doctor's Additional Note:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 541, -1, -1));
        add(txtDoctorsNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 538, 481, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Previous Vitals");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 209, -1, -1));

        lablePreviousVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor", "Specalization", "Prescription", "Note"
            }
        ));
        jScrollPane4.setViewportView(lablePreviousVisits);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 363, 834, 80));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Previous Doctor Visits");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 345, -1, -1));
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
        populateVitalsTable();
        populatePreviousDocVisitsTable();
    }//GEN-LAST:event_btnViewActionPerformed

    public void populatePreviousDocVisitsTable() {
        DefaultTableModel model = (DefaultTableModel) lablePreviousVisits.getModel();
        model.setRowCount(0);
        
         PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
         
         ArrayList<DoctorVisit> visits = patient.getDoctorVisits().getDoctorVisitList();
         
         for(DoctorVisit visit: visits) {
             if(visit.getDoctorProfile() != null) {
                Object[] row = new Object[4];
                row[0] = visit.getDoctorProfile().getPerson().getFirstName();
                row[1] = visit.getDoctorProfile().getSpecalization();
                row[2] = visit.getPrescription();
                row[3] = visit.getNote();
                model.addRow(row);
             }
         }
    }
    
    public void populateVitalsTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);
        
         PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
         
         ArrayList<NurseVisit> vitals = patient.getNurseVisits().getNurseVisitList();
         
         for(NurseVisit vital: vitals) {
             if(vital.getVital() != null) {
                Object[] row = new Object[7];
                row[0] = vital.getVital().getBloodPressure();
                row[1] = vital.getVital().getHeartRate();
                row[2] = vital.getVital().getOxygenSaturation();
                row[3] = vital.getVital().getRespiratoryRate();
                row[4] = vital.getVital().getTemperature();
                row[5] =  vital.getVital().getHeight();
                row[6] =  vital.getVital().getWeight();
                model.addRow(row);
             }
         }
    }
    
    private void btnDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargeActionPerformed
        // TODO add your handling code here:
        if(this.selectedPatient == null) {
            JOptionPane.showMessageDialog(this, "Please select a Patient!");
            return;
        }
        
        String prescription = txtPrescription.getText();
        String note = txtDoctorsNote.getText();
        
        if(prescription.isBlank()) {
            JOptionPane.showMessageDialog(this, "Prescription cannot be null!");
            return;
        }
        
        if(note.isBlank()) {
            JOptionPane.showMessageDialog(this, "Note cannot be null!");
            return;
        }
        
        PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
        
        DoctorVisit doctorVisit = patient.getDoctorVisits().createDoctorVisit(currentAuthenticatedUser);
        doctorVisit.setPrescription(prescription);
        doctorVisit.setNote(note);
        
        patient.setIsCurrentlyAssignedToNurse(null);
        patient.setIsCurrentlyAssignedToDoctor(null);
        patient.setNeedsDoctorAttention(false);
        patient.setIsTrainingReady(true);
        
        JOptionPane.showMessageDialog(this, "Patient has been successfully Discharged!");
        populatePatientsTable();
        populateVitalsTable();
        populatePreviousDocVisitsTable();
        txtPatientName.setText("");
        txtPrescription.setText("");
        txtDoctorsNote.setText("");
    }//GEN-LAST:event_btnDischargeActionPerformed

    private void btnReferToDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferToDoctorActionPerformed
        // TODO add your handling code here:
        if(this.selectedPatient == null) {
            JOptionPane.showMessageDialog(this, "Please select a Patient!");
            return;
        }
        
        String prescription = txtPrescription.getText();
        String note = txtDoctorsNote.getText();
        
        if(prescription.isBlank()) {
            JOptionPane.showMessageDialog(this, "Prescription cannot be null!");
            return;
        }
        
        if(note.isBlank()) {
            JOptionPane.showMessageDialog(this, "Note cannot be null!");
            return;
        }
        
        PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
        
        DoctorVisit doctorVisit = patient.getDoctorVisits().createDoctorVisit(currentAuthenticatedUser);
        doctorVisit.setPrescription(prescription);
        doctorVisit.setNote(note);
        
        patient.setIsCurrentlyAssignedToNurse(null);
        patient.setIsCurrentlyAssignedToDoctor(null);
        patient.setNeedsDoctorAttention(true);
        patient.setIsTrainingReady(false);
        
        JOptionPane.showMessageDialog(this, "Patient will be guided to the next doctor!");
        populatePatientsTable();
        populateVitalsTable();
        populatePreviousDocVisitsTable();
        txtPatientName.setText("");
        txtPrescription.setText("");
        txtDoctorsNote.setText("");
    }//GEN-LAST:event_btnReferToDoctorActionPerformed

    public void populatePatientsTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();
        
        for(UserAccount user: users) {
             PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            if(patient.getIsCurrentlyAssignedToNurse() == null && patient.getIsCurrentlyAssignedToDoctor() != null && patient.isNeedsDoctorAttention() && patient.getIsCurrentlyAssignedToDoctor().getPerson().getPersonId() == currentAuthenticatedUser.getPerson().getPersonId()) {
                Object[] row = new Object[6];
                row[0] = user;
                row[1] = patient.getPerson().getFirstName();
                row[2] = patient.getPerson().getPhoneNum();
                row[3] = patient.getPerson().getAge();
                row[4] = patient.getPrimaryIssue().getIssueName();
                row[5] = patient.getSecondaryIssue().getIssueName();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnReferToDoctor;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable lablePreviousVisits;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtDoctorsNote;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtPrescription;
    // End of variables declaration//GEN-END:variables
}