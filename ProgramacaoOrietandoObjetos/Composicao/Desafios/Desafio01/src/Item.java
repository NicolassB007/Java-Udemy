public class Item {
    final int itemQuantity;
    final Produto produto;

    Item(Produto produto, int itemQuantity) {
        this.produto = produto;
        this.itemQuantity = itemQuantity;
    }
}
