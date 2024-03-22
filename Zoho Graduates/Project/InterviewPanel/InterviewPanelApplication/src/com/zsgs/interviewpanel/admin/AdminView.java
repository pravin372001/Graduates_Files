package com.zsgs.interviewpanel.admin;

import com.zsgs.interviewpanel.home.HomePage;

import java.util.Scanner;

public class AdminView {
    AdminModel adminModel;
    Scanner scanner = new Scanner(System.in);
    public AdminView() {
        adminModel = new AdminModel(this);
    }

    public void initiateSetup() {
        if (adminModel.isDefaultPassword()) {
            System.out.println("Initiate Setup");
            System.out.print("Enter the new password : ");
            String password = scanner.next();
            System.out.print("Enter the email id : ");
            String emailId = scanner.next();
            System.out.print("Enter the phone number : ");
            String phoneNumber = scanner.next();
            adminModel.initiateSetup(password, emailId, phoneNumber);
        } else {
            new HomePage().init();
        }
    }
}
