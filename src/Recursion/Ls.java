package Recursion;

public class Ls {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,19};
        int target = 7;
        System.out.println(find(arr, target));
    }
    static boolean find(int[] arr,int target){
        return helper(arr,target,0);
    }
    static boolean helper(int[] arr,int target,int index){
        if(arr[index + 1] == arr.length){
            return  false;
        }
        
        return arr[index] == arr[target] | helper(arr, target, index + 1);
    }
}
