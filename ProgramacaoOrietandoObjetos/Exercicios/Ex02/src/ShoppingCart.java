import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> productsList = new ArrayList<>();
    Product product;

    void addProducts(Product product) {
        this.product = new Product(product.productName, product.price, product.productCode, product.quantity);
        this.productsList.add(product);
    }
}
