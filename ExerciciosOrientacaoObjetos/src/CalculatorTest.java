import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String value;
        String valueTwo;

        Calculator calculator = new Calculator();
        System.out.println("CALCULADORA!");

        System.out.print("Informe o primeiro valor: ");
        calculator.valueString = readData.nextLine().replace(',', '.');
        calculator.value = Double.parseDouble(calculator.valueString);

        System.out.print("Informe o segundo valor: ");
        calculator.valueStringTwo = readData.nextLine().replace(',', '.');
        calculator.valueTwo = Double.parseDouble(calculator.valueStringTwo);

        System.out.print("Informe o operador (+, -, *, /): ");
        calculator.operator = readData.next();

        double resultAddition = calculator.addition();
        double resultSubtraction = calculator.subtraction();
        double resultMultiplication = calculator.multiplication();
        double resultDivision = calculator.division();

        System.out.printf("SOMA = %.2f\n", resultAddition);
        System.out.printf("SUBTRAÇÃO = %.2f\n", resultSubtraction);
        System.out.printf("MULTIPLICAÇÃO = %.2f\n", resultMultiplication);
        System.out.printf("DIVISÃO = %.2f", resultDivision);
        
        String calc = Calculator.calc(calculator.value, calculator.valueTwo, calculator.operator);
        System.out.printf(calc);
    }
}
