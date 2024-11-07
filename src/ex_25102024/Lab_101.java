package ex_25102024;

public class Lab_101 {
    public static void main(String[] args) {
        String name = "Sai";
        String name1 = new String("Sai");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.length());
    }
}
