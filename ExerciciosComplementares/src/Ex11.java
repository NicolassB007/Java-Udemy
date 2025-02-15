import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        var userNumbersString = "";
        var userNumbersDouble = 0.0;
        var addiction = 0.0;

        do {
            System.out.print("Informe um valor: ");
            userNumbersString = readData.next().replace(',', '.');
            userNumbersDouble = Double.parseDouble(userNumbersString);

            if (userNumbersDouble < 0) break;
            addiction += userNumbersDouble;
        } while (userNumbersDouble > 0);
        System.out.printf("SOMA TOTAL = %.2f", addiction);
        readData.close();
    }
}
