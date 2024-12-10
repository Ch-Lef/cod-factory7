package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int topNumber = 0;
        int i = 2;

        System.out.println("Enter a number: ");

        topNumber = scanner.nextInt();

        while (i <= topNumber) {
            result += i;
            i += 2;
        }

        System.out.println("The sum of all even numbers from 2 to " + topNumber + " is: " + result);
    }
}

