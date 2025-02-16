import java.io.PrintStream;
import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Pessoa people = new Pessoa();

        System.out.print("Informe o nome da pessoa: ");
        people.name = readData.nextLine().strip().toLowerCase();

        System.out.print("Informe a idade da pessoa: ");
        people.age = readData.nextInt();

        System.out.print("Informe a profissão da pessoa: ");
        people.profession = readData.next();

        System.out.println(people.getFormatation());
    }
}
