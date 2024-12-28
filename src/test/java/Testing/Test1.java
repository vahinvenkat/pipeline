package Testing;

public class Test1 {
// all subarrys with given sum
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 }; // Example array
		int targetSum =11; // Example sum
		// Loop through each i point
		for (int i = 0; i < arr.length; i++) {
			int currentSum = 0;
			// Check every subarray from 'i'
			for (int j = i; j < arr.length; j++) {
				currentSum += arr[j];

				// If the sum matches the target sum, print the subarray
				if (currentSum == targetSum) {
					System.out.print("Subarray found: [ ");
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println("]");
				}
			}
		}
		 System.out.println("All subarrays with sum " + targetSum + ":");

	}

}
