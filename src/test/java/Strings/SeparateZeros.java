package Strings;

import java.util.Arrays;

public class SeparateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 7, 0, 9};
        int[] result = new int[arr.length];
        
        int index = 0;
        
        // Place non-zero elements in the beginning of result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        
        // Remaining positions will be zeros, already initialized as zeros
        System.out.println("Array after separating zeros: " + Arrays.toString(result));
    }
}

