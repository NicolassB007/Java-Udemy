import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Aula05 {
    public static void main(String[] args) {
//        Set<String> lista = new HashSet<>();
        TreeSet<String> lista = new TreeSet<>();

        lista.add("String");
        lista.add("Nicolas");
        lista.add("Pietro");
        lista.add("Japa");
        lista.add("Marcos");

        for (String names: lista) {
            System.out.println("Nome dos canditados: " + names);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (int vales: nums) {
            System.out.println("Números " + vales);
        }
    }
}
