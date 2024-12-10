package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * turn lght on if is raining AND car is running >100 OR is dark
 */

public class LightsOn {
    public static void main(String[] args) {
        boolean isDay = false;
        boolean isRaining = false;

        boolean isCarRunning = false;
        int speed = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it day? (true/false)");
        isDay = scanner.nextBoolean();
        System.out.println("Is it raining? (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("What is the speed of the car?");
        speed = scanner.nextInt();
        isCarRunning = speed > 100;

        boolean isLightOn = isRaining && (isCarRunning || !isDay);
        System.out.println("Are the lights on? " + isLightOn);
    }
}
