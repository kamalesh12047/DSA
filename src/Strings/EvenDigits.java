package Strings;
public class EvenDigits {
    public static void main(String[] args) {
       int[] arr = {80,688,9080,34,124,90};
       System.out.println(count(arr));
       
    }
    static int count(int[] nums){
        int count = 0;
        for(int num : nums){
            String j = Integer.toString(num);       
            if((j.length()) %2 ==0){
                count ++;
            }
        }
        return count;


    }
}
