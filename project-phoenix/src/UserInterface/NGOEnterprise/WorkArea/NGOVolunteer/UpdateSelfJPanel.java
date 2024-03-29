/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.NGOEnterprise.WorkArea.NGOVolunteer;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.NGOEnterprise;
import business.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import business.Organization.NGOVolunteerOrganization;
import business.Organization.Organization;
import business.userAccounts.UserAccount;
import business.userAccounts.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.BusinessUtils;
import static utils.BusinessUtils.isValidPhoneNumber;

/**
 *
 * @author vishnupaduchuri
 */
public class UpdateSelfJPanel extends javax.swing.JPanel {

    Business business;
    NGOEnterprise enterprise;
    NGOVolunteerOrganization organization;
    NGOVolunteerProfile currentAuthenticatedUser;
    UserAccount currentUser;
    /**
     * Creates new form UpdateSelfJPanel
     */
    public UpdateSelfJPanel(Business business, NGOEnterprise enterprise, NGOVolunteerOrganization organization, NGOVolunteerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        populateData();
    }
    
    public void populateData() {
        txtFirstName.setText(this.currentAuthenticatedUser.getPerson().getFirstName());
        txtLastName.setText(this.currentAuthenticatedUser.getPerson().getLastName());
        txtEmailId.setText(this.currentAuthenticatedUser.getPerson().getEmail());
        txtPhoneNumber.setText(this.currentAuthenticatedUser.getPerson().getPhoneNum());
        txtAddress.setText(this.currentAuthenticatedUser.getPerson().getAddress());
        ageSpinner.setValue(this.currentAuthenticatedUser.getPerson().getAge());
        
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtEmailId.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        ageSpinner.setEnabled(false);
        btnSave.setEnabled(false);
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ageSpinner = new javax.swing.JSpinner();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSaveUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 221, 253));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Update Page");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Email ID:");

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Address:");

        jLabel7.setText("Age:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("Update Personal Information");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("Update User Information");

        jLabel10.setText("Password:");

        jLabel11.setText("User Name:");

        btnSaveUser.setText("Save");
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });

        btnEditUser.setText("Edit");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtLastName)
                                    .addComponent(txtEmailId)
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(txtAddress)
                                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtEmailId.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtAddress.setEnabled(true);
        ageSpinner.setEnabled(true);
        btnEdit.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmailId.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String address = txtAddress.getText();
        String spinnerValue = ageSpinner.getValue().toString();
        
        if(spinnerValue.isBlank()) {
           JOptionPane.showMessageDialog(this, "Patient Age is null!");
           return;
        }
        
        if(firstName.isBlank()) {
           JOptionPane.showMessageDialog(this, "First Name can't be null!");
           return;
        }

        if(lastName.isBlank()) {
           JOptionPane.showMessageDialog(this, "Last Name can't be null!");
           return;
        }

        if(phoneNumber.isBlank()) {
           JOptionPane.showMessageDialog(this, "Phone number can't be null!");
           return;
        }
        
        if(!isValidPhoneNumber(phoneNumber)) {
            JOptionPane.showMessageDialog(this, "Phone number is not valid, use format (XXX) XXX-XXXX");
           return;
        }

        if(email.isBlank()) {
           JOptionPane.showMessageDialog(this, "Email ID can't be null!");
           return;
        }

        if(address.isBlank()) {
           JOptionPane.showMessageDialog(this, "Address can't be null!");
           return;
        }
        
        currentAuthenticatedUser.getPerson().setFirstName(firstName);
        currentAuthenticatedUser.getPerson().setLastName(lastName);
        currentAuthenticatedUser.getPerson().setEmail(email);
        currentAuthenticatedUser.getPerson().setPhoneNum(phoneNumber);
        currentAuthenticatedUser.getPerson().setAddress(address);
        currentAuthenticatedUser.getPerson().setAge(Integer.parseInt(spinnerValue));
        
        
         JOptionPane.showMessageDialog(this, "Successfully Updated Personal Information");
              
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtEmailId.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        ageSpinner.setEnabled(false);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        if(userName.isBlank()){
            JOptionPane.showMessageDialog(this, "UserName can't be empty");
            return;
        }
        
        UserAccount user = organization.getOrganizationUserDirectory().findUserAccountByUserName(userName);
        
       if(user.getUsername().equals(userName) && user.getPersonId() != currentUser.getPersonId()) {
           JOptionPane.showMessageDialog(this, "UserName is already taken be empty");
           return;
       }
        
       if(!password.isBlank()) {
            if(!BusinessUtils.isValidPassword(password)) {
                JOptionPane.showMessageDialog(this, "Invalid Password!");
                return;
            }

            try {
                boolean isPasswordUpdated = currentUser.setPasswordHash(password);

                if(!isPasswordUpdated) {
                    JOptionPane.showMessageDialog(this, "You can't use older password!");
                    return;
                }

            } catch (Exception e) {
                System.out.println("Issue in Updating the User Password");
                return;
            }
        }
       currentUser.setUserName(userName);
       
       JOptionPane.showMessageDialog(this, "UserName information saved successfully!");
       
        txtUserName.setEnabled(false);
        txtPassword.setEnabled(false);
        txtPassword.setText("");
        btnSaveUser.setEnabled(false);
        btnEditUser.setEnabled(true);
    }//GEN-LAST:event_btnSaveUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        // TODO add your handling code here:
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnSaveUser.setEnabled(true);
        btnEditUser.setEnabled(false);
    }//GEN-LAST:event_btnEditUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
