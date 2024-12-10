package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * calculates the power of a number a^n
 */

public class PowerApp {
    public static void main(String[] args) {

        //initializing variables
        int base = 2;
        int power = 100;
        int result = 1;
        BigInteger bigResult = new BigInteger("1");


        // for loop to calculate the power of a number
        for (int i = 1; i <= power; i++) {
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        //printing results
        System.out.println(base + " to the power of " + power + " is " + result);
        System.out.println(base + " to the power of " + power + " is " + bigResult);
    }
}
