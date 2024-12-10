package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        int result;

        while (true) {
            printMenu();
            choice = getChoice();
            if (!isValidChoice(choice)) {
                System.out.println("Invalid choice, try again (1-6)");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }


    }

    public static void printMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
    }

    public static int getChoice() {
        return scanner.nextInt();
    }

    public static boolean isValidChoice(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int a, b, result = 0;
        System.out.println("Enter two numbers:");
        a = getChoice();
        b = getChoice();


        switch (choice) {
            case 1:
                result = add(a, b);
                break;
            case 2:
                result = sub(a, b);
                break;
            case 3:
                result = mul(a, b);
                break;
            case 4:
                result = div(a, b);
                break;
            case 5:
                result = mod(a, b);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero");
            return 0;
        }
        return a % b;
    }


}
