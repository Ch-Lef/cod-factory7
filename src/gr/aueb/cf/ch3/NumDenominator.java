package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Enter the numerator:  (0 = exit)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                break;
            }

            System.out.println("Enter the denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator cannot be zero!");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }
}
