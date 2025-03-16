import java.util.ArrayList;

public class Library {
    final ArrayList<Books> booksList = new ArrayList<>();
    Books books;

    void addBooks(Books book) {
        this.booksList.add(new Books(book.title, book.author, book.numberOfPages, book.isbn));
    }

    void lendBook(int index) {
        for (int i = 0; i < booksList.size(); i++) {
            if (index < booksList.size()) {
                if (index == i) {
                    booksList.remove(index);
                }
            }
        }
    }
}
