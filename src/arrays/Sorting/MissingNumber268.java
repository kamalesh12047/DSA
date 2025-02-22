package arrays.Sorting;

public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
        //System.out.println(missingNumber1(nums));
    }
                                                                        //method 1
    // static int missingNumber1(int[] nums) {
    //     int i = 0;
    //     while(i < nums.length ){
    //         int correct = nums[i];
    //         if(nums[i] < nums.length && nums[correct] != nums[i]){
    //             Swap(nums, i, correct);
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     for(int index = 0;index < nums.length;index++){
    //         if(nums[index] != index){
    //             return index;
    //         } 
    //     }
    //     return nums.length;
    // }
    // static void  Swap(int[] nums,int first,int last){
    //     int temp = nums[first];
    //     nums[first] = nums[last];
    //     nums[last] = temp;
    // }

                                                                  //method 2                        best method 
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int ExpectedSum = n * (n+1)/2;
        int Actual_sum = 0;
        for(int num : nums){
            Actual_sum += num;
        }
        return ExpectedSum - Actual_sum;
    }
}
