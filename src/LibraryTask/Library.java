package LibraryTask;

import java.lang.reflect.Member;
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

    public void removeMember(LibraryMember member) {
        members.remove(member);
    }

    public void removeMember(int id) {
        LibraryMember member = getMember(id);
        if (member != null)
            removeMember(member);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeBook(String title) {
        Book book = getBook(title);
        if (book != null)
            removeBook(book);
    }

    public List<LibraryMember> getMembers() {
        return members;
    }

    public LibraryMember getMember(int id) {
        for (LibraryMember member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        System.out.println("Invalid ID given");
        return null;
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;

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
        Book book = getBook(title);
        if (book != null)
            checkoutBook(member, book);
    }

    public void returnBook(LibraryMember member, String title) {
        Book book = getBook(title);
        if (book == null)
            System.out.println("Invalid title.");
        else {
            if (!book.isCheckedOut()) {
                System.out.println("Book is not checked out");
            } else {
                member.removeBook(book);
                book.returnBook();
            }
        }
    }
}
