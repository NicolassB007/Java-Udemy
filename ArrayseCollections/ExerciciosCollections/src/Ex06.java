import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.println("Informe o nome de 5 frutas");
        ArrayList<String> fruitsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Fruta %d: ", (i + 1));
            fruitsList.add(readData.nextLine());
        }
        Collections.sort(fruitsList);
        System.out.println("Lista ordenada: " + fruitsList);
    }
}
