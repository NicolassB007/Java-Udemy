import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        int choice = 0;

        while (!(choice == -1)) {
            System.out.print("Informe o ano: ");
            String yearString = readData.next();
            if (yearString.length() > 4) {
                System.out.println("Informe um ano válido!");
                continue;
            }

            var yearInt = Integer.parseInt(yearString);

            if (yearInt % 4 == 0) {
                System.out.printf("%d é um ano BISSEXTO!\n", yearInt);
            }
            else {
                System.out.printf("%d não é um ano BISSEXTO!\n", yearInt);
            }

            System.out.print("Informe -1 caso queira para de informar anos: ");
            choice = readData.nextInt();
        }
        readData.close();
    }
}
