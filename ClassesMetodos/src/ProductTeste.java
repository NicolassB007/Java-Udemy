public class ProductTeste {
    public static void main(String[] args) {
        Product productOne = new Product("Notebook", 4356.89, 0.25);
        //productOne.productName = "Notebook";
        //productOne.productValue = 4356.89;
        //productOne.discount = 0.25;

        Product productTwo = new Product();
        productTwo.productName = "Caneta Preta";
        productTwo.productValue = 12.56;
        productTwo.discount = 0.29;

        System.out.printf("PRODUTO - %s\n", productOne.productName);
        System.out.printf("VALOR - R$%.2f\n", productOne.productValue);
        System.out.printf("DESCONTO - %.2f por cento\n", productOne.discount);

        System.out.println();
        double finalPrice = productOne.priceWithDiscount(0);
        double finalPriceTwo = productTwo.priceWithDiscount(0.1);
        double media = (finalPrice + finalPriceTwo) / 2;

        System.out.printf("PRODUTO - %s\n", productTwo.productName);
        System.out.printf("VALOR - R$%.2f\n", productTwo.productValue);
        System.out.printf("DESCONTO - %.2f por cento\n", productTwo.discount);
        System.out.printf("MÉDIA DO CARRINHO -> %.2f", media);
    }
}
