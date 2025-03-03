import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas serão? ");
        int numbersOfLine = readData.nextInt();

        System.out.print("Quantas colunas serão? ");
        int numbersOfColumns = readData.nextInt();

        int[][] array = new int[numbersOfLine][numbersOfColumns];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("LINHA %d\n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("VALOR %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }

        System.out.println("SOMA DAS LINHAS");
        int addictionLines = 0;
        int[] resultAddictionLines = new int[numbersOfLine];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                addictionLines += array[i][j];
            }
            System.out.printf("SOMA DA LINHA %d -> %d\n", (i + 1), addictionLines);
            resultAddictionLines[i] = addictionLines;
            addictionLines = 0;
        }

        System.out.println("RESULTADO DA SOMA DE CADA LINHA: ");
        for (int result: resultAddictionLines) {
            System.out.printf("%d ", result);
        }

        int numColumns = array[0].length;
        int[] addictionColumns = new int[numColumns];
        int addiction = 0;

        for (int colum = 0; colum < numColumns ; colum++) {
            for (int line = 0; line < array.length; line++) {
                addiction += array[line][colum];
            }
            addictionColumns[colum] = addiction;
            addiction = 0;
        }

        System.out.println("\nRESULTADO DE CADA COLUNA");
        for (int result: addictionColumns) {
            System.out.printf("%d ", result);
        }
    }
}
