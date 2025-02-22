package functions;
import java.util.Arrays;
import java.util.Scanner;
public class mutidimensionsam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no columns:");
        int r = in.nextInt();

        System.out.print("enter the no columns:");
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                int COLUMNS = col;
                arr1[COLUMNS] = in.nextInt();
            }
            System.out.println("");
        }

    //    for(int row =0;row<arr.length;row++){
    //         for(int col=0;col<arr[row].length;col++){
    //             System.out.print(arr[row][col] + " ");
    //     }
    //         System.out.println("");
    //     }

        // for(int row =0;row<arr.length;row++){
        //     System.err.println(Arrays.toString(arr[row]));
        // }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
