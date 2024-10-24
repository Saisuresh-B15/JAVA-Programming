package ex_21102024;

import java.util.Scanner;

public class Lab_070 {
    public static void main(String[] args) {
        Scanner decimal = new Scanner(System.in);
        System.out.println("enter the decimal no");
        short f1 = decimal.nextShort();
       // System.out.println("enter the second decimal no");
       // short f2 = decimal.nextShort();

        switch(f1){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            default:
                System.out.println(3);
        }


    }
}
