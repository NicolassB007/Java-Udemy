import java.util.Scanner;

public class SystemStore {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Informe o nome do produto: ");
        product.setProductName(readData.nextLine());

        System.out.print("Informe o preço do produto: ");
        String productPriceString = readData.nextLine().replace(',', '.');
        product.setProductPrice(Double.parseDouble(productPriceString));

        System.out.print("Quantos itens tem no estoque: ");
        product.setProductStockQuantity(readData.nextInt());

        System.out.println("Nome do produto: " + product.getProductName());
        System.out.println("Preço do produto: " + product.getProductPrice());
        System.out.println("Quantidade do produto no estoque: " + product.getProductStockQuantity());
        System.out.println("Valor total do estoque: R$" + product.calcTotalValueStock());

        readData.close();
    }
}
