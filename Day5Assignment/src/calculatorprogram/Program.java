package calculatorprogram;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Prompt user for two operands
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Prompt user for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double[] remainder = new double[1];
        double result = 0;

        // Perform the appropriate operation
        switch (operator) {
            case '+':
                result = calculator.Addition(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = calculator.Subtraction(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = calculator.Multiplication(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = calculator.Division(num1, num2, remainder);
                    System.out.println("Quotient: " + result);
                    System.out.println("Remainder: " + remainder[0]);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}

