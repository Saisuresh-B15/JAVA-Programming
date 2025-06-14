package Ex_jan01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_1148 {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int a = sai.nextInt();

        for (int i = a; i>= 1; i++) {
            for (int j = i; j > 1; j--)
            {
                System.out.println("c");
            }
            System.out.println("Sai");
        }

    }
}

    /*
      for (int i=rows; i>=1; i--){
                for( int j=i; j>=1; j--)
                {
     */
