package gr.aueb.cf.ch2;

/**
 * Η κλάση RandomApp δημιουργεί τυχαίους αριθμούς.
 */
public class RandomApp {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int die = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            System.out.println("Ο τυχαίος αριθμός είναι: " + die + " " + die2);
        }

    }
}
