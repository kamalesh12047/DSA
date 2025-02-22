package arrays.Sorting;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length ){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                Swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index],index + 1};
            } 
        }
        return new int[]{-1,-1};
    }
    static void Swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
    
}


