package ex_18102024;
import java.util.Scanner;

public class Lab_054 {
    public static void main(String[] args) {
        //Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sai = new Scanner (System.in);
        System.out.println("enter the value");
        int num = sai.nextInt();
        char garde = 'A';

        if(num>=90 && num<=100 ){
            System.out.println("grade should be " + 'A');
        }else if(num>=80 && num<=89){
            System.out.println("grade should be "+ 'B');
        }else if (num>=70 && num<=79){
            System.out.println("grade should be" + 'C');
        }else if(num>=60 && num<=69){
            System.out.println("grade should be " + 'D');
        }else if(num<0 || num>100){
            System.out.println("grade should be lol " + 0);
        }else{
            System.out.println("grade should be " + 'F');
        }


     sai.close();

    }
}
