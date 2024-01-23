/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SignIn;

import UserInterface.CSREnterprise.WorkArea.CSRAdmin.CSRAdminWorkArea;
import UserInterface.CSREnterprise.WorkArea.CSREmployer.CSREmployerWorkArea;
import UserInterface.ClinicEnterprise.WorkArea.ClinicDoctor.ClinicDoctorWorkArea;
import UserInterface.ClinicEnterprise.WorkArea.ClinicStaff.ClinicStaffWorkArea;
import UserInterface.NGOEnterprise.WorkArea.NGOAdmin.NGOAdminJPanel;
import UserInterface.NGOEnterprise.WorkArea.NGOVolunteer.NGOVolunteerJPanel;
import UserInterface.ShelterEnterprise.WorkArea.ShelterNurse.ShelterNurseWorkArea;
import UserInterface.ShelterEnterprise.WorkArea.ShelterSupervisor.ShelterSupervisorWorkArea;
import UserInterface.ShelterEnterprise.WorkArea.ShelterTrainer.ShelterTrainerWorkArea;
import UserInterface.SignUp.SignUpJPanel;
import UserInterface.WorkAreas.PatientRole.PatientWorkAreaJPanel;
import business.Business;
import business.CSREnterprise.CSRAdministration.CSRAdminProfile;
import business.CSREnterprise.CSREmployer.CSREmployerProfile;
import business.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.CSREnterprise;
import business.Enterprise.ClinicEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.NGOEnterprise;
import business.Enterprise.ShelterEnterprise;
import business.NGOEnterprise.NGOAdministration.NGOSupervisorProfile;
import business.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import business.Organization.CSRAdministrationOrganization;
import business.Organization.CSREmployerOrganization;
import business.Organization.ClinicAdministrationOrganization;
import business.Organization.ClinicDoctorOrganization;
import business.Organization.NGOAdministrationOrganization;
import business.Organization.NGOVolunteerOrganization;
import business.Organization.Organization;
import business.Organization.ShelterAdministrationOrganization;
import business.Organization.ShelterNurseStationOrganization;
import business.Organization.ShelterUpSkillOrganization;
import business.Patient.BloodGroup;
import business.Patient.Issue;
import business.Patient.PatientDirectory;
import business.Patient.PatientProfile;
import business.ShelterEnterprise.ShelterAdministration.ShelterSupervisorProfile;
import business.ShelterEnterprise.ShelterNurseStation.ShelterNurseProfile;
import business.ShelterEnterprise.ShelterUpSkillDept.ShelterTrainerProfile;
import business.person.Ethnicity;
import business.person.Gender;
import business.person.Person;
import business.profile.Profile;
import business.userAccounts.UserAccount;
import business.userAccounts.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.BusinessUtils;
import utils.Neighbourhood;

/**
 *
 * @author nagal
 */
