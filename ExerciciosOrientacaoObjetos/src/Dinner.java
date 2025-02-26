import java.util.Scanner;

public class Dinner {
    public static void main(String[] args) {
        var readData = new Scanner(System.in);
        PersonTwo person = new PersonTwo();
        Food food = new Food();

        System.out.print("Informe seu nome: ");
        person.name = readData.nextLine().strip();

        System.out.print("Informe seu peso: ");
        person.weightString = readData.nextLine().replace(",", ".");
        PersonTwo.weight = Double.parseDouble(person.weightString);

        System.out.print("Informe o nome da comida: ");
        food.foodName = readData.nextLine().strip();

        System.out.print("Informe o peso da comida (em gramas): ");
        food.foodWeightString = readData.nextLine().replace(",", ".");
        food.foodWeight = Double.parseDouble(food.foodWeightString);

        System.out.print("\n");
        System.out.print("Informe o nome da segunda comida: ");
        food.secondFoodName = readData.nextLine().strip();

        System.out.print("Informe o peso da comida (em gramas): ");
        food.secondFoodWeightString = readData.nextLine().replace(",", ".");
        food.secondFoodWeight = Double.parseDouble(food.foodWeightString);

        System.out.print("Você quer comer (s/n)? ");
        food.wannaEat = readData.next().toLowerCase();

        if (food.wannaEat.startsWith("s")) {
            System.out.print("Qual alimento você quer comer?\n");
            for (var i = 0; i < 5; i++) {
                System.out.print("-=-=");
            }
            System.out.printf("\n[ 1 ] -> %s\n", food.foodName);
            System.out.printf("[ 2 ] -> %s\n", food.secondFoodName);
            for (var i = 0; i < 5; i++) {
                System.out.print("-=-=");
            }
            System.out.print("\nQual número do pedido: ");
            food.foodNumber = readData.nextInt();

            var result = (food.eat(food.wannaEat, food.foodWeight, food.secondFoodWeight, food.foodNumber));

            switch (food.foodNumber) {
                case 1:
                    System.out.println("COMIDA " + food.foodName);
                    System.out.printf("PESO ANTES DE COMER %.2f (Kg)\n", PersonTwo.weight);
                    System.out.printf("PESO FINAL %.2f (Kg)",result);
                    break;
                case 2:
                    System.out.println("COMIDA " + food.secondFoodName);
                    System.out.printf("PESO ANTES DE COMER %.2f (Kg)\n", PersonTwo.weight);
                    System.out.printf("PESO FINAL %.2f (Kg)", result);
                    break;
                default:
                    System.out.println(result);
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
        else {
            System.out.println("Nenhum alimento foi consumido!");
        }
    }
}
