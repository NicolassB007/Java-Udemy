import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantos itens serão? ");
        int numbersOfItems = readData.nextInt();

        Set<Integer> numbersSet = new TreeSet<>();
        for (int i = 0; i < numbersOfItems; i++) {
            System.out.print("Informe os valores inteiros: ");
            numbersSet.add(readData.nextInt());
        }

        System.out.println("VALORES PRESENTE NO CONJUNTO");
        System.out.println(numbersSet);
    }
}