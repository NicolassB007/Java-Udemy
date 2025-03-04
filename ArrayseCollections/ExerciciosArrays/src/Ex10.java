import java.util.Scanner;

public class Ex10 {

    static int HigherValueInArray(int[][] array) {
        int higherValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    higherValue = array[i][j];
                } else if (array[i][j] > higherValue) {
                    higherValue = array[i][j];
                }
            }
        }
        return higherValue;
    }

    static int lowestValueInArray(int[][] array) {
        int lowestValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < lowestValue) {
                    lowestValue = array[i][j];
                }
            }
        }
        return lowestValue;
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas serão: ");
        int numbersOfLines = readData.nextInt();

        System.out.print("Quantas linhas serão: ");
        int numbersOfColums= readData.nextInt();

        int[][] array = new int[numbersOfLines][numbersOfColums];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("LINHA %d\n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("VALOR %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }

        System.out.printf("MAIOR VALOR -> %d\n", Ex10.HigherValueInArray(array));
        System.out.printf("MENOR VALOR -> %d", Ex10.lowestValueInArray(array));
    }
}
