package gr.aueb.cf.ch6;

public class ArraySwitchWithMethod {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int position;

        position = getPosition(array, 3);
        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at position: " + (position + 1));
        }

    }


    public static int getPosition(int[] array, int value) {
        int positionToReturn = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

}

