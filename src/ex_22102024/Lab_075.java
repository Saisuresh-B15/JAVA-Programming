package ex_22102024;

import java.util.Scanner;

public class Lab_075 {
    public static void main(String[] args) {

        //Write a program that uses a while loop to calculate the sum of the first N natural numbers.
        // For example, if N = 5, the sum is 1 + 2 + 3 + 4 + 5 = 15
        Scanner sai = new Scanner(System.in);
        System.out.println("enter the natural number");
        int s = sai.nextInt();

        int sum =0;


        while(s<=5) {
            sum += s;
            s++;
        }

        System.out.println("The sum of the first " + s + " natural numbers is: " + sum);
    }

}
