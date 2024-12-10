package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET_NUMBER = 7;

        System.out.println("Enter your guess: ");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET_NUMBER) {
            System.out.println("Congratulations! You found the secret number!");
            return;
        } else {
            System.out.println("Sorry, you lost!");
        }

    }

}
