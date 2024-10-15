package Tasks;

public class Task5 {
    public static void main(String[] args) {
        int a = 16;
        int b = 26;
        int c = 50;
        System.out.println((a>b)? "A":(b>c)? "B":"C");
        System.out.println((a>=b)? a:(b>c) ? b:("Alphabet is true") +" "+ c);
    }
}
