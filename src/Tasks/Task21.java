package Tasks;

import java.util.Scanner;

public class Task21{
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String args[])
        {
            Scanner sc=  new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a  = sc.nextInt();

            System.out.println ( "Enter the second number : ");
            int b  = sc.nextInt();

            //Performing operations
            System.out.println("sum: " + sum(a, b));
            System.out.println("sub: " + sub(a, b));
            System.out.println("mul: " + mul(a, b));
            System.out.println("div: " + div(a, b));
            System.out.println("mod: " + mod(a, b));


        }

        public static int sum(int a  , int b)
        {
            return a + b;
        }
        public static int sub(int a  , int b)
        {
            return a - b;
        }
        public static int mul(int a  , int b)
        {
            return a * b;
        }
        public static double div(int a  , int b)
        {
            if(b !=0) {

                return (double) a / b;
            }
            else
            {
                System.out.println("Division by zero is not possible");
                return 0;
            }
        }
        public static int mod(int a  , int b)
        {
            return a % b;
        }

    }




