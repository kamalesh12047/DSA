package arrays.Searching;

public class Floor {
    public static int findFloor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        
        if (target < arr[start]) {
            return -1;  // No floor exists if target is smaller than the smallest element
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) {
                return arr[mid];  // Target is the floor
            } else if (arr[mid] < target) {
                start = mid + 1;  // Search right side
            } else {
                end = mid - 1;  // Search left side
            }
        }
        
        return arr[end];  // Floor is arr[end] after the loop ends
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int target = 12;
        int floor = findFloor(arr, target);
        
        System.out.println("Floor: " + (floor == -1 ? "Not found" : floor));
    }
}
