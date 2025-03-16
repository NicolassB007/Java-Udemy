import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Produto p, int quantity) {
        this.itens.add(new Item(p, quantity));
    }

    void addItem(String name, double price, int quantity) {
        var produto = new Produto(name, price);
        this.itens.add(new Item(produto, quantity));
    }

    double getTotalValue() {
        double total = 0;

        for (Item item: itens) {
            total += item.itemQuantity * item.produto.price;
        }

        return total;
    }
}
