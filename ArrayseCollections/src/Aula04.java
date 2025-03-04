import java.util.HashSet;
import java.util.Set;

public class Aula04 {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Adiciona coisas para o conjunto
        conjunto.add(1.4); // -> Double
        conjunto.add(true); // -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); // -> Integer
        conjunto.add('x'); // -> Char

        System.out.println("Tamnho do conjunto é -> " + conjunto.size());

        conjunto.add("Teste");

        System.out.println("Tamnho do conjunto é -> " + conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamnho do conjunto é -> " + conjunto.size());

        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre 2 conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
