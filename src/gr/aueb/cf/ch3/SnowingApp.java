package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        System.out.println("βρέχει; (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Δώσε τη θερμοκρασία:");
        temp = scanner.nextInt();

        isSnowing = temp < 0 && isRaining;
        System.out.println("Χιονίζει; " + isSnowing);
    }
}
