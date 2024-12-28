package Strings;

import java.util.Arrays;

public class CheckifTwoStringsAreAnagrams {

	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
		 // Check if lengths are the same
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
	}

}
