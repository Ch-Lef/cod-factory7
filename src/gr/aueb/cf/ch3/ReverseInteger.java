package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int inputNum = 0;
        int tempNum = 0;
        int reversedNum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        inputNum = scanner.nextInt();
        tempNum = inputNum;

        while (tempNum != 0) {
            reversedNum = reversedNum * 10 + tempNum % 10;
            tempNum /= 10;
        }
        System.out.println(inputNum + " reversed is : " + reversedNum);
    }
}
