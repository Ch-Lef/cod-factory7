package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Η κλάση FrogJumpsApp υπολογίζει το πλήθος των βημάτων που κάνει ένας βάτραχος για να διασχίσει μια απόσταση.
 */
public class FrogJumpsApp {

    public static void main(String[] args) {

        // Δήλωση μεταβλητών
        int start = 0; // αρχική θέση του βάτραχου
        int target = 0; // τελική θέση του βάτραχου
        int hop = 0; // το μέγεθος του βήματος του βάτραχου
        int jumps = 0;// το πλήθος των βημάτων που κάνει ο βάτραχος

        Scanner scanner = new Scanner(System.in);

        // Εντολές
        System.out.println("Δώσε την αρχική θέση του βάτραχου:");
        start = scanner.nextInt();

        System.out.println("Δώσε την τελική θέση του βάτραχου:");
        target = scanner.nextInt();

        System.out.println("Δώσε το μέγεθος του βήματος του βάτραχου:");
        hop = scanner.nextInt();

        jumps = (int) Math.ceil((double) (target - start) / hop);

        System.out.println("Ο βάτραχος κάνει " + jumps + " βήματα για να διασχίσει την απόσταση.");
    }

}

