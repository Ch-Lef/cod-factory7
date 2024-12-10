package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary Operator demo.
 */

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please enter a number");
        num = scanner.nextInt();

//        if ( num >=-0) abs = num;
//        else abs = -num;

        // Ternary operator
        abs = (num >= 0) ? num : -num;

        System.out.println("The absolute value of " + num + " is " + abs);
    }

}
