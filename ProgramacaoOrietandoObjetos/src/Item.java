public class Item {
    String nome;
    int quatidade;
    double preco;

    Compras compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quatidade = quantidade;
        this.preco = preco;
    }
}
