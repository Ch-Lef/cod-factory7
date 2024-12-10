package gr.aueb.cf.ch6;

/**
 * Η κλάση ArraysInMethods περιέχει μεθόδους που δείχνουν τη χρήση πινάκων σε μεθόδους.
 */

public class ArraysInMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        printArray(array, 1, 3);

    }

    public static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el);
            if (el != array[array.length - 1]) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    /**
     * Overloaded version of printArray
     *
     * @param array the array to print
     * @param low   the index of the first element to print
     * @param high  the index of the last element to print
     */
    public static void printArray(int[] array, int low, int high) {
        if (low < 0 || high >= array.length) {
            System.out.println("Invalid indices");
            return;
        }
        
        for (int i = low; i <= high; i++) {
            System.out.print(array[i]);
            if (i != high) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

}
