package Strings;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Example array
        
        // Reverse the array in place
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

