package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * * Η κλάση DateTimeToSecondsConverter παίρνει
 * μία ημερομηνία και ώρα και τη μετατρέπει σε δευτερόλεπτα.
 */

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_DAY = 86400;

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Δώσε τις μέρες:");
        days = in.nextInt();
        System.out.println("Δώσε τις ώρες:");
        hours = in.nextInt();
        System.out.println("Δώσε τα λεπτά:");
        minutes = in.nextInt();
        System.out.println("Δώσε τα δευτερόλεπτα:");
        seconds = in.nextInt();

        totalSeconds = days * SECONDS_IN_DAY + hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
        System.out.println("Οι συνολικά δευτερόλεπτα είναι: " + totalSeconds);

    }
}
