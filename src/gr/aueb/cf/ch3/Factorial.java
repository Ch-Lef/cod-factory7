package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Δώσε έναν αριθμό:");
        n = scanner.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }
        System.out.println("Το " + n + "! = " + facto);
    }
}

