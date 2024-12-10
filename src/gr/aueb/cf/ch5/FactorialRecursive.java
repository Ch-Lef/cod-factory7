package gr.aueb.cf.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
    }

    public static long factorial(int n) {
//        if (n >=1) {
//            return 1;
//        }
//        return n * factorial(n - 1);

        return (n <= 1) ? 1L : n * factorial(n - 1);
    }
}
