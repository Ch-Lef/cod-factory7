package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] array = {1, 10};
        printArray(array);

        swap(array);

        printArray(array);

    }

    public static void swap(int[] array) {
        if (array.length != 2) return;

        int tmp = 0;
        tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;


    }


    public static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();

    }

}
