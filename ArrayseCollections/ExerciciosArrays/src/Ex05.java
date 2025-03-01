import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.println("ARRAY A!");

        System.out.print("Quantas linhas do Array A serão? ");
        int numberOfLines = readData.nextInt();
        System.out.print("Quantas colunas do Array A serão? ");
        int numberOfColumns = readData.nextInt();
        int[][] arrayA = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.printf("Linha %d - Array A\n", (i + 1));
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                arrayA[i][j] = readData.nextInt();
            }
        }

        System.out.println("ARRAY A:");
        for (int[] valuesArrayA: arrayA) {
            System.out.println(Arrays.toString(valuesArrayA));
        }

        System.out.println();

        System.out.println("ARRAY B!");

        int[][] arrayB = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < arrayB.length; i++) {
            System.out.printf("Linha %d - Array B\n", (i + 1));
            for (int j = 0; j < arrayB[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                arrayB[i][j] = readData.nextInt();
            }
        }

        System.out.println("ARRAY B:");
        for (int[] valuesArrayB: arrayB) {
            System.out.println(Arrays.toString(valuesArrayB));
        }

        System.out.println("MULTIPLICANDO OS VALORES DO ARRAY A E B");
        int[][] arrayC = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                arrayC[i][j] = arrayA[i][j] * arrayB[i][j];
            }
        }

        System.out.println("ARRAY C (Contém o resultado da multiplicação do ARRAY A E B):");
        for (int[] valuesArrayC: arrayC) {
            System.out.println(Arrays.toString(valuesArrayC));
        }
    }
}
