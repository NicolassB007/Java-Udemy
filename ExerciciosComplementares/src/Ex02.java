import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        var firstNumber = readData.nextInt();

        System.out.print("Digite o segundo valor: ");
        var secondNumber = readData.nextInt();

        int addition = 0, subtraction = 0, multiplication = 1;
        double division;
        addition = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = (double) firstNumber / secondNumber;

        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, addition);
        System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, subtraction);
        System.out.printf("%d * %d = %d\n", firstNumber, secondNumber, multiplication);
        System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, division);
    }
}
