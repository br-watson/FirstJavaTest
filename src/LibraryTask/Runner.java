package LibraryTask;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();
        library.addMember(new LibraryMember("Brad", 23));
        library.addMember(new LibraryMember("Jordan", 65));

        System.out.println(library.getMembers());

        library.addBook(new Book("Book 1", "Author 1", 1925));
        library.addBook(new Book("Book 2", "Author 2", 1869));
        library.addBook(new Book("Book 3", "Author 3", 1951));

        System.out.println(library.getBooks());
        System.out.println(library.getBook("Book 3"));
        System.out.println(library.getMember(1));

        library.checkoutBook(library.getMember(1), "Book 3");
        System.out.println(library.getMember(1));
        System.out.println(library.getMember(1).getBooks());
        library.returnBook(library.getMember(1), "Book 3");
        System.out.println(library.getMember(1).getBooks());

    }
}
