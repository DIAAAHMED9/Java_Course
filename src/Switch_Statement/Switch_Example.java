package Switch_Statement;

import java.util.Scanner;

public class Switch_Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double num1 = scanner.nextInt();
        System.out.println("Enter the operation");
        char ope = scanner.next().charAt(0);
        System.out.println("Enter the Second Number");
        double num2 = scanner.nextInt();
        double result = 0;
        switch (ope) {
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error");

        }
        System.out.println("The result is " + result);
    }
}