import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas serão: ");
        int numberOfLines = readData.nextInt();

        System.out.print("Quantas colunas serão: ");
        int numberOfColumns = readData.nextInt();

        int[][] array = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if (i == j) {
                   array[i][j] = 1;
               }
               else {
                   array[i][j] = 0;
               }
            }
        }

        for (int[] values: array) {
            System.out.println(Arrays.toString(values));
        }
    }
}
