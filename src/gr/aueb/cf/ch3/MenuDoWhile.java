package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Επιλογή 1");
            System.out.println("2. Επιλογή 2");
            System.out.println("3. Έξοδος");
            System.out.println("Δώσε την επιλογή σου:");
            choice = scanner.nextInt();
        } while (choice != 3);
        System.out.println("``thank you for using our application");
    }
}
