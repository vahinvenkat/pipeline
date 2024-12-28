package Strings;

public class CheckifOneStringisaRotationofAnother {
	public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        // Check if the lengths are the same and strings are not empty
        if (str1.length() == str2.length() && str1.length() > 0) {
            // Concatenate str1 with itself
            String concatenated = str1 + str2;
            // Check if str2 is a substring of concatenated str1
            if (concatenated.contains(str2)) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
	}
}
