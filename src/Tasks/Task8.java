package Tasks;

public class Task8 {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);

        System.out.println(a);
        // line 5/ a = 10;
        //line ++a -> 11
        //+
        //a++ -> 11, a=12
        //+
        //a++ -> 12= ,a=13
    }

}
