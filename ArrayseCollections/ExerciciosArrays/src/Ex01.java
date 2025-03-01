import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        System.out.print("Quantas notas serão informadas? ");
        int numberOfNotes = readData.nextInt();
        readData.nextLine();

        double[] arrayNotes = new double[numberOfNotes];

        String notesString;
        double notesDouble;

        for (int i = 0; i < numberOfNotes; i++) {
            System.out.print("Notas: ");
            notesString = readData.nextLine().replace(",", ".");
            notesDouble = Double.parseDouble(notesString);
            arrayNotes[i] = notesDouble;
        }

        // System.out.println(Arrays.toString(arrayNotes));

        double addiction = 0;
        for(double notes: arrayNotes) {
            addiction += notes;
        }

        double mediaStudent = addiction / arrayNotes.length;
        System.out.printf("Média do aluno: %.2f", mediaStudent);
    }
}