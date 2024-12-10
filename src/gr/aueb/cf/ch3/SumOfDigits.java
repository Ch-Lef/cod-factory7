package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;
        int inputNumber = 0;
        int tempNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        inputNumber = scanner.nextInt();
        tempNumber = inputNumber;

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("The sum of the digits of: " + inputNumber + " is " + sum);
    }
}
