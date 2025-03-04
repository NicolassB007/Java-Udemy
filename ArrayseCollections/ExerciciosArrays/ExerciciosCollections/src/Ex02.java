import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

    static boolean findNumberInSet(Set<Integer> numbers) {
        Scanner readData = new Scanner(System.in);
        int number;
        System.out.println("Informe o valor que deseja saber se está no Conjunto");
        System.out.print("Números: ");
        number = readData.nextInt();
        readData.close();

        return numbers.contains(number);
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantos valores serão informados: ");
        int numbersOfNumbers = readData.nextInt();

        Set<Integer> numbersSet = new TreeSet<>();

        System.out.println("INFORME VALORES INTEIROS");
        for (int i = 0; i < numbersOfNumbers; i++) {
            System.out.printf("VALOR %d: ", (i + 1));
            numbersSet.add(readData.nextInt());
        }

        System.out.println(numbersSet);

        System.out.println("VERIFICANDO SE DETERMINADO NÚMERO ESTÁ NO CONJUNTO");
        boolean verification = Ex02.findNumberInSet(numbersSet);

        System.out.println("SE O NÚMERO ESTIVER NO CONJUNTO -> true");
        System.out.println("SE O NÚMERO NÃO ESTIVER NO CONJUNTO -> false");
        System.out.println("RESULTADO -> " + verification);
    }
}
