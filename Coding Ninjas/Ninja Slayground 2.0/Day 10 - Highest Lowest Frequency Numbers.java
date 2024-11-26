import java.util.*;
public class Solution {
    public static int[] getFrequencies(int[] v) {
        // HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Variables to store results
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        int maxElement = Integer.MAX_VALUE;
        int minElement = Integer.MAX_VALUE;
        
        // Iterate over the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            
            // Update the max frequency element
            if (frequency > maxFrequency || (frequency == maxFrequency && element < maxElement)) {
                maxFrequency = frequency;
                maxElement = element;
            }
            
            // Update the min frequency element
            if (frequency < minFrequency || (frequency == minFrequency && element < minElement)) {
                minFrequency = frequency;
                minElement = element;
            }
        }
        
        // Return the result as an array
        return new int[] { maxElement, minElement };
    }
