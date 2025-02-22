package arrays.Searching;
import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 6;
        System.out.println(Arrays.toString(SM(arr, target)));
    }
    static int[] SM(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Convert the mid index to row and column
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Target found
            } else if (matrix[row][col] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1; // Search the left half
            }
        }

        return new int[]{-1, -1};
    }


}
