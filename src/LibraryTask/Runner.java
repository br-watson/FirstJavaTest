package LibraryTask;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();
        library.addMember(new LibraryMember("Brad", 23));
        library.addMember(new LibraryMember("Jordan", 65));

        System.out.println(library.getMembers());

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("War and Peace", "Leo Tolstoy", 1869));
        library.addBook(new Book("The Catcher in the Rye", "J. D. Salinger", 1951));

        System.out.println(library.getBooks());
        System.out.println(library.getBook("The Catcher in the Rye"));
        System.out.println(library.getMember(1));

        library.checkoutBook(library.getMember(1), "The Catcher in the Rye");
        System.out.println(library.getMember(1));
        System.out.println(library.getMember(1).getBooks());
        library.returnBook(library.getMember(1), "The Catcher in the Rye");
        System.out.println(library.getMember(1).getBooks());

    }
}
