import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        String concept = "";
        System.out.print("Informe a nota: ");
        var nota = readData.nextInt();

        switch (nota) {
            case 10: case 9:
                concept = "A";
                break;
            case 8: case 7:
                concept = "B";
                break;
            case 6: case 5:
                concept = "C";
                break;
            case 4: case 3:
                concept = "E";
                break;
            case 2: case 1: case 0:
                concept = "F";
                break;
            default:
                concept = "Não informado";
        }
        System.out.println("Conceito = " + concept);
    }
}
