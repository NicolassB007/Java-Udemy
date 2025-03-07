import java.util.LinkedList;
import java.util.Queue;

public class Aula07 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // .add e .offer -> Adicionam elementos na Queue
        fila.add("Ana"); // Caso a fila esteja cheia o add lançará uma exceção
        fila.offer("Bia"); // Caso a fila esteja cheia o offer lançará um valor Boolean
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // .peek() e .element() pegam o primeiro elemento da fila e mostram na tela
        /*System.out.println(fila.peek()); // Fial vazia o .peek() retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Retorna uma exceção
        System.out.println(fila.element());*/

        // Limpa a fila
        // fila.clear();
        // fila.size();
        // fila.isEmpty();
        // fila.contains("Nicolas");
        // Retorna o primeiro elemento da fila e remove da fila
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
