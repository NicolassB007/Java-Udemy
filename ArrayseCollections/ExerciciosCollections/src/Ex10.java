import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        ArrayList<String> listTask = new ArrayList<>();

        System.out.println("Lista de Tarefas");
        System.out.println("[ 1 ] -> Adicionar");
        System.out.println("[ 2 ] -> Remover");
        System.out.println("[ 3 ] -> Sair");

        while (true) {
            System.out.print("Qual opção você quer? ");
            int choice = readData.nextInt();
            readData.nextLine();

            if ((choice > 3) || (choice <= 0)) {
                System.out.println("Opção inválida!");
                System.out.println("A opção inserida está fora de alcance");
            }

            if (choice == 1) {
                System.out.print("Informe a tarefa: ");
                String task = readData.nextLine();
                listTask.add(task);
            }

            else if (choice == 2) {
                System.out.println("O índice começa em 0");
                System.out.println("Informe o índice do item a ser retirado");

                System.out.println("LISTA");
                System.out.println(listTask);

                System.out.println("INFORME O ÍNDICE DO ITEM (INDICES COMEÇAM NO 0)");
                System.out.println("Qual item você quer remover? ");
                int indexRemove = readData.nextInt();

                if (listTask.isEmpty()) {
                    System.out.println("Não é possível exibir a lista");
                    System.out.println("A lista está vazia\n");
                }
                else if (indexRemove > listTask.size()) {
                    System.out.println("O indice é maior que a lista");
                    System.out.println("Não foi possível remover o item\n");
                }
                else {
                    System.out.println("ITEM REMOVIDO");
                    listTask.remove(indexRemove);
                }
            }
            else if (choice == 3){
                if (listTask.isEmpty()) {
                    System.out.println("LISTA ESTÁ VAZIA");
                }
                else {
                    System.out.println("LISTA:");
                    System.out.println(listTask);
                }
            }
            else {
                System.out.println("OPÇÃO INVÁLIDA!");
                System.out.println("PROGRANA ENCERRADO");
                break;
            }
        }
    }
}
