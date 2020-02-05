
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library biblioteca = new Library();
        biblioteca.addBook(new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997));
        biblioteca.addBook(new Book("Harry Potter and the chamber of secrets", "J.K.Rowling", 1998));
        biblioteca.addBook(new Book("Harry Potter and the prisioner of Azkaban", "J.K.Rowling", 1999));
        biblioteca.addBook(new Book("ABBABBA","test",1234));
        System.out.println();

        for (Book book : biblioteca.searchByTitle("")) {
            System.out.println(book);
        }
    }
}
