package Array;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

// int [] num1 = new int[];
//        int[] num2 = {value};
//        int [] num1[][] = new int[][][];
//        int[][] num2 = {value}{value2};
//        int[][] num = new int[3][4];
//        num[0][0] = 7;
//        num[0][1] = 3;
//        num[0][2] = 2;
//        num[0][3] = 5;
//        num[1][0] = 7;
//        num[1][1] = 3;
//        num[1][2] = 2;
//        num[1][3] = 5;
//        num[2][0] = 7;
//        num[2][1] = 3;
//        num[2][2] = 2;
//        num[2][3] = 5;
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.println(num[i][j]);
//
//            }
//
//    }

//        for (int[] arr1:num) {
//            for (int arr2:arr1) {
//                System.out.println(arr2);
//
//            }
//
//        }

//        int[][] num = {{3, 2, 1, 0}, {7, 6, 5}, {9, 8}};
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.println(num[i][j]);
//            }
//        }
//        for (int[] arr1 : num) {
//            for (int arr2 : arr1) {
//                System.out.println(arr2);
//            }
//        }

        int[][][] num = {

                {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}},
                {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}
                }
        };
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.println(num[i][j][k]);
//
//                }
//
//            }
//
//        }

        for (int[][] arr2d: num) {
            for (int[]arr1d:arr2d) {
                for (int print:arr1d) {
                    System.out.println(print);

                }

            }

        }
//        Example
        int [][] arr1 = {{2,3,4},{4,5,6}};
        int [][] arr2 = {{6,7,8},{1,2,3}};
        int [][] sum =new int[2][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] =arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The Sum");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.println(sum[i][j]);

            }
        }



    }
}
