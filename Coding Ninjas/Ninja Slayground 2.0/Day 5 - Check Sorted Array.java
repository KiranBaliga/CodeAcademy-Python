public class Solution {
    public static int isSorted(int n, int[] a) {
        // Loop through the array and check each pair
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0; // If we find a pair where a[i] > a[i+1], return 0
            }
        }
        return 1; // If no violation is found, return 1
    }
}
