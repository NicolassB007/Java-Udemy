import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas será: ");
        int numberOfLine = readData.nextInt();

        System.out.print("Quantas colunas será: ");
        int numberOfColumns = readData.nextInt();

        int[][] array = new int[numberOfLine][numberOfColumns];

        // Receiving and Storing values inside of the array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Linha %d: \n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Valor %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }

        for (int[] values: array) {
            System.out.println(Arrays.toString(values));
        }

        int higherValueInArray = 0;
        int lowestValueInArray = 0;

        // Finding and Storing the higher and lowest values and Storing in their variables
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if ((i == 0) && (j == 0)) {
                    higherValueInArray = array[i][j];
                    lowestValueInArray = array[i][j];
                }

                else if (array[i][j] > higherValueInArray) {
                    higherValueInArray = array[i][j];
                }

                else {
                    lowestValueInArray = array[i][j];
                }

            }
        }

        System.out.println("HIGHER VALUE = " + higherValueInArray);
        System.out.println("LOWEST VALUE = " + lowestValueInArray);


        // Showing where is the higher and lowest value in array
        // Counter for control of when they'll go appear
        int counterHighestValueInArray = 0;
        int counterLowestValueInArray = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if ((higherValueInArray == array[i][j]) && (counterHighestValueInArray < 1)) {
                    counterHighestValueInArray++;
                    System.out.printf("POSIÇÃO DO MAIOR VALOR: [%d, %d]\n", i, j);
                }

                else if ((lowestValueInArray == array[i][j]) && (counterLowestValueInArray < 1)) {
                    counterLowestValueInArray++;
                    System.out.printf("POSIÇÃO DO MAIOR VALOR: [%d, %d]\n", i, j);
                }

            }

        }
    }
}
