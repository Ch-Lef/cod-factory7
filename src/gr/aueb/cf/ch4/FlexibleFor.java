package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Thought demo of for
 */

public class FlexibleFor {
    public static void main(String[] args) {
        int startVal = 0;
        int stopVal = 0;
        int step;
        int iterations = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start, end and step");
        startVal = scanner.nextInt();
        stopVal = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startVal; i < stopVal; i += step) {

            iterations++;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("iterations: " + iterations);
    }

}
