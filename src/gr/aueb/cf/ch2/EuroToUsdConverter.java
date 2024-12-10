package gr.aueb.cf.ch2;

import java.util.Scanner;

//**
// * Η κλάση EuroToUsdConverter πραγματοποιεί μετατροπή από ευρώ σε δολάρια.
// */

public class EuroToUsdConverter {
    public static void main(String[] args) {
        int euro = 0;
        int usdCents = 0;
        final int PARITY=99;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώσε το ποσό σε ευρώ προς μετατροπή:");
        euro = in.nextInt();

        usdCents=euro*PARITY;
        System.out.println("Το ποσό σε $ δολάρια είναι: " + usdCents/100 + "." + usdCents%100);

    }
}