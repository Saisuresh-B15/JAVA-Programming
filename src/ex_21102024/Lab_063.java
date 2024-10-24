package ex_21102024;

import java.util.Scanner;

public class Lab_063 {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);
        System.out.println("Enter the month name");
        int month = months.nextInt();

        switch(month){
            case 1:
                System.out.println("print the month jan");
                break;
            case 2:
                System.out.println("print the month feb");
                break;

            case 3:
                System.out.println("print the month march");
                break;

            case 4:
                System.out.println("print the month april");
                break;

            case 5:
                System.out.println("print the month may");
                break;

            case 6:
                System.out.println("print the month june");
                break;

            case 7:
                System.out.println("print the month july");
                break;

            case 8:
                System.out.println("print the month aug");
                break;

            case 9:
                System.out.println("print the month sept");
                break;

            case 10:
                System.out.println("print the month oct");
                break;

            case 11:
                System.out.println("print the month nov");
                break;

            case 12:
                System.out.println("print the month dec");
                break;
            case 13:
                System.out.println("print the default jan");
            default:

        }
        months.close();
    }

}
