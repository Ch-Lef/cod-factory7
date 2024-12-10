package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Η κλάση PowerCalculator υπολογίζει την δύναμη ενός αριθμού.
 */

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Δώσε τη βάση και τη δύναμη: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
