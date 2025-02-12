import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Qual seu saldo bancário: ");
        var balance = readData.next().replace(",", ".");
        var balanceDouble = Double.parseDouble(balance);

        System.out.print("Quantas prestações são no total: ");
        var installments = readData.nextInt();

        System.out.print("Quantas parcelas foram pagas: ");
        var installmentsPayed = readData.nextInt();

        System.out.print("Qual o valor de cada parcela: ");
        var installmentsValue = readData.next().replace(",", ".");
        var installmentsValueDouble = Double.parseDouble(installmentsValue);

        readData.close();

        if (installmentsPayed == installments) {
            System.out.println("Todas as parcelas foram pagas.");
        }

        else if ((installmentsPayed >= 0) && (installmentsPayed < installments)) {

            var installmentsRemains = installments - installmentsPayed;
            var totalPay = installmentsRemains * installmentsValueDouble;
            var finalBalance = balanceDouble - totalPay;

            if (totalPay > balanceDouble) {
                System.out.println();
                System.out.println("SALDO INSUFICIENTE!!!");
                System.out.println("VOCÊ FICARÁ COM SALDO *NEGATIVO*!!");
                System.out.println();
            }

            System.out.printf("SALDO INICIAL: R$%.2f\n", balanceDouble);
            System.out.printf("Parcelas restantes: %d\n", installmentsRemains);
            System.out.printf("Total a pagar: R$%.2f\n", totalPay);
            System.out.printf("Saldo Final: R$%.2f", finalBalance);

        }

        else {
            System.out.println();
            System.out.println("ALGUM DADO FOI INSERIDO INCORRETAMENTE!");
            System.out.println("Revise os dados informados e tente novamente, por gentileza.");
            System.out.println();
        }

    }
}
