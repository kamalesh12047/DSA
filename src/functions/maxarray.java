package functions;
import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("enter the no of terms?:");
        int n = o.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = o.nextInt(); 

        }
        System.out.println("the max value is "+findmax(arr));
    }
    static int findmax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
        
    }  
}
