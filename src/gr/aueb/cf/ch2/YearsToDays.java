package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Η κλάση YearsToDays παίρνει την ηλικία ενός ατόμου σε χρόνια και τη μετατρέπει σε ημέρες.
 */

public class YearsToDays {
    public static void main(String[] args) {
        // Δήλωση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int days = 0;
        int age = 0;

        // Εντολες
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        // Εκτύπωση αποτελέσματος
        System.out.println("You are " + days + " days old.");

    }
}
