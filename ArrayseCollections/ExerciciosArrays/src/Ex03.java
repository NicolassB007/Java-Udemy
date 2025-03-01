import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linha serão? ");
        int numberOfLines = readData.nextInt();
        System.out.print("Quantas colunas serão? ");
        int numberOfColumns = readData.nextInt();

        int[][] array = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Linha %d: \n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }

        System.out.println("ORDEN NORMAL DO ARRAY");
        for (int[] values: array) {
            System.out.println(Arrays.toString(values));
        }

        System.out.println("ORDEM TRANSPOSTA");

        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                System.out.printf("%d ", array[j][i]);
            }
            System.out.println();
        }
    }
}
