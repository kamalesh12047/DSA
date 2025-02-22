package arrays.Searching;

public class SplitArrayLargestSum410 {
    public static int splitArray(int[] arr, int m) {
        int start = 0, end = 0;
        
        // Calculate the range for binary search (from max element to total sum of elements)
        for (int num : arr) {
            start = Math.max(start, num);
            end += num;
        }
        
        while (start < end) {
            int mid = (start + end) / 2;
            int count = 1, sum = 0;
            
            for (int num : arr) {
                sum += num;
                if (sum > mid) {
                    count++;  // Create a new subarray
                    sum = num;
                }
            }
            
            if (count <= m) {
                end = mid;  // Try to find a smaller largest sum
            } else {
                start = mid + 1;  // Try to increase the largest sum
            }
        }
        
        return start;  // Return the minimum largest sum possible
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println("Minimum largest sum: " + splitArray(arr, m));
    }
}

