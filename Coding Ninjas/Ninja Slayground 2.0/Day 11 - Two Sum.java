import java.util.HashSet;
public class Solution {
    public static String read(int n, int[] book, int target) {
        HashSet<Integer> seenPages = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int complement = target - book[i];
            if (seenPages.contains(complement)) {
                return "YES";
            }
            seenPages.add(book[i]);
        }
        
        return "NO";
    }
}
