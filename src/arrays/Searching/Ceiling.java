package arrays.Searching;

public class Ceiling {
    public static int findCeiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        if (target > arr[end]) {
            return -1;  // No ceiling exists if target is greater than the largest element
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return arr[mid];  // Target is the ceiling
            } else if (arr[mid] < target) {
                start = mid + 1;  // Search right side
            } else {
                end = mid - 1;  // Search left side
            }
        }
        
        return arr[start];  // Ceiling is arr[start] after the loop ends
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int target = 12;
        int ceiling = findCeiling(arr, target);
        
        System.out.println("Ceiling: " + (ceiling == -1 ? "Not found" : ceiling));
    }
}

 
    

