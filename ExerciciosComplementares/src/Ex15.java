import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("=-=-");
        }
        System.out.print("\n[ 1 ] - Venda a Vista - desconto de 15%\n");
        System.out.print("[ 2 ] - Venda a Prazo 30 dias - desconto de 10%\n");
        System.out.print("[ 3 ] - Venda a Prazo 60 dias - sem desconto\n");
        System.out.print("[ 4 ] - Venda a Prazo com 90 dias - acréscimo de 5%\n");
        System.out.print("[ 5 ] - Venda com cartão de débito - desconto de 5%\n");
        System.out.print("[ 6 ] - Venda com cartão de crédito - desconto de 6% \n");
        for (int i = 0; i < 12; i++) {
            System.out.print("=-=-");
        }

        System.out.print("\nQual o valor da venda? ");
        String valueString = readData.nextLine().replace(",", ".");
        double valueDouble = Double.parseDouble(valueString);
        System.out.print("Qual a forma da venda? ");
        int condition = readData.nextInt();

        readData.close();

        double discount = 0.0;
        double increase = 0.0;
        double finalPrice = 0.0;

        switch (condition) {
            case 1:
                discount = (double) 15 / 100;
                finalPrice = valueDouble - (valueDouble * discount);
                System.out.println("FORMA ESCOLHIDA -> Venda a Vista - desconto de 15%");
                System.out.printf("PREÇO FINAL -> %.2f", finalPrice);
                break;
            case 2:
                discount = (double) 10 / 100;
                finalPrice =  valueDouble - (valueDouble * discount);
                System.out.println("FORMA ESCOLHIDA -> Venda a Prazo 30 dias - desconto de 10%");
                System.out.printf("PREÇO FINAL -> %.2f", finalPrice);
                break;
            case 3:
                System.out.println("FORMA ESCOLHIDA -> Venda a Prazo 60 dias - sem desconto ");
                System.out.printf("PREÇO FINAL -> %.2f", valueDouble);
                break;
            case 4:
                increase = (double) 5 / 100;
                finalPrice =  valueDouble + (valueDouble * increase);
                System.out.println("FORMA ESCOLHIDA -> Venda a Prazo com 90 dias - acréscimo de 5%");
                System.out.printf("PREÇO FINAL -> %.2f", finalPrice);
                break;
            case 5:
                discount = (double) 5 / 100;
                finalPrice =  valueDouble - (valueDouble * discount);
                System.out.println("FORMA ESCOLHIDA -> Venda com cartão de débito - desconto de 5%");
                System.out.printf("PREÇO FINAL -> %.2f", finalPrice);
                break;
            case 6:
                discount = (double) 6 / 100;
                finalPrice =  valueDouble - (valueDouble * discount);
                System.out.println("FORMA ESCOLHIDA -> Venda com cartão de crédito - desconto de 6%");
                System.out.printf("PREÇO FINAL -> %.2f", finalPrice);
                break;
            default:
                System.out.println("FORMA DE PAGAMENTO INVÁLIDA!");
        }
    }
}
