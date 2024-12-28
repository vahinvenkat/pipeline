package Strings;

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 1, 7}; // Example array
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;
        
        // Compare adjacent elements after sorting
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        System.out.println("Minimum absolute difference: " + minDiff);
    }
}
