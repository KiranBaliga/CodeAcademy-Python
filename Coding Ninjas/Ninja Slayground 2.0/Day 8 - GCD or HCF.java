public class Solution {
    public static int calcGCD(int n, int m) {
        // Base case: if m is 0, return n as the GCD
        if (m == 0) {
            return n;
        }
        // Recursive case: call the function with m and n % m
        return calcGCD(m, n % m);
    }
}
