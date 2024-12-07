public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        return mergeSortAndCount(a, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Count inversions in the left half
            count += mergeSortAndCount(arr, left, mid);

            // Count inversions in the right half
            count += mergeSortAndCount(arr, mid + 1, right);

            // Count inversions during the merge process
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        // Sizes of temporary arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left, swaps = 0;

        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];

                // Count inversions: elements remaining in leftArr are greater than rightArr[j]
                swaps += (n1 - i);
            }
        }

        // Copy remaining elements of leftArr
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        // Copy remaining elements of rightArr
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }

        return swaps;
    }
}
