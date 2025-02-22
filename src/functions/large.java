package functions;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a<b){
            if(b>c){
                System.out.println(b + "is greatest of all");
            }
            else{
                System.out.println(c + "is greatest of all");
            }
        }

        if(b<a){
            if(a>c){
                System.out.println(a + " is greatest of all");
            }
            else{
                System.out.println(c + " is greatest of all");
            }
        }



    }
}
