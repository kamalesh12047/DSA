package Recursion;

public class PrdOfNo {
    public static void main(String[] args) {
        int range =5;
        System.out.println(fact(range));
    }
    static int  fact(int n){
        if(n <=1){
            return 1;
        }
        return n * fact(n - 1) ;
    }

}
