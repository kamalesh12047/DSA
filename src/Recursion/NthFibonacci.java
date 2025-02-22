package Recursion;
public class NthFibonacci {
    public static void main(String[] args) {
        int fib = 50;
        System.out.println(Fibonacci(fib));
        System.out.println(FibComplexity(fib));
    }

    static int FibComplexity(int fib){
        return (int)(Math.pow((1 + Math.sqrt(5))/2,fib)/ Math.sqrt(5));
        //return (int)(Math.pow(1.6180, fib));
    }
    static int Fibonacci(int fib){
        if(fib > 2){
            return fib;
        }
        else{
            return (fib - 1) + (fib - 2);
        }
    }
}
