package ex_21102024;

import java.util.Scanner;

public class Lab_061 {
    public static void main(String[] args) {
        Scanner points_table = new Scanner(System.in);
        System.out.println("enter the point1");

        int point1 = points_table.nextInt();
        System.out.println("enter the point2");
        int point2 = points_table.nextInt();
        System.out.println("enter the point3");
        int point3 = points_table.nextInt();

        if(point1 > point2){
            System.out.println("it is table topper");
        }else if(point2 >point3){
            System.out.println("it is a table second");
        }else if(point1 >point3){
            System.out.println("hey what are you expecting");
        }else{
            System.out.println("it is table last");
        }
        points_table.close();

    }
}
