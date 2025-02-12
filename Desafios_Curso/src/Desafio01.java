import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);

        System.out.print("Informe um dia da semana: ");
        String day = readData.nextLine().toLowerCase();

        if ((day.equalsIgnoreCase("segunda")) || day.contains("segunda")) {
            System.out.println("Segunda-Feira corresponde ao número 1");
        }

        else if ((day.equalsIgnoreCase("terça")) || day.contains("terca")) {
            System.out.println("Terça-Feira corresponde ao número 2");
        }

        else if ((day.equalsIgnoreCase("quarta")) || day.contains("quarta")) {
            System.out.println("Quarta-Feira corresponde ao número 3");
        }

        else if ((day.equalsIgnoreCase("quinta")) || day.contains("quinta")) {
            System.out.println("Quinta-Feira corresponde ao número 4");
        }

        else if ((day.equalsIgnoreCase("sexta")) || day.contains("sexta")) {
            System.out.println("Sexta-Feira corresponde ao número 5");
        }

        else if ((day.equalsIgnoreCase("sábado")) || day.contains("sabado")) {
            System.out.println("Sábado corresponde ao número 6");
        }

        else if ((day.equalsIgnoreCase("domingo")) || day.contains("domingo")) {
            System.out.println("Domingo corresponde ao número 7");
        }

        else {
            System.out.println("Dia inválido!");
            System.out.println("O dia digitado pode estar com algum erro");
        }

    }
}