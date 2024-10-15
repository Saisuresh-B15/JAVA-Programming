package ex_15102024;

public class Lab_033 {
    public static void main(String[] args) {
        int a = 36;
        int b = 26;
        int c = 50;
        System.out.println((a>b)? "A":(b>c)? "B":"C");
        System.out.println((a>b)? a:(b>c)? b:c);
    }
}
