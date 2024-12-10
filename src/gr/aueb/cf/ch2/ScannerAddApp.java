package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerAddApp {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("Δώσε τον πρώτο αριθμό: ");
                num1 = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Λάθος είσοδος");
                in.next();
            }
        }
        while (true) {
            try {
                System.out.println("Δώσε τον δεύτερο αριθμό: ");
                num2 = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Λάθος είσοδος");
                in.next();
            }
        }

        sum = num1 + num2;
        System.out.println("Το άθροισμα των αριθμών είναι: " + sum);
    }
}