public class SignInJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignInJPanel
     */
    private Business business;
    private JPanel UserMainContainer;
    public SignInJPanel(JPanel UserMainContainer, Business business) {
        
        initComponents();
        
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        
        populateInitialData();
    }
    
    public void populateInitialData(){
        UserAccountDirectory masterPatientList = business.getMasterPatientList();
        
        //Patient 1
        Person p = new Person();
        p.setFirstName("Patient 1");
        p.setLastName("John");
        p.setGender(Gender.FEMALE);
        p.setEthnicity(Ethnicity.ASIAN);
        p.setAge(19);
        p.setPhoneNum("1234567891");
        p.setEmail("smith.john@gmail.com");
        p.setAddress("150, Mass Ave");
        
        PatientProfile patient = new PatientProfile(p);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient.setNeighbourhood(Neighbourhood.FENWAY_KENMORE);
        patient.setPrimaryIssue(Issue.ANXIETY_DISORDERS);
        patient.setSecondaryIssue(Issue.DENTAL_PROBLEMS);
        patient.setBloodGroup(BloodGroup.O_NEGATIVE);
        
        UserAccount patientUser = masterPatientList.createUserAccount(patient, "smith", "pass@1", true); 
        
        Person p2 = new Person();
        p2.setFirstName("Patient 2");
        p2.setLastName("Varun");
        p2.setGender(Gender.MALE);
        p2.setEthnicity(Ethnicity.MIDDLE_EASTERN_NORTH_AFRICAN);
        p2.setAge(22);
        p2.setPhoneNum("1234567891");
        p2.setEmail("smith.john@gmail.com");
        p2.setAddress("150, Mass Ave");
        
        PatientProfile patient2 = new PatientProfile(p2);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient2.setNeighbourhood(Neighbourhood.BACK_BAY);
        patient2.setPrimaryIssue(Issue.DENTAL_PROBLEMS);
        patient2.setSecondaryIssue(Issue.DENTAL_PROBLEMS);
         patient2.setBloodGroup(BloodGroup.AB_POSITIVE);
        
        UserAccount patientUse2 = masterPatientList.createUserAccount(patient2, "smith", "pass@1", true); 
        
        Person p3 = new Person();
        p3.setFirstName("Patient 3");
        p3.setLastName("Cruise");
        p3.setGender(Gender.FEMALE);
        p3.setEthnicity(Ethnicity.NATIVE_AMERICAN);
        p3.setAge(44);
        p3.setPhoneNum("1234567891");
        p3.setEmail("mary.john@gmail.com");
        p3.setAddress("150, Mass Ave");
        
        PatientProfile patient3 = new PatientProfile(p3);
        
        //Need to create the NGO Volunteer, and then add the NGO volunteer who onboarded the patient
        patient3.setNeighbourhood(Neighbourhood.BACK_BAY);
        patient3.setPrimaryIssue(Issue.ANXIETY_DISORDERS);
        patient3.setSecondaryIssue(Issue.DISCRIMINATION_STIGMATIZATION);
        patient3.setBloodGroup(BloodGroup.B_POSITIVE);
        
        UserAccount patientUse3 = masterPatientList.createUserAccount(patient3, "smith", "pass@1", true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPanelTitle = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtUserNameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        labelPanelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelPanelTitle.setText("Welcome to Transformation Inc");

        labelUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelUserName.setText("User Name:");

        labelPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        labelPassword.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtUserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSignIn)
                                .addGap(46, 46, 46)
                                .addComponent(btnSignUp)))
                        .addGap(51, 51, 51))
                    .addComponent(labelPanelTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(labelPanelTitle)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName)
                    .addComponent(txtUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnSignUp))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:

        String userName = txtUserNameField.getText();
        String password = txtPassword.getText();

        if(userName.isBlank()) {
            JOptionPane.showMessageDialog(this, "UserName can't be empty");
            return;
        }

        if(password.isBlank()){
            JOptionPane.showMessageDialog(this, "Password can't be empty");
            return;
        }

        if(!BusinessUtils.isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Entered Password is not Valid!");
            return;
        }

        String encryptedPassword = BusinessUtils.encryptPassword(password);

        if(encryptedPassword == null) {
            JOptionPane.showMessageDialog(this, "There was an error in encrypting the password");
            return;
        }

        UserAccount userAccount = null;
        Enterprise supportingEnterprise = null;
        Organization supportingOrganization = null;
        
        UserAccountDirectory uad = business.getMasterPatientList();
        userAccount = uad.AuthenticateUser(userName, password);
        
        if(userAccount == null){
            for(Enterprise enterprise: business.getEnterpriseCatalog().getEnterpriseList()){
                for(Organization organization: enterprise.getOrganizationCatalog().getOrganizationList()){
                    userAccount = organization.getOrganizationUserDirectory().AuthenticateUser(userName, password);
//                    System.out.println("UserAccount for " + organization.getName() + " : " + userAccount);
                    if(userAccount != null){
                        supportingEnterprise = enterprise;
                        supportingOrganization = organization;
                        break;
                    }

                }
                if(userAccount != null){
                    break;
                }
            }
        }
        
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials: Invalid Credentials\nThe username or password you entered is incorrect.");
            return;
        }
        
        if(!userAccount.getIsUserEnabled()) {
            JOptionPane.showMessageDialog(null, "Your User Profile is not yet enabled, Please wait for Admin to process request!");
            return;
        }
               
        else {
            Profile profile = userAccount.getAssociatedProfile();

            if(profile instanceof PatientProfile) {
                PatientProfile patient = (PatientProfile) profile;
                PatientWorkAreaJPanel patientWorkArea = new PatientWorkAreaJPanel(UserMainContainer, business, patient, userAccount);
                UserMainContainer.add("PatientWorkArea", patientWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof NGOVolunteerProfile) {
                NGOVolunteerProfile ngoVolunteer = (NGOVolunteerProfile) profile;
                NGOVolunteerJPanel ngoVolunteerWorkArea = new NGOVolunteerJPanel(UserMainContainer, business, (NGOEnterprise) supportingEnterprise, (NGOVolunteerOrganization) supportingOrganization, ngoVolunteer, userAccount);
                UserMainContainer.add("NGOVolunteerWorkArea", ngoVolunteerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof NGOSupervisorProfile) {
                NGOSupervisorProfile ngoSupervisor = (NGOSupervisorProfile) profile;
                NGOAdminJPanel ngoSupervisorWorkArea = new NGOAdminJPanel(UserMainContainer, business, (NGOEnterprise) supportingEnterprise, (NGOAdministrationOrganization) supportingOrganization, ngoSupervisor, userAccount);
                UserMainContainer.add("NGOSupervisorWorkArea", ngoSupervisorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterSupervisorProfile) {
                ShelterSupervisorProfile shelterSupervisor = (ShelterSupervisorProfile) profile;
                ShelterSupervisorWorkArea shelterSupervisorWorkArea = new ShelterSupervisorWorkArea(UserMainContainer, business, (ShelterEnterprise) supportingEnterprise, (ShelterAdministrationOrganization) supportingOrganization, shelterSupervisor, userAccount);
                UserMainContainer.add("ShelterSupervisorWorkArea", shelterSupervisorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterNurseProfile) {
                ShelterNurseProfile shelterNurse = (ShelterNurseProfile) profile;
                ShelterNurseWorkArea shelterNurseWorkArea = new ShelterNurseWorkArea(UserMainContainer, business, (ShelterEnterprise) supportingEnterprise, (ShelterNurseStationOrganization) supportingOrganization, shelterNurse, userAccount);
                UserMainContainer.add("ShelterNurseWorkArea", shelterNurseWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ShelterTrainerProfile) {
                ShelterTrainerProfile shelterTrainer = (ShelterTrainerProfile) profile;
                ShelterTrainerWorkArea shelterTrainerWorkArea = new ShelterTrainerWorkArea(UserMainContainer, business, (ShelterEnterprise) supportingEnterprise, (ShelterUpSkillOrganization) supportingOrganization, shelterTrainer, userAccount);
                UserMainContainer.add("ShelterTrainerWorkArea", shelterTrainerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ClinicStaffProfile) {
                ClinicStaffProfile clinicStaff = (ClinicStaffProfile) profile;
                ClinicStaffWorkArea clinicStaffWorkArea = new ClinicStaffWorkArea(UserMainContainer, business, (ClinicEnterprise) supportingEnterprise, (ClinicAdministrationOrganization) supportingOrganization, clinicStaff, userAccount);
                UserMainContainer.add("ClinicStaffWorkArea", clinicStaffWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof ClinicDoctorProfile) {
                ClinicDoctorProfile clinicDoctor = (ClinicDoctorProfile) profile;
                ClinicDoctorWorkArea clinicDoctorWorkArea = new ClinicDoctorWorkArea(UserMainContainer, business, (ClinicEnterprise) supportingEnterprise, (ClinicDoctorOrganization) supportingOrganization, clinicDoctor, userAccount);
                UserMainContainer.add("ClinicDoctorWorkArea", clinicDoctorWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof CSRAdminProfile) {
                CSRAdminProfile csrAdmin = (CSRAdminProfile) profile;
                CSRAdminWorkArea csrAdminWorkArea = new CSRAdminWorkArea(UserMainContainer, business, (CSREnterprise) supportingEnterprise, (CSRAdministrationOrganization) supportingOrganization, csrAdmin, userAccount);
                UserMainContainer.add("CSRAdminWorkArea", csrAdminWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else if(profile instanceof CSREmployerProfile) {
                CSREmployerProfile csrEmployer = (CSREmployerProfile) profile;
                CSREmployerWorkArea csrEmployerWorkArea = new CSREmployerWorkArea(UserMainContainer, business, (CSREnterprise) supportingEnterprise, (CSREmployerOrganization) supportingOrganization, csrEmployer, userAccount);
                UserMainContainer.add("CSREmployerWorkArea", csrEmployerWorkArea);
                CardLayout layout = (CardLayout) UserMainContainer.getLayout();
                layout.next(UserMainContainer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Selected wrong Role");
            }
        }

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignUpJPanel signUpPanel = new SignUpJPanel(UserMainContainer, business);
        UserMainContainer.add("SignUpJPanel", signUpPanel);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.next(UserMainContainer);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtUserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel labelPanelTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserNameField;
    // End of variables declaration//GEN-END:variables
}
