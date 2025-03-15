import java.util.ArrayList;

public class Compras {
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;

        for (Item itens: itens) {
            total += itens.quatidade * itens.preco;
        }
        return total;
    }
}