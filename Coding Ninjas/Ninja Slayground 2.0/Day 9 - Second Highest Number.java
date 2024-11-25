public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Initialize variables
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Update largest and second largest
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest) {
                secondLargest = a[i];
            }

            // Update smallest and second smallest
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest) {
                secondSmallest = a[i];
            }
        }

        // Return the results as an array
        return new int[] { secondLargest, secondSmallest };
    }
}
