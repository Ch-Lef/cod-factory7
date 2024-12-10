package gr.aueb.cf.ch3;

import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {

        int firstDigit = 0;
        int inputNumber = 0;
        int tempNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        inputNumber = scanner.nextInt();
        tempNumber = inputNumber;

        while (tempNumber >= 10) {
            tempNumber /= 10;
        }
        firstDigit = tempNumber;
        System.out.println("The first digit of: " + inputNumber + " is " + firstDigit);
    }
}
