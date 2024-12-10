package gr.aueb.cf.ch8;

public class Arithmetic {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Division by zero");
        }
        
    }
}
