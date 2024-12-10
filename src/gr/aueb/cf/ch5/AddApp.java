package gr.aueb.cf.ch5;

/**
 * use methods to calculate the sum of two numbers
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;
        int sub = 0;

        sum = add(num1, num2);
        sub = sub(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    
}
