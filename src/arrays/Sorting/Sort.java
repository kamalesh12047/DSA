package arrays.Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {45,90,76,56,89,17,98,13};
        int[] crr = {1,9,8,7,3,2,5};
        // Selection(arr);
        // Bubble(arr);
        // Insertion(arr);
        Cyclic(crr);
        System.out.println(Arrays.toString(arr));
    }
           // SELECTION SORT //
    static void  Selection(int[] arr){
        for (int i=0;i < arr.length; i++){
            int LastIndex = arr.length - i - 1;
            int max = Maxvalue(arr,0, LastIndex);
            Swap(arr,max,LastIndex);
        }

    }

    static int Maxvalue(int[] arr,int start,int LastIndex){
        int max = start;
        for (int i=start;i < LastIndex; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void Swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last]; 
        arr[last] = temp;
    }
    //          BUBBLE SORT          // 
    static void Bubble(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }                  
    //          INSERTION SORT          //     
    static void Insertion(int arr[]){
        for (int i = 0; i < arr.length -1 ; i++) {
            for(int j = i + 1;j>0;j--){
                if(arr[j] < arr[j - 1]){
                    Swap(arr, j, j - 1);
                }
                else{
                    break;
                }
            }
        }
    }
    //          CYCLIC SORT          //
    static void Cyclic(int brr[]){
        int i = 0;
        while(i < brr.length){
            int index = brr[i] - 1;
            if(brr[index] != brr[i]){
                Swap(brr,i,index);
            }
            else{
                i++;
            }

        }
    }                                     
}



