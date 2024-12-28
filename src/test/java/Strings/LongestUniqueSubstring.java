package Strings;

import java.util.HashSet;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String input = "yourInputStringHere";
		   int n = input.length();
	        if (n == 0) {
	            System.out.println("Input string is empty.");
	            return;
	        }

	        HashSet set = new HashSet();
	        int maxLength = 0;
	        int start = 0;
	        int end = 0;
	        int longestStart = 0;
	        while (end < n) {
	            if (!set.contains(input.charAt(end))) {
	                set.add(input.charAt(end));
	                end++;
	                if (end - start > maxLength) {
	                    maxLength = end - start;
	                    longestStart = start;
	                }
	            } else {
	                set.remove(input.charAt(start));
	                start++;
	            }
	        }
	        String longestSubstring = input.substring(longestStart, longestStart + maxLength);
	        System.out.println("Longest substring without repeating characters: " + longestSubstring);

	}

}
