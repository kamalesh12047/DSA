package Recursion;

public class NoOfSteps {
    public static void main(String[] args) {
        int n = 14;
        // both methods have no TC but rec have less SC
        System.out.println(norecur(n));
        System.out.println(numberOfSteps(n));
    }


                       // recursion method(effective )

    static int norecur(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n == 0){
            return c;
        }
        if(n%2 == 0){
            return helper(n/2,c+1);
        }
        return helper(n -1, c + 1);
    }


                        // method to understand
    static int numberOfSteps(int num) {
        int c = 0;
        while(num>0){
            c += 1;
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
        }
        return c;
    }
}
