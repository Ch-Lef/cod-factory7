package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {
    public static void main(String[] args) {

        final double VAT = 1.24;
        double inputPrice = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Δώσε την τιμή χωρίς ΦΠΑ:");
        inputPrice = scanner.nextDouble();

        System.out.printf("Η τιμή με ΦΠΑ είναι: %.2f", inputPrice * VAT);
    }
}
