package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει ως input ένα διψήφιο ακέραιο και εκτυπώνει το άθροισμα των ψηφίων του.
 */

public class DigitsSum {
    public static void main(String[] args) {


        int num = 0;
        int sum = 0;
        int digit1 = 0;
        int digit2 = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Δώσε ένα διψήφιο αριθμό: ");

            num = in.nextInt();
            digit1 = num / 10;
            digit2 = num % 10;
            sum = digit1 + digit2;

            System.out.println("Το άθροισμα των ψηφίων του " + num + " είναι: " + sum);
            System.out.println("Επανάληψη; (y/n)");
            String answer = in.next();
            if (!answer.equals("y")) {
                System.out.println("Γίνεται έξοδος...");
                break;
            }
        }
    }
}
