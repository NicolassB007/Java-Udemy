import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        var number = readData.nextInt();

        System.out.print("Digite o segundo valor: ");
        var secondNumber = readData.nextInt();

        System.out.print("Digite o terceiro valor: ");
        var thirdNumber = readData.nextInt();

        var result = (number + secondNumber) * thirdNumber;

        System.out.printf("O resultado de (%d + %d) x %d = %d", number, secondNumber, thirdNumber, result);

    }
}