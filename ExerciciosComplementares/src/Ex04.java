import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        final double balance = 500.00;
        
        readData.close();

        System.out.print("Informe o valor do cheque: ");
        var check = readData.next().replace(",", ".");

        var checkDouble = Double.parseDouble(check); // Value converted to Double

        double finalValue = balance + checkDouble;

        System.out.printf("SALDO FINAL APÓS A ENTRADA DO CHEQUE = %.2f (Saldo inicial + cheque)", finalValue);
    }
}
