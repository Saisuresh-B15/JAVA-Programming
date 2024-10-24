package ex_21102024;

import java.util.Scanner;

public class Lab_062 {
    public static void main(String[] args) {
        Scanner angles = new Scanner(System.in);
        System.out.println("enter the first angle degrees");
        int angle1 = angles.nextInt();
        System.out.println("enter the second angle degrees");
        int angle2 = angles.nextInt();
        System.out.println("enter the third angle degrees");
        int angle3 = angles.nextInt();

        if((angle1>=90) && (angle2>=90) &&(angle3>=90)){
            System.out.println("then it is equilateral triangle");
        }else if((angle1>90) || (angle2>90) || (angle3<10)){
            System.out.println("then it is scalene triangle");
        }else{
            System.out.println("then it is isosceles triangle");
        }
        angles.close();
    }
}
