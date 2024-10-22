package ex_17102024;


import java.util.Scanner;
public class Lab_049 {
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);

        int num = sai.nextInt();
        System.out.println("value is :" + num);

        if(num>60){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        sai.close();
    }
}
