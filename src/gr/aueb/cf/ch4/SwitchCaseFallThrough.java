package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("You failed");
                break;
            case 5:
            case 6:
                System.out.println("You passed");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
            case 9:
            case 10:
                System.out.println("You passed with distinction");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
