package Testing;

public class Javaprogramtofindamissingnumberinanintegerarray {
	 public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 3,4, 6,7,8 };
	        int n =8 ;
	        int sum = 0;
int missingnum=0;
	        // Calculate the sum of array elements
	        for (int i = 0; i < n - 1; i++) {
	            sum += arr[i];
	        }

	        // Calculate the expected sum
	        int expectedSum = (n * (n + 1)) / 2;

	        // Return the missing number
	        missingnum= expectedSum - sum;
	        System.out.println(missingnum);
	    }
}
