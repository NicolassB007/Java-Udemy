import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex08 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.println("LISTAS DE COMPRAS");
        System.out.println("-----------------------");
        System.out.print("[ 1 ] -> Inserir\n[ 2 ] -> Remover\n[ 3 ] -> Ver itens\n[ 4 ] -> Sair\n");
        System.out.println("-----------------------");
        int choice;
        Set<String> items = new TreeSet<>();
        while (true) {
            System.out.print("Qual funcionalidade será utilizada? ");
            choice = readData.nextInt();
            readData.nextLine();
            if (choice > 5) {
                System.out.println("Informe um número menor que 5");
                continue;
            }

            if (choice == 1) {
                System.out.print("Informe o nome do produto: ");
                items.add(readData.nextLine().toUpperCase());
            }
            else if (choice == 2 ) {
                if (items.isEmpty()) {
                    System.out.println("A lista de compra está VAZIA");
                    continue;
                }
                System.out.println(items);
                System.out.println("Qual item será removido?");
                items.remove(readData.nextLine().toUpperCase());
            }
            else if (choice == 3) {
                if (items.isEmpty()) {
                    System.out.println("LISTA DE COMPRAS VAZIAS");
                    continue;
                }
                System.out.println("ITENS");
                System.out.println(items);
            }
            else {
                System.out.println("VOCÊ ENCERROU A OPERAÇÃO");
                break;
            }
        }
    }
}
