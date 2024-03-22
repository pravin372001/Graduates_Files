package com.zsgs.interviewpanel.login;

import com.zsgs.interviewpanel.data.InterViewPanelDB;
import com.zsgs.interviewpanel.model.Admin;
import com.zsgs.interviewpanel.model.Credentials;

public class LoginModel {
    LoginView loginView;
    Admin admin = InterViewPanelDB.getInstance().getAdmin();
    Credentials credentials = InterViewPanelDB.getInstance().getCredentials(admin.getCredentials());

    public LoginModel(LoginView loginView) {
        this.loginView = loginView;
    }

    public void validateUser(String userName, String password) {
        if (isValidUser(userName)) {
            if (isValidPassword(password)) {
                loginView.showMessage("Login Successful");
            } else {
                loginView.showMessage("Invalid Password");
            }
        } else {
            loginView.showMessage("Invalid User Name");
        }
    }

    private boolean isValidUser(String userName) {
        return userName.equals(credentials.getUsername());
    }

    private boolean isValidPassword(String password) {
        return password.equals(credentials.getPassword());
    }
}
