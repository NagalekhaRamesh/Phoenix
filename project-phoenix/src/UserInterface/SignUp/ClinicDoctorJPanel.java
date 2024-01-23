/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SignUp;

import business.Business;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.person.Ethnicity;
import business.person.Gender;
import business.person.Person;
import utils.DoctorSpecalization;
import business.userAccounts.UserAccount;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static utils.BusinessUtils.isValidEmail;
import static utils.BusinessUtils.isValidPassword;
import static utils.BusinessUtils.isValidPhoneNumber;

/**
 *
 * @author vishnupaduchuri
 */
public class ClinicDoctorJPanel extends javax.swing.JPanel {

    JPanel UserMainContainer;
    Business business;
    /**
     * Creates new form ClinicDoctorJPanel
     */
    public ClinicDoctorJPanel(JPanel UserMainContainer, Business business) {
        initComponents();
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        
        populateDropDowns();
    }
    
    public void populateDropDowns() {
       DefaultComboBoxModel<Ethnicity> ethnicities = new DefaultComboBoxModel<>(Ethnicity.values());
       ethnicityComboBox.setModel(ethnicities);
       
       DefaultComboBoxModel<Gender> genders = new DefaultComboBoxModel<>(Gender.values());
       genderComboBox.setModel(genders);
       
       DefaultComboBoxModel<DoctorSpecalization> specalizations = new DefaultComboBoxModel<>(DoctorSpecalization.values());
       specalizationDropDown.setModel(specalizations);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        ethnicityComboBox = new javax.swing.JComboBox<>();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        spinnerAge = new javax.swing.JSpinner();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        specalizationDropDown = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(167, 219, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("User Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 157, -1, -1));

        labelFirstName.setText("First Name:");
        add(labelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 154, -1, -1));

        add(ethnicityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 326, 200, -1));

        genderComboBox.setToolTipText("");
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 284, 200, -1));

        jLabel13.setText("Password:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 199, -1, -1));

        jLabel4.setText("Ethnicity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 329, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 154, 200, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Clinic Doctor Personal Information:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 115, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 196, 200, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 451, 200, -1));

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));
        add(spinnerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 242, 200, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 368, 200, -1));

        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 454, -1, -1));

        labelLastName.setText("Last Name:");
        add(labelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 203, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Clinic Doctor Sign Up");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 45, -1, -1));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 481, 100, 40));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 200, 200, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("User Credentials:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 115, -1, -1));
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 410, 200, -1));

        jLabel5.setText("Phone Number:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 371, -1, -1));

        labelAge.setText("Age:");
        add(labelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 245, -1, -1));

        jLabel6.setText("Email:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 413, -1, -1));

        jLabel3.setText("Gender:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 287, -1, -1));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 151, 200, -1));

        jLabel9.setText("Specalization:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        add(specalizationDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        String patientFirstName = txtFirstName.getText();
        String patientLastName = txtLastName.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String emailId = txtEmailId.getText();
        String address = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String spinnerValue = spinnerAge.getValue().toString();

        if(spinnerValue.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Age is null!");
            return;
        }

        if(patientFirstName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor First Name can't be null!");
            return;
        }

        if(patientLastName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Last Name can't be null!");
            return;
        }

        if(phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Phone number can't be null!");
            return;
        }

        if(emailId.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Email ID can't be null!");
            return;
        }

        if(address.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor address can't be null!");
            return;
        }

        if(userName.isBlank()){
            JOptionPane.showMessageDialog(this, "Clinic Doctor User Name can't be null!");
            return;
        }

        if(password.isBlank()){
            JOptionPane.showMessageDialog(this, "Clinic Doctor password can't be null!");
            return;
        }

        if(!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor password is not valid!");
            return;
        }

        if(!isValidEmail(emailId)) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Email ID is invalid!");
            return;
        }

        if(!isValidPhoneNumber(phoneNumber)){
            JOptionPane.showMessageDialog(this, "Clinic Doctor Phone number is invalid!");
            return;
        }

        Gender selectedGender = (Gender) genderComboBox.getSelectedItem();

        if(selectedGender == null) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Gender is not selected!");
            return;
        }

        Ethnicity selectedEthnicity = (Ethnicity) ethnicityComboBox.getSelectedItem();

        if(selectedEthnicity == null) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Ethnicity is not selected!");
            return;
        }

        boolean isExistingUser = business.isExistingUserByUserName(userName);

        if(isExistingUser) {
            JOptionPane.showMessageDialog(this, "UserName Already exists");
            return;
        }
        
        DoctorSpecalization selectedSpecialization = (DoctorSpecalization) specalizationDropDown.getSelectedItem();

        if(selectedSpecialization == null) {
            JOptionPane.showMessageDialog(this, "Clinic Doctor Gender is not selected!");
            return;
        }

        //Signup Shelter Supervisor
        Person p = new Person();
        p.setFirstName(patientFirstName);
        p.setLastName(patientLastName);
        p.setGender(selectedGender);
        p.setEthnicity(selectedEthnicity);
        p.setAge(Integer.parseInt(spinnerValue));
        p.setPhoneNum(phoneNumber);
        p.setEmail(emailId);
        p.setAddress(address);

        ClinicDoctorProfile clinicDoctor = new ClinicDoctorProfile(p);
        clinicDoctor.setSpecalization(selectedSpecialization);

        Enterprise supportedEnterprise = business.getEnterpriseCatalog().getSupportedEnterpriseGivenRole(clinicDoctor.getRole());
        Organization supportedOrganization = supportedEnterprise.getOrganizationGivenRole(clinicDoctor.getRole());

        UserAccount clinicDoctorUser = supportedOrganization.getOrganizationUserDirectory().createUserAccount(clinicDoctor, userName, password, true);

        JOptionPane.showMessageDialog(this, "Clinic Doctor has been successfully Registered!! | " + clinicDoctorUser);

        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNumber.setText("");
        txtEmailId.setText("");
        txtAddress.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        spinnerAge.setValue(0);
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<Ethnicity> ethnicityComboBox;
    private javax.swing.JComboBox<Gender> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JComboBox<DoctorSpecalization> specalizationDropDown;
    private javax.swing.JSpinner spinnerAge;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
