import java.util.ArrayDeque;
import java.util.Deque;

public class Ex11 {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("Nicolas");
        stack.push("Marcos");
        stack.push("Pietro");
        stack.push("Japa");
        stack.push("Romano");
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pollLast());
        }
    }
}
