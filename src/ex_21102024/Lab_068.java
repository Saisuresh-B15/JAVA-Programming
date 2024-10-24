package ex_21102024;

import java.util.Scanner;

public class Lab_068 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("enter the day");
        int day = days.nextInt();

        switch(day){
            case 1:
                System.out.println("print monday");
            case 2:
                System.out.println("print tuesday");
                case 3:
                    System.out.println("print wednesday");
            case 4:
                System.out.println("print thursday");
            case 5:
                System.out.println("print friday");
            case 6:
                System.out.println("print saturday");
            case 7:
                System.out.println("print sunday");
            default:
                System.out.println("I have to discover new day");
        }
        days.close();
    }
}
