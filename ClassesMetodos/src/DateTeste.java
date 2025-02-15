import  java.util.Scanner;

public class DateTeste {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        DesafioDate date = new DesafioDate();

        int counter = 0;
        System.out.print("Informe um dia: ");
        date.day = readData.nextInt();

        System.out.print("Informe um mês: ");
        date.month = readData.nextInt();

        System.out.print("Informe um ano: ");
        date.year = readData.nextInt();

        System.out.printf(date.getDateFormated());
    }
}
