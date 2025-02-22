package Recursion;

public class PrdOfDigit {
    public static void main(String[] args) {
        int n = 99;
        System.out.println(POfDigits(n));
    }
    static int POfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * POfDigits(n/10);
    }
}
