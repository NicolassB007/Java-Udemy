public class Books {
    String title;
    String author;
    long isbn;
    int numberOfPages;

    Books(String title, String author, int numberOfPages, long isbn) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
    }
}
