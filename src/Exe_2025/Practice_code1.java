package Exe_2025;

import java.util.Scanner;
public class Practice_code1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                int sum = 0;

                while (number > 0) {
                    sum += number % 10; // Get last digit and add to sum
                    number /= 10; // Remove last digit
                }

                 System.out.println("Sum of digits: " + sum);

                scanner.close();
            }
        }


