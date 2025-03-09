import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        Map<Integer, String> anagrama = new HashMap<>();

        int counter = 0;
        int countWords = 0;

        while (true) {
            System.out.print("Informe a palavra: ");
            String word = readData.nextLine().toLowerCase();

            char[] invertedWord = new char[word.length()];
            char[] normalWord = new char[word.length()];

            for (int i = (word.length() - 1); i >= 0 ; i--) {
                invertedWord[word.length() - 1 - i] = word.charAt(i);
            }
            for (int i = 0; i < word.length(); i++) {
                normalWord[i] = word.charAt(i);
            }

            for (int i = 0; i < word.length(); i++) {
                if (normalWord[i] == invertedWord[i]) {
                    counter++;
                }
            }
            if (counter == word.length()) {
                System.out.println("A palavra é um ANAGRAMA.");
                anagrama.put(countWords, word);
                counter = 0;
            }
            else {
                System.out.println("A palavra não é um ANAGRAMA");
                counter = 0;
            }

            System.out.println("Você quer acrescentar mais palavras?");
            System.out.print("s/n: ");
            String choice = readData.nextLine().toLowerCase();
            if (!choice.startsWith("s")) {
                System.out.println("Você encerrou a operação.");
                for (Map.Entry<Integer, String> wordsAnagrama: anagrama.entrySet()) {
                    System.out.printf("ID Palavra: %d\n", wordsAnagrama.getKey());
                    System.out.printf("Palavra: %s\n", wordsAnagrama.getValue());
                }
                break;
            }
            countWords++;
        }
    }
}
