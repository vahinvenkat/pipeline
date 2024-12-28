package Strings;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 67, 44, 3, 5, 3};
        
        // The rightmost element is always a leader
        int maxFromRight = arr[arr.length - 1];
        System.out.print("Leaders: " + maxFromRight + " ");
        
        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

