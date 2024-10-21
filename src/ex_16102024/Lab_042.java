package ex_16102024;

import java.util.Scanner;

public class Lab_042 {
    public static void main(String[] args) {
        Scanner sai= new Scanner(System.in);

        System.out.println("enter my name:");
        String name= sai.nextLine();

        System.out.println("Enter the age:");
        int age = sai.nextInt();

        System.out.println("Enter my Salary");
        double salary = sai.nextDouble();

        System.out.println("Name"+ name);
        System.out.println("Age"+ age);
        System.out.println("salary"+ salary);
    }
}
