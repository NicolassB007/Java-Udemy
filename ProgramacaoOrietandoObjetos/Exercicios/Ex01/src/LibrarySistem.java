import java.util.Scanner;

public class LibrarySistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Books book;
        Library library = new Library();

        // While for storage the books
        while (true) {
            System.out.print("Nome do livro: ");
            String bookName = readData.nextLine();

            System.out.print("Autor do livro: ");
            String author = readData.nextLine();

            System.out.print("Quantidade de páginas: ");
            int numberPage = readData.nextInt();
            readData.nextLine();

            System.out.print("ISBN do livro: ");
            String isbnString = readData.nextLine();

            long isbn;
            if (isbnString.length() == 13){
                isbn = Long.parseLong(isbnString);
                book = new Books(bookName, author, numberPage, isbn);
            }
            else  {
                System.out.println("ISBN inválido");
                System.out.println("Livro não foi cadastrado");
                continue;
            }

            library.addBooks(book);

            System.out.println("Será adicionado mais itens? ");
            System.out.print("s/n: ");
            String choice = readData.nextLine().toLowerCase();

            if (!choice.startsWith("s")) {
                System.out.println("Operação Finalizada.");
                System.out.println("Obrigado por utilizar nosso Sistema!\n");
                break;
            }
        }

        System.out.println("Você quer retirar algum livro?");
        System.out.print("s/n: ");
        String choice = readData.nextLine().toLowerCase();

        int counter = 0;

        while ((choice.startsWith("s")) && (counter < 1)) {
            System.out.println("TÍTULOS DOS LIVROS PRESENTES.");
            for (Books booksTitle: library.booksList) {
                System.out.println(booksTitle.title);
            }

            System.out.println("Informe o *Índice* do livro para a retirada.");
            System.out.println("Os *Índices* começam em 0!");
            System.out.print("Índice: ");
            int index = readData.nextInt();

            for (int i = 0; i < library.booksList.size(); i++) {
                if (i == index) {
                    System.out.println("Livro retirado: " + library.booksList.get(i).title);
                    break;
                }
            }

            library.lendBook(index);
            counter++;
        }

        System.out.println("\nTÍTULOS DOS LIVROS PRESENTES.");
        for (Books booksTitle: library.booksList) {
            System.out.println(booksTitle.title);
        }
        System.out.println("OBRIGADO POR UTILIZAR NOSSO SISTEMA!");
    }
}
