package ex_18102024;

import java.util.Scanner;

public class Lab_056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        int s = scanner.nextInt();
        System.out.println("enter the second value");
        int s2 = scanner.nextInt();
        System.out.println("null");
        int sum = scanner.nextInt();

        switch(sum){
            case 1 :
                System.out.println(s);
                break;
            case 2:
                System.out.println(s2);
            case 3:
                System.out.println("null");
            default:
                break;
        }
    }
}
