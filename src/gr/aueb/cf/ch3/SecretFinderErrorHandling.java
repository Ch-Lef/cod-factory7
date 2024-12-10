package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUMBER = 7;
        boolean success = false;

        while (true) {
            System.out.println("Enter your guess: ");
            num = scanner.nextInt();

            if (num != SECRET_NUMBER) {
                System.out.println("Sorry, try again!");
                continue;
            }

            System.out.println("Congratulations! You found the secret number!");
            break;
        }

    }
}
