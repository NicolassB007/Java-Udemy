import  java.util.Scanner;

public class DateTeste {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        DesafioDate date = new DesafioDate();
        DesafioDate dateTwo = new DesafioDate(12, 4, 2006);

        System.out.print("Informe um dia: ");
        dateTwo.day = readData.nextInt();

        System.out.print("Informe um mês: ");
        dateTwo.month = readData.nextInt();

        System.out.print("Informe um ano: ");
        dateTwo.year = readData.nextInt();

        System.out.printf(date.getDateFormated());
        System.out.println(dateTwo.getDateFormated());
        /*System.out.printf("DATA FORMADA -> %d/%d/%d\n", dateTwo.day, dateTwo.month, dateTwo.year);
        System.out.println(dateTwo.getDateFormated());*/

    }
}
