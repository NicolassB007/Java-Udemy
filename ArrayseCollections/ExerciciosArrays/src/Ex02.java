import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas terá? ");
        int numberOfLines = readData.nextInt();

        System.out.print("Quantas colunas terá? ");
        int numberOfColumns = readData.nextInt();

        int[][] numbersInt = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < numbersInt.length; i++) {
            System.out.printf("Linha %d \n", (i + 1));
            for (int j = 0; j < numbersInt[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                numbersInt[i][j] = readData.nextInt();
            }
        }

        int addiction = 0;
        for (int i = 0; i < numbersInt.length; i++) {
            for (int j = 0; j < numbersInt[i].length; j++) {
                if (i == j) {
                    addiction += numbersInt[i][j];
                }
            }
        }

        for (int[] notes: numbersInt) {
            System.out.println(Arrays.toString(notes));
        }

        System.out.printf("SOMA DA DIAGONAL PRINCIPAL: %d\n", addiction);

        addiction = 0;
        for (int i = 0; i < numberOfColumns; i++) {
            addiction += numbersInt[i][numberOfColumns - 1 - i];
        }

        System.out.printf("SOMA DA DIAGONAL SECUNDÁRIA: %d\n", addiction);
    }
}
