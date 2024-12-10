package gr.aueb.cf.ch6;

public class ArrayMixAndMatch {

    public static void main(String[] args) {

    }


    public static int getMinPosition(int[] array) {

        if (array == null || array.length == 0) return -1;


        int minPosition = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minPosition) {
                minPosition = array[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] array) {

        if (array == null || array.length == 0) return -1;


        int maxPosition = 0;
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxPosition) {
                maxPosition = i;
                maxValue = array[i];

            }
        }
        return maxPosition;
    }
}



