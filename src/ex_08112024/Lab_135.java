package ex_08112024;

public class Lab_135 {
    public static void main(String[] args) {
       // dog d = new dog();
      //  d.barking();

       dog.wolf wolf  = new dog.wolf();
       wolf.barking();


    }
    static class dog{
        void barking(){
            System.out.println("dog is braking");
        }
          static class wolf extends dog{
            void barking(){
                System.out.println("wolf is howing");
            }
          }
    }
}

