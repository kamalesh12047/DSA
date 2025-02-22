package Recursion;

public class SOD {
    public static void main(String[] args) {
        int n = 99;
        System.out.println(SumOfDigits(n));
        System.out.println(SumRecur(n));
    }
    // loop method;
    static int SumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    // recursion method
    static int SumRecur(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + SumRecur(n/10);
    }
}
