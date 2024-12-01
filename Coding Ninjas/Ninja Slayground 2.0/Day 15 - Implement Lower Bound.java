public class Solution {
    public static int lowerBound(int[] arr, int n, int x) {
        int left = 0;
        int right = n; // Initially, 'n' acts as the upper bound if 'x' is greater than all elements.
        
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            if (arr[mid] < x) {
                left = mid + 1; // Move right as 'arr[mid]' is less than 'x'
            } else {
                right = mid; // Move left as 'arr[mid]' is greater than or equal to 'x'
            }
        }
        
        return left; // 'left' now points to the smallest index where 'arr[idx] >= x'
    }
}
