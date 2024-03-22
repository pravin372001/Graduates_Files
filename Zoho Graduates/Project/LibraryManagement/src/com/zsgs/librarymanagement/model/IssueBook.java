package com.zsgs.librarymanagement.model;

import java.util.Date;

public class IssueBook {
    private int issueId;
    private static int issueIdCount;
    private int userId;
    private int bookId;
    private Date issueDate;
    private Date returnDate;
    private static int overDueDays = 10;

    public IssueBook(int userId, int bookId) {
        this.issueId = ++issueIdCount;
        this.userId = userId;
        this.bookId = bookId;
        this.issueDate = new Date();
        this.returnDate = null;
    }

    public static int getOverDueDays() {
        return overDueDays;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
