package ex_17102024;

public class Lab_045 {
    //ternary operator example
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 60;
        int num4 = 90;

        int max_num = (num1>num2)? num2:(num2>num3) ? num3:num4;
        System.out.println(max_num);
    }
}
