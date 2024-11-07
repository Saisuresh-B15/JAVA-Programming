package ex_28102024;

public class Lab_107 {
    public static void main(String[] args) {
        String name = "My name is sai";
        String b2 = name.replace('m', 'w');
        System.out.println(b2);

        String result2 = name.replaceAll("My name is sai+","charan");
        System.out.println(result2);

        String B2 = "Divya";
        String B5 = B2.replaceAll("Divya","Raju");
        System.out.println(B5);
    }
}
