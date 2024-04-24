package library;

import library.book.Book;
import library.members.Member;
import library.members.RegularMember;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Member member = new RegularMember("John Doe", "1234567890");
        Transaction transaction = new Transaction(book, member);
        System.out.println(transaction);
    }
}
