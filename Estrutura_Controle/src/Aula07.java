import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        String value = "";

        do {
            System.out.print("Você precisa falar as palavras mágicas");
            System.out.print("Quer sair? ");
            value = readData.nextLine();
        } while (!value.equalsIgnoreCase("sair"));
        readData.close();
    }
}
