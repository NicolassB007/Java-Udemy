// Em andamento

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linha serão: ");
        int numberOfLines = readData.nextInt();

        System.out.print("Quantas colunas serão: ");
        int numberOfColumns = readData.nextInt();

        if (numberOfLines != numberOfColumns) {
            while (numberOfLines != numberOfColumns) {
                System.out.println("\nNÚMERO DE LINHAS E COLUNAS *DEVEM* SER IGUAIS");
                System.out.println("Insira as informações novamente, por gentileza.");

                System.out.print("Quantas linha serão: ");
                numberOfLines = readData.nextInt();

                System.out.print("Quantas colunas serão: ");
                numberOfColumns = readData.nextInt();
            }
        }

        int[][] array = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Linha %d\n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }

        System.out.println("ARRAY NA ORDEM NORMAL");
        for (int[] values: array) {
            System.out.println(Arrays.toString(values));
        }

        /*
        int[][] rotatedArray = new int[numberOfLines][numberOfColumns];
        */

        int lines = 0;
        int[][] finalArray = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                finalArray[i][j] = array[numberOfLines - 1 - i][j];
            }
        }

        System.out.println("MATRIZ ROTACIONADA 90 GRAUS");
        for (int[] values: finalArray) {
            System.out.println(Arrays.toString(values));
        }
    }
}
