package Testing;

import java.util.HashSet;

public class Test3 {

	public static void main(String[] args) {
		// Example array and target sum
		int[] numbers = { 1, 5, 7, -1, 5, 2, 3, 14, 2, 9, 0 };
		int targetSum = 16;
		// Create a HashSet to store elements
		HashSet<Integer> elements = new HashSet();

		// Loop through the array
		for (int number : numbers) {
			// Calculate the complement (i.e., the number needed to reach the target sum)
			int complement = targetSum - number;

			// Check if the complement exists in the HashSet
			if (elements.contains(complement)) {
				System.out.println("Pair found: (" + complement + ", " + number + ")");
			}

			// Add the current number to the HashSet
			elements.add(number);
		}

	}

}
