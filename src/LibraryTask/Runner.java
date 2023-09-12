package LibraryTask;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();
        library.addMember(new LibraryMember("Brad", 23));
        library.addMember(new LibraryMember("Jordan", 65));

    }
}
