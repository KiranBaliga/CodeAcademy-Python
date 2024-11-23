public class Solution {
    public static int reverseNumber(int n) {
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit from the original number
        }
        
        return reversed;
    }
}
