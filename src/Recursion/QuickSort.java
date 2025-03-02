package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        Quick(nums, 0, nums.length -1);
        System.out.println(Arrays.toString(nums));
    }

    static void Quick(int[] nums,int low,int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2; 
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot ){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        Quick(nums, low, end);
        Quick(nums,start, high);
    }
}
