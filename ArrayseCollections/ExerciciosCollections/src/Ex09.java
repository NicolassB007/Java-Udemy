import java.util.*;

public class Ex09 {
    static public class Contact {
        String phoneNumberString;
        int phoneNumberInt;
        ArrayList<String> nameList = new ArrayList<>();
        Map<String, Integer> contactMap = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Contact contact = new Contact();
        while (true) {
            System.out.print("Informe o nome: ");
            String name = readData.nextLine().strip();

            System.out.print("Informe o número de telefone: ");
            contact.phoneNumberString = readData.nextLine().strip();

            if (contact.phoneNumberString.length() != 9) {
                do {
                    System.out.println("Foi inserido um número com mais de 9 digitos ou menos");
                    System.out.println("Digite o número de telefone novamente");
                    System.out.print("Número de telefone: ");
                    contact.phoneNumberString = readData.nextLine();
                } while (contact.phoneNumberString.length() != 9);
            }

            contact.phoneNumberInt = Integer.parseInt(contact.phoneNumberString);

            if (contact.contactMap.containsValue(contact.phoneNumberInt)) {
                System.out.println("Este número de telefone já está associado a outro nome. Por favor, insira um número diferente.");
                continue;
            }

            contact.nameList.add(name);
            contact.contactMap.put(name, contact.phoneNumberInt);

            System.out.println("Você quer inserir mais informções? (S/N)");
            System.out.print("Opção: ");
            String choice = readData.nextLine().toLowerCase();

            if (choice.startsWith("n")) {
                break;
            }
        }
        System.out.println("LISTA DE CONTATOS");
        for (Map.Entry<String, Integer> entry : contact.contactMap.entrySet()) {
            System.out.printf("Nome: %s, Número de telefone: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
