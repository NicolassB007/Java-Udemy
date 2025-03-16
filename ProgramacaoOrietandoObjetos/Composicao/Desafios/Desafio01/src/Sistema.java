import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Cliente cliente = new Cliente("Nicolas Bissotto");
        Compra compra1 = new Compra();
        compra1.addItem("Camiseta", 9.12, 4);
        compra1.addItem("Tenis", 100.00, 1);

        Compra compra2 = new Compra();
        compra1.addItem("Guitarra", 7000.00, 1);
        compra1.addItem("Tenis", 150.00, 1);

        cliente.shoppingList.add(compra1);
        cliente.shoppingList.add(compra2);

        System.out.println(cliente.getTotalValue());
    }
}
