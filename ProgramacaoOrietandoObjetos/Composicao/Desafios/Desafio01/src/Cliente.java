import java.util.ArrayList;

public class Cliente {
    final ArrayList<Compra> shoppingList = new ArrayList<Compra>();
    final String name;

    Cliente(String name) {
        this.name = name;
    }

    double getTotalValue() {
        double total = 0;

        for (Compra compra: shoppingList) {
            total += compra.getTotalValue();
        }
        return total;
    }
}
