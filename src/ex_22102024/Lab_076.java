package ex_22102024;

import java.util.Scanner;

public class Lab_076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        int a = scanner.nextInt();

        int add = 2;

        while(a<=20){
            add *=a;
            a++;
        }
        System.out.println("addition of the numbers: "+ (a*add));
    }
}
