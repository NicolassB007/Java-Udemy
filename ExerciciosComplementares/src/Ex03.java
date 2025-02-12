import java.util.Scanner;
import java.lang.Math;

public class Ex03 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        var number = readData.nextInt();

        var numberSquare = Math.pow(number, 2);

        System.out.printf("%d x %d = %.2f", number, number, numberSquare);
    }
}

