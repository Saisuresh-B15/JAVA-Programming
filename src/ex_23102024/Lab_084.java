package ex_23102024;

import java.util.Scanner;

public class Lab_084 {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        System.out.println("enter the value of bunny");
        int bunny = sai.nextInt();

        for(bunny=0; bunny<=20; bunny++) {
            System.out.println(bunny);
        }
        sai.close();
    }
}
