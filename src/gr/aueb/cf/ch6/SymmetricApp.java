package gr.aueb.cf.ch6;

public class SymmetricApp {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        System.out.println(isSymmetric(matrix));
    }

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            for (int k = 0, l = matrix[i].length - 1; k < matrix[i].length; k++, l--) {
                if (matrix[i][k] != matrix[j][l]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean isSymmetric2(int[] array) {
        int n = array.length / 2;
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            if (array[i] != array[n - i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
