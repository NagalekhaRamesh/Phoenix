/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ClinicEnterprise.WorkArea.ClinicStaff;

import business.Business;
import business.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.ClinicEnterprise;
import business.Organization.ClinicAdministrationOrganization;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import business.profile.UserRole;
import business.userAccounts.UserAccount;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishnupaduchuri
 */
public class ClinicManageDoctors extends javax.swing.JPanel {

    Business business;
    ClinicEnterprise enterprise;
    ClinicAdministrationOrganization organization;
    ClinicStaffProfile currentAuthenticatedUser;
    UserAccount currentUser;
    UserAccount selectedDoctor;
    /**
     * Creates new form ClinicManageDoctors
     */
    public ClinicManageDoctors(Business business, ClinicEnterprise enterprise, ClinicAdministrationOrganization organization, ClinicStaffProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        this.selectedDoctor = null;
        DisplayDateAndTime();
        populateTable();
    }
    
    public void DisplayDateAndTime() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        currentDate.setText("Date: " + dateFormat.format(now));
    }
    
    public void populateTable() {
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

        lblTitle = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        doctorName = new javax.swing.JTextField();
        enableUserDropDown = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        volunteerNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 226, 209));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Manage Doctors");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 30, -1, -1));

        currentDate.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        currentDate.setText("Date:");
        add(currentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 35, -1, -1));

        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Name", "Email ID", "Phone Number", "Specalization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNurse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 723, 132));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 220, -1, -1));

        doctorName.setEditable(false);
        add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 291, 200, -1));

        enableUserDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(enableUserDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 332, 200, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 387, -1, 31));

        volunteerNameLabel.setText("Doctors Name:");
        add(volunteerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 291, -1, -1));

        jLabel2.setText("Enable as User:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 329, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
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
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String nameOfNurse = doctorName.getText();

        if(selectedDoctor == null) {
            JOptionPane.showMessageDialog(this, "Please select a Doctor first!");
            return;
        }

        if(nameOfNurse.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please select a Doctor first!");
            return;
        }

        String isEnabledString = enableUserDropDown.getSelectedItem().toString();

        ClinicDoctorProfile doctor = (ClinicDoctorProfile) selectedDoctor.getAssociatedProfile();

        this.selectedDoctor.setIsUserEnabled((isEnabledString == "Yes") ? true : false);

        this.selectedDoctor =  null;

        JOptionPane.showMessageDialog(this, "Doctor's information has been updated successfully!!!");
        populateTable();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel currentDate;
    private javax.swing.JTextField doctorName;
    private javax.swing.JComboBox<String> enableUserDropDown;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblNurse;
    private javax.swing.JLabel volunteerNameLabel;
    // End of variables declaration//GEN-END:variables
}
