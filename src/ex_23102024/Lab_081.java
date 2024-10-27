package ex_23102024;

public class Lab_081 {
    public static void main(String[] args) {
        String age = args[0];
        int a = Integer.parseInt(age);
        System.out.println("enter the value");

        while(a>30){
            System.out.println(a);
            a--;
        }
    }

    }