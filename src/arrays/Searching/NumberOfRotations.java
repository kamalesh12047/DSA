package arrays.Searching;

public class NumberOfRotations {
    public static int findRotationCount(int[] arr) {
        int start = 0, end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;  // Mid element is the pivot point
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }
        
        return 0;  // Array is not rotated
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 15, 19, 2, 3};
        System.out.println("Number of rotations: " + findRotationCount(arr));
    }
}

