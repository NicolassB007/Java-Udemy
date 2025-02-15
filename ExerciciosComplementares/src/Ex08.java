import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int value = readData.nextInt();

        int counter = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.printf("%d é PRIMO", value);
        }
        else {
            System.out.printf("%d não é PRIMO", value);
        }
        readData.close();
    }
}
