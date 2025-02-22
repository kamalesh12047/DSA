package functions;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int j = input.nextInt();
        int k = 0;

        while(j!=0){
            int rem = j % 10;
            j/=10;
            k = k * 10 + rem;
        }
        System.out.println(k);
    }
}
