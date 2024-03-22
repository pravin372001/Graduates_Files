package com.zsgs.interviewpanel.login;

import java.util.Scanner;

public class LoginView {
    LoginModel loginModel;
    Scanner scanner = new Scanner(System.in);

    public LoginView() {
        loginModel = new LoginModel(this);
    }

    public void init() {
        System.out.print("Enter the user name: ");
        String userName = scanner.next();
        System.out.print("Enter the password: ");
        String password = scanner.next();
        loginModel.validateUser(userName, password);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
