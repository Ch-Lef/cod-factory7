package gr.aueb.cf.ch6;

public class TwoDimArrayApp {
    public static void main(String[] args) {

        // Κατά γραμμή - Στήλη
        int[][] grid = new int[2][3];
        System.out.println("threeDimArray.length = " + grid.length);

        grid[0][0] = 99;
        grid[0][1] = 88;
        grid[0][2] = 77;
        grid[1][0] = 66;
        grid[1][1] = 55;
        grid[1][2] = 44;


        // Traverse the 2D array
        for (int el : grid[0]) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int el : grid[1]) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

    }
}
