import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();

        // Base case: if n is 0, return empty result
        if (n <= 0) return result;

        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();

            // First element of each row is 1
            row.add(1L);

            // Fill in the middle elements by summing up adjacent elements of the previous row
            if (i > 0) {
                ArrayList<Long> prevRow = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                // Last element of each row is also 1
                row.add(1L);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int n = 4; // Change n to test with other inputs
        ArrayList<ArrayList<Long>> pascalTriangle = printPascal(n);

        // Printing the Pascal's Triangle
        for (ArrayList<Long> row : pascalTriangle) {
            for (Long num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
