package ex_13112024november_poly;

public class Lab140Poly {
    int a = 10;
    String name = "sai";
    double d = 20.1;

    // Constructor
    public Lab140Poly(int x, String name1) {
        this.a = x;        // Use 'this' to refer to the instance variable
        this.name = name1; // Use 'this' to refer to the instance variable
    }

    // Method to print an integer
    void sai(int b) {
        System.out.println(b);
    }

    // Method that returns a string
    String Suresh(String name) {
        return name;
    }

    // Main method
    public static void main(String[] args) {
        Lab140Poly g = new Lab140Poly(20, "sai");
        System.out.println(g.name);
        System.out.println(g.a);// Prints the name set in the constructor
    }
}
