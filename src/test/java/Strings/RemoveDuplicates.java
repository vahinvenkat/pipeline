package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5}; // Example array
        
        // Use HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet();
        
        // Add elements to the HashSet (duplicates will automatically be removed)
        for (int num : arr) {
            uniqueElements.add(num);
        }
        
        // Convert HashSet to array (manual method)
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }
}

