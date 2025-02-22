package arrays.Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDup442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static  List<Integer> findDuplicates(int[] nums) {
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
            List<Integer> ans = new ArrayList<>();
            for(int index = 0;index < nums.length;index++){
                if(nums[index] != index + 1){
                    ans.add(index + 1);
                } 
            }
            return ans;
    }
    static void  Swap(int[] nums,int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
    
}
