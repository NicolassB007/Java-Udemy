import java.util.Scanner;

public class LibrarySistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Books book;
        while (true) {
            System.out.print("Nome do livro: ");
            String bookName = readData.nextLine();

            System.out.print("Autor do livro: ");
            String author = readData.nextLine();

            System.out.print("Quantidade de páginas: ");
            int numberPage = readData.nextInt();
            readData.nextLine();

            System.out.print("ISBN do livro: ");
            int isbn = readData.nextInt();

            book = new Books(bookName, author, numberPage, isbn);
            break;
        }
    }
}
