package gr.aueb.cf.ch5;

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap");
        System.out.printf("a: %d, b: %d\n", a, b);
        swap(a, b);
        System.out.println("After swap");
        System.out.printf("a: %d, b: %d\n", a, b);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
