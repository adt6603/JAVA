 class Calc {

     void area(int l) {
         System.out.println("Area of square is : " + (l * l));
     }
 }
    class shape extends Calc {

        void area(double l, double b) {
            System.out.println("Area of rectangle is : " + (l * b));
//return (float) (l*b);
        }
    }

 public class MyArea {
     public static void main(String[] args) {
         shape s = new shape();
         s.area(5);
         s.area(6.7, 8.9);
     }
 }


