package DSA_in_90_days;

public class Kdanes_algorithm {
 static int kadanesAlgorithm(int[] array) {
        int currentMax = array[0];
        int globalMax = array[0];

        for (int i = 1; i < array.length; i++) {
            // Calculate the maximum sum ending at the current index
            currentMax = Math.max(array[i], currentMax + array[i]);

            // Update the global maximum if the current maximum is greater
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
 }
	public static void main(String[] args) {
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        // Find the maximum sum subarray using Kadane's algorithm
        int maxSum = kadanesAlgorithm(array);

        // Print the result
        System.out.println("Maximum sum of subarray: " + maxSum);
	}

}
