package functions;
import java.util.Scanner;

public class fibanocci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
    Scanner input1 = new Scanner(System.in);
    System.out.println("enter the no of terms?:");

    int num = input1.nextInt();
    int a = 0;
    int b = 1;
    input1.close();
    System.out.print(a + " ");

    for (int i = 0; i <=num; i++) {
        int temp = b;
        b = b + a;
        a = temp;

        System.out.print(a +" ");
        

    }
    }
}
