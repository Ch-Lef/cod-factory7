package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2^" + i + " is " + power(2, i));
        }

    }

    public static long power(int base, int exponent) {
        return (exponent == 0) ? 1 : base * power(base, exponent - 1);
    }
}

