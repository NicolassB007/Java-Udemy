import java.util.Scanner;
import java.lang.Math;

public class Ex14 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("[ 1 ] - Raiz Quadrada\n");
        System.out.print("[ 2 ] - A metade do valor\n");
        System.out.print("[ 3 ] - 10% do valor\n");
        System.out.print("[ 4 ] - O dobro\n");

        System.out.print("Informe um valor: ");
        double userNumber = readData.nextDouble();

        System.out.print("Qual operação/escolha você quer? ");
        int choice = readData.nextInt();

        readData.close();

        double squareRoot = 0;
        double discount = 0;
        double finalValue = 0;
        switch (choice) {
            case 1:
                squareRoot = Math.sqrt(userNumber);
                System.out.printf("A Raiz Quadrada de %.2f é %.2f", userNumber, squareRoot);
                break;
            case 2:
                System.out.printf("A metade de %.2f é %.2f", userNumber, (userNumber / 2));
                break;
            case 3:
                discount = (double) 10 / 100;
                finalValue = userNumber * discount;
                System.out.printf("10%% de %.2f é %.2f", userNumber, finalValue);
                break;
            case 4:
                System.out.printf("O dobro de %.2f é %.2f", userNumber, (userNumber * 2));
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
    }
}
