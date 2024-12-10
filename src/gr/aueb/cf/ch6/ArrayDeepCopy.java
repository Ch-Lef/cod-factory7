package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = arrDeepCopy(source);

        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Destination: " + Arrays.toString(destination));

    }

    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];

//        for (int i = 0; i < source.length; i++) {
//            destination[i] = source[i];
//        }

        System.arraycopy(source, 0, destination, 0, source.length);
        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }


}
