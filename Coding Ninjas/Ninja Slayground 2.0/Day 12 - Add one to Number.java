import java.util.*; 
import java.io.*; 

public class Solution {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        int n = arr.size();
        int carry = 1; // Start with a carry of 1, as we are adding 1 to the number.

        // Traverse the array from the end to the beginning.
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10); // Update the current digit.
            carry = sum / 10; // Calculate the new carry.

            // If carry becomes 0, we can exit early.
            if (carry == 0) {
                break;
            }
        }

        // If there's still a carry left, add it to the beginning of the array.
        if (carry > 0) {
            arr.add(0, carry);
        }

        // Remove leading zeroes if any.
        while (arr.size() > 1 && arr.get(0) == 0) {
            arr.remove(0);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Size of the array
            ArrayList<Integer> arr = new ArrayList<>();

            // Read the array
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }

            // Process the array
            ArrayList<Integer> result = addOneToNumber(arr);

            // Print the result
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
