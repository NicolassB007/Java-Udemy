import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        Car car = new Car();
        System.out.print("Informe o modelo do carro: ");
        car.model = readData.nextLine();

        System.out.print("Informe a marca do carro: ");
        car.brand = readData.nextLine();

        System.out.print("Informe o ano do carro: ");
        car.year = readData.nextInt();

        System.out.println(car.model);
        System.out.println(car.brand);
        System.out.println(car.year);
        System.out.println();
        car.startCar();
        System.out.printf("VELOCIDADE Km/h: %.2f\n", car.speed());
        car.turnOffCar();
    }
}
