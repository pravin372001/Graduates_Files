package com.zsgs.interviewpanel.login;

import com.zsgs.interviewpanel.admin.AdminView;
import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.model.Admin;
import com.zsgs.interviewpanel.model.Credentials;
import com.zsgs.interviewpanel.model.EmployeeType;
import com.zsgs.interviewpanel.receptionist.ReceptionistView;

public class LoginModel {
    LoginView loginView;
    Admin admin = InterViewPanelDB.getInstance().getAdmin();

    public LoginModel(LoginView loginView) {
        this.loginView = loginView;
    }

    public void validateUser(String userName, String password) {
        int credentialId = InterViewPanelDB.getInstance().getAdmin().getCredentialId();
        Credentials credentials = InterViewPanelDB.getInstance().getCredentials(credentialId);
        if (credentials.getUsername().equals(userName)) {
            if (credentials.getPassword().equals(password)) {
                EmployeeType employeeType = InterViewPanelDB.getInstance().getEmployeeType(credentialId);
                identitfyLogin(employeeType);
            } else {
                loginView.showMessage("Invalid Password");
            }
        } else {
            loginView.showMessage("Invalid User Name");
        }
    }

    public void identitfyLogin(EmployeeType employeeType) {
        if (employeeType.equals(EmployeeType.Admin)) {
            new AdminView().initiateSetup();
            loginView.showMessage("Login as Admin");
        } else if (employeeType.equals(EmployeeType.Receptionist)) {
            new ReceptionistView();
            loginView.showMessage("Login as Receptionist");
        } else if (employeeType.equals(EmployeeType.HR)) {
            loginView.showMessage("Login as HR");
        }
    }
}
