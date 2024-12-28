package Strings;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayListConversion {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(array));
        
        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList to Array
        Integer[] newArray = new Integer[arrayList.size()];
        newArray = arrayList.toArray(newArray);
        
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}

