package arrays.Searching;

public class BinarySearch704 {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return mid;  // Return the index of the target
            }
            
            if (arr[mid] < target) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }
        
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}

