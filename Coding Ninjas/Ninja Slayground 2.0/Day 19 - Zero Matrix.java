import java.util.* ;
import java.io.*; 

public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Check if the first row and column have any zero
        boolean firstRowZero = false, firstColZero = false;

        // Check for zero in the first row
        for (int j = 0; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check for zero in the first column
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and column to mark zero rows and columns
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); // Mark the row
                    matrix.get(0).set(j, 0); // Mark the column
                }
            }
        }

        // Zero out cells based on the marks in the first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Zero out the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        // Zero out the first column if needed
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}
