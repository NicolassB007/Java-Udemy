public class Product {
    String productName;
    double productValue;
    double discount;

    // Construtor explícito
    Product(String initialName, double initialPrice, double initialDiscount) {
        productName = initialName;
        productValue = initialPrice;
        discount = initialDiscount;
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