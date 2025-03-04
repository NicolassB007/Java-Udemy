import java.util.Scanner;

public class Ex11 {

    static double mediaArray(double[][] array) {
        double addiction = 0.0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                addiction += array[i][j];
                counter++;
            }
        }

        return (addiction / counter);
    }

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas linhas serão? ");
        int numbersOfLines = readData.nextInt();
        System.out.print("Quantas linhas serão? ");
        int numbersOfColumns = readData.nextInt();

        double[][] array = new double[numbersOfLines][numbersOfColumns];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("LINHA %d\n", (i+ 1));
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("VALOR %d: ", (j + 1));
                array[i][j] = readData.nextDouble();
            }
        }

        System.out.printf("A MÉDIA DO ARRAY É %.2f", Ex11.mediaArray(array));
    }
}
