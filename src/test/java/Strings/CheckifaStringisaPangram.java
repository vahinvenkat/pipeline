package Strings;

import java.util.HashSet;

public class CheckifaStringisaPangram {

	public static void main(String[] args) {
		String str1 = "The quick brown fox jumps over the lazy dog";
		 // Convert the string to lowercase and remove non-alphabetic characters
       String str2 = str1.toLowerCase().replaceAll("[^a-z]", "");
        
        // Use a HashSet to store unique characters
        HashSet letters = new HashSet();
        
        // Iterate through the string and add characters to the set
        for (char ch : str2.toCharArray()) {
            letters.add(ch);
        }
        
        // Print the result directly, no return type
        if (letters.size() == 26) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

	}

}
