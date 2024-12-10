package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();
        if (totalMarks <= 0) {
            System.out.println("Total marks cannot be negative");
            System.exit(1);
        }
        System.out.println("Enter the number of courses: ");
        coursesCount = scanner.nextInt();

    }
}
