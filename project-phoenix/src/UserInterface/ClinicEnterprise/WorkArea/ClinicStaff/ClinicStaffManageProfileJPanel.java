/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ClinicEnterprise.WorkArea.ClinicStaff;

import business.Business;
import business.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import business.Enterprise.ClinicEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.ClinicAdministrationOrganization;
import business.Organization.Organization;
import business.person.Ethnicity;
import business.person.Gender;
import business.person.Person;
import business.userAccounts.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static utils.BusinessUtils.isValidEmail;
import static utils.BusinessUtils.isValidPassword;
import static utils.BusinessUtils.isValidPhoneNumber;

/**
 *
 * @author ketan
 */
public class ClinicStaffManageProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicStaffManageProfileJPanel
     */
    JPanel UserMainContainer; 
    Business business;
    ClinicEnterprise enterprise;
    ClinicAdministrationOrganization organization;
    ClinicStaffProfile currentAuthenticatedUser;
    UserAccount currentUser;
    
    public ClinicStaffManageProfileJPanel(JPanel UserMainContainer, Business business, ClinicEnterprise enterprise, ClinicAdministrationOrganization organization, ClinicStaffProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegister = new javax.swing.JButton();
        txtEmailId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        labelFirstName = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ethnicityComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        spinnerAge = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 219, 154));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel6.setText("Email:");

        labelFirstName.setText("First Name:");

        genderComboBox.setToolTipText("");

        jLabel4.setText("Ethnicity:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Clinic Staff Personal Information:");

        labelLastName.setText("Last Name:");

        jLabel5.setText("Phone Number:");

        jLabel3.setText("Gender:");

        jLabel12.setText("User Name:");

        jLabel13.setText("Password:");

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        jLabel7.setText("Address:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Manage Profile");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("User Credentials:");

        labelAge.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethnicityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(247, 247, 247)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(417, 417, 417)
                            .addComponent(jLabel12)
                            .addGap(34, 34, 34)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(279, 279, 279)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(labelAge)
                            .addGap(29, 29, 29)
                            .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel6)
                            .addGap(31, 31, 31)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel7)
                            .addGap(34, 34, 34)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(379, 379, 379)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelLastName)))
                .addGap(111, 111, 111)
                .addComponent(ethnicityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelFirstName)
                                .addComponent(jLabel12))))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(labelAge))
                        .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addComponent(jLabel4)
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5))
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel6))
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel7))
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
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
            JOptionPane.showMessageDialog(this, "Clinic Staff Age is null!");
            return;
        }

        if(patientFirstName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Staff First Name can't be null!");
            return;
        }

        if(patientLastName.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Last Name can't be null!");
            return;
        }

        if(phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Phone number can't be null!");
            return;
        }

        if(emailId.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Email ID can't be null!");
            return;
        }

        if(address.isBlank()) {
            JOptionPane.showMessageDialog(this, "Clinic Staff address can't be null!");
            return;
        }

        if(userName.isBlank()){
            JOptionPane.showMessageDialog(this, "Clinic Staff User Name can't be null!");
            return;
        }

        if(password.isBlank()){
            JOptionPane.showMessageDialog(this, "Clinic Staff password can't be null!");
            return;
        }

        if(!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Clinic Staff password is not valid!");
            return;
        }

        if(!isValidEmail(emailId)) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Email ID is invalid!");
            return;
        }

        if(!isValidPhoneNumber(phoneNumber)){
            JOptionPane.showMessageDialog(this, "Clinic Staff Phone number is invalid!");
            return;
        }

        Gender selectedGender = (Gender) genderComboBox.getSelectedItem();

        if(selectedGender == null) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Gender is not selected!");
            return;
        }

        Ethnicity selectedEthnicity = (Ethnicity) ethnicityComboBox.getSelectedItem();

        if(selectedEthnicity == null) {
            JOptionPane.showMessageDialog(this, "Clinic Staff Ethnicity is not selected!");
            return;
        }

        boolean isExistingUser = business.isExistingUserByUserName(userName);

        if(isExistingUser) {
            JOptionPane.showMessageDialog(this, "UserName Already exists");
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

        ClinicStaffProfile clinicStaff = new ClinicStaffProfile(p);

        Enterprise supportedEnterprise = business.getEnterpriseCatalog().getSupportedEnterpriseGivenRole(clinicStaff.getRole());
        Organization supportedOrganization = supportedEnterprise.getOrganizationGivenRole(clinicStaff.getRole());

        UserAccount clinicStaffUser = supportedOrganization.getOrganizationUserDirectory().createUserAccount(clinicStaff, userName, password, true);

        JOptionPane.showMessageDialog(this, "Clinic Staff has been successfully Registered!! | " + clinicStaffUser);

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
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
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
