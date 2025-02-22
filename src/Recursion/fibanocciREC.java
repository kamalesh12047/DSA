package Recursion;
public class fibanocciREC {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        
    }
    static int  fib(int n){
        if(n < 2){
            return n;
        }

        else{
            return fib(n - 1) + fib (n - 2);
        }
        
    }
}

// this above method is not preffered for this prb since the space complexity is higher as compared to loops.
