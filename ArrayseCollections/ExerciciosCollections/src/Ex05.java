import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.println("Informe 10 valores");
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.printf("VALOR %d: ", (i + 1));
            numbersList.add(readData.nextInt());
        }

        System.out.println("Lista com todos o valores informados >>>" + numbersList);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersList.remove(i);
            }
        }

        System.out.println("Lista sem valor PAR >>>" + numbersList);
    }
}
