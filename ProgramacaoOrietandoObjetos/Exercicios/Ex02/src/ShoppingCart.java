import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    ArrayList<Product> productsList = new ArrayList<>();
    ArrayList<Double> totalValueEachProduct = new ArrayList<>();
    Map<Integer, Client> listNameAndAddress = new HashMap<>();

    void addProducts(Product product) {
        this.productsList.add(product);
    }

    ArrayList<Double> getTotalValue(Product product) {
        double total;
        total = product.price * product.quantity;

        this.totalValueEachProduct.add(total);

        return totalValueEachProduct;
    }
}
