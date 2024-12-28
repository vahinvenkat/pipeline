package Strings;

import java.util.Arrays;

public class CountOccurrences {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 4, 6, 5, 4, 7, 6, 7, 8 }; // Example array
		boolean[] visited = new boolean[arr.length]; // Track visited elements

		System.out.println("Element : Occurrences");

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue; // Skip if already processed
			}

			int count = 1; // Count current element occurrence

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true; // Mark duplicates as visited
					count++;
				}
			}

			// Print the element and its occurrence count
			System.out.println(arr[i] + " : " + count);
		}
	}
}
