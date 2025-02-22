package arrays.Searching;

public class RotatedArray33 {
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[start] <= arr[mid]) {  // Left half is sorted
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {  // Right half is sorted
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
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Target found at index: " + search(arr, target));
    }
}

