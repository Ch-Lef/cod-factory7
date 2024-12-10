package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose: ");
            System.out.println("1. One player");
            System.out.println("2. Two players");
            System.out.println("3. Team game");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }

            //Verbose code
            if (choice == 1) {
                System.out.println("One player game");
            } else if (choice == 2) {
                System.out.println("Two players game");
            } else if (choice == 3) {
                System.out.println("Team game");
            } else {
                System.out.println("Exiting...");
            }


            //  Switch case
            switch (choice) {
                case 2:
                    System.out.println("One player game");
                    break;
                case 1:
                    System.out.println("Two players game");
                    break;
                case 3:
                    System.out.println("Team game");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 4);

    }
}
