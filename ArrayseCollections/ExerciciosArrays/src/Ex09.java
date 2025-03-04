import java.util.Scanner;

public class Ex09 {

    static int sumArray(int[][] array) {
        int addiction = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                addiction += array[i][j];
            }
        }
        return addiction;
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas serão: ");
        int numbersOfLines = readData.nextInt();

        System.out.print("Quantas colunas serão: ");
        int numbersOfColumns = readData.nextInt();

        readData.close();

        int[][] array = new int[numbersOfLines][numbersOfColumns];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("LINHA %d\n", (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("VALOR %d: ", (j + 1));
                array[i][j] = readData.nextInt();
            }
        }
        System.out.printf("A SOMA DO ARRAY É " + Ex09.sumArray(array));
    }
}
