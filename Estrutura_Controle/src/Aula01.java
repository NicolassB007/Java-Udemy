import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe a média: ");
        var media = readData.nextDouble();

        if ((media <= 10) && (media >= 7)) {
            System.out.println("Aluno aprovado!");
        }

        if ((media >= 4.5) && (media < 7)) {
            System.out.println("Recuperação");
        }

        if ((media <= 4.5) && (media >= 0)) {
            System.out.println("Reprovado");
        }
    }
}