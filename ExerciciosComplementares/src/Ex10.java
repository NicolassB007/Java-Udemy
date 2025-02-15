import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        int userNumber;
        int randomNumber;
        int tentative = 10;

        System.out.println("Adivinhe de 1 até 100 número sorteado!");
        System.out.print("VOCÊ TEM 10 TENTATIVAS!");
        System.out.println("Sorteando número!");
        Random numbers = new Random();
        randomNumber = numbers.nextInt(101);

        do {
            System.out.print("\nQual é o número? ");
            userNumber = readData.nextInt();

            if (userNumber > randomNumber) {
                System.out.println("O número sorteado é menor");
                System.out.println();
                tentative--;
            }

            else if (userNumber < randomNumber) {
                System.out.println("O número sorteado é maior");
                System.out.println();
                tentative--;
            }

            else {
                System.out.println("PARABÉNS, VOCÊ ACERTOU!");
                System.out.printf("MEU NÚMERO ERA %d\n", randomNumber);
                System.out.printf("RESTOU %d TENTATIVAS\n", tentative);
                break;
            }

            System.out.printf("TENTATIVAS RESTANTE -> %d\n", tentative);

        } while (tentative != 0);
        if ((userNumber != randomNumber) && (tentative == 0)) {
            System.out.println("VOCÊ NÃO CONSEGUIU ACERTAR");
            System.out.printf("MEU NÚMERO ERA %d", randomNumber);
        }
        readData.close();
    }
}
