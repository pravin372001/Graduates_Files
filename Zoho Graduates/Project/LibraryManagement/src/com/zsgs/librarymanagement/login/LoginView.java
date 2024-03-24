package com.zsgs.librarymanagement.login;

import java.io.Console;
import java.util.Scanner;

import com.zsgs.librarymanagement.LibraryManagement;
import com.zsgs.librarymanagement.admin.AdminView;

public class LoginView {
    LoginModel loginModel;

    static Scanner scanner = new Scanner(System.in);
    static Console console = System.console();

    public LoginView() {
        loginModel = new LoginModel(this);
    }

    public boolean init() {
        System.out.println("Login Page");
        System.out.print("Enter the user name: ");
        String userName = console.readLine();
        System.out.print("Enter the password: ");
        char[] password = console.readPassword();
        return loginModel.validateUser(userName, new String(password));
    }

    public void onSuccess() {
        System.out.flush();
        System.out.println("\n\nLogin successful...\n\n ---- welcome to " + LibraryManagement.getInstance().getAppName()
                + " - v" + LibraryManagement.getInstance().getAppVersion() + "----");
        AdminView adminView = new AdminView();
        adminView.initiateSetup();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
