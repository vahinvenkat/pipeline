package Strings;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6}; // Example array where 3 is missing
        int n = arr.length + 1; // Since one number is missing
        
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

