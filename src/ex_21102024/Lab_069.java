package ex_21102024;

public class Lab_069 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        int c = a+b;
        int de = 50;
        System.out.println(c);

        switch(de){
            case 10:
                System.out.println("print 10");
                break;
            case 30:
                System.out.println("print 30");
            case 40:
                System.out.println("print " + (a+b));
                break;
            case 50:
                System.out.println("null");

        }
    }
}
