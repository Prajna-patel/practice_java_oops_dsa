package DSA_in_90_days;

public class Arrays_07 {
	private static int searchInRotatedArray(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the target is found at the middle
            if (array[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (array[left] <= array[mid]) {
                // Check if the target is in the left half
                if (array[left] <= target && target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // If the right half is sorted
            else {
                // Check if the target is in the right half
                if (array[mid] < target && target <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // If the element is not present in the rotated array
        return -1;
    }

	public static void main(String[] args) {
int[] rotatedArray = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
        
        // Element to search
        int target = 6;
        
        // Perform binary search on rotated array
        int result = searchInRotatedArray(rotatedArray, target);
        
        // Display the result
        if (result == -1) {
            System.out.println("Element " + target + " not found in the rotated array.");
        } else {
            System.out.println("Element " + target + " found at index " + result);
        }
	}

}
