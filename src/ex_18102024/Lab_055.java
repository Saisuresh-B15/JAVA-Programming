package ex_18102024;

import java.util.Scanner;

public class Lab_055{
    public static void main(String[] args) {
       /* Write a program that classifies a triangle based on its side lengths.

        Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.

                side1, side2, side2 → eq, iso, scalene*/
        Scanner charan = new Scanner(System.in);
        System.out.println("enter the one side of triangle");
        int side1 = charan.nextInt();

        System.out.println("enter the one side of triangle");
        int side2 = charan.nextInt();

        System.out.println("enter the one side of triangle");
        int side3 = charan.nextInt();

        if((side1 == side2) || (side2 == side3) || (side3 == side1) ){
            System.out.println("it is a equilateral triangle");

        }else if((side1 == side2) || (side2 == side3)){
            System.out.println("it is a Isosceles triangle");
        }else{
            System.out.println("it is a Scalene triangle");
        }

   charan.close();
    }
}
