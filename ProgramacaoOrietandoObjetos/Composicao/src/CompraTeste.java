public class CompraTeste {
    public static void main(String[] args) {
        Compras compra1 = new Compras();
        compra1.nomeCliente = "Nicolas Bissotto";
        compra1.itens.add(new Item("Cereal", 2, 8.12));
        compra1.itens.add(new Item("Chocolate", 1, 12));
        compra1.itens.add(new Item("Paçoca", 7, 6.12));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
