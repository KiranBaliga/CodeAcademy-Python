import java.util.*; 
import java.io.*; 

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // Swap arr[low] and arr[mid]
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                // Swap arr[mid] and arr[high]
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }
}
