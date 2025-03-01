import java.util.Arrays;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Quantos alunos serão? ");
        int numberOfStudents = readData.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int notesPerStudent = readData.nextInt();

        double[][] notesClass = new double[numberOfStudents][notesPerStudent];
        double total = 0;

        for (int i = 0; i < notesClass.length; i++) {
            System.out.printf("ALUNO %d: \n", (i + 1));
            for (int j = 0; j < notesClass[i].length; j++) {
                System.out.printf("Nota %d: ", (j + 1));
                notesClass[i][j] = readData.nextDouble();

                total += notesClass[i][j];
            }
        }

        double media = total / (numberOfStudents * notesPerStudent);

        for (double[] notes: notesClass) {
            System.out.println(Arrays.toString(notes));
        }

        System.out.printf("A Média da turma é %.2f\n", media);
        readData.nextDouble();
    }
}
