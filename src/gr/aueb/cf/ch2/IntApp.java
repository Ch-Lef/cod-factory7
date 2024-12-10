package gr.aueb.cf.ch2;

/**
 * Εμφανίζει τους τύπους δεδομένων int, byte, short, long και τα μεγέθη τους.
 */

public class IntApp {
    public static void main(String[] args) {
        System.out.printf("int. Size: %d, Min: %,d, Max: %d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("byte. Size: %d, Min: %,d, Max: %,d\n", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short. Size: %d, Min: %,d, Max: %,d\n", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d, Min: %,d, Max: %,d\n", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%d",Integer.SIZE);
        int sum=Integer.MAX_VALUE;
        System.out.println(sum);
        System.out.println(sum+1);
    }
}
