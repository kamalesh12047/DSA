package functions;
import java.util.Arrays;
import java.util.Scanner;
public class reversearr {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("enter the no of terms?:");
        int n = o.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = o.nextInt();
        }
        reverse(arr);
    }
    static void reverse(int[] arr){
        int temp;
        int k = 0;
        int l = (arr.length-1);
        for(int i= 0;i<l;i++){
            if(k>=i){
                temp = arr[i];
                k = (l - i);
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println("the reversed array is  " + Arrays.toString(arr));
    }
}
