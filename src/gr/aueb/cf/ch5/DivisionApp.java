package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Double Demo
 */

public class DivisionApp {

    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;

        float myFloat = 4.5f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Division: %.2f\n", div);
        System.out.printf("Modulus: %.2f\n", mod);

    }
}
