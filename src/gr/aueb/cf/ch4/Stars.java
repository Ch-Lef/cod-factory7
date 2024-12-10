package gr.aueb.cf.ch4;

/**
 * Print different outputs of stars
 */

public class Stars {

    public static void main(String[] args) {

        // vertical line of stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();

        // horizontal line of stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
        System.out.println();

        // square of stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // triangle of stars ascending
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // triangle of stars descending
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
