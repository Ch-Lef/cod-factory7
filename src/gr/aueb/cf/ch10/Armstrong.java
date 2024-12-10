package gr.aueb.cf.ch10;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int numberOfDigits;
        int temp;
        temp = number;

        numberOfDigits = String.valueOf(number).length();
        for (int i = 0; i < numberOfDigits; i++) {

            sum += (int) Math.pow(temp % 10, numberOfDigits);
            temp /= 10;
        }


        System.out.printf("The number: %d is%s an Armstrong number", number, sum == number ? "" : " not");

    }
}
