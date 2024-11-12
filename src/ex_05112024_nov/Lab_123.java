package ex_05112024_nov;

public class Lab_123 {
    public static void main(String[] args) {
        String s1 = "sai";
        String s2 = "suresh";
        String s3 = "batraju";

        switch(s3){
            case "sai":
                System.out.println(s1);
                break;
            case "suresh":
                    System.out.println(s2);
                    break;
            case "charan":
                System.out.println(s3);
                break;
            default:
                System.out.println("no matches found");

        }
    }
}
