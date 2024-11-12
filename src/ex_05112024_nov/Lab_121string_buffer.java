package ex_05112024_nov;



public class Lab_121string_buffer {
    public static void main(String[] args) {
        StringBuffer buffer_sai = new StringBuffer("sai");
        buffer_sai.append("suresh");
        System.out.println(buffer_sai);

        StringBuffer sai = new StringBuffer("sai suresh");
        int s1 = sai.lastIndexOf("s");
        int s2 = sai.indexOf("a");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "sai suresh";
        System.out.println(s3.indexOf("u"));
        System.out.println(s3.indexOf("e"));

        String s4 = "batraju";
        System.out.println(s4.contains("raju"));
        System.out.println(s4.contains("sai"));


    }
}
