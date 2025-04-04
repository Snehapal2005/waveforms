import java.util.*;
public class WaveOrder{
    public static void printWaveOrder(int[][] matrix, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            // If the column index is even, traverse downward
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } 
            // If the column index is odd, traverse upward
            else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Wave Order Traversal:");
        printWaveOrder(matrix, rows, cols);
        sc.close();
    }
}
