package functions;
import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("enter the elements of arrays");
        for(int i=0; i < arr.length;i++){
            for(int j =0;j < arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
    }
}
