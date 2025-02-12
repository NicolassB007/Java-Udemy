import javax.swing.*;

public class Aula02 {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Informe um número: ");

        int valueInt = Integer.parseInt(value);

        if (valueInt % 2 == 0) {
            System.out.println("O valor é PAR");
        }
        else {
            System.out.println("O valor é ÍMPAR");
        }
    }
}
