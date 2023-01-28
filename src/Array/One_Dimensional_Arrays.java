package Array;

public class One_Dimensional_Arrays {

    public static void main(String[] args) {

        int[] num1 ={5,4,3,2,1};
        int[] num = new int[5];
        num[0]=0;
        num[1]=1;
        num[2]=2;
        num[3]=3;
        num[4]=4;


//        for(datatype name : num)
        for (int i:num) {
            System.out.println(i);
        }

        int[] num2 = {5, 4, 3, 2, 1};
        System.out.println("****** Print use for loop ******");

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        System.out.println("****** Print use foreach ******");
        for (int i : num2) {
            System.out.println(i);

        }
//        Example ..............
//
//        Q1
//        int sum =0;
//        for (int i = 0; i < num.length; i++) {
//            sum += num.length; // 15
//
//        }
//
//        double avr = sum/ num.length;
//        System.out.println("Sum = "+sum);
//        System.out.println("Average = "+avr);

//        Q2
//        int coun =0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i]==7){
//                coun ++;
//
//            }
//
//        }
//
//        System.out.println(coun);


//        int [] num = {4,5,6,7,7,8,9};


//        Q3

//        int min =10;
//        int max =1;
//        for (int i = 0; i <= num.length-1; i++) {
////
////            if (max <num[i]) {
////                max=num[i];
////
////            }
//            if (min > num[i]) {
//                min=num[i];
//            }
//        }
//        System.out.println(min);


//        Q4
//
//        int [] num = {4,5,6,7,7,8,9};
//        int [] num1 = {1,2,3,4,7,8,9};
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num1.length; j++) {
//                if (num[i] ==num1[j]) {
//                    System.out.println(num1[j]);
//
//                }
//
//            }
//        }





    }
}
