import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex07 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Quantas palavras serão informadas? ");
        int numbersOfWords = readData.nextInt();
        readData.nextLine();

        Set<String> wordsSet = new TreeSet<>();
        for (int i = 0; i < numbersOfWords; i++) {
            System.out.print("Informe a palavra: ");
            wordsSet.add(readData.nextLine());
        }

        System.out.printf("O CONJUNTO TEM %d PALAVRAS\n", wordsSet.size());
        System.out.printf("AS PALAVRAS DO CONJUNTO SÃO %s", wordsSet);
    }
}
