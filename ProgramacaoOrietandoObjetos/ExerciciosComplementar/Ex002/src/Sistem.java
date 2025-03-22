import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.print("Informe o número da conta: ");
        bankAccount.setNumberAccount(readData.nextInt());

        System.out.print("Informe o saldo bancário: R$");
        bankAccount.setBalance(readData.nextDouble());

        System.out.println("Número da conta: " + bankAccount.getNumberAccount());
        System.out.println("Saldo bancário: R$" + bankAccount.getBalance());

        System.out.println("Você quer depositar? ");
        System.out.print("s/n: ");
        readData.nextLine();
        String choice = readData.nextLine().toLowerCase();

        if (choice.startsWith("s")) {
            System.out.print("Qual o valor do depósito: ");
            bankAccount.deposit(readData.nextDouble());
        }

        System.out.println("Você quer sacar: ");
        System.out.print("s/n: ");
        readData.nextLine();
        choice = readData.nextLine().toLowerCase();

        if (choice.startsWith("s")) {
            System.out.print("Qual o valor do saque? ");
            double amount = readData.nextDouble();
            if (amount > bankAccount.getBalance()) {
                System.out.println("Saldo insuficiente:");
            }
            else {
                bankAccount.draw(amount);
            }
        }

        System.out.println("Você quer consultar seu saldo bancário?: ");
        System.out.print("s/n: ");
        choice = readData.nextLine().toLowerCase();

        if (choice.startsWith("s")) {
            System.out.println("Saldo atual: R$" + bankAccount.getBalance());
        }
    }
}
