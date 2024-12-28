package Strings;

import java.util.HashSet;

public class UnionandIntersectionofthearray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 5, 6, 7, 8 };
		
		   // Create sets to store the union and intersection
        HashSet<Integer> unionSet = new HashSet();
        HashSet<Integer> intersectionSet = new HashSet();

        // Add all elements of the first array to the union set
        for (int num : array1) {
            unionSet.add(num);
        }

        // Add elements of the second array to the union set
        // and find the intersection
        for (int num : array2) {
            if (unionSet.contains(num)) {
                intersectionSet.add(num);  // Element is in both arrays, so it's an intersection
            }
            unionSet.add(num);  // Element goes into the union
        }

        // Display the results
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
	}
}
