package LibraryTask;

import java.util.List;
import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int age;
    private final int id;
    private static int count;
    private final List<Book> books;


    public LibraryMember(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = count;
        count++;
        books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getBooks() {
        return books.toString();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}
