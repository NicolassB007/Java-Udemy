import java.util.*;

public class Ex13 {

    static public class Person {
        String name;
        int id;
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Queue<Integer> bankListById = new LinkedList<>();
        Map<Integer, String> clientBank = new HashMap<>();

        int counter = 0;

        while (true) {
            Person person = new Person();

            System.out.print("Informe seu nome: ");
            person.name = readData.nextLine();
            person.id = counter;

            clientBank.put(person.id, person.name);
            bankListById.add(person.id);
            counter++;

            System.out.println("Será adicionado mais clientes? ");
            System.out.print("s/n: ");
            String choice = readData.nextLine().toLowerCase();

            if (!choice.startsWith("s")) {
                System.out.println("Operação encerrada.");
                break;
            }
        }

        System.out.println("FILA DE ESPERA:");
        for (Map.Entry<Integer, String> clients: clientBank.entrySet()) {
            System.out.printf("ID -> %d: %s\n", clients.getKey(), clients.getValue());
        }
    }
}
