import Modulos.Gtr;
import Modulos.Jetta;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        /*System.out.print("Qual é a velocidade máxima do JETTA: ");
        final int MAX_SPEED_JETTA = readData.nextInt();

        Jetta jetta = new Jetta(MAX_SPEED_JETTA);
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed);
        jetta.accelerateCar();
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed + "Km/h");
        jetta.accelerateCar();
        jetta.accelerateCar();
        jetta.accelerateCar();
        jetta.accelerateCar();
        System.out.println("Velocidade do Jetta = " + jetta.actualSpeed + "Km/h");*/

        Gtr gtr = new Gtr();

        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");
        gtr.accelerateCar();
        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");
        gtr.accelerateCar();
        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");
        gtr.accelerateCar();
        System.out.println("Velocidade GTR = " + gtr.actualSpeed + "Km/h");
    }
}
