package ex_21102024;

public class Lab_067 {
    public static void main(String[] args) {
        String name1 = "Sai";
        String name2 = "Charan";
        String name3 = "karthik";
        String name4 = "Harsha Vardhan";
        String name = name1.toLowerCase();
        String name5 = name1.toLowerCase();
        String name6 = name1.toLowerCase();

        switch(name4){
            case "Sai":
                System.out.println("then print sai");
                break;
            case "Charan":
                System.out.println("then print Charan");
                break;
            case "karthik":
                System.out.println("then print karthik");
            case "Harsha Vardhan":
                System.out.println("then print surrao");
            default:
                System.out.println("then print sunny mama");
        }
    }
}
