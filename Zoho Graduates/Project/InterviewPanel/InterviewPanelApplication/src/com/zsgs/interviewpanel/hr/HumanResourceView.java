package com.zsgs.interviewpanel.hr;

import java.util.Scanner;

import com.zsgs.interviewpanel.validator.Validator;

public class HumanResourceView {
    private HumanResourceModel humanResourceModel;
    static Scanner scanner = new Scanner(System.in);

    public HumanResourceView() {
        this.humanResourceModel = new HumanResourceModel(this);
    }

    public void addHumanResource() {
        String name;
        String email;
        String phone;
        String address;
        String password;
        System.out.println("Add New Human Resource");
        do {
            System.out.print("Enter the name : ");
            name = scanner.next();
        } while (!Validator.validateName(name));
        do {
            System.out.print("Enter the email id : ");
            email = scanner.next();
        } while (!Validator.validateEmail(email));
        do {
            System.out.print("Enter the phone number : ");
            phone = scanner.next();
        } while (!Validator.validatePhoneNo(phone));
        System.out.print("Enter the address : ");
        address = scanner.next();
        do {
            System.out.print("Enter the password : ");
            password = scanner.next();
        } while (!Validator.validatePassword(password));
        humanResourceModel.addHumanResource(name, email, phone, address, password);
    }
}
