package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 1284;
        UNOReverse(n);
        System.err.println(Reversal(n));
    }
    static int sum = 0;
    static void  UNOReverse(int n){
        if(n == 0){
            return;
        }
        int r = n%10;
        sum = sum * 10 + r;
        UNOReverse(n/10);
        System.out.println(sum);
    }
                        // BEST METHOD 
    static int Reversal(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);                 
    }
    static int helper(int n,int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem *(int) Math.pow(10,digits - 1) + helper(n/10,digits - 1);
    }
}
