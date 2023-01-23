import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int star = 5;
        for (int i = 1; i <=star ; i++) {
            for (int j = star; j >=i ; j--) {
                System.out.print("+");
            }
            System.out.println();

        }
    }
}