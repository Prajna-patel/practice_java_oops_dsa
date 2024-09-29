package DSA_in_90_days;
import java.util.*;
public class Arrays_02 {
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5};
		int[] reversedArray = Arrays.copyOf(originalArray, originalArray.length);
		Arrays.reverse(reversedArray);

		// Print the original and reversed arrays
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

	}

}
