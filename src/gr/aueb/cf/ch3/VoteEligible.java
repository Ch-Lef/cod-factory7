package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Η κλάση VoteEligible ελέγχει αν ένα άτομο είναι εκλέξιμο να ψηφίσει.
 */

public class VoteEligible {
    public static void main(String[] args) {
        // Δήλωση μεταβλητών
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;
        Scanner scanner = new Scanner(System.in);

        // Εντολές
        System.out.println("Δώσε την ηλικία σου: ");
        age = scanner.nextInt();
        isEligible = age > VOTING_AGE;

        System.out.printf("Right to vote: %b", isEligible);


    }
}
