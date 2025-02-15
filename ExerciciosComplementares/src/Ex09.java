import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = readData.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        switch (counter) {
            case 0:
                System.out.println("Informe um número maior que 0!");
                break;
            case 2:
                System.out.printf("%d é PRIMO!", number);
                break;
            default:
                System.out.printf("%d não é PRIMO!", number);
        }
        readData.close();
    }
}
