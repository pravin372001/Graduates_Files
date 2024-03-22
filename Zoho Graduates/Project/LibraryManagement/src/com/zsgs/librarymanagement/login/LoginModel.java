package com.zsgs.librarymanagement.login;

import com.zsgs.librarymanagement.Librarydatabase.LibraryDatabase;
import com.zsgs.librarymanagement.model.Admin;
import com.zsgs.librarymanagement.validator.Validator;

public class LoginModel {
    LoginView loginView;
    Admin admin = LibraryDatabase.getInstance().getAdmin();

    LoginModel(LoginView loginView) {
        this.loginView = loginView;
    }

    private boolean validatePass(String passWord) {
        return Validator.validatePassword(passWord);
    }

    public void validateUser(String userName, String password) {
        if (!validatePass(password)) {
            loginView.showMessage("Invalid Format of Password");
            loginView.init();
        }
        if (isValidUser(userName)) {
            if (isValidPassword(password)) {
                loginView.onSuccess();
            } else {
                loginView.showMessage("Invalid Password");
            }
        } else {
            loginView.showMessage("Invalid User Name");
        }
    }

    private boolean isValidUser(String userName) {
        return userName.equals(admin.getCredential().getUserName());
    }

    private boolean isValidPassword(String password) {
        return password.equals(admin.getCredential().getPassword());
    }
}
