package com.zsgs.interviewpanel.receptionist;

import java.util.Scanner;

public class ReceptionistView {

    private ReceptionistModel receptionistModel;
    static Scanner scanner = new Scanner(System.in);

    public ReceptionistView() {
        this.receptionistModel = new ReceptionistModel(this);
    }

    public void addReceptionist() {
        System.out.println("Add Receptionist");
        System.out.print("Enter the Receptionist name: ");
        String receptionistName = scanner.next();
        System.out.print("Enter the Receptionist email: ");
        String receptionistEmail = scanner.next();
        System.out.print("Enter the Receptionist phone: ");
        String receptionistPhone = scanner.next();
        receptionistModel.addReceptionist(receptionistName, receptionistEmail, receptionistPhone);

    }

    public void showMessage(String string) {
        System.out.println(string);
    }
}
