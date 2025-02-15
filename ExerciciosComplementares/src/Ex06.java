import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        var readData = new Scanner(System.in);

        int value;
        boolean condition, isPair;
        /*do {

            System.out.print("Informe um valor: ");
            value = readData.nextInt();
            condition = ((value >= 0) && (value <= 10));
            isPair = (value % 2 == 0);

            if (isPair) {
                System.out.printf("O valor %d é PAR\n", value);
            }
            else {
                System.out.printf("O valor %d é ÍMPAR\n", value);
            }

        } while (condition);*/
        while (true) {
            System.out.print("Informe um valor: ");
            value = readData.nextInt();
            condition = ((value >= 0) && (value <= 10));
            isPair = (value % 2 == 0);

            if (condition)  {
                if (isPair) {
                    System.out.printf("O valor %d é PAR\n", value);
                }
                else {
                    System.out.printf("O valor %d é ÍMPAR\n", value);
                }
            }
            else {
                break;
            }
        }
        readData.close();
    }
}
