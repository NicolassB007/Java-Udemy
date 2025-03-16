import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Client client;
        Product product;
        while (true) {
            client = new Client();
            System.out.print("Nome do cliente: ");
            client.clientName = readData.nextLine();

            System.out.println("Nome do produto: ");
            String nameProduct = readData.nextLine();

            System.out.println("Preço: R$");
            double priceProduct = readData.nextDouble();

            System.out.println("Código do produto: ");
            int codeProduct = readData.nextInt();

            System.out.println("Informe a quantidade: ");
            int quantityProduct = readData.nextInt();

            product = new Product(nameProduct, priceProduct, codeProduct, quantityProduct);

            System.out.println("Será adicionado mais produtos?");
            System.out.print("s/n: ");
            String choice = readData.nextLine().toLowerCase();

            if (!choice.startsWith("s")) {
                System.out.println("Operação finalizada.");
                System.out.println("Obrigado por utilizar nosso Sistema!");
                break;
            }
            else {
                System.out.println("");
            }
        }
        System.out.println(client.clientName);
    }
}
