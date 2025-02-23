public class Product {
    String productName;
    double productValue;
    static double discount = 0.25;

    // Construtor explícito
    Product(String initialName, double initialPrice) {
        productName = initialName;
        productValue = initialPrice;
    }

    /*Product(String initialName, double initialPrice) {
        productName = initialName;
        productValue = initialPrice;
    }*/

    Product() {

    }

    double priceWithDiscount(double managerDiscount){
        return productValue * (1 - (managerDiscount + discount));
    }
}