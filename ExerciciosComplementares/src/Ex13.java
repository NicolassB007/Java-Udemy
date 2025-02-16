import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe a idade do atleta: ");
        int age = readData.nextInt();

        readData.close();

        boolean childCategory = ((age >= 5) && (age <= 10));
        boolean youthCategory = ((age >= 11) && (age <= 15));
        boolean juniorCategory = ((age >= 16) && (age <= 20));
        boolean professional = ((age >= 21) && (age <= 25));

        if (childCategory) {
            System.out.println("Sua idade está entre 5 e 10 anos");
            System.out.println("Sua categoria é INFANTIL!");
        }

        else if (youthCategory) {
            System.out.println("Sua idade está entre 11 e 15 anos");
            System.out.println("Sua categoria é JUVENIL!");
        }

        else if (juniorCategory) {
            System.out.println("Sua idade está entre 16 e 20 anos");
            System.out.println("Sua categoria é JUNIOR!");
        }

        else if (professional) {
            System.out.println("Sua idade está entre 21 e 25 anos");
            System.out.println("Sua categoria é PROFISSIONAL!");
        }

        else if (age > 26) {
            System.out.println("Sua idade está fora do alcance da tabela!");
        }

        else {
            System.out.println("IDADE INVÁLIDA!");
        }

    }
}
