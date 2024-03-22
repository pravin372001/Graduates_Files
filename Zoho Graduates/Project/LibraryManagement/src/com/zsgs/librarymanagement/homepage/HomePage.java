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
            System.out.println("<-------- Menu ------->");
            System.out
                    .println(
                            "1. Managae Books \n2. Manage Members \n3. Issue Book \n4. Return Book \n5. Issue History \n6. Issued Books \n7. Overdue Books \n8. Logout  \n"
                                    +
                                    "9.Exit "
                                    + //
                                    "Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    int bookChoice;
                    boolean flag = true;
                    while (flag) {
                        System.out.println("<-------- Book Menu ------->");
                        System.out.print(
                                "\n1. Add Book \n2. Show All Books \n3. Search Book by Id \n4. Search Book by Name \n5. Update Book count \n6. Return to main menu \n\nEnter your choice: ");
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
                        System.out.println("<-------- Member Menu ------->");
                        System.out.println(
                                "\n1. Add Member \n2. Show All Members \n3. Delete Member by Id \n4. Return to main menu \n\nEnter your choice: ");
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
