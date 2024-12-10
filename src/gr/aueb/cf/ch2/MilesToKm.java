package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Η κλάση MilesToKm μετατρέπει από μίλια σε χιλιόμετρα.
 */

public class MilesToKm {

    public static void main(String[] args) {
        // δήλωση μεταβλητών
        final double KM_PER_MILE = 1.609;
        double inputMiles = 0.0;
        double resultKm = 0.0;
        Scanner scanner = new Scanner(System.in);

        // εντολές
        System.out.println("Δώσε τα μίλια προς μετατροπή:");
        inputMiles = scanner.nextDouble();
        resultKm = inputMiles * KM_PER_MILE;

        // εκτύπωση αποτελέσματος
        System.out.printf("%.2f μίλια είναι %.2f χιλιόμετρα\n", inputMiles, resultKm);
    }
}
