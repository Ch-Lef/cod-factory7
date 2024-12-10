package gr.aueb.cf.ch3;

/**
 * Η κλάση StartsWhile εκτυπώνει n αστεράκια στην οθόνη.
 */
public class StartsWhile {
    public static void main(String[] args) {
        int stars = 10;
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println("");
    }
}
