package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "Java interview preparation";
        String[] s2 = s1.split(" ");
      String[] s3=  s1.trim().split("\\s+");
        int num=s3.length;
        for (int i = 0; i < s2.length; i++) {
            char[] c1 = s2[i].toCharArray();
            
            // Reverse each word using a for loop
            for (int j = 0, k = c1.length - 1; j < k; j++, k--) {
                char temp = c1[j];
                c1[j] = c1[k];
                c1[k] = temp;
            }
            
            // Print the reversed word without returning
            System.out.print(new String(c1) + " ");
        }
        System.out.println("no of words" +num);
    }
}

