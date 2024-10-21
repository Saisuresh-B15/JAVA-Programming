package ex_16102024;

import java.util.Scanner;


public class Lab_041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter my name");
        String name = scanner.nextLine();
        System.out.println("enter your Age:");
        int Age = scanner.nextInt();
        System.out.println("Enter my Grade:");
        String grade = scanner.next();

        System.out.println("Name :"+ name);
        System.out.println("Age:" +Age);
        System.out.println("Grade:"+ grade);


    }
}
