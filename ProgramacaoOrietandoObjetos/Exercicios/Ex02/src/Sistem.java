import java.util.Map;
import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart();
        Product product;
        int id = 0;
        while (true) {
            Client client = new Client();
            System.out.print("Nome do cliente: ");
            client.clientName = readData.nextLine();

            System.out.print("Informe seu endereço: ");
            client.address = readData.nextLine();

            shoppingCart.listNameAndAddress.put(id, client);

            System.out.print("Nome do produto: ");
            String nameProduct = readData.nextLine();

            System.out.print("Preço: R$");
            double priceProduct = readData.nextDouble();

            System.out.print("Código do produto: ");
            int codeProduct = readData.nextInt();

            System.out.print("Informe a quantidade: ");
            int quantityProduct = readData.nextInt();
            readData.nextLine();

            product = new Product(nameProduct, priceProduct, codeProduct, quantityProduct);
            shoppingCart.addProducts(product);
            client.counterItem += 1;

            shoppingCart.getTotalValue(product);

            System.out.println("Será adicionado mais produtos?");
            System.out.print("s/n: ");
            String choice = readData.nextLine().toLowerCase();

            if (!choice.startsWith("s")) {
                System.out.println("Operação finalizada.");
                System.out.println("Obrigado por utilizar nosso Sistema!");
                break;
            }
            id++;
        }
        for (Map.Entry<Integer, Client> clienInformation: shoppingCart.listNameAndAddress.entrySet()) {
            System.out.println("ID Cliente: " + clienInformation.getKey());
            System.out.println("Nome do Cliente: " + clienInformation.getValue().clientName);
            System.out.println("Endereço do Cliente: " + clienInformation.getValue().address);
            System.out.println("Produto Comprado: " + shoppingCart.productsList.get(clienInformation.getKey()).productName);
            System.out.println("Preço do Produto Comprado: " + shoppingCart.productsList.get(clienInformation.getKey()).price);
            System.out.println("Código do Produto Comprado: " + shoppingCart.productsList.get(clienInformation.getKey()).productCode);
            System.out.println("Quantidade Comprada: " + shoppingCart.productsList.get(clienInformation.getKey()).quantity);
            System.out.println("Total Gasto: R$" + shoppingCart.totalValueEachProduct.get(clienInformation.getKey()) + "\n");
        }
    }
}
