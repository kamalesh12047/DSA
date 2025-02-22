package Recursion;

public class CntOf0 {
    public static void main(String[] args) {
        int n = 10890;
        System.out.println(count(n));
    }
    static int count(int n){
        return helper(n, 0);
    }
    static int helper(int n,int c){
        if(n == 0){
            return c;
        }
        
        if((n%10) == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10, c);
    }
}
