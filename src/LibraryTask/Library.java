package LibraryTask;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private final List<LibraryMember> members;
    private final List<Book> books;

    public Library() {
        members = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<LibraryMember> getMembers() {
        return members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void checkoutBook(LibraryMember member, Book book) {
        if (book.isCheckedOut()) {
            System.out.println("Book is already checked out");
        } else {
            member.addBook(book);
            book.checkoutBook();
        }
    }

    public void checkoutBook(LibraryMember member, String title) {
        Book book = null;
        for (Book book1 : books) {
            if (book1.getTitle().equals(title))
                book = book1;
        }
        if (book != null) {
            checkoutBook(member, book);
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (!book.isCheckedOut()) {
            System.out.println("Book is not checked out");
        } else {
            member.removeBook(book);
            book.returnBook();
        }
    }
}
