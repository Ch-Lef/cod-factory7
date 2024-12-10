package gr.aueb.cf.ch5;

public class Factorial {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Factorial of " + i + " is " + facto(i));
        }
        
    }

    public static int facto(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}