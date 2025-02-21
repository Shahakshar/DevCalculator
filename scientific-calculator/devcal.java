import java.util.Scanner;

public class devcal {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        try {
            double result;
            switch (op) {
                case '+': result = add(a, b); break;
                case '-': result = subtract(a, b); break;
                case '*': result = multiply(a, b); break;
                case '/': result = divide(a, b); break;
                default: throw new IllegalArgumentException("Invalid operation");
            }
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

