import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Car jetta = new Jetta();
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed);
        jetta.accelerateCar();
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed + "Km/h");
        jetta.accelerateCar();
        jetta.accelerateCar();
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed + "Km/h");

        Car gtr = new Gtr();
        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");
        gtr.accelerateCar();
        gtr.accelerateCar();
        gtr.accelerateCar();
        gtr.brakeCar();
        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");

    }
}
