import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.print("Informe um dia: ");
        int day = readData.nextInt();
        String dayString = Integer.toString(day);

        System.out.print("Informe o mês: ");
        int month = readData.nextInt();
        String monthString = Integer.toString(month);

        System.out.print("Informe o ano: ");
        int year = readData.nextInt();

        readData.close();

        String stringYear = Integer.toString(year);

        // Defining the sizes for dates, day and month only accept two length. For example: 1, 10, 21, 01, 21;
        // 011 doesn't exist nor 102 for day and month;
        // Year only accept 4 for lenght. For example: 2000, 1923, 1329;
        boolean sizeDayValid = ((dayString.length() > 0) && (dayString.length() <= 2));
        boolean sizeMonthValid = ((monthString.length() > 0) && (monthString.length() <= 2));
        boolean validYear = (stringYear.length() == 4);

        boolean validDay = ((day > 0) && (day <= 31) && (sizeDayValid));
        boolean validMonth = ((month > 0) && (month <= 12) && (sizeMonthValid));


        // Validating Day
        if (!validDay) {
            System.out.println("\nO *DIA* inserido é INVÁLIDO!");
            System.out.println("Revise o *DIA* informado e insira o *DIA* novamente, por gentileza");
            while (!validDay) {
                System.out.print("Insira o *DIA*: ");
                day = readData.nextInt();
                validDay = ((day > 0) && (day <= 31));
            }
        }

        // Validating Month
        if (!validMonth) {
            System.out.println("\nO *MÊS* inserido é INVÁLIDO!");
            System.out.println("Revise o *MÊS* informado e insira o *MÊS* novamente, por gentileza");
            while (!validMonth) {
                System.out.print("Insira o *MÊS*: ");
                month = readData.nextInt();
                validMonth = ((month > 0) && (month <= 12));
            }
        }

        // Validating Year
        if (!validYear) {
            System.out.println("\nO *ANO* inserido é INVÁLIDO!");
            System.out.println("Revise o *ANO* informado e insira o *ANO* novamente, por gentileza");
            while (!validYear) {
                System.out.print("Insira o *ANO*: ");
                year = readData.nextInt();
                stringYear = Integer.toString(year);
                validYear = (stringYear.length() == 4);
            }
        }

        // Checking if is leap year
        boolean isLeapYear = false;
        if ((validYear) && (year % 4 == 0)) {
            isLeapYear = true;
        }

        // Summer
        int summerDayStart = 22;
        int summerDayEnd = 19;

        // Boolean for day if leap year
        boolean februaryDayIfIsLeapYear = (day < 30);

        // Boolean for day if leap year is false
        boolean februaryDayIfIsntLeapYear = (day < 29);

        if ((month == 12) && (day >= summerDayStart)) {
            System.out.println("ESTAÇÃO DO ANO -> VERÃO");
            System.out.printf("%d/%d/%d\n", day, month, year);
            if (day == 25) {
                System.out.println("É NATALLL!!!!");
                System.out.println("FELIZ NATALLLL!!!!!!!");
            }
        }

        // Conditions for february.
        // Structure for case FEBRUARY is Leap Year
        else if ((month == 2) && (isLeapYear)) {
            if (day > 29) {
                System.out.printf("%d É UM ANO BISSEXTO\n", year);
                System.out.println("Por ser um ano bissexto FEVEREIRO tem apenas 29 DIAS");
                System.out.println("Portanto o dia informado é INVÁLIDO");
            }
            else {
                System.out.println("ESTAÇÃO DO ANO -> VERÃO");
                System.out.printf("%d/0%d/%d", day, month, year);
            }
        }

        // Structure for case FEBRUARY isn't Leap Year
        else if ((month == 2) && (!isLeapYear)) {
            if (day <= 28) {
                System.out.println("ESTAÇÃO DO ANO -> VERÃO");
                System.out.printf("%d/0%d/%d", day, month, year);
            }
            else if (day > 28) {
                System.out.printf("%d NÃO É BISSEXTO\n", year);
                System.out.println("Fevereiro em ano bissexto tem apenas 29 dias, e 28 dias caso não for bissexto");
                System.out.println("Portanto, o dia informado é inválido");
            }
        }

        else if ((month == 3) && (day < summerDayEnd)) {
            System.out.println("ESTAÇÃO DO ANO -> VERÃO");
            System.out.printf("%d/0%d/%d", day, month, year);
        }

        // Autumn
        int autumnDayStart = 19;
        int autumnDayEnd = 20;

        // Range for be Autumn
        boolean autumn = ((month >= 3) && (month < 6));

        if ((autumn) && (day >= autumnDayStart)) {
            System.out.println("ESTAÇÃO DO ANO - OUTONO");
            System.out.printf("%d/0%d/%d\n", day, month, year);
        }

        else if ((month == 6) && (day <= autumnDayEnd)) {
            System.out.println("ESTAÇÃO DO ANO - OUTONO");
            System.out.printf("%d/0%d/%d\n", day, month, year);
        }

        // Winter

        int winterDayStart = 21;
        int winterDayEnd = 23;

        // Range for be Winter
        boolean winter = ((month >= 6) && (month < 9));

        if ((winter) && (day >= winterDayStart)) {
            System.out.println("ESTAÇÃO DO ANO - INVERNO");
            System.out.printf("%d/0%d/%d\n", day, month, year);
        }

        else if ((month == 9) && (day < winterDayEnd)) {
            System.out.println("ESTAÇÃO DO ANO - INVERNO");
            System.out.printf("%d/0%d/%d\n", day, month, year);
        }

        // Spring

        int springDayStart = 23;
        int springDayEnd = 21;

        // Range for be Winter
        boolean spring = ((month >= 10) && (month < 12));

        if ((month == 9) && (day >= springDayStart)) {
            System.out.println("ESTAÇÃO DO ANO - PRIMAVERA");
            System.out.printf("%d/0%d/%d\n", day, month, year);
        }
        else if ((spring)) {
            System.out.println("ESTAÇÃO DO ANO - PRIMAVERA");
            System.out.printf("%d/%d/%d\n", day, month, year);
        }

        else if ((month == 12) && (day <= springDayEnd)) {
            System.out.println("ESTAÇÃO DO ANO - PRIMAVERA");
            System.out.printf("%d/%d/%d\n", day, month, year);
        }
    }
}