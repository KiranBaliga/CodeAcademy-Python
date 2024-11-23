public class Solution {
    public static int[] reverseArray(int n, int[] nums) {
        // Create a new array to store the reversed elements
        int[] reversedArray = new int[n];
        
        // Loop through the array and reverse the elements
        for (int i = 0; i < n; i++) {
            reversedArray[i] = nums[n - 1 - i];
        }
        
        return reversedArray;
    }
}
