package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positivesCoount = 0;
        int inputNum = 0;
        System.out.println("Please insert a number:");
        inputNum = in.nextInt();

        while (inputNum >= 0) {
            positivesCoount++;
            System.out.println("Please insert a number:");
            inputNum = in.nextInt();
        }
        System.out.println("You inserted " + positivesCoount + " positive numbers.");
    }
}
