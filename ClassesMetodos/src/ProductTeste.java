public class ProductTeste {
    public static void main(String[] args) {
        Product productOne = new Product();
        productOne.productName = "Notebook";
        productOne.productValue = 5921.91;
        productOne.discount = 0.5;

        Product productTwo = new Product();
        productTwo.productName = "Celular";
        productTwo.productValue = 6991.02;
        productTwo.discount = 0.6;

        System.out.printf("PRODUTO - %s\n", productOne.productName);
        System.out.printf("VALOR - R$%.2f\n", productOne.productValue);
        System.out.printf("DESCONTO - %.2f por cento\n", productOne.discount);

        System.out.println();

        System.out.printf("PRODUTO - %s\n", productTwo.productName);
        System.out.printf("VALOR - R$%.2f\n", productTwo.productValue);
        System.out.printf("DESCONTO - %.2f por cento\n", productTwo.discount);
    }
}
