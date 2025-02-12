import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        var note = readData.nextDouble();

        readData.close();

        if ((note > 10) || (note < 0)) {
            System.out.println("Nota inválida");
        }

        else if (note >= 8.1){
            System.out.println("Conceito A");
        }

        else if (note >= 6.1) {
            System.out.println("Conceito B");
        }

        else if (note >= 4.1) {
            System.out.println("Conceito C");
        }

        else if (note >= 2.1) {
            System.out.println("Conceito D");
        }

        else {
            System.out.println("Sem nota");
        }
    }
}
