package arrays.Searching;

public class RotatedArrayWithDuplicates {
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return mid;  // Target found
            }
            
            // Skip duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            } else if (arr[start] <= arr[mid]) {  // Left side is sorted
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {  // Right side is sorted
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        System.out.println("Target found at index: " + search(arr, target));
    }
}

