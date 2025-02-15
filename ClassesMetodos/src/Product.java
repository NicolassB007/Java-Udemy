public class Product {
    String productName;
    double productValue;
    double discount;

    double priceWithDiscount(double managerDiscount){
        return productValue * (1 - (managerDiscount + discount));
    }
}