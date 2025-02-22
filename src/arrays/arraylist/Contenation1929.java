package arrays.arraylist;

import java.util.Arrays;

public class Contenation1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
        int[] dup = new int[nums.length * 2]; // New array with double the size

        // Copy the original array into the first half of the new array
        System.arraycopy(nums, 0, dup, 0, nums.length);

        // Copy the original array into the second half of the new array
        System.arraycopy(nums, 0, dup, nums.length, nums.length);
        return dup;
    }
}
