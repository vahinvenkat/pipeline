package Testing;

public class Test2 {

	 public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7};  // First sorted array
	        int[] arr2 = {2, 4, 6, 8};  // Second sorted array
	        int n1 = arr1.length;
	        int n2 = arr2.length;
	        int[] result = new int[n1 + n2];

	        int i = 0, j = 0, k = 0;
	        // Use while loop to merge arrays until one of them is fully traversed
	        while (i < n1 && j < n2) {
	            if (arr1[i] <= arr2[j]) {
	                result[k++] = arr1[i++];
	            } else {
	                result[k++] = arr2[j++];
	            }
	        }

	        // Copy remaining elements of arr1, if any
	        while (i < n1) {
	            result[k++] = arr1[i++];
	        }

	        // Copy remaining elements of arr2, if any
	        while (j < n2) {
	            result[k++] = arr2[j++];
	        }


	       
	    }

}
