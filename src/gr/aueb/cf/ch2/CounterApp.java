package gr.aueb.cf.ch2;

/**
 * Counts steps up, distance down.
 */
public class CounterApp {

    public static void main(String[] args) throws InterruptedException {

        //Δήλωση μεταβλητών
        int steps = 0;
        int distance = 3;

        while (distance >= 0) {
            System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
            Thread.sleep(1000);
        }
    }
}

