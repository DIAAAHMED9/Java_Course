package Exeption_Handling;

public class Exception {
    public static void main(String[] args) {

//        int x = 5/0;
//        System.out.println(x);
//        ArithmeticException

//        String name = null;
//        System.out.println(name.length()); //NullPointerException

//        int[] x = new int[2];
//        x[2] =1;
//        System.out.println(x[2]);//ArrayIndexOutOfBoundsException

//        String x = "3";
//        System.out.println(Integer.parseInt(x));//NumberFormatException
//        try and catch


        try {
            int[] x = new int[2];
            x[2] = 1;
            System.out.println(x[2]);//ArrayIndexOutOfBoundsException
            try {
                int y = 5 / 0;
                System.out.println(y);
            } catch (ArithmeticException e) {
                System.out.println("Inner Error catch");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("ERROR catch 2");
        } finally {
            System.out.println("Final");
        }

//
//        static void print() throws ArithmeticException {
//
//            System.out.println("throws method");
//
//        try{
//            print();
//        }catch (java.lang.Exception e){
//            System.out.println(e);
//            System.out.println("catch");
//        }finally {
//            System.out.println("Final");
//        }
//
//        }


    }
}