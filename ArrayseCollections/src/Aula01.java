import java.util.Arrays;

public class Aula01 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 7.9;
        notas[1] = 9.0;
        notas[2] = 1;
        notas[3] = 9.12;

        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        System.out.printf("SOMA DAS NOTAS = %.2f\n", total);
        System.out.printf("MÉDIA DAS NOTAS = %.2f", (total / 3));

        double[] notasB = { 5.4, 2.1, 3.4, 5.0};
        double totalB = 0;
        for (int i = 0; i < notasB.length; i++) {
            totalB += notasB[i];
        }

        System.out.printf("TOTAL NOTAS B = %.2f", totalB);
    }
}