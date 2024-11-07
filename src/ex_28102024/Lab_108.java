package ex_28102024;

import java.util.Scanner;

public class Lab_108 {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        System.out.println("enter the value");
        int s = sai.nextInt();

        for(; 0<s; s--){
            System.out.println(s);
        }
        sai.close();
    }

}
