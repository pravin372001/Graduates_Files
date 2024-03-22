package com.zsgs.librarymanagement.issuebook;

import java.util.Scanner;

public class IssueBookView {
    private IssueBookModel issueBookModel;
    Scanner scanner = new Scanner(System.in);

    public IssueBookView() {
        issueBookModel = new IssueBookModel(this);
    }

    public void issueBook() {
        System.out.println("\n\nIssue Book\n\n");
        System.out.print("Enter the user id : ");
        int userId = scanner.nextInt();
        System.out.print("Enter the book id : ");
        int bookId = scanner.nextInt();
        issueBookModel.issueBook(userId, bookId);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void returnBook() {
        issuedBooks();
        System.out.println("\n\nReturn Book\n\n");
        System.out.print("Enter the Issue Id :");
        int issueId = scanner.nextInt();
        issueBookModel.returnBook(issueId);
    }

    public void showAllOverDues() {
        issueBookModel.showAllOverDues();
    }

    public void issueHistory() {
        issueBookModel.issueHistory();
    }

    public void issuedBooks() {
        issueBookModel.issuedBooks();
    }
}
