package Strings;

public class CountVowelsandConsonantsinaString {
	 public static void main(String[] args) {
		  String str1= "Venkata Jayanth";
		// Convert the string to lowercase to make it case-insensitive
	       String  str2= str1.toLowerCase();
	        int vowels = 0, consonants = 0;
	        
	        // Define a set of vowels for easy lookup
	        String vowelsSet = "aeiou";
	        
	        // Iterate through the string character by character
	        for (int i = 0; i < str2.length(); i++) {
	            char ch = str2.charAt(i);
	            // Check if the character is a vowel
	            if (vowelsSet.indexOf(ch) != -1) {
	                vowels++;
	            }
	            // Check if the character is a consonant (alphabetic but not a vowel)
	            else if (ch >= 'a' && ch <= 'z') {
	                consonants++;
	            }
	        }
	        
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	 }
}
