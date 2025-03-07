import java.util.ArrayDeque;
import java.util.Deque;

public class Aula08 {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("1984");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.remove());

        // livros.size();
        // livros.clear();
        // livros.contains();
    }
}
