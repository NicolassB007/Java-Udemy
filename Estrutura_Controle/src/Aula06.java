import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        String string = "";

        var number = 0;

        while (!string.equalsIgnoreCase("sair")) {
            System.out.print("Informe um valor: ");
            number = readData.nextInt();

            System.out.print("Você diz? ");
            readData.nextLine();
            string = readData.nextLine();

            System.out.println(string);
        }

        readData.close();
    }
}
