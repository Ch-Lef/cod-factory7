package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        int num;
        Scanner scanner = new Scanner(System.in);

        while (i <= 0) {
            System.out.println("Never Gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never Gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("Gets in");
            i++;
        }

        while (true) {
            System.out.println("Infinite Loop");
            break;
        }

        while ((scanner.nextInt()) >= 0) {
            System.out.println("Infinite Loop");
        }
    }

}
