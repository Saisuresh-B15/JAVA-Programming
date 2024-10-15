package ex_14102024;

public class Lab_027 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte)a; //narrowing
        System.out.println(a);
        System.out.println(b);
        float c =1.12f;
        short d = (short)c;
        System.out.println(d);
        long e = 123456788; //narrowing
        float f = (float)e;
        System.out.println(f);
    }
}
