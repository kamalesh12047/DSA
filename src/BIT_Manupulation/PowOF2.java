package BIT_Manupulation;

public class PowOF2 {
    public static void main(String[] args) {
        int n = 32;
        
        if((n & (n - 1)) == 0){
            System.out.println(n +" is the power of 2");
        }
        else{
            System.out.println(n +" is not the power of 2");
        }
    }
}
