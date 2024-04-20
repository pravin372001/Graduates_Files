package library.transactions;

import java.time.LocalDateTime;

import library.book.Book;
import library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private LocalDateTime dateIssued;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.dateIssued = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Issued '" + book + "' to " + member + " on " + dateIssued;
    }
}
