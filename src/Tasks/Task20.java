package Tasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");
            int y = sc.nextInt();

            System.out.println("\nCalculation Results:");
            System.out.println("-------------------");
            sum(x, y);
            difference(x, y);
            multiplication(x, y);
            division(x, y);
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } finally {
            sc.close();
        }
    }

    static void sum(int a, int b) {
        System.out.printf("Sum: %d + %d = %d%n", a, b, (a + b));
    }

    static void difference(int a, int b) {
        int diff = Math.abs(a - b);
        System.out.printf("Difference: |%d - %d| = %d%n", a, b, diff);
    }

    static void multiplication(int a, int b) {
        System.out.printf("Multiplication: %d × %d = %d%n", a, b, (a * b));
    }

    static void division(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            double result = (double) a / b;
            System.out.printf("Division: %d ÷ %d = %.2f%n", a, b, result);
        } catch (ArithmeticException e) {
            System.out.println("Division: Error - " + e.getMessage());
        }
    }
}