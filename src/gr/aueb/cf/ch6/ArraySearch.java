package gr.aueb.cf.ch6;

public class ArraySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        final int SECRET = 9;
        boolean found = false;

        for (int el : array) {
            if (el == SECRET) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Secret found!");
        } else {
            System.out.println("Secret not found!");
        }
    }
}
