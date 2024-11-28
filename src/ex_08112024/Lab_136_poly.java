package ex_08112024;

public class Lab_136_poly {
    public static void main(String[] args) {

        train1.train2 t = new train1.train2();
        t.horn();
    }
}
    class train1{
        void horn() {
        System.out.println("train horn is so high");
        }

        static class train2 extends train1{
            void horn() {
            System.out.println(" train 2 horn is low");
        }
    }
    }
