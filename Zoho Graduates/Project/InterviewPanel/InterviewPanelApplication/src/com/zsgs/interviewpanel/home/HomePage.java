package com.zsgs.interviewpanel.home;

import java.util.Scanner;

public class HomePage {

    private static HomePage homePage;
    static Scanner scanner = new Scanner(System.in);

    private HomePage() {

    }

    public static HomePage getInstance() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public void adminView() {
        System.out.println("Welcome to the Interview Panel");
        System.out.println("1. Add Receptionist");
        System.out.println("2. Remove Receptionist");
        System.out.println("3. Add HR");
        System.out.println("4. Remove HR");
        System.out.println("5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                  
            default:
                System.out.println("Invalid choice");
        }
    }
}
