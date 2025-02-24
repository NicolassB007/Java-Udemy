public class Calculator {
    String valueString;
    double value;

    String valueStringTwo;
    double valueTwo;

    String operator;

    static String calc(double value, double valueTwo, String operator) {
        if (operator.equalsIgnoreCase("+")) {
            double resultAddiction = value + valueTwo;
            String message = String.format("SOMA = %.2f", resultAddiction);
            return message;
        }
        else if (operator.equalsIgnoreCase("-")) {
            double resultSubtraction = value - valueTwo;
            String message = String.format("SUBTRAÇÃO = %.2f", resultSubtraction);
            return message;
        }
        else if (operator.equalsIgnoreCase("*")) {
            double resultMultiplication = value * valueTwo;
            String message = String.format("MULTIPLICAÇÃO = %.2f", resultMultiplication);
            return message;
        }
        else if (operator.equalsIgnoreCase("/")) {
            if (valueTwo != 0) {
                double resultDivision = value / valueTwo;
                String message = String.format("DIVISÃO = %.2f", resultDivision);
                return message;
            }
            else {
                String errorDivisionByZero;
                errorDivisionByZero = "Não é possível realizar divisão por 0!";
                return errorDivisionByZero;
            }
        }
        else {
            return "Operador inválido!";
        }
    }

    double addition() {
        double resultAddition;
        resultAddition = value + valueTwo;
        return resultAddition;
    }

    double subtraction() {
        double resultSubtraction;
        resultSubtraction = value - valueTwo;
        return resultSubtraction;
    }

    double multiplication() {
        double resultMultiplication;
        resultMultiplication = value * valueTwo;
        return resultMultiplication;
    }

    double division() {
        double resultDivision;
        resultDivision = value / valueTwo;
        return resultDivision;
    }
}
