package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        
        try {
            System.out.print("Please enter 2 integers: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            result = div(num1, num2);
            System.out.println("Division: " + result);
        } catch (InputMismatchException e) {
            System.out.println("input musb be integers");
        } catch (Exception e) {
            System.out.println("An error occurred");

        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws Exception {

        try {
            if (b == 0) throw new Exception("Division by zero");
            return a / b;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
