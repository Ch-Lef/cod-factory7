package gr.aueb.cf.ch6;

public class ArraysCollection {
    public static void main(String[] args) {


    }

    public static int[] getEvens(int[] array) {

        int count = 0;
        for (int el : array) {
            if (el % 2 == 0) {
                count++;
            }
        }

        int[] even = new int[count];

        int pivot = 0;
        for (int el : array) {
            if (el % 2 == 0) even[pivot++] = el;
        }
        return even;
    }

    public static int[] mapToDouble(int[] array) {
        int[] doubled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubled[i] = array[i] * 2;
        }
        return doubled;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int el : array) {
            sum += el;
        }

        return sum;
    }


    public static double avg(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static boolean moreThanTwoEvens(int[] array) {
        return getEvens(array).length > 2;
    }

    public static boolean moreThanTwoConsecutiveEvens(int[] array) {

        boolean isTrue = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }
}
