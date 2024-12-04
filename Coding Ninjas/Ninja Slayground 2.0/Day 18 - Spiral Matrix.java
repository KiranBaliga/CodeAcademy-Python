import java.util.*;

public class Solution {
    public static int[] spiralMatrix(int[][] MATRIX) {
        // Dimensions of the matrix
        int rows = MATRIX.length;
        int cols = MATRIX[0].length;

        // Result list to store the spiral order
        List<Integer> result = new ArrayList<>();

        // Boundaries of the matrix
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        // Traverse the matrix in a spiral order
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int col = left; col <= right; col++) {
                result.add(MATRIX[top][col]);
            }
            top++;

            // Traverse from top to bottom
            for (int row = top; row <= bottom; row++) {
                result.add(MATRIX[row][right]);
            }
            right--;

            // Traverse from right to left (if still within bounds)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(MATRIX[bottom][col]);
                }
                bottom--;
            }

            // Traverse from bottom to top (if still within bounds)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(MATRIX[row][left]);
                }
                left++;
            }
        }

        // Convert result list to an array
        int[] spiralOrder = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            spiralOrder[i] = result.get(i);
        }
        
        return spiralOrder;
    }
}
