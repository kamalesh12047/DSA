package functions;

import java.util.Arrays;
import java.util.Scanner;

public class Swaparray {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("enter the no of terms?:");
        int n = o.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = o.nextInt();            
        }

        System.out.print("enter the index no:");
        int I1 = o.nextInt();

        System.out.print("enter the index no:");
        int I2 = o.nextInt();

        Swap(arr, I1, I2);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;



    }
}
