package ex_06112024;

import java.util.Scanner;

public class Lab_127 {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        System.out.println("ENTER THE NAME");
        String s = sai.next();

        for(int i = 0; i<=10; i++){
            System.out.println(s);
        }
        sai.close();
    }
}
