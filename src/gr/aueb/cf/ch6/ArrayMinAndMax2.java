package gr.aueb.cf.ch6;

public class ArrayMinAndMax2 {
    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] array, int start, int end) {
        if (array == null || array.length == 0) return -1;
        if (start < 0 || start >= array.length) return -1;
        if (start > end) return -1;

        int min = array[0];
        int minPosition = start;

        for (int i = 1; i < end; i++) {
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }
        }

        return minPosition;
    }

}
