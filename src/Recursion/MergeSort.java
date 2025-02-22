package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int[] l = mergesort(arr);
        System.out.println(Arrays.toString(l));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = mergesort(Arrays.copyOfRange(arr,0,mid ));
        int[] second = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    static int[] merge(int[] first,int[] second){
        int i = 0;
        int k = 0;
        int j = 0;
        int[] mix = new int[first.length + second.length];
        while(i < first.length && j < second.length ){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // if there is some elements remains considering the no of elements are unequal 
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
