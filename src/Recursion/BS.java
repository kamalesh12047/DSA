package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 19, 28, 35};
        int target = 19;
        int result = BinaryR(arr, target);
        System.out.println("Target found at index: " + result);
    }

    static int BinaryR(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        return helper(arr, target, start, end);
    }

    static int helper(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Base case: target not found
        }

        int mid = start + (end - start) / 2; // Recalculate mid to avoid overflow
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return helper(arr, target, start, mid - 1); // Search in the left half
        } else {
            return helper(arr, target, mid + 1, end); // Search in the right half
        }
    }
}
