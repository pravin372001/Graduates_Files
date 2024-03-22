package com.zsgs.librarymanagement.homepage;

import com.zsgs.librarymanagement.issuebook.IssueBookView;
import com.zsgs.librarymanagement.login.LoginView;
import com.zsgs.librarymanagement.managebook.ManageBookView;
import com.zsgs.librarymanagement.user.UserView;

import java.util.Scanner;

public class HomePage {
    Scanner scanner = new Scanner(System.in);
    private static HomePage homePage;

    private HomePage() {

    }

    public static HomePage getInstance() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public void init() {
        ManageBookView manageBookView = new ManageBookView();
        UserView userView = new UserView();
        IssueBookView issueBookView = new IssueBookView();
        int choice;
        while (true) {
            System.out.print(
                    "------------------------------------------------------\n" +
                            "| Option |              Main Menu                    |\n" +
                            "------------------------------------------------------\n" +
                            "|   1    | Manage Books                              |\n" +
                            "|   2    | Manage Members                            |\n" +
                            "|   3    | Issue Book                                |\n" +
                            "|   4    | Return Book                               |\n" +
                            "|   5    | Issue History                             |\n" +
                            "|   6    | Issued Books                              |\n" +
                            "|   7    | Overdue Books                             |\n" +
                            "|   8    | Logout                                    |\n" +
                            "|   9    | Exit                                      |\n" +
                            "------------------------------------------------------\n" +
                            "Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    int bookChoice;
                    boolean flag = true;
                    while (flag) {
                        System.out.println("<-------- Book Menu ------->");
                        System.out.print(
                                "------------------------------------------------------\n" +
                                        "| Option |              Book Menu                    |\n" +
                                        "------------------------------------------------------\n" +
                                        "|   1    | Add Book                                  |\n" +
                                        "|   2    | Show All Books                            |\n" +
                                        "|   3    | Search Book by Id                         |\n" +
                                        "|   4    | Search Book by Name                       |\n" +
                                        "|   5    | Update Book count                         |\n" +
                                        "|   6    | Return to main menu                       |\n" +
                                        "------------------------------------------------------\n" +
                                        "Enter your choice: ");
                        bookChoice = scanner.nextInt();
                        switch (bookChoice) {
                            case 1:
                                manageBookView.initAdd();
                                break;

                            case 2:
                                manageBookView.showAllBooks();
                                break;

                            case 3:
                                manageBookView.getBookById();
                                break;

                            case 4:
                                manageBookView.getBooksByName();
                                break;

                            case 5:
                                manageBookView.updateBookCount();
                                break;

                            case 6:
                                flag = false;
                                break;

                            default:
                                System.out.println("Enter valid choice");
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    int bookChoice;
                    boolean flag = true;
                    while (flag) {
                        System.out.print(
                                "------------------------------------------------------\n" +
                                        "| Option |              Member Menu                  |\n" +
                                        "------------------------------------------------------\n" +
                                        "|   1    | Add Member                                |\n" +
                                        "|   2    | Show All Members                          |\n" +
                                        "|   3    | Delete Member by Id                       |\n" +
                                        "|   4    | Return to main menu                       |\n" +
                                        "------------------------------------------------------\n" +
                                        "Enter your choice: ");
                        bookChoice = scanner.nextInt();
                        switch (bookChoice) {
                            case 1:
                                userView.addNewUser();
                                break;

                            case 2:
                                userView.showAllUsers();
                                break;

                            case 3:
                                userView.removeUserById();
                                break;

                            case 4:
                                flag = false;
                                break;

                            default:
                                System.out.println("Enter valid choice");
                                break;
                        }
                    }
                    break;
                }

                case 3: {
                    issueBookView.issueBook();
                    break;
                }

                case 4:
                    issueBookView.returnBook();
                    break;

                case 5:
                    issueBookView.issueHistory();
                    break;

                case 6: {
                    issueBookView.issuedBooks();
                    break;
                }

                case 7: {
                    issueBookView.showAllOverDues();
                    break;
                }

                case 8: {
                    new LoginView().init();
                    return;
                }

                case 9: {
                    System.exit(0);
                }
            }
        }
    }
}
