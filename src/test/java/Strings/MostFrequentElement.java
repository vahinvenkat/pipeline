package Strings;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 3, 1, 4, 2, 2, 3}; // Example array
        
        Map<Integer, Integer> frequencyMap = new HashMap();
        
        // Build frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the most frequent element
        int mostFrequent = arr[0];
        int maxCount = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        System.out.println("The most frequent element is: " + mostFrequent);
    }
}

