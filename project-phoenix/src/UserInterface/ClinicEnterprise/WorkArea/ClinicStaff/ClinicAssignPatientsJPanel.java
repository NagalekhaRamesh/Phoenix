/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ClinicEnterprise.WorkArea.ClinicStaff;

import business.Business;
import business.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.ClinicEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.ClinicAdministrationOrganization;
import business.Organization.Organization;
import business.Patient.PatientProfile;
import business.profile.UserRole;
import business.userAccounts.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishnupaduchuri
 */
public class ClinicAssignPatientsJPanel extends javax.swing.JPanel {

    Business business;
    ClinicEnterprise enterprise;
    ClinicAdministrationOrganization organization;
    ClinicStaffProfile currentAuthenticatedUser;
    UserAccount currentUser;
    UserAccount selectedPatient;
    UserAccount selectedDoctor;
    /**
     * Creates new form ClinicAssignPatientsJPanel
     */
    public ClinicAssignPatientsJPanel(Business business, ClinicEnterprise enterprise, ClinicAdministrationOrganization organization, ClinicStaffProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
         this.selectedDoctor = null;
        populateTable();
        populateDoctorsTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        ArrayList<UserAccount> users = business.getMasterPatientList().getUserAccountList();
        
        for(UserAccount user: users) {
             PatientProfile patient = (PatientProfile) user.getAssociatedProfile();
            if(patient.getIsCurrentlyAssignedToNurse() == null && patient.getIsCurrentlyAssignedToDoctor() == null && patient.isNeedsDoctorAttention()) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = patient.getPerson().getFirstName();
                row[2] = patient.getPerson().getPhoneNum();
                model.addRow(row);
            }
        }
    }
    
    public void populateDoctorsTable() {
        DefaultTableModel model = (DefaultTableModel) tblNurse.getModel();
        model.setRowCount(0);
        
        ArrayList<UserAccount> doctorList = enterprise.getOrganizationGivenRole(UserRole.CLINIC_DOCTOR).getOrganizationUserDirectory().getUserAccountList();

        for(UserAccount user: doctorList) {
            ClinicDoctorProfile doctorProfile = (ClinicDoctorProfile) user.getAssociatedProfile();
            Object[] row = new Object[5];
            row[0] = user;
            row[1] = doctorProfile.getPerson().getFirstName();
            row[2] = doctorProfile.getPerson().getEmail();
            row[3] = doctorProfile.getPerson().getPhoneNum();
            row[4] = doctorProfile.getSpecalization().getName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        volunteerNameLabel = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient User Name", "Patient Name", "Mobile Number", "Assigned To Doctor"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 888, 116));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Manage and View Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 6, -1, -1));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 163, -1, 40));

        jLabel3.setText("Patient's Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 224, -1, -1));

        txtPatientName.setEditable(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 221, 150, -1));

        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor's User Name", "Name", "Email ID", "Phone Number", "Specalization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNurse);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 280, 888, 132));

        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 424, -1, 40));

        volunteerNameLabel.setText("Doctors Name:");
        add(volunteerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 486, -1, -1));

        doctorName.setEditable(false);
        add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 483, 200, -1));

        jButton1.setText("Assign Patient to Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 536, -1, 38));
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

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNurse.getSelectedRow();
        this.selectedDoctor = null;

        if(selectedRow < 0 ) {
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        } else {

            DefaultTableModel model = (DefaultTableModel) tblNurse.getModel();
            UserAccount user = (UserAccount) model.getValueAt(selectedRow, 0);

            ClinicDoctorProfile doctor = (ClinicDoctorProfile) user.getAssociatedProfile();
            this.selectedDoctor = user;
            doctorName.setText(doctor.getPerson().getFirstName());
        }
    }//GEN-LAST:event_btnView1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(this.selectedDoctor == null) {
            JOptionPane.showMessageDialog(this, "Please select doctor for assigning to the patient!");
            return;
        }
        
        if(this.selectedPatient == null) {
            JOptionPane.showMessageDialog(this, "Please select a Patient for assignment!");
            return;
        }
        
         PatientProfile patient = (PatientProfile) selectedPatient.getAssociatedProfile();
         ClinicDoctorProfile doctor = (ClinicDoctorProfile) selectedDoctor.getAssociatedProfile();
         
         patient.setIsCurrentlyAssignedToDoctor(doctor);
         JOptionPane.showMessageDialog(this, "Patient has been assigned to Doctor!");
         this.selectedDoctor = null;
         this.selectedPatient = null;
         doctorName.setText("");
         txtPatientName.setText("");
         populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JTextField doctorName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNurse;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JLabel volunteerNameLabel;
    // End of variables declaration//GEN-END:variables
}
