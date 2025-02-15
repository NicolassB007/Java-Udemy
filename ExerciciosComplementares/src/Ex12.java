import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        var userNumber = 0;
        var higherNumber = 0;
        var lowerNumber = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um valor inteiro: ");
            userNumber = readData.nextInt();

            if (i == 0) {
                higherNumber = userNumber;
                lowerNumber = userNumber;
            }
            else if (i > 0) {
                if (userNumber > higherNumber) {
                    higherNumber = userNumber;
                }
                else if (userNumber < lowerNumber){
                    lowerNumber = userNumber;
                }
            }
            else {
                System.out.println("Algum dado inserido está incorreto!");
            }
        }
        System.out.println("O MAIOR NÚMERO É " + higherNumber);
        System.out.println("O MENOR NÚMERO É " + lowerNumber);
        readData.close();
    }
}
