package Exe_2025;

public class Practicecode2 {
    public static void main(String[] args) {
        String sai = "Suresh";
        String rev = "";
        int s = sai.length();
        for(int i=s-1; i>=0; i--)
        {
            rev = rev+sai.charAt(i);
        }
        System.out.println("Reverse my name"+ " "+rev);
    }
}
