package arrays.Searching;

public class FindInMountainArray1095 {
    public static int findInMountainArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        // Find peak element
        while (start < end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;  // Peak is in the right half
            } else {
                end = mid;  // Peak is in the left half (including mid)
            }
        }
        
        int peak = start;
        
        // Binary search in the increasing part of the array (from start to peak)
        start = 0;
        end = peak;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // Binary search in the decreasing part of the array (from peak to end)
        start = peak + 1;
        end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 9, 7, 5};
        int target = 10;
        System.out.println("Target found at index: " + findInMountainArray(arr, target));
    }
}

