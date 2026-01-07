import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Enter operator (+ - * /):");
        char op = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double b = scanner.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
