package gr.aueb.cf.ch5;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 11;
        System.out.println("num is even " + isEven(num));
        System.out.println("num is odd " + isOdd(num));

    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isEven(int n) {
        return !isOdd(n);
    }

}
