package arrays.Searching;
// mountain_array
public class PeakIndex852 {
    public static int findPeakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;  // Peak is in the right half
            } else {
                end = mid;  // Peak is in the left half (including mid)
            }
        }
        
        return start;  // At the end, start will be the peak index
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 3, 2, 1};
        System.out.println("Peak index: " + findPeakIndex(arr));
    }
}
 
    

