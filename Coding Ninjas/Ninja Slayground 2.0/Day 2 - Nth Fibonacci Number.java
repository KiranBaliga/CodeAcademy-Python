	
	import java.util.Scanner;
    public class Solution {
    public static void main(String[] args) {
        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        
        // Read input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // Print the nth Fibonacci number
        System.out.println(fibonacci(n));
    }
    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Handle edge cases
        if (n == 1 || n == 2) {
            return 1;
        }
        // Initialize the first two Fibonacci numbers
        int fib1 = 1, fib2 = 1;
        // Calculate Fibonacci numbers iteratively up to the nth term
        for (int i = 3; i <= n; i++) {
            int fibNext = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }
        return fib2;
    }
}
