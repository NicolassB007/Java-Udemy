import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    final ArrayList<Books> booksList = new ArrayList<>();

    void addBooks(Books book) {
        this.booksList.add(new Books(book.title, book.author, book.numberOfPages, book.idIdentificationBook));
    }
}
