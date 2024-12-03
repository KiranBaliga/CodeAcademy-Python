public class Solution {
    public static int upperBound(int[] arr, int x, int n) {
        int low = 0;
        int high = n; // Initially set high to n as the default upper bound if no greater element is found
        
        while (low < high) {
            int mid = low + (high - low) / 2; // Calculate mid to avoid overflow
            if (arr[mid] > x) {
                high = mid; // Move high to mid as we need the first element greater than x
            } else {
                low = mid + 1; // Move low to mid + 1 as arr[mid] <= x
            }
        }
        return low; // low will point to the first index where arr[index] > x
    }
}
