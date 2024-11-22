public class Solution {
    public static boolean isPrime(int n) {
        // Base cases
        if (n <= 1) {
            return false;  // Numbers <= 1 are not prime
        }
        if (n <= 3) {
            return true;   // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;  // Eliminate multiples of 2 and 3
        }
        // Check for factors from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;  // If divisible by i or i + 2, it's not prime
            }
        }
        return true;  // n is prime
    }
    public static void main(String[] args) {
        // Test cases
        int[] n = {5, 6, 1};  // Example test case array
        for (int num : n) {
            boolean ans = isPrime(num);
            System.out.println(ans ? "YES" : "NO");  // Print YES if prime, NO if not
        }
    }
}
