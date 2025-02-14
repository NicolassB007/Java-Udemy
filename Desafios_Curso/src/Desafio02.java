import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        var valueConditionOut = 0;
        var note = 0.0;
        var noteString = "";
        var counter = 0;
        var addiction = 0.0;

        while (!(valueConditionOut == -1)) {
            System.out.print("Informe a nota: ");
            noteString = readData.next().replace(",", ".");
            note = Double.parseDouble(noteString);

            var validNote = (note >= 0 && note <= 10);
            if (validNote) {
                addiction += note;
                counter++;
            }
            else {
                System.out.println("Insira notas válida!");
            }

            System.out.println("Informe -1 caso queira ver a média: ");
            valueConditionOut = readData.nextInt();
        }
        var media = addiction / counter;
        System.out.printf("A média das notas é %.2f", media);
    }
}
