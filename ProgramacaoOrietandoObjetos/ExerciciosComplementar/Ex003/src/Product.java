public class Product {
    private String productName;
    private double productPrice;
    private int productStockQuantity;

    public void setProductName(String productName) {
        if (productName.isEmpty()) {
            this.productName = null;
        }
        else {
            this.productName = productName;
        }
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public void setProductStockQuantity(int productStockQuantity) {
        if (productStockQuantity > 0) {
            this.productStockQuantity = productStockQuantity;
        }
        else {
            this.productStockQuantity = 0;
        }
    }

    public double calcTotalValueStock() {
        return this.productPrice * this.productStockQuantity;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public int getProductStockQuantity() {
        return this.productStockQuantity;
    }
}
