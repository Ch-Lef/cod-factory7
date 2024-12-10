package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int i = 1;

        System.out.println("δώσε έναν αριθμό :");
        inputNumber = scanner.nextInt();

        while (i <= 10) {
//            System.out.println(inputNumber + " * " + i + " = " + inputNumber * i);
            System.out.printf("%d * %2d = %2d\n", inputNumber, i, inputNumber * i);
            i++;
        }
    }
}
