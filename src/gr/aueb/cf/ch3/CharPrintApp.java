package gr.aueb.cf.ch3;

public class CharPrintApp {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println("char ch1: " + ch1 + " ordinal value: " + (int) ch1);
        System.out.println("char ch2: " + ch2 + " ordinal value: " + (int) ch2);

        System.out.printf("char ch1: %c ordinal value: %d\n", ch1, (int) ch1);
        System.out.printf("char ch2: %c ordinal value: %d\n", ch2, (int) ch2);
    }
}
